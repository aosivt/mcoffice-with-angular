package ru.mobilcard.mcoffice.database.models.cbo;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.mobilcard.mcoffice.database.config.MyBatisConfig;
import ru.mobilcard.mcoffice.database.models.interfaces.Model;

import java.util.List;
import java.util.Objects;

public abstract class BaseTestModel<T extends Model> {

    private static Logger log = LoggerFactory.getLogger(BaseTestModel.class);
    private static SqlSession session;
    protected T model;

    @BeforeClass
    public static void setUp() throws Exception {
        log.info("starting up myBatis tests");
        String resource = "mybatis/mybatis-config.xml";
        SqlSessionFactory sf = MyBatisConfig.getSessionFactory();
        session = sf.openSession();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        log.info("closing down myBatis tests");
    }

//    @Test
//    public void checkMapper(){
//
//    try{
//        assertCollection();
//        assertCollectionById();
//    } finally {
//        session.close();
//    }
//
//    }

    protected void assertCollection(){
        List<T> temp = null;
        temp = session.selectList(getReferencePathMapper().concat(".getCollectionData"));
        setFirstElement(temp);

    }
    protected void assertCollectionById(){
        if (Objects.isNull(model)) return;
        T temp = session.selectOne(getReferencePathMapper().concat(".getById"), model.getId());
        Assert.assertFalse(Objects.isNull(temp));
    }

    protected T setFirstElement(List<T> models){
        if (models.size()>0){
            model = models.get(0);
        }
        return null;
    }

    protected abstract String getReferencePathMapper();

}
