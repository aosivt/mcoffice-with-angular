package ru.mobilcard.restservice.controlls.models.cbo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.mobilcard.restservice.controlls.models.BaseController;
import ru.mobilcard.restservice.mappers.cbo.ArticleMapper;
import ru.mobilcard.restservice.mappers.cbo.TaxDocDirMapper;
import ru.mobilcard.restservice.models.cbo.ArticleModel;
import ru.mobilcard.restservice.models.cbo.TaxDocDirModel;

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
