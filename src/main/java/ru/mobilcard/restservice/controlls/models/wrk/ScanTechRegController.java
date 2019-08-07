package ru.mobilcard.restservice.controlls.models.wrk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.mobilcard.restservice.controlls.models.BaseController;
import ru.mobilcard.restservice.mappers.cbo.CountryMapper;
import ru.mobilcard.restservice.mappers.wrk.ScanTechRegMapper;
import ru.mobilcard.restservice.models.cbo.CountryModel;
import ru.mobilcard.restservice.models.wrk.ScanTechRegModel;

@RestController()
@RequestMapping(value = "scantech_reg",method = {RequestMethod.GET, RequestMethod.POST})
public class ScanTechRegController extends BaseController<ScanTechRegMapper, ScanTechRegModel, Long> {

    @Override
    protected Class<ScanTechRegMapper> getMapperClass(){
        return ScanTechRegMapper.class;
    }
    @Override
    protected Class<ScanTechRegModel> getModelClass(){
        return ScanTechRegModel.class;
    }

}
