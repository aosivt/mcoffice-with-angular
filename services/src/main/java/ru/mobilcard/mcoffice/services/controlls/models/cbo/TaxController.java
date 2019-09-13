package ru.mobilcard.mcoffice.services.controlls.models.cbo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.mobilcard.mcoffice.database.models.cbo.TaxModel;
import ru.mobilcard.mcoffice.services.controlls.models.BaseController;
import ru.mobilcard.mcoffice.database.fasades.BaseFacade;
import ru.mobilcard.mcoffice.database.mappers.cbo.TaxMapper;

@RestController()
@RequestMapping(value = "tax",method = {RequestMethod.GET, RequestMethod.POST})
public class TaxController extends BaseController<TaxMapper, TaxModel, Long> {

    @Override
    protected Class<TaxMapper> getMapperClass(){
        return TaxMapper.class;
    }
    @Override
    protected Class<TaxModel> getModelClass(){
        return TaxModel.class;
    }

}
