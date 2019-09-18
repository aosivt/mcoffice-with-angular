package ru.mobilcard.mcoffice.services.controlls.models.wrk.scantechreg;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import org.springframework.stereotype.Service;
import ru.mobilcard.mcoffice.database.fasades.BaseFacade;
import ru.mobilcard.mcoffice.database.mappers.cbo.ArticleMapper;
import ru.mobilcard.mcoffice.database.mappers.cbo.CountryMapper;
import ru.mobilcard.mcoffice.database.mappers.wrk.ScanTechRegMapper;
import ru.mobilcard.mcoffice.database.models.cbo.ArticleModel;
import ru.mobilcard.mcoffice.database.models.cbo.CountryModel;
import ru.mobilcard.mcoffice.database.models.wrk.ScanTechRegModel;
import ru.mobilcard.mcoffice.services.controlls.config.AbstractJsonRpcServiceComponent;

@Service
@AutoJsonRpcServiceImpl
public class ScanTechRegJsonRpcServiceComponent extends AbstractJsonRpcServiceComponent implements ScanTechRegJsonRpcService {

    @Override
    public BaseFacade<ScanTechRegMapper, ScanTechRegModel, Long> getBaseFacade() {
        return baseFacade;
    }

    @Override
    public Class<ScanTechRegMapper> getMapperClass() {
        return ScanTechRegMapper.class;
    }

    @Override
    public Class<ScanTechRegModel> getModelClass() {
        return ScanTechRegModel.class;
    }
}
