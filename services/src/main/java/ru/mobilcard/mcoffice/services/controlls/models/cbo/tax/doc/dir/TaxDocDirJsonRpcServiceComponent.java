package ru.mobilcard.mcoffice.services.controlls.models.cbo.tax.doc.dir;

import org.springframework.stereotype.Service;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;

import ru.mobilcard.mcoffice.services.controlls.config.BaseModelJsonRpcService;

import ru.mobilcard.mcoffice.database.mappers.cbo.TaxDocDirMapper;
import ru.mobilcard.mcoffice.database.models.cbo.TaxDocDirModel;




@Service
@AutoJsonRpcServiceImpl
public class TaxDocDirJsonRpcServiceComponent
        extends BaseModelJsonRpcService<TaxDocDirMapper, TaxDocDirModel, Long>
        implements TaxDocDirJsonRpcService
{

    @SuppressWarnings("unchecked")
    @Override
    public Class<TaxDocDirMapper> getMapperClass() {
        return TaxDocDirMapper.class;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<TaxDocDirModel> getModelClass() {
        return TaxDocDirModel.class;
    }
}
