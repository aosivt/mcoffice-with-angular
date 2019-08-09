package ru.mobilcard.restservice.controlls.models.cbo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.mobilcard.restservice.controlls.models.BaseController;
import ru.mobilcard.restservice.mappers.cbo.BankMapper;
import ru.mobilcard.restservice.mappers.cbo.FuelEcologicalClassMapper;
import ru.mobilcard.restservice.models.cbo.BankModel;
import ru.mobilcard.restservice.models.cbo.FuelEcologicalClassModel;

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
