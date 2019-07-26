package ru.mobilcard.restservice.controlls.models.cbo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.mobilcard.restservice.controlls.models.BaseController;
import ru.mobilcard.restservice.mappers.cbo.ArticleMapper;
import ru.mobilcard.restservice.models.cbo.ArticleModel;
import ru.mobilcard.restservice.models.cbo.BankModel;

import java.util.Set;

@RestController()
@RequestMapping(value = "article",method = {RequestMethod.GET, RequestMethod.POST})
public class ArticleController extends BaseController<ArticleMapper, ArticleModel, String> {

    @Override
    protected Class getMapperClass(){
        return ArticleMapper.class;
    }
    @Override
    protected Class getModelClass(){
        return ArticleModel.class;
    }

}
