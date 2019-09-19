package ru.mobilcard.mcoffice.services.controlls.models.cbo.country;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;
import ru.mobilcard.mcoffice.database.models.cbo.BankModel;
import ru.mobilcard.mcoffice.database.models.cbo.CountryModel;
import ru.mobilcard.mcoffice.services.controlls.config.JsonRpcServiceComponent;

import java.util.Set;

@JsonRpcService("/country")
public interface CountryJsonRpcService {
    public CountryModel getRecordById(@JsonRpcParam(value = "id") Long id);

    public Set<CountryModel> getRecordByModel(@JsonRpcParam(value = "model") CountryModel model);

    public Set<CountryModel> getCollection();

    public CountryModel insertRecord(@JsonRpcParam(value = "model") CountryModel model);

    public Set<CountryModel> insertCollectionRecords(@JsonRpcParam(value = "models") Set<CountryModel> models);

    public CountryModel deleteRecord(@JsonRpcParam(value = "model") CountryModel model);

    public Set<CountryModel> deleteCollectionRecords(@JsonRpcParam(value = "models") Set<CountryModel> models);

    public CountryModel updateRecord(@JsonRpcParam(value = "model") CountryModel model);

    public Set<CountryModel> updateCollectionRecord(@JsonRpcParam(value = "models") Set<CountryModel> models);
}
