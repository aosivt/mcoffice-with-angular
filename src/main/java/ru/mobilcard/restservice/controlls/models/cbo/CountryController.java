package ru.mobilcard.restservice.controlls.models.cbo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.mobilcard.restservice.controlls.models.BaseController;
import ru.mobilcard.restservice.mappers.cbo.CountryMapper;
import ru.mobilcard.restservice.models.cbo.CountryModel;

@RestController()
@RequestMapping(value = "country",method = {RequestMethod.GET, RequestMethod.POST})
public class CountryController extends BaseController<CountryMapper, CountryModel, Long> {

    @Override
    protected Class<CountryMapper> getMapperClass(){
        return CountryMapper.class;
    }
    @Override
    protected Class<CountryModel> getModelClass(){
        return CountryModel.class;
    }

}
