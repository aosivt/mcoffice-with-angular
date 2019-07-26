package ru.mobilcard.restservice.controlls.models.cbo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.mobilcard.restservice.controlls.DefaultController;
import ru.mobilcard.restservice.controlls.models.BaseController;
import ru.mobilcard.restservice.mappers.cbo.BankMapper;
import ru.mobilcard.restservice.models.cbo.BankModel;
import ru.mobilcard.restservice.fasades.BaseFacade;

@RestController()
@RequestMapping(value = "bank",method = {RequestMethod.GET, RequestMethod.POST})
public class BankController extends BaseController<BankMapper,BankModel, Long> {

    @Override
    protected Class<BankMapper> getMapperClass(){
        return BankMapper.class;
    }
    @Override
    protected Class<BankModel> getModelClass(){
        return BankModel.class;
    }

}
