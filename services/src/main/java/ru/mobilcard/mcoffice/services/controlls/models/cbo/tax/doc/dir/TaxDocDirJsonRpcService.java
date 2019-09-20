package ru.mobilcard.mcoffice.services.controlls.models.cbo.tax.doc.dir;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;

import ru.mobilcard.mcoffice.database.models.cbo.TaxDocDirModel;

import java.sql.SQLException;
import java.util.Set;

@JsonRpcService("/tax-doc-dir")
public interface TaxDocDirJsonRpcService {
    public TaxDocDirModel getRecordById(@JsonRpcParam(value = "id") Long id) throws SQLException;

    public Set<TaxDocDirModel> getRecordByModel(@JsonRpcParam(value = "model") TaxDocDirModel model) throws SQLException;

    public Set<TaxDocDirModel> getCollection() throws SQLException;

    public TaxDocDirModel insertRecord(@JsonRpcParam(value = "model") TaxDocDirModel model) throws SQLException;

    public Set<TaxDocDirModel> insertCollectionRecords(@JsonRpcParam(value = "models") Set<TaxDocDirModel> models) throws SQLException;

    public TaxDocDirModel deleteRecord(@JsonRpcParam(value = "model") TaxDocDirModel model) throws SQLException;

    public Set<TaxDocDirModel> deleteCollectionRecords(@JsonRpcParam(value = "models") Set<TaxDocDirModel> models) throws SQLException;

    public TaxDocDirModel updateRecord(@JsonRpcParam(value = "model") TaxDocDirModel model) throws SQLException;

    public Set<TaxDocDirModel> updateCollectionRecord(@JsonRpcParam(value = "models") Set<TaxDocDirModel> models) throws SQLException;
}
