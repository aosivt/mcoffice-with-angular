package ru.mobilcard.mcoffice.services.controlls.models.cbo.tax.doc.dir;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import org.springframework.stereotype.Service;
import ru.mobilcard.mcoffice.database.fasades.BaseFacade;
import ru.mobilcard.mcoffice.database.mappers.cbo.ArticleMapper;
import ru.mobilcard.mcoffice.database.mappers.cbo.TaxDocDirMapper;
import ru.mobilcard.mcoffice.database.models.cbo.ArticleModel;
import ru.mobilcard.mcoffice.database.models.cbo.TaxDocDirModel;
import ru.mobilcard.mcoffice.services.controlls.config.AbstractJsonRpcServiceComponent;

@Service
@AutoJsonRpcServiceImpl
public class TaxDocJsonRpcServiceComponent extends AbstractJsonRpcServiceComponent implements TaxDocDirJsonRpcService {

    @Override
    public BaseFacade<TaxDocDirMapper, TaxDocDirModel, Long> getBaseFacade() {
        return baseFacade;
    }

    @Override
    public Class<TaxDocDirMapper> getMapperClass() {
        return TaxDocDirMapper.class;
    }

    @Override
    public Class<TaxDocDirModel> getModelClass() {
        return TaxDocDirModel.class;
    }
}
