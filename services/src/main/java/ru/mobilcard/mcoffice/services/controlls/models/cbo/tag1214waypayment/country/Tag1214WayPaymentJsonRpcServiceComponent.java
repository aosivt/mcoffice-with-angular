package ru.mobilcard.mcoffice.services.controlls.models.cbo.tag1214waypayment.country;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import org.springframework.stereotype.Service;
import ru.mobilcard.mcoffice.database.fasades.BaseFacade;
import ru.mobilcard.mcoffice.database.mappers.cbo.ArticleMapper;
import ru.mobilcard.mcoffice.database.mappers.cbo.CountryMapper;
import ru.mobilcard.mcoffice.database.mappers.cbo.Tag1214WayPaymentMapper;
import ru.mobilcard.mcoffice.database.models.cbo.ArticleModel;
import ru.mobilcard.mcoffice.database.models.cbo.CountryModel;
import ru.mobilcard.mcoffice.database.models.cbo.Tag1214WayPaymentModel;
import ru.mobilcard.mcoffice.services.controlls.config.AbstractJsonRpcServiceComponent;

@Service
@AutoJsonRpcServiceImpl
public class Tag1214WayPaymentJsonRpcServiceComponent
        extends AbstractJsonRpcServiceComponent implements Tag1214WayPaymentJsonRpcService {

    @Override
    public BaseFacade<Tag1214WayPaymentMapper, Tag1214WayPaymentModel, Long> getBaseFacade() {
        return baseFacade;
    }

    @Override
    public Class<Tag1214WayPaymentMapper> getMapperClass() {
        return Tag1214WayPaymentMapper.class;
    }

    @Override
    public Class<Tag1214WayPaymentModel> getModelClass() {
        return Tag1214WayPaymentModel.class;
    }
}
