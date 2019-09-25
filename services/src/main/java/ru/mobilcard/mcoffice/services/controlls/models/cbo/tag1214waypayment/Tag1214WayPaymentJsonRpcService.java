package ru.mobilcard.mcoffice.services.controlls.models.cbo.tag1214waypayment;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;

import ru.mobilcard.mcoffice.database.models.cbo.Tag1214WayPaymentModel;
import ru.mobilcard.mcoffice.services.controlls.config.BaseJsonRpcService;

import java.sql.SQLException;
import java.util.Set;

@JsonRpcService("/tag-1214-way-payment")
public interface Tag1214WayPaymentJsonRpcService extends BaseJsonRpcService {
    public Tag1214WayPaymentModel getRecordById(@JsonRpcParam(value = "id") Long id) throws SQLException;

    public Set<Tag1214WayPaymentModel> getRecordByModel(@JsonRpcParam(value = "model") Tag1214WayPaymentModel model) throws SQLException;

    public Set<Tag1214WayPaymentModel> getCollection() throws SQLException;

    public Tag1214WayPaymentModel insertRecord(@JsonRpcParam(value = "model") Tag1214WayPaymentModel model) throws SQLException;

    public Set<Tag1214WayPaymentModel> insertCollectionRecords(@JsonRpcParam(value = "models") Set<Tag1214WayPaymentModel> models) throws SQLException;

    public Tag1214WayPaymentModel deleteRecord(@JsonRpcParam(value = "model") Tag1214WayPaymentModel model) throws SQLException;

    public Set<Tag1214WayPaymentModel> deleteCollectionRecords(@JsonRpcParam(value = "models") Set<Tag1214WayPaymentModel> models) throws SQLException;

    public Tag1214WayPaymentModel updateRecord(@JsonRpcParam(value = "model") Tag1214WayPaymentModel model) throws SQLException;

    public Set<Tag1214WayPaymentModel> updateCollectionRecord(@JsonRpcParam(value = "models") Set<Tag1214WayPaymentModel> models) throws SQLException;
}
