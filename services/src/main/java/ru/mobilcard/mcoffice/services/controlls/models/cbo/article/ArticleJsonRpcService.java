package ru.mobilcard.mcoffice.services.controlls.models.cbo.article;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;

import org.postgresql.util.PSQLException;
import ru.mobilcard.mcoffice.database.models.cbo.ArticleModel;


import java.sql.SQLException;
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

}
