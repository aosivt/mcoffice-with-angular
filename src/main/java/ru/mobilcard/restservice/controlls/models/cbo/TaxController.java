package ru.mobilcard.restservice.controlls.models.cbo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.mobilcard.restservice.controlls.models.BaseController;
import ru.mobilcard.restservice.mappers.cbo.TaxDocDirMapper;
import ru.mobilcard.restservice.mappers.cbo.TaxMapper;
import ru.mobilcard.restservice.models.cbo.TaxDocDirModel;
import ru.mobilcard.restservice.models.cbo.TaxModel;

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
