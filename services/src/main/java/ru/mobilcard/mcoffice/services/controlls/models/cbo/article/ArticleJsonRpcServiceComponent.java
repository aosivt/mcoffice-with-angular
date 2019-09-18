package ru.mobilcard.mcoffice.services.controlls.models.cbo.article;

import com.google.gson.JsonObject;
import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import ru.mobilcard.mcoffice.database.fasades.BaseFacade;
import ru.mobilcard.mcoffice.database.mappers.cbo.ArticleMapper;
import ru.mobilcard.mcoffice.database.models.cbo.ArticleModel;
import ru.mobilcard.mcoffice.database.models.interfaces.Model;
import ru.mobilcard.mcoffice.services.controlls.config.AbstractJsonRpcServiceComponent;

import java.util.Set;

@Service
@AutoJsonRpcServiceImpl
public class ArticleJsonRpcServiceComponent extends AbstractJsonRpcServiceComponent implements ArticleJsonRpcService{

    @Override
    public BaseFacade<ArticleMapper, ArticleModel, String> getBaseFacade() {
        return baseFacade;
    }

    @Override
    public Class<ArticleMapper> getMapperClass() {
        return ArticleMapper.class;
    }

    @Override
    public Class<ArticleModel> getModelClass() {
        return ArticleModel.class;
    }
}
