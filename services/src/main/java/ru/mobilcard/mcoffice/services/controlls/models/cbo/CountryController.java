package ru.mobilcard.mcoffice.services.controlls.models.cbo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.mobilcard.mcoffice.database.models.cbo.CountryModel;
import ru.mobilcard.mcoffice.services.controlls.models.BaseController;
import ru.mobilcard.mcoffice.database.fasades.BaseFacade;
import ru.mobilcard.mcoffice.database.mappers.cbo.CountryMapper;

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
