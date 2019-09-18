package ru.mobilcard.mcoffice.services.controlls.models.wrk.scantechreg;

import com.googlecode.jsonrpc4j.JsonRpcService;
import ru.mobilcard.mcoffice.services.controlls.config.JsonRpcServiceComponent;

@JsonRpcService("/scan-tech-reg")
public interface ScanTechRegJsonRpcService extends JsonRpcServiceComponent {}
