package ru.mobilcard.mcoffice.services.controlls.models.cbo.country;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import org.springframework.stereotype.Service;
import ru.mobilcard.mcoffice.database.mappers.cbo.CountryMapper;
import ru.mobilcard.mcoffice.database.models.cbo.CountryModel;
import ru.mobilcard.mcoffice.services.controlls.config.BaseModelJsonRpcService;

@Service
@AutoJsonRpcServiceImpl
public class CountryJsonRpcServiceComponent
        extends BaseModelJsonRpcService<CountryMapper, CountryModel, Long>
        implements CountryJsonRpcService {

    @SuppressWarnings("unchecked")
    @Override
    public Class<CountryMapper> getMapperClass() {
        return CountryMapper.class;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<CountryModel> getModelClass() {
        return CountryModel.class;
    }
}
