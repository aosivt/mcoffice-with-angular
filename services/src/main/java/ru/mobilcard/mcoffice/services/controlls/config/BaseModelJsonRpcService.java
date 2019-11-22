package ru.mobilcard.mcoffice.services.controlls.config;

import org.apache.ibatis.exceptions.PersistenceException;
import org.postgresql.util.PSQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageHeaders;
import ru.mobilcard.mcoffice.database.config.TableFieldsResponse;
import ru.mobilcard.mcoffice.database.config.TreeWorkNodeResponse;
import ru.mobilcard.mcoffice.database.config.interfaces.annotations.gui.fields.table.TableField;
import ru.mobilcard.mcoffice.database.config.interfaces.annotations.gui.fields.tree.TreeWorkNode;
import ru.mobilcard.mcoffice.database.fasades.BaseFacade;
import ru.mobilcard.mcoffice.database.mappers.Mapper;
import ru.mobilcard.mcoffice.database.models.interfaces.Model;

import java.sql.SQLException;
import java.util.*;
import java.util.stream.Collectors;


//@SuppressWarnings("unchecked")
public abstract class BaseModelJsonRpcService<MapperType , ModelType , IdentifierType> {

    @Autowired
    private BaseFacade baseFacade;

    public ModelType getRecordById(IdentifierType id) throws SQLException {
        ModelType result = null;
        try{
            result = (ModelType) getBaseFacade().getDictionaryById(id , getMapperClass());
        } catch (NullPointerException npe) {
            throw new RuntimeException("Заданное не задано");
        } catch (PSQLException psqlE){
            throw new RuntimeException("Ошибка базы данных");
        }

        return result;
    }

    public Set<ModelType> getRecordByModel(ModelType model) throws SQLException {
        return getBaseFacade().getDictionaryByModel(getModelClass().cast(model), getMapperClass());
    }

    public Set<ModelType> getCollection() throws SQLException {
        return getBaseFacade().getListDictionary(getMapperClass());
    }

    public ModelType insertRecord(ModelType model) throws SQLException {
        getBaseFacade().insertRecord(getModelClass().cast(model), getMapperClass());
        return model;
    }

    public Set<ModelType> insertCollectionRecords( Set<ModelType> models) throws SQLException {
        try {
            getBaseFacade().insertCollectionRecords(models, getMapperClass());
        } catch (NullPointerException npe) {
            throw new RuntimeException("Заданное не задано");
         } catch (PSQLException psqlE){
            throw new RuntimeException("Ошибка базы данных");
         }
        return models;
    }

    public ModelType deleteRecord( ModelType model) throws SQLException {
        try {
            getBaseFacade().deleteRecord(getModelClass().cast(model), getMapperClass());
        } catch (NullPointerException npe) {
            throw new RuntimeException("Заданное значение не может быть пустым");
        } catch (PersistenceException psqlE){
            throw new PersistenceException("Запись не может быть удалена", psqlE);
        } catch (PSQLException psqlE){
            throw new RuntimeException("Ошибка базы данных");
        }
        return model;
    }

    public Set<ModelType> deleteCollectionRecords( Set<ModelType> models) throws SQLException {
        getBaseFacade().deleteCollectionRecords(models, getMapperClass());
        return models;
    }

    public ModelType updateRecord( ModelType model) throws SQLException {
        getBaseFacade().updateRecord(getModelClass().cast(model), getMapperClass());
        return model;
    }

    public Set<ModelType> updateCollectionRecord(Set<ModelType> models) throws SQLException {
        getBaseFacade().updateCollectionRecords(models, getMapperClass());
        return models;
    }

    public List getTableFieldsAnnotations() throws Exception {
        List tableAnnotations = null;
        try {
        tableAnnotations =
                    Arrays.stream(getModelClass().getDeclaredFields())
                            .map(f->f.getAnnotation(TableField.class))
                            .map(TableFieldsResponse::new)
                            .collect(Collectors.toList());
        } catch (NullPointerException npe) {
            throw new RuntimeException("Ошибка определения полей таблици");
        }
        return tableAnnotations;
    }
    public List getTreeWorkNodeAnnotations() throws Exception {
        List tableAnnotations = null;
        try {
            tableAnnotations =
                    Arrays.stream(getModelClass().getDeclaredFields())
                            .map(f->f.getAnnotation(TreeWorkNode.class))
                            .map(TreeWorkNodeResponse::new)
                            .collect(Collectors.toList());
        } catch (NullPointerException npe) {
            throw new RuntimeException("Ошибка определения полей таблици");
        }
        return tableAnnotations;
    }

    public <MapperType extends Mapper<ModelType, IdentifierType>,
            ModelType  extends Model, IdentifierType> BaseFacade getBaseFacade(){
        return baseFacade;
    }

    public abstract <MapperType extends Mapper<ModelType, IdentifierType>,
            ModelType  extends Model, IdentifierType> Class<MapperType> getMapperClass();

    public abstract <MapperType extends Mapper<ModelType, IdentifierType>,
            ModelType  extends Model, IdentifierType> Class<ModelType> getModelClass();



}
