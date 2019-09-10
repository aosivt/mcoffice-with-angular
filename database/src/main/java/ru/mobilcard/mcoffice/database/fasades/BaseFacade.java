package ru.mobilcard.mcoffice.database.fasades;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import ru.mobilcard.mcoffice.database.config.MyBatisConfig;
import ru.mobilcard.mcoffice.database.mappers.Mapper;
import ru.mobilcard.mcoffice.database.models.interfaces.Model;

import java.util.Set;

public class BaseFacade<MapperType extends Mapper<ModelType, IdentifierType>,
                        ModelType  extends Model, IdentifierType>  {

    public ModelType getDictionaryById(IdentifierType l, Class<MapperType> mapper) {
        SqlSessionFactory sessionFactory = MyBatisConfig.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
        MapperType m = session.getMapper(mapper);
        ModelType dictionary = m.getById(l);
        session.close();
        return dictionary;
    }
    public Set<ModelType> getDictionaryByModel(ModelType model, Class<MapperType> mapper) {
        SqlSessionFactory sessionFactory = MyBatisConfig.getSessionFactory();

        SqlSession session = sessionFactory.openSession();

        MapperType m = session.getMapper(mapper);
        Set<ModelType> dictionaries = m.getByModel(model);
        session.close();
        return dictionaries;
    }

    public Set<ModelType> getListDictionary(Class<MapperType> mapperType){
        SqlSessionFactory sessionFactory = MyBatisConfig.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
        MapperType m = session.getMapper(mapperType);
        Set<ModelType> dictionary = m.getCollectionData();
        session.close();
        return dictionary;
    }
    public ModelType insertRecord(ModelType model, Class<MapperType> type){
        SqlSessionFactory sessionFactory = MyBatisConfig.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
        MapperType m = session.getMapper(type);
        m.insert(model);
        session.commit();
        session.close();
        return model;
    }
    public ModelType deleteRecord(ModelType record, Class<MapperType> type){
        SqlSessionFactory sessionFactory = MyBatisConfig.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
        MapperType m = session.getMapper(type);
        m.delete(record);
        session.commit();
        session.close();
        return record;
    }
    public void insertCollectionRecords(Set<ModelType> records, Class<MapperType> type){
        SqlSessionFactory sessionFactory = MyBatisConfig.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
        MapperType m = session.getMapper(type);
        m.insertCollection(records);
        session.commit();
        session.close();
    }
    public void deleteCollectionRecords(Set<ModelType> records, Class<MapperType> type){
        SqlSessionFactory sessionFactory = MyBatisConfig.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
        MapperType m = session.getMapper(type);
        m.deleteCollection(records);
        session.commit();
        session.close();
    }
    public void updateRecord(ModelType record, Class<MapperType> type){
        SqlSessionFactory sessionFactory = MyBatisConfig.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
        MapperType m = session.getMapper(type);
        m.update(record);
        session.commit();
        session.close();
    }
    public void updateCollectionRecords(Set<ModelType> records, Class<MapperType> type){
        SqlSessionFactory sessionFactory = MyBatisConfig.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
        MapperType m = session.getMapper(type);
        m.updateCollection(records);
        session.commit();
        session.close();
    }
}
