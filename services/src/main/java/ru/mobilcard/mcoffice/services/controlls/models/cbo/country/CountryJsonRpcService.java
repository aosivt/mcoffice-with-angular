package ru.mobilcard.mcoffice.services.controlls.models.cbo.country;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;


import ru.mobilcard.mcoffice.database.models.cbo.CountryModel;


import java.sql.SQLException;
import java.util.Set;

@JsonRpcService("/country")
public interface CountryJsonRpcService {
    public CountryModel getRecordById(@JsonRpcParam(value = "id") Long id) throws SQLException;

    public Set<CountryModel> getRecordByModel(@JsonRpcParam(value = "model") CountryModel model) throws SQLException;

    public Set<CountryModel> getCollection() throws SQLException;

    public CountryModel insertRecord(@JsonRpcParam(value = "model") CountryModel model) throws SQLException;

    public Set<CountryModel> insertCollectionRecords(@JsonRpcParam(value = "models") Set<CountryModel> models) throws SQLException;

    public CountryModel deleteRecord(@JsonRpcParam(value = "model") CountryModel model) throws SQLException;

    public Set<CountryModel> deleteCollectionRecords(@JsonRpcParam(value = "models") Set<CountryModel> models) throws SQLException;

    public CountryModel updateRecord(@JsonRpcParam(value = "model") CountryModel model) throws SQLException;

    public Set<CountryModel> updateCollectionRecord(@JsonRpcParam(value = "models") Set<CountryModel> models) throws SQLException;
}
