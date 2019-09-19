package ru.mobilcard.mcoffice.services.controlls.models.cbo.bank;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;

import ru.mobilcard.mcoffice.database.models.cbo.BankModel;


import java.util.Set;

@JsonRpcService("/bank")
public interface BankJsonRpcService {
    public BankModel getRecordById(@JsonRpcParam(value = "id") Long id);

    public Set<BankModel> getRecordByModel(@JsonRpcParam(value = "model") BankModel model);

    public Set<BankModel> getCollection();

    public BankModel insertRecord(@JsonRpcParam(value = "model") BankModel model);

    public Set<BankModel> insertCollectionRecords(@JsonRpcParam(value = "models") Set<BankModel> models);

    public BankModel deleteRecord(@JsonRpcParam(value = "model") BankModel model);

    public Set<BankModel> deleteCollectionRecords(@JsonRpcParam(value = "models") Set<BankModel> models);

    public BankModel updateRecord(@JsonRpcParam(value = "model") BankModel model);

    public Set<BankModel> updateCollectionRecord(@JsonRpcParam(value = "models") Set<BankModel> models);
}
