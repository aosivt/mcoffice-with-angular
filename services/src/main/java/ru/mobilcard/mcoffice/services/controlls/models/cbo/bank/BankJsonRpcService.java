package ru.mobilcard.mcoffice.services.controlls.models.cbo.bank;

import com.googlecode.jsonrpc4j.JsonRpcService;
import ru.mobilcard.mcoffice.services.controlls.config.JsonRpcServiceComponent;

@JsonRpcService("/bank")
public interface BankJsonRpcService extends JsonRpcServiceComponent {}
