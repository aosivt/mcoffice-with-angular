package ru.mobilcard.mcoffice.services.controlls.models.cbo.country;

import com.googlecode.jsonrpc4j.JsonRpcService;
import ru.mobilcard.mcoffice.services.controlls.config.JsonRpcServiceComponent;

@JsonRpcService("/country")
public interface CountryJsonRpcService extends JsonRpcServiceComponent {}
