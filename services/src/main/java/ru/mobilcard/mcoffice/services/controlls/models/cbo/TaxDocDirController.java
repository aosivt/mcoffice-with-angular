package ru.mobilcard.mcoffice.services.controlls.models.cbo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.mobilcard.mcoffice.database.models.cbo.TaxDocDirModel;
import ru.mobilcard.mcoffice.services.controlls.models.BaseController;
import ru.mobilcard.mcoffice.database.fasades.BaseFacade;
import ru.mobilcard.mcoffice.database.mappers.cbo.TaxDocDirMapper;

@RestController()
@RequestMapping(value = "tax_doc_dir",method = {RequestMethod.GET, RequestMethod.POST})
public class TaxDocDirController extends BaseController<TaxDocDirMapper, TaxDocDirModel, Long> {

    @Override
    protected Class<TaxDocDirMapper> getMapperClass(){
        return TaxDocDirMapper.class;
    }
    @Override
    protected Class<TaxDocDirModel> getModelClass(){
        return TaxDocDirModel.class;
    }

}
