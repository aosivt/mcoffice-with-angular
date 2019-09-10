package ru.mobilcard.mcoffice.services.controlls.models.cbo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.mobilcard.mcoffice.database.models.cbo.FuelEcologicalClassModel;
import ru.mobilcard.mcoffice.services.controlls.models.BaseController;
import ru.mobilcard.mcoffice.database.fasades.BaseFacade;
import ru.mobilcard.mcoffice.database.mappers.cbo.FuelEcologicalClassMapper;

@RestController()
@RequestMapping(value = "fuel_ecological_class",method = {RequestMethod.GET, RequestMethod.POST})
public class FuelEcologicalClassController extends BaseController<FuelEcologicalClassMapper, FuelEcologicalClassModel, Long> {

    @Override
    protected Class<FuelEcologicalClassMapper> getMapperClass(){
        return FuelEcologicalClassMapper.class;
    }
    @Override
    protected Class<FuelEcologicalClassModel> getModelClass(){
        return FuelEcologicalClassModel.class;
    }

}
