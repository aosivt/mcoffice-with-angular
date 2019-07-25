package ru.mobilcard.restservice.utils;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import ru.mobilcard.restservice.config.MyBatisConfig;
import ru.mobilcard.restservice.mappers.Mapper;
import ru.mobilcard.restservice.models.interfaces.Dictionary;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class MyBatisUtils {
    public Dictionary getDictionaryById(Long l, Class type) {
        SqlSessionFactory sessionFactory = MyBatisConfig.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
        Mapper m = (Mapper) session.getMapper(type);
        Dictionary dictionary = m.getById(l);
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
    public void insertRecord(Dictionary dictionary, Class type){
        SqlSessionFactory sessionFactory = MyBatisConfig.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
        Mapper m = (Mapper) session.getMapper(type);
        m.insert(dictionary);
        session.close();
    }
    public void deleteRecord(Dictionary record, Class type){
        SqlSessionFactory sessionFactory = MyBatisConfig.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
        Mapper m = (Mapper) session.getMapper(type);
        m.delete(record);
        session.close();
    }
    public void insertCollectionRecords(Set<Dictionary> records, Class type){
        SqlSessionFactory sessionFactory = MyBatisConfig.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
        Mapper m = (Mapper) session.getMapper(type);
        records.parallelStream()
                .forEach(record-> m.insert(record));
        session.close();
    }
    public void deleteCollectionRecords(Set<Dictionary> records, Class type){
        SqlSessionFactory sessionFactory = MyBatisConfig.getSessionFactory();
        SqlSession session = sessionFactory.openSession();
        Mapper m = (Mapper) session.getMapper(type);
        records.parallelStream()
                .forEach(record-> m.delete(record));
        session.close();
    }
}
