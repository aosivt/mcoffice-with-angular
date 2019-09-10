package ru.mobilcard.mcoffice.services.controlls.models.cbo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.mobilcard.mcoffice.database.models.cbo.BankModel;
import ru.mobilcard.mcoffice.services.controlls.models.BaseController;
import ru.mobilcard.mcoffice.database.mappers.cbo.BankMapper;
import ru.mobilcard.mcoffice.database.fasades.BaseFacade;

@RestController()
@RequestMapping(value = "bank",method = {RequestMethod.GET, RequestMethod.POST})
public class BankController extends BaseController<BankMapper, BankModel, Long> {

    @Override
    protected Class<BankMapper> getMapperClass(){
        return BankMapper.class;
    }
    @Override
    protected Class<BankModel> getModelClass(){
        return BankModel.class;
    }

}
