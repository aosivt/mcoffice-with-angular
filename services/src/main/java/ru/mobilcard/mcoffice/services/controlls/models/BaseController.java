package ru.mobilcard.mcoffice.services.controlls.models;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ru.mobilcard.mcoffice.database.fasades.BaseFacade;
import ru.mobilcard.mcoffice.database.mappers.Mapper;
import ru.mobilcard.mcoffice.database.models.interfaces.Model;

import java.sql.SQLException;
import java.util.Set;

public abstract class BaseController<MapperType extends Mapper<ModelType, IdentifierType>,
                                    ModelType   extends Model, IdentifierType> {
    @Autowired
    private BaseFacade<MapperType,ModelType, IdentifierType> baseFacade;

    /**
     * method for get collection banks
     * @return Set object mapper
     * */
    @RequestMapping(value = "/get/record/{id}",method = {RequestMethod.GET, RequestMethod.POST})
    @CrossOrigin(origins = "*")
    public ModelType getRecordById(@PathVariable(name = "id") IdentifierType id) throws SQLException {
        return baseFacade.getDictionaryById(id , getMapperClass());
    }

    /**
     * method for get collection banks
     * @return Set object mapper
     * */
    @RequestMapping(value = "/collection/by/model",method = {RequestMethod.GET, RequestMethod.POST})
    @CrossOrigin(origins = "*")
    public Set<ModelType> getRecordByModel(@RequestBody() ModelType dictionary) throws SQLException {
        return baseFacade.getDictionaryByModel(dictionary, getMapperClass());
    }

    /**
     * method for get collection banks
     * @return Set object mapper
     * */
    @RequestMapping(value = "/collection",method = {RequestMethod.GET, RequestMethod.POST})
    @CrossOrigin(origins = "*")
    public Set getCollection() throws SQLException{
        return baseFacade.getListDictionary(getMapperClass());
    }

    /**
     * method for insert record to dictionary
     * @return Dictionary inserted directory
     * */
    @RequestMapping(value = "/record/insert",method = {RequestMethod.POST})
    @CrossOrigin(origins = "*")
    public ModelType insertRecord(@RequestBody() ModelType dictionary) throws SQLException{
        baseFacade.insertRecord(dictionary, getMapperClass());
        return dictionary;
    }

    /**
     * method for insert collection record to dictionary
     * @return Set<Dictionary> inserted collection directory
     * */
    @RequestMapping(value = "/collection/record/insert",method = {RequestMethod.POST})
    @CrossOrigin(origins = "*")
    public Set<ModelType> insertCollectionRecords(@RequestBody() Set<ModelType> dictionaries) throws SQLException {
        baseFacade.insertCollectionRecords(dictionaries, getMapperClass());
        return dictionaries;
    }

    /**
     * method for delete record from dictionary
     * @return Dictionary deleted directory
     * */
    @RequestMapping(value = "/record/delete",method = {RequestMethod.POST})
    @CrossOrigin(origins = "*")
    public ModelType deleteRecord(@RequestBody() ModelType dictionary) throws SQLException {
        baseFacade.deleteRecord(dictionary, getMapperClass());
        return getModelClass().cast(dictionary);
    }

    /**
     * method for delete collection record from dictionary
     * @return Set<Dictionary> deleted collection directory
     * */
    @RequestMapping(value = "/collection/record/delete",method = {RequestMethod.POST})
    @CrossOrigin(origins = "*")
    public Set<ModelType> deleteCollectionRecords(@RequestBody() Set<ModelType> dictionaries) throws SQLException {
        baseFacade.deleteCollectionRecords(dictionaries, getMapperClass());
        return dictionaries;
    }

    /**
     * method for update record inside dictionary
     * @return Dictionary update directory
     * */
    @RequestMapping(value = "/record/update",method = {RequestMethod.GET, RequestMethod.POST})
    @CrossOrigin(origins = "*")
    public ModelType updateRecord(@RequestBody() ModelType dictionary) throws SQLException {
        baseFacade.updateRecord(dictionary, getMapperClass());
        return getModelClass().cast(dictionary);
    }

    /**
     * method for get collection banks
     * @return @return Set<Dictionary> updated collection directory
     * */
    @RequestMapping(value = "/collection/record/update",method = {RequestMethod.GET, RequestMethod.POST})
    @CrossOrigin(origins = "*")
    public Set<ModelType> updateCollectionRecord(@RequestBody() Set<ModelType> dictionaries) throws SQLException {
        baseFacade.updateCollectionRecords(dictionaries, getMapperClass());
        return dictionaries;
    }

    protected abstract Class<MapperType> getMapperClass();

    protected abstract Class<ModelType> getModelClass();

}
