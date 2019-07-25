package ru.mobilcard.restservice.controlls.cbo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.mobilcard.restservice.mappers.cbo.ArticleMapper;
import ru.mobilcard.restservice.mappers.cbo.BankMapper;
import ru.mobilcard.restservice.utils.MyBatisUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

@RestController()
public class ArticleController {
    @Autowired
    private MyBatisUtils batisUtils;

    /**
     * method for get collection banks
     * @return Set<BankModel> object mapper
     * */
    @RequestMapping(value = "/cbo/articles/collection",method = {RequestMethod.GET, RequestMethod.POST})
    @CrossOrigin(origins = "*")
    public Set articleCollection() {
        return batisUtils.getListDictionary(ArticleMapper.class);
    }
}
