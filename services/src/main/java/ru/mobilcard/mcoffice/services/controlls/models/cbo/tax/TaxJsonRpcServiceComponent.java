package ru.mobilcard.mcoffice.services.controlls.models.cbo.tax;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import org.springframework.stereotype.Service;
import ru.mobilcard.mcoffice.database.fasades.BaseFacade;
import ru.mobilcard.mcoffice.database.mappers.cbo.ArticleMapper;
import ru.mobilcard.mcoffice.database.mappers.cbo.CountryMapper;
import ru.mobilcard.mcoffice.database.mappers.cbo.TaxMapper;
import ru.mobilcard.mcoffice.database.models.cbo.ArticleModel;
import ru.mobilcard.mcoffice.database.models.cbo.CountryModel;
import ru.mobilcard.mcoffice.database.models.cbo.TaxModel;
import ru.mobilcard.mcoffice.services.controlls.config.AbstractJsonRpcServiceComponent;

@Service
@AutoJsonRpcServiceImpl
public class TaxJsonRpcServiceComponent extends AbstractJsonRpcServiceComponent implements TaxJsonRpcService {

    @Override
    public BaseFacade<TaxMapper, TaxModel, Long> getBaseFacade() {
        return baseFacade;
    }

    @Override
    public Class<TaxMapper> getMapperClass() {
        return TaxMapper.class;
    }

    @Override
    public Class<TaxModel> getModelClass() {
        return TaxModel.class;
    }
}
