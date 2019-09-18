package ru.mobilcard.mcoffice.services.controlls.config;

import org.springframework.beans.factory.annotation.Autowired;
import ru.mobilcard.mcoffice.database.fasades.BaseFacade;
import ru.mobilcard.mcoffice.database.mappers.Mapper;
import ru.mobilcard.mcoffice.database.mappers.cbo.ArticleMapper;
import ru.mobilcard.mcoffice.database.models.cbo.ArticleModel;
import ru.mobilcard.mcoffice.database.models.interfaces.Model;

public abstract class AbstractJsonRpcServiceComponent implements JsonRpcServiceComponent {

    @Autowired
    protected BaseFacade baseFacade;

}
