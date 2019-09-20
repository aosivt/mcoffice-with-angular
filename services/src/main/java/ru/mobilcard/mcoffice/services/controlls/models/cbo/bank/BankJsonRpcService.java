package ru.mobilcard.mcoffice.services.controlls.models.cbo.bank;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;

import ru.mobilcard.mcoffice.database.models.cbo.BankModel;


import java.sql.SQLException;
import java.util.Set;

@JsonRpcService("/bank")
public interface BankJsonRpcService {
    public BankModel getRecordById(@JsonRpcParam(value = "id") Long id) throws SQLException;

    public Set<BankModel> getRecordByModel(@JsonRpcParam(value = "model") BankModel model) throws SQLException;

    public Set<BankModel> getCollection() throws SQLException;

    public BankModel insertRecord(@JsonRpcParam(value = "model") BankModel model) throws SQLException;

    public Set<BankModel> insertCollectionRecords(@JsonRpcParam(value = "models") Set<BankModel> models) throws SQLException;

    public BankModel deleteRecord(@JsonRpcParam(value = "model") BankModel model) throws SQLException;

    public Set<BankModel> deleteCollectionRecords(@JsonRpcParam(value = "models") Set<BankModel> models) throws SQLException;

    public BankModel updateRecord(@JsonRpcParam(value = "model") BankModel model) throws SQLException;

    public Set<BankModel> updateCollectionRecord(@JsonRpcParam(value = "models") Set<BankModel> models) throws SQLException;
}
