package ru.mobilcard.restservice.controlls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.mobilcard.restservice.mappers.Mapper;
import ru.mobilcard.restservice.mappers.cbo.BankMapper;
import ru.mobilcard.restservice.models.interfaces.Dictionary;
import ru.mobilcard.restservice.utils.MyBatisUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

@RestController()
public class DefaultController {
    @Autowired
    private MyBatisUtils batisUtils;
    /**
     * method empty
     * @return null
     * */
    @RequestMapping(value = "/",method = {RequestMethod.GET, RequestMethod.POST})
    public Object rootPath() {
        return null;
    }

    /**
     * method for insert record to dictionary
     * @return Dictionary insert directory
     * */
    @RequestMapping(value = "/record/insert",method = {RequestMethod.POST})
    @CrossOrigin(origins = "*")
    public Dictionary insertRecord(
            @RequestParam(value = "dictionary", defaultValue="none") Dictionary dictionary) {
        batisUtils.insertRecord(dictionary, Mapper.class);
        return dictionary;
    }

    /**
     * method for insert record to dictionary
     * @return Dictionary insert directory
     * */
    @RequestMapping(value = "/collection/record/insert",method = {RequestMethod.POST})
    @CrossOrigin(origins = "*")
    public Set<Dictionary> insertCollectionRecords(Set<Dictionary> dictionaries) {
        batisUtils.insertCollectionRecords(dictionaries, Mapper.class);
        return dictionaries;
    }

    /**
     * method for delete record from dictionary
     * @return Dictionary delete directory
     * */
    @RequestMapping(value = "/record/delete",method = {RequestMethod.POST})
    @CrossOrigin(origins = "*")
    public Dictionary deleteRecord(Dictionary dictionary) {
        batisUtils.deleteRecord(dictionary, Mapper.class);
        return dictionary;
    }

    /**
     * method for delete record from dictionary
     * @return Dictionary delete directory
     * */
    @RequestMapping(value = "/collection/record/delete",method = {RequestMethod.POST})
    @CrossOrigin(origins = "*")
    public Set<Dictionary> deleteCollectionRecords(Set<Dictionary> dictionaries) {
        batisUtils.deleteCollectionRecords(dictionaries, Mapper.class);
        return dictionaries;
    }

}
