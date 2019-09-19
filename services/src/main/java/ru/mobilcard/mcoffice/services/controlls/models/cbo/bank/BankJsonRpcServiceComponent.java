package ru.mobilcard.mcoffice.services.controlls.models.cbo.bank;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import org.springframework.stereotype.Service;
import ru.mobilcard.mcoffice.database.mappers.cbo.BankMapper;
import ru.mobilcard.mcoffice.database.models.cbo.BankModel;
import ru.mobilcard.mcoffice.services.controlls.config.BaseModelJsonRpcService;

@Service
@AutoJsonRpcServiceImpl
public class BankJsonRpcServiceComponent
        extends BaseModelJsonRpcService<BankMapper, BankModel, Long>
        implements BankJsonRpcService {

    @SuppressWarnings("unchecked")
    @Override
    public Class<BankMapper> getMapperClass() {
        return BankMapper.class;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<BankModel> getModelClass() {
        return BankModel.class;
    }

}
