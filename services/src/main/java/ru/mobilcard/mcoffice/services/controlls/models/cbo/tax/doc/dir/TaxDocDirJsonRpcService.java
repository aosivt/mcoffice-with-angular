package ru.mobilcard.mcoffice.services.controlls.models.cbo.tax.doc.dir;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;
import ru.mobilcard.mcoffice.database.models.cbo.TaxDocDirModel;

import java.util.Set;

@JsonRpcService("/tax-doc-dir")
public interface TaxDocDirJsonRpcService {
    public TaxDocDirModel getRecordById(@JsonRpcParam(value = "id") Long id);

    public Set<TaxDocDirModel> getRecordByModel(@JsonRpcParam(value = "model") TaxDocDirModel model);

    public Set<TaxDocDirModel> getCollection();

    public TaxDocDirModel insertRecord(@JsonRpcParam(value = "model") TaxDocDirModel model);

    public Set<TaxDocDirModel> insertCollectionRecords(@JsonRpcParam(value = "models") Set<TaxDocDirModel> models);

    public TaxDocDirModel deleteRecord(@JsonRpcParam(value = "model") TaxDocDirModel model);

    public Set<TaxDocDirModel> deleteCollectionRecords(@JsonRpcParam(value = "models") Set<TaxDocDirModel> models);

    public TaxDocDirModel updateRecord(@JsonRpcParam(value = "model") TaxDocDirModel model);

    public Set<TaxDocDirModel> updateCollectionRecord(@JsonRpcParam(value = "models") Set<TaxDocDirModel> models);
}
