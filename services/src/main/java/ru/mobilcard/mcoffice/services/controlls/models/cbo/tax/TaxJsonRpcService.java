package ru.mobilcard.mcoffice.services.controlls.models.cbo.tax;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;
import ru.mobilcard.mcoffice.database.models.cbo.TaxModel;
import java.util.Set;

@JsonRpcService("/tax")
public interface TaxJsonRpcService {
    public TaxModel getRecordById(@JsonRpcParam(value = "id") Long id);

    public Set<TaxModel> getRecordByModel(@JsonRpcParam(value = "model") TaxModel model);

    public Set<TaxModel> getCollection();

    public TaxModel insertRecord(@JsonRpcParam(value = "model") TaxModel model);

    public Set<TaxModel> insertCollectionRecords(@JsonRpcParam(value = "models") Set<TaxModel> models);

    public TaxModel deleteRecord(@JsonRpcParam(value = "model") TaxModel model);

    public Set<TaxModel> deleteCollectionRecords(@JsonRpcParam(value = "models") Set<TaxModel> models);

    public TaxModel updateRecord(@JsonRpcParam(value = "model") TaxModel model);

    public Set<TaxModel> updateCollectionRecord(@JsonRpcParam(value = "models") Set<TaxModel> models);
}
