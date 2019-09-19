package ru.mobilcard.mcoffice.services.controlls.models.cbo.ecologicalclass.fuel;


import org.springframework.stereotype.Service;

import ru.mobilcard.mcoffice.database.mappers.cbo.FuelEcologicalClassMapper;
import ru.mobilcard.mcoffice.database.models.cbo.FuelEcologicalClassModel;

import ru.mobilcard.mcoffice.services.controlls.config.BaseModelJsonRpcService;


@Service
//@AutoJsonRpcServiceImpl
public class FuelEcologicalClassJsonRpcServiceComponent
        extends BaseModelJsonRpcService<FuelEcologicalClassMapper, FuelEcologicalClassModel, Long>
        implements FuelEcologicalClassJsonRpcService {

    @SuppressWarnings("unchecked")
    @Override
    public Class<FuelEcologicalClassMapper> getMapperClass() {
        return FuelEcologicalClassMapper.class;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<FuelEcologicalClassModel> getModelClass() {
        return FuelEcologicalClassModel.class;
    }
}
