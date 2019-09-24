package ru.mobilcard.mcoffice.services.controlls.models.wrk.scantechreg;

import java.util.Set;
import java.sql.SQLException;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;

import ru.mobilcard.mcoffice.database.models.wrk.ScanTechRegModel;




@JsonRpcService("/scan-tech-reg")
public interface ScanTechRegJsonRpcService {

    public ScanTechRegModel getRecordById(@JsonRpcParam(value = "id") Long id) throws SQLException;

    public Set<ScanTechRegModel> getRecordByModel(@JsonRpcParam(value = "model") ScanTechRegModel model) throws SQLException;

    public Set<ScanTechRegModel> getCollection() throws SQLException;

    public ScanTechRegModel insertRecord(@JsonRpcParam(value = "model") ScanTechRegModel model) throws SQLException;

    public Set<ScanTechRegModel> insertCollectionRecords(@JsonRpcParam(value = "models") Set<ScanTechRegModel> models) throws SQLException;

    public ScanTechRegModel deleteRecord(@JsonRpcParam(value = "model") ScanTechRegModel model) throws SQLException;

    public Set<ScanTechRegModel> deleteCollectionRecords(@JsonRpcParam(value = "models") Set<ScanTechRegModel> models) throws SQLException;

    public ScanTechRegModel updateRecord(@JsonRpcParam(value = "model") ScanTechRegModel model) throws SQLException;

    public Set<ScanTechRegModel> updateCollectionRecord(@JsonRpcParam(value = "models") Set<ScanTechRegModel> models) throws SQLException;
}
