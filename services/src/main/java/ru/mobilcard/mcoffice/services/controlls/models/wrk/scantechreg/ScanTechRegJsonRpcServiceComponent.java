package ru.mobilcard.mcoffice.services.controlls.models.wrk.scantechreg;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import org.springframework.stereotype.Service;
import ru.mobilcard.mcoffice.database.mappers.cbo.TaxDocDirMapper;
import ru.mobilcard.mcoffice.database.mappers.wrk.ScanTechRegMapper;
import ru.mobilcard.mcoffice.database.models.cbo.TaxDocDirModel;
import ru.mobilcard.mcoffice.database.models.wrk.ScanTechRegModel;
import ru.mobilcard.mcoffice.services.controlls.config.BaseModelJsonRpcService;
import ru.mobilcard.mcoffice.services.controlls.models.cbo.tax.doc.dir.TaxDocDirJsonRpcService;

@Service
@AutoJsonRpcServiceImpl
public class ScanTechRegJsonRpcServiceComponent  extends BaseModelJsonRpcService<ScanTechRegMapper, ScanTechRegModel, Long>
        implements ScanTechRegJsonRpcService {


    @Override
    public Class<ScanTechRegMapper> getMapperClass() {
        return ScanTechRegMapper.class;
    }

    @Override

    public Class<ScanTechRegModel> getModelClass() {
        return ScanTechRegModel.class;
    }
}
