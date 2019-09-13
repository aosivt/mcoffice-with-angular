package ru.mobilcard.mcoffice.services.controlls.models.cbo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ru.mobilcard.mcoffice.database.models.cbo.Tag1214WayPaymentModel;
import ru.mobilcard.mcoffice.services.controlls.models.BaseController;

import ru.mobilcard.mcoffice.database.fasades.BaseFacade;
import ru.mobilcard.mcoffice.database.mappers.cbo.Tag1214WayPaymentMapper;

@RestController()
@RequestMapping(value = "tag1214_way_payment",method = {RequestMethod.GET, RequestMethod.POST})
public class Tag1214WayPaymentController extends BaseController<Tag1214WayPaymentMapper, Tag1214WayPaymentModel, Long> {

    @Override
    protected Class<Tag1214WayPaymentMapper> getMapperClass(){
        return Tag1214WayPaymentMapper.class;
    }
    @Override
    protected Class<Tag1214WayPaymentModel> getModelClass(){
        return Tag1214WayPaymentModel.class;
    }

}
