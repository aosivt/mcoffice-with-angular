package ru.mobilcard.mcoffice.services.controlls.models.cbo.article;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;

import ru.mobilcard.mcoffice.database.models.cbo.ArticleModel;


import java.util.Set;

@JsonRpcService("/article")
public interface ArticleJsonRpcService {
    public ArticleModel getRecordById(@JsonRpcParam(value = "id") String id);

    public Set<ArticleModel> getRecordByModel(@JsonRpcParam(value = "model") ArticleModel model);

    public Set<ArticleModel> getCollection();

    public ArticleModel insertRecord(@JsonRpcParam(value = "model") ArticleModel model);

    public Set<ArticleModel> insertCollectionRecords(@JsonRpcParam(value = "models") Set<ArticleModel> models);

    public ArticleModel deleteRecord(@JsonRpcParam(value = "model") ArticleModel model);

    public Set<ArticleModel> deleteCollectionRecords(@JsonRpcParam(value = "models") Set<ArticleModel> models);

    public ArticleModel updateRecord(@JsonRpcParam(value = "model") ArticleModel model);

    public Set<ArticleModel> updateCollectionRecord(@JsonRpcParam(value = "models") Set<ArticleModel> models);
}
