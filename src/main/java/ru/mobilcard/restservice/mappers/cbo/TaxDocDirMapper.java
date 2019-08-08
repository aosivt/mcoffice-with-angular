package ru.mobilcard.restservice.mappers.cbo;

import ru.mobilcard.restservice.mappers.Mapper;
import ru.mobilcard.restservice.models.cbo.TaxDocDirModel;


import java.util.Set;

public interface TaxDocDirMapper extends Mapper<TaxDocDirModel, Long> {

    @Override
    Set<TaxDocDirModel> getCollectionData();

    @Override
    TaxDocDirModel getById(Long id);

    @Override
    void insert(TaxDocDirModel model);

    @Override
    void delete(TaxDocDirModel model);

    @Override
    void update(TaxDocDirModel model);

    @Override
    void insertCollection(Set<TaxDocDirModel> model);

    @Override
    void deleteCollection(Set<TaxDocDirModel> model);

    @Override
    void updateCollection(Set<TaxDocDirModel> model);

    @Override
    Set<TaxDocDirModel> getByModel(TaxDocDirModel model);

}
