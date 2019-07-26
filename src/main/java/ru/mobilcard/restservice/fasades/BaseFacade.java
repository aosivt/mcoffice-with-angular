package ru.mobilcard.restservice.fasades;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import ru.mobilcard.restservice.config.MyBatisConfig;
import ru.mobilcard.restservice.mappers.Mapper;
import ru.mobilcard.restservice.models.interfaces.Model;

import java.util.Set;

public class BaseFacade<IdentifierClass> {

    public Model getDictionaryById(IdentifierClass l, Class mapperType) {
        SqlSessionFactory sessionFactory = MyBatisConfig.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
        Mapper m = (Mapper) session.getMapper(mapperType);
        Model dictionary = m.getById(l);
        session.close();
        return dictionary;
    }
    public Set getListDictionary(Class type){
        SqlSessionFactory sessionFactory = MyBatisConfig.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
        Mapper m = (Mapper) session.getMapper(type);
        Set dictionary = m.getCollectionData();
        session.close();
        return dictionary;
    }
    public void insertRecord(Model dictionary, Class type){
        SqlSessionFactory sessionFactory = MyBatisConfig.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
        Mapper m = (Mapper) session.getMapper(type);
        m.insert(dictionary);
        session.close();
    }
    public void deleteRecord(Model record, Class type){
        SqlSessionFactory sessionFactory = MyBatisConfig.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
        Mapper m = (Mapper) session.getMapper(type);
        m.delete(record);
        session.close();
    }
    public void insertCollectionRecords(Set<Model> records, Class type){
        SqlSessionFactory sessionFactory = MyBatisConfig.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
        Mapper m = (Mapper) session.getMapper(type);
        records.parallelStream()
                .forEach(record-> m.insert(record));
        session.close();
    }
    public void deleteCollectionRecords(Set<Model> records, Class type){
        SqlSessionFactory sessionFactory = MyBatisConfig.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
        Mapper m = (Mapper) session.getMapper(type);
        records.parallelStream()
                .forEach(record-> m.delete(record));
        session.close();
    }

    public void updateRecord(Model dictionary, Class type){
        SqlSessionFactory sessionFactory = MyBatisConfig.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
        Mapper m = (Mapper) session.getMapper(type);
        m.insert(dictionary);
        session.close();
    }
    public void updateCollectionRecords(Set<Model> records, Class type){
        SqlSessionFactory sessionFactory = MyBatisConfig.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
        Mapper m = (Mapper) session.getMapper(type);
        records.parallelStream()
                .forEach(record-> m.delete(record));
        session.close();
    }
}
