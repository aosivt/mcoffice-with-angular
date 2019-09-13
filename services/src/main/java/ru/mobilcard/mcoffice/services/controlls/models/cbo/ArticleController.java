package ru.mobilcard.mcoffice.services.controlls.models.cbo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.mobilcard.mcoffice.database.models.cbo.ArticleModel;
import ru.mobilcard.mcoffice.services.controlls.models.BaseController;
import ru.mobilcard.mcoffice.database.fasades.BaseFacade;
import ru.mobilcard.mcoffice.database.mappers.cbo.ArticleMapper;

@RestController()
@RequestMapping(value = "article",method = {RequestMethod.GET, RequestMethod.POST})
public class ArticleController extends BaseController<ArticleMapper, ArticleModel, String> {

    @Override
    protected Class<ArticleMapper> getMapperClass(){
        return ArticleMapper.class;
    }
    @Override
    protected Class<ArticleModel> getModelClass(){
        return ArticleModel.class;
    }

}
