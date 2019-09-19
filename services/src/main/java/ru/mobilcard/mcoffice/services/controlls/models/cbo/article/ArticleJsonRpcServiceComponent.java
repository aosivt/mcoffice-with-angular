package ru.mobilcard.mcoffice.services.controlls.models.cbo.article;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import org.springframework.stereotype.Service;
import ru.mobilcard.mcoffice.database.mappers.cbo.ArticleMapper;
import ru.mobilcard.mcoffice.database.models.cbo.ArticleModel;
import ru.mobilcard.mcoffice.services.controlls.config.BaseModelJsonRpcService;

@Service
@AutoJsonRpcServiceImpl
public class ArticleJsonRpcServiceComponent
        extends BaseModelJsonRpcService<ArticleMapper, ArticleModel, String>
        implements ArticleJsonRpcService {

    @SuppressWarnings("unchecked")
    @Override
    public Class<ArticleMapper> getMapperClass() {
        return ArticleMapper.class;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<ArticleModel> getModelClass() {
        return ArticleModel.class;
    }
}
