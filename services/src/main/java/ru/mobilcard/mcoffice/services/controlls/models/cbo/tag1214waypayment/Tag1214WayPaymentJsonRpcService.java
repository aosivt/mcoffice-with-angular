package ru.mobilcard.mcoffice.services.controlls.models.cbo.tag1214waypayment;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;
import ru.mobilcard.mcoffice.database.models.cbo.Tag1214WayPaymentModel;

import java.util.Set;

@JsonRpcService("/fuel-ecological-class")
public interface Tag1214WayPaymentJsonRpcService {
    public Tag1214WayPaymentModel getRecordById(@JsonRpcParam(value = "id") Long id);

    public Set<Tag1214WayPaymentModel> getRecordByModel(@JsonRpcParam(value = "model") Tag1214WayPaymentModel model);

    public Set<Tag1214WayPaymentModel> getCollection();

    public Tag1214WayPaymentModel insertRecord(@JsonRpcParam(value = "model") Tag1214WayPaymentModel model);

    public Set<Tag1214WayPaymentModel> insertCollectionRecords(@JsonRpcParam(value = "models") Set<Tag1214WayPaymentModel> models);

    public Tag1214WayPaymentModel deleteRecord(@JsonRpcParam(value = "model") Tag1214WayPaymentModel model);

    public Set<Tag1214WayPaymentModel> deleteCollectionRecords(@JsonRpcParam(value = "models") Set<Tag1214WayPaymentModel> models);

    public Tag1214WayPaymentModel updateRecord(@JsonRpcParam(value = "model") Tag1214WayPaymentModel model);

    public Set<Tag1214WayPaymentModel> updateCollectionRecord(@JsonRpcParam(value = "models") Set<Tag1214WayPaymentModel> models);
}
