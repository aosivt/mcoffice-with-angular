package ru.mobilcard.mcoffice.services.controlls.models.cbo.tax;

import com.googlecode.jsonrpc4j.JsonRpcService;
import ru.mobilcard.mcoffice.services.controlls.config.JsonRpcServiceComponent;

@JsonRpcService("/tax")
public interface TaxJsonRpcService extends JsonRpcServiceComponent {}
