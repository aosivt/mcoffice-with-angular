package ru.mobilcard.mcoffice.services.controlls.models.cbo.article;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;

import org.postgresql.util.PSQLException;
import ru.mobilcard.mcoffice.database.config.interfaces.annotations.gui.fields.TableFields;
import ru.mobilcard.mcoffice.database.mappers.wrk.ScanTechRegMapper;
import ru.mobilcard.mcoffice.database.models.cbo.ArticleModel;
import ru.mobilcard.mcoffice.database.models.wrk.ScanTechRegModel;


import java.lang.reflect.Proxy;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;

@JsonRpcService("/article")
public interface ArticleJsonRpcService {

    public ArticleModel getRecordById(@JsonRpcParam(value = "id") String id) throws SQLException;

    public Set<ArticleModel> getRecordByModel(@JsonRpcParam(value = "model") ArticleModel model) throws SQLException;

    public Set<ArticleModel> getCollection() throws SQLException;

    public ArticleModel insertRecord(@JsonRpcParam(value = "model") ArticleModel model) throws SQLException;

    public Set<ArticleModel> insertCollectionRecords(@JsonRpcParam(value = "models") Set<ArticleModel> models) throws SQLException;

    public ArticleModel deleteRecord(@JsonRpcParam(value = "model") ArticleModel model) throws SQLException;

    public Set<ArticleModel> deleteCollectionRecords(@JsonRpcParam(value = "models") Set<ArticleModel> models) throws SQLException;

    public ArticleModel updateRecord(@JsonRpcParam(value = "model") ArticleModel model) throws SQLException;

    public Set<ArticleModel> updateCollectionRecord(@JsonRpcParam(value = "models") Set<ArticleModel> models) throws SQLException;

    public List getTableFieldsAnnotations() throws Exception;

}
