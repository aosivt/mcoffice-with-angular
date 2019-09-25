package ru.mobilcard.mcoffice.services.controlls.models.cbo.ecologicalclass.fuel;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;

import ru.mobilcard.mcoffice.database.models.cbo.FuelEcologicalClassModel;
import ru.mobilcard.mcoffice.services.controlls.config.BaseJsonRpcService;

import java.sql.SQLException;
import java.util.Set;

@JsonRpcService("/fuel-ecological-class")
public interface FuelEcologicalClassJsonRpcService extends BaseJsonRpcService {
    public FuelEcologicalClassModel getRecordById(@JsonRpcParam(value = "id") Long id) throws SQLException;

    public Set<FuelEcologicalClassModel> getRecordByModel(@JsonRpcParam(value = "model") FuelEcologicalClassModel model) throws SQLException;

    public Set<FuelEcologicalClassModel> getCollection() throws SQLException;

    public FuelEcologicalClassModel insertRecord(@JsonRpcParam(value = "model") FuelEcologicalClassModel model) throws SQLException;

    public Set<FuelEcologicalClassModel> insertCollectionRecords(@JsonRpcParam(value = "models") Set<FuelEcologicalClassModel> models) throws SQLException;

    public FuelEcologicalClassModel deleteRecord(@JsonRpcParam(value = "model") FuelEcologicalClassModel model) throws SQLException;

    public Set<FuelEcologicalClassModel> deleteCollectionRecords(@JsonRpcParam(value = "models") Set<FuelEcologicalClassModel> models) throws SQLException;

    public FuelEcologicalClassModel updateRecord(@JsonRpcParam(value = "model") FuelEcologicalClassModel model) throws SQLException;

    public Set<FuelEcologicalClassModel> updateCollectionRecord(@JsonRpcParam(value = "models") Set<FuelEcologicalClassModel> models) throws SQLException;
}
