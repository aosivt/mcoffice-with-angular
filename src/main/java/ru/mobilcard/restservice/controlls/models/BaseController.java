package ru.mobilcard.restservice.controlls.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import ru.mobilcard.restservice.fasades.BaseFacade;
import ru.mobilcard.restservice.mappers.Mapper;
import ru.mobilcard.restservice.models.interfaces.Model;

import java.util.Set;

public abstract class BaseController<MapperType, ModelType, IdentifierType> {
    @Autowired
    private BaseFacade<IdentifierType> batisUtils;
    /**
     * method for get collection banks
     * @return Set object mapper
     * */
    @RequestMapping(value = "/get/record/{id}",method = {RequestMethod.GET, RequestMethod.POST})
    @CrossOrigin(origins = "*")
    public Model getRecordById(
            @PathVariable(name = "id") IdentifierType id) {
        return batisUtils.getDictionaryById(id , getMapperClass());
    }

    /**
     * method for get collection banks
     * @return Set object mapper
     * */
    @RequestMapping(value = "/collection",method = {RequestMethod.GET, RequestMethod.POST})
    @CrossOrigin(origins = "*")
    public Set getCollection() {
        return batisUtils.getListDictionary(getMapperClass());
    }

    /**
     * method for insert record to dictionary
     * @return Dictionary inserted directory
     * */
    @RequestMapping(value = "/record/insert",method = {RequestMethod.POST})
    @CrossOrigin(origins = "*")
    public Model insertRecord(
            @RequestBody() Object dictionary) {
        batisUtils.insertRecord(getModelClass().cast(dictionary), Mapper.class);
        return getModelClass().cast(dictionary);
    }

    /**
     * method for insert collection record to dictionary
     * @return Set<Dictionary> inserted collection directory
     * */
    @RequestMapping(value = "/collection/record/insert",method = {RequestMethod.POST})
    @CrossOrigin(origins = "*")
    public Set insertCollectionRecords(
            @RequestBody() Set dictionaries) {
        batisUtils.insertCollectionRecords(dictionaries, getModelClass());
        return dictionaries;
    }

    /**
     * method for delete record from dictionary
     * @return Dictionary deleted directory
     * */
    @RequestMapping(value = "/record/delete",method = {RequestMethod.POST})
    @CrossOrigin(origins = "*")
    public Model deleteRecord(
            @RequestBody() Object dictionary) {
        batisUtils.deleteRecord(getModelClass().cast(dictionary), getMapperClass());
        return getModelClass().cast(dictionary);
    }

    /**
     * method for delete collection record from dictionary
     * @return Set<Dictionary> deleted collection directory
     * */
    @RequestMapping(value = "/collection/record/delete",method = {RequestMethod.POST})
    @CrossOrigin(origins = "*")
    public Set deleteCollectionRecords(
            @RequestBody() Set dictionaries) {
        batisUtils.deleteCollectionRecords(dictionaries, getMapperClass());
        return dictionaries;
    }

    /**
     * method for update record inside dictionary
     * @return Dictionary update directory
     * */
    @RequestMapping(value = "/update/record",method = {RequestMethod.GET, RequestMethod.POST})
    @CrossOrigin(origins = "*")
    public Model updateRecord(@RequestBody() Object dictionary) {
        batisUtils.updateRecord(getModelClass().cast(dictionary), getMapperClass());
        return getModelClass().cast(dictionary);
    }

    /**
     * method for get collection banks
     * @return @return Set<Dictionary> updated collection directory
     * */
    @RequestMapping(value = "/collection/update/record",method = {RequestMethod.GET, RequestMethod.POST})
    @CrossOrigin(origins = "*")
    public Set updateCollectionRecord(
            @RequestBody() Set dictionaries) {
        batisUtils.updateCollectionRecords(dictionaries, getMapperClass());
        return dictionaries;
    }

    protected abstract Class getMapperClass();

    protected abstract Class<Model> getModelClass();

}
