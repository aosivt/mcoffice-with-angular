package ru.mobilcard.restservice.mappers.cbo;

import ru.mobilcard.restservice.mappers.Mapper;
import ru.mobilcard.restservice.models.cbo.ArticleModel;
import ru.mobilcard.restservice.models.cbo.BankModel;

import java.util.Set;

@org.apache.ibatis.annotations.Mapper
public interface BankMapper extends Mapper<BankModel, Long> {

    @Override
    Set<BankModel> getCollectionData();

    @Override
    BankModel getById(Long id);

    @Override
    void insert(BankModel model);

    @Override
    void delete(BankModel model);

    @Override
    void update(BankModel model);

    @Override
    void insertCollection(Set<BankModel> model);

    @Override
    void deleteCollection(Set<BankModel> model);

    @Override
    void updateCollection(Set<BankModel> model);

    @Override
    Set<BankModel> getByModel(BankModel model);

}
