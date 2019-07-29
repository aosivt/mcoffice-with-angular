package ru.mobilcard.restservice.fasades;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import ru.mobilcard.restservice.config.MyBatisConfig;
import ru.mobilcard.restservice.mappers.Mapper;
import ru.mobilcard.restservice.models.interfaces.Model;

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
        session.close();
        return record;
    }
    public void insertCollectionRecords(Set<ModelType> records, Class<MapperType> type){
        SqlSessionFactory sessionFactory = MyBatisConfig.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
        MapperType m = session.getMapper(type);
        records.forEach(m::insert);
        session.commit();
        session.close();
    }
    public void deleteCollectionRecords(Set<ModelType> records, Class<MapperType> type){
        SqlSessionFactory sessionFactory = MyBatisConfig.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
        MapperType m = session.getMapper(type);
        records.forEach(m::delete);
        session.commit();
        session.close();
    }
    public void updateRecord(ModelType record, Class<MapperType> type){
        SqlSessionFactory sessionFactory = MyBatisConfig.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
        MapperType m = session.getMapper(type);
        m.update(record);
        session.close();
    }
    public void updateCollectionRecords(Set<ModelType> records, Class<MapperType> type){
        SqlSessionFactory sessionFactory = MyBatisConfig.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
        MapperType m = session.getMapper(type);
        records.forEach(m::update);
        session.commit();
        session.close();
    }
}
