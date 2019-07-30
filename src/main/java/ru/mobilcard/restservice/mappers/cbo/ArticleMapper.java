package ru.mobilcard.restservice.mappers.cbo;

import ru.mobilcard.restservice.mappers.Mapper;

import ru.mobilcard.restservice.models.cbo.ArticleModel;


import java.util.Set;

public interface ArticleMapper extends Mapper<ArticleModel, String> {

    @Override
    Set<ArticleModel> getCollectionData();

    @Override
    ArticleModel getById(String id);

    @Override
    void insert(ArticleModel model);

    @Override
    void delete(ArticleModel model);

    @Override
    void update(ArticleModel model);

    @Override
    void insertCollection(Set<ArticleModel> model);

    @Override
    void deleteCollection(Set<ArticleModel> model);

    @Override
    void updateCollection(Set<ArticleModel> model);
}
