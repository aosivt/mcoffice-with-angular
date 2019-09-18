package ru.mobilcard.mcoffice.services.controlls.models.cbo.ecologicalclass.fuel;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import org.springframework.stereotype.Service;
import ru.mobilcard.mcoffice.database.fasades.BaseFacade;
import ru.mobilcard.mcoffice.database.mappers.cbo.ArticleMapper;
import ru.mobilcard.mcoffice.database.mappers.cbo.CountryMapper;
import ru.mobilcard.mcoffice.database.mappers.cbo.FuelEcologicalClassMapper;
import ru.mobilcard.mcoffice.database.models.cbo.ArticleModel;
import ru.mobilcard.mcoffice.database.models.cbo.CountryModel;
import ru.mobilcard.mcoffice.database.models.cbo.FuelEcologicalClassModel;
import ru.mobilcard.mcoffice.services.controlls.config.AbstractJsonRpcServiceComponent;

@Service
@AutoJsonRpcServiceImpl
public class FuelEcologicalClassJsonRpcServiceComponent
        extends AbstractJsonRpcServiceComponent implements FuelEcologicalClassJsonRpcService {

    @Override
    public BaseFacade<FuelEcologicalClassMapper, FuelEcologicalClassModel, Long> getBaseFacade() {
        return baseFacade;
    }

    @Override
    public Class<FuelEcologicalClassMapper> getMapperClass() {
        return FuelEcologicalClassMapper.class;
    }

    @Override
    public Class<FuelEcologicalClassModel> getModelClass() {
        return FuelEcologicalClassModel.class;
    }
}
