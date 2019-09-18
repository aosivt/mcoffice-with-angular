package ru.mobilcard.mcoffice.services.controlls.models.cbo.article;

import com.googlecode.jsonrpc4j.JsonRpcService;
import ru.mobilcard.mcoffice.services.controlls.config.JsonRpcServiceComponent;

@JsonRpcService("/article")
public interface ArticleJsonRpcService extends JsonRpcServiceComponent {}
