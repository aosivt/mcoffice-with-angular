package ru.mobilcard.restservice.controlls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.mobilcard.restservice.mappers.Mapper;
import ru.mobilcard.restservice.mappers.cbo.ArticleMapper;
import ru.mobilcard.restservice.models.interfaces.Model;
import ru.mobilcard.restservice.fasades.BaseFacade;

import java.util.Set;

@RestController()
public class DefaultController {
    /**
     * method empty
     * @return null
     * */
    @RequestMapping(value = "/",method = {RequestMethod.GET, RequestMethod.POST})
    public Object rootPath() {
        return null;
    }

}
