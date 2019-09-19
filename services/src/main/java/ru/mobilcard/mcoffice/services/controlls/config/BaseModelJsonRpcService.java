package ru.mobilcard.mcoffice.services.controlls.config;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import ru.mobilcard.mcoffice.database.fasades.BaseFacade;
import ru.mobilcard.mcoffice.database.mappers.Mapper;
import ru.mobilcard.mcoffice.database.mappers.cbo.ArticleMapper;
import ru.mobilcard.mcoffice.database.models.cbo.ArticleModel;
import ru.mobilcard.mcoffice.database.models.interfaces.Model;

import java.util.Set;


@SuppressWarnings("unchecked")
public abstract class BaseModelJsonRpcService<MapperType , ModelType , IdentifierType> {

    @Autowired
    private BaseFacade baseFacade;

    public ModelType getRecordById(IdentifierType id){
        return (ModelType) getBaseFacade().getDictionaryById(id , getMapperClass());
    }

    public Set<ModelType> getRecordByModel(ModelType model){
        return getBaseFacade().getDictionaryByModel(getModelClass().cast(model), getMapperClass());
    }

    public Set<ModelType> getCollection(){
        return getBaseFacade().getListDictionary(getMapperClass());
    }

    public ModelType insertRecord( ModelType model){
        getBaseFacade().insertRecord(getModelClass().cast(model), getMapperClass());
        return model;
    }

    public Set<ModelType> insertCollectionRecords( Set<ModelType> models){
        getBaseFacade().insertCollectionRecords(models, getMapperClass());
        return models;
    }

    public ModelType deleteRecord( ModelType model){
        getBaseFacade().deleteRecord(getModelClass().cast(model), getMapperClass());
        return model;
    }

    public Set<ModelType> deleteCollectionRecords( Set<ModelType> models){
        getBaseFacade().deleteCollectionRecords(models, getMapperClass());
        return models;
    }

    public ModelType updateRecord( ModelType model){
        getBaseFacade().updateRecord(getModelClass().cast(model), getMapperClass());
        return model;
    }

    public Set<ModelType> updateCollectionRecord(Set<ModelType> models){
        getBaseFacade().updateCollectionRecords(models, getMapperClass());
        return models;
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
