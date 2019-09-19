package ru.mobilcard.mcoffice.services.controlls.models.cbo.ecologicalclass.fuel;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;
import ru.mobilcard.mcoffice.database.models.cbo.FuelEcologicalClassModel;

import java.util.Set;

@JsonRpcService("/fuel-ecological-class")
public interface FuelEcologicalClassJsonRpcService {
    public FuelEcologicalClassModel getRecordById(@JsonRpcParam(value = "id") Long id);

    public Set<FuelEcologicalClassModel> getRecordByModel(@JsonRpcParam(value = "model") FuelEcologicalClassModel model);

    public Set<FuelEcologicalClassModel> getCollection();

    public FuelEcologicalClassModel insertRecord(@JsonRpcParam(value = "model") FuelEcologicalClassModel model);

    public Set<FuelEcologicalClassModel> insertCollectionRecords(@JsonRpcParam(value = "models") Set<FuelEcologicalClassModel> models);

    public FuelEcologicalClassModel deleteRecord(@JsonRpcParam(value = "model") FuelEcologicalClassModel model);

    public Set<FuelEcologicalClassModel> deleteCollectionRecords(@JsonRpcParam(value = "models") Set<FuelEcologicalClassModel> models);

    public FuelEcologicalClassModel updateRecord(@JsonRpcParam(value = "model") FuelEcologicalClassModel model);

    public Set<FuelEcologicalClassModel> updateCollectionRecord(@JsonRpcParam(value = "models") Set<FuelEcologicalClassModel> models);
}
