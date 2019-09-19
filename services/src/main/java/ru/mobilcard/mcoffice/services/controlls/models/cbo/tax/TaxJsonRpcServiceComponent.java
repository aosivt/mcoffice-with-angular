package ru.mobilcard.mcoffice.services.controlls.models.cbo.tax;

import org.springframework.stereotype.Service;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;

import ru.mobilcard.mcoffice.database.mappers.cbo.TaxMapper;
import ru.mobilcard.mcoffice.database.models.cbo.TaxModel;

import ru.mobilcard.mcoffice.services.controlls.config.BaseModelJsonRpcService;

@Service
@AutoJsonRpcServiceImpl
public class TaxJsonRpcServiceComponent
        extends BaseModelJsonRpcService<TaxMapper, TaxModel, Long>
        implements TaxJsonRpcService {

    @SuppressWarnings("unchecked")
    @Override
    public Class<TaxMapper> getMapperClass() {
        return TaxMapper.class;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<TaxModel> getModelClass() {
        return TaxModel.class;
    }
}
