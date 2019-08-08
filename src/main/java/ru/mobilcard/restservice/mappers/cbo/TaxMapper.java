package ru.mobilcard.restservice.mappers.cbo;

import ru.mobilcard.restservice.mappers.Mapper;
import ru.mobilcard.restservice.models.cbo.TaxModel;

import java.util.Set;

public interface TaxMapper extends Mapper<TaxModel, Long> {

    @Override
    Set<TaxModel> getCollectionData();

    @Override
    TaxModel getById(Long id);

    @Override
    void insert(TaxModel model);

    @Override
    void delete(TaxModel model);

    @Override
    void update(TaxModel model);

    @Override
    void insertCollection(Set<TaxModel> model);

    @Override
    void deleteCollection(Set<TaxModel> model);

    @Override
    void updateCollection(Set<TaxModel> model);

    @Override
    Set<TaxModel> getByModel(TaxModel model);

}
