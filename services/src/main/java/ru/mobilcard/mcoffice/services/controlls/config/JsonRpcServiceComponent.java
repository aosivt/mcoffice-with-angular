package ru.mobilcard.mcoffice.services.controlls.config;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.mobilcard.mcoffice.database.fasades.BaseFacade;
import ru.mobilcard.mcoffice.database.mappers.Mapper;
import ru.mobilcard.mcoffice.database.models.interfaces.Model;

import java.util.Set;

public interface JsonRpcServiceComponent
        <MapperType extends Mapper<ModelType, IdentifierType>, ModelType extends Model, IdentifierType> {

    default public Model getRecordById(@JsonRpcParam(value = "id") IdentifierType id){
        return getBaseFacade().getDictionaryById(id , getMapperClass());
    }

    default public Set<ModelType> getRecordByModel(@JsonRpcParam(value = "model") ModelType model){
        return getBaseFacade().getDictionaryByModel(model, getMapperClass());
    }

    default public Set<ModelType> getCollection(){
        return getBaseFacade().getListDictionary(getMapperClass());
    }

    default public ModelType insertRecord(@JsonRpcParam(value = "model") ModelType model){
        getBaseFacade().insertRecord(model, getMapperClass());
        return model;
    }

    default public Set<ModelType> insertCollectionRecords(@JsonRpcParam(value = "models") Set<ModelType> models){
        getBaseFacade().insertCollectionRecords(models, getMapperClass());
        return models;
    }

    default public ModelType deleteRecord(@JsonRpcParam(value = "model") ModelType model){
        getBaseFacade().deleteRecord(model, getMapperClass());
        return getModelClass().cast(model);
    }

    default public Set<ModelType> deleteCollectionRecords(@JsonRpcParam(value = "models") Set<ModelType> models){
        getBaseFacade().deleteCollectionRecords(models, getMapperClass());
        return models;
    }

    default public ModelType updateRecord(@JsonRpcParam(value = "model") ModelType model){
        getBaseFacade().updateRecord(model, getMapperClass());
        return getModelClass().cast(model);
    }

    default public Set<ModelType> updateCollectionRecord(@JsonRpcParam(value = "models") Set<ModelType> models){
        getBaseFacade().updateCollectionRecords(models, getMapperClass());
        return models;
    }

    public BaseFacade<MapperType, ModelType , IdentifierType> getBaseFacade();

    public abstract Class<MapperType> getMapperClass();

    public abstract Class<ModelType> getModelClass();

}
