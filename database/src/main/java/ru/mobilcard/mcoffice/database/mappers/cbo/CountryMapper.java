package ru.mobilcard.mcoffice.database.mappers.cbo;

import ru.mobilcard.mcoffice.database.mappers.Mapper;
import ru.mobilcard.mcoffice.database.models.cbo.CountryModel;

import java.util.Set;

public interface CountryMapper extends Mapper<CountryModel, Long> {

    @Override
    Set<CountryModel> getCollectionData();

    @Override
    CountryModel getById(Long id);

    @Override
    void insert(CountryModel model);

    @Override
    void delete(CountryModel model);

    @Override
    void update(CountryModel model);

    @Override
    void insertCollection(Set<CountryModel> model);

    @Override
    void deleteCollection(Set<CountryModel> model);

    @Override
    void updateCollection(Set<CountryModel> model);

    @Override
    Set<CountryModel> getByModel(CountryModel model);

}
