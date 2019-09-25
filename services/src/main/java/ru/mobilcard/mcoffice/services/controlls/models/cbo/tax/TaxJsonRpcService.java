package ru.mobilcard.mcoffice.services.controlls.models.cbo.tax;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;

import ru.mobilcard.mcoffice.database.models.cbo.TaxModel;
import ru.mobilcard.mcoffice.services.controlls.config.BaseJsonRpcService;

import java.sql.SQLException;
import java.util.Set;

@JsonRpcService("/tax")
public interface TaxJsonRpcService extends BaseJsonRpcService {
    public TaxModel getRecordById(@JsonRpcParam(value = "id") Long id) throws SQLException;

    public Set<TaxModel> getRecordByModel(@JsonRpcParam(value = "model") TaxModel model) throws SQLException;

    public Set<TaxModel> getCollection() throws SQLException;

    public TaxModel insertRecord(@JsonRpcParam(value = "model") TaxModel model) throws SQLException;

    public Set<TaxModel> insertCollectionRecords(@JsonRpcParam(value = "models") Set<TaxModel> models) throws SQLException;

    public TaxModel deleteRecord(@JsonRpcParam(value = "model") TaxModel model) throws SQLException;

    public Set<TaxModel> deleteCollectionRecords(@JsonRpcParam(value = "models") Set<TaxModel> models) throws SQLException;

    public TaxModel updateRecord(@JsonRpcParam(value = "model") TaxModel model) throws SQLException;

    public Set<TaxModel> updateCollectionRecord(@JsonRpcParam(value = "models") Set<TaxModel> models) throws SQLException;
}
