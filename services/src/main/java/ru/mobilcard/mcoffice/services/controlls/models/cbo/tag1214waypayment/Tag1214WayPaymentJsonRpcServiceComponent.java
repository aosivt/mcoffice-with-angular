package ru.mobilcard.mcoffice.services.controlls.models.cbo.tag1214waypayment;


import org.springframework.stereotype.Service;
import ru.mobilcard.mcoffice.database.mappers.cbo.Tag1214WayPaymentMapper;
import ru.mobilcard.mcoffice.database.models.cbo.Tag1214WayPaymentModel;
import ru.mobilcard.mcoffice.services.controlls.config.BaseModelJsonRpcService;


@Service
//@AutoJsonRpcServiceImpl
public class Tag1214WayPaymentJsonRpcServiceComponent
        extends BaseModelJsonRpcService<Tag1214WayPaymentMapper, Tag1214WayPaymentModel, Long>
        implements Tag1214WayPaymentJsonRpcService {

    @SuppressWarnings("unchecked")
    @Override
    public Class<Tag1214WayPaymentMapper> getMapperClass() {
        return Tag1214WayPaymentMapper.class;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<Tag1214WayPaymentModel> getModelClass() {
        return Tag1214WayPaymentModel.class;
    }
}
