package ru.mobilcard.mcoffice.services.controlls.models.cbo.country;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import org.springframework.stereotype.Service;
import ru.mobilcard.mcoffice.database.fasades.BaseFacade;
import ru.mobilcard.mcoffice.database.mappers.cbo.ArticleMapper;
import ru.mobilcard.mcoffice.database.mappers.cbo.CountryMapper;
import ru.mobilcard.mcoffice.database.models.cbo.ArticleModel;
import ru.mobilcard.mcoffice.database.models.cbo.CountryModel;
import ru.mobilcard.mcoffice.services.controlls.config.AbstractJsonRpcServiceComponent;

@Service
@AutoJsonRpcServiceImpl
public class CountryJsonRpcServiceComponent extends AbstractJsonRpcServiceComponent implements CountryJsonRpcService {

    @Override
    public BaseFacade<CountryMapper, CountryModel, Long> getBaseFacade() {
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
