package ru.mobilcard.mcoffice.database.mappers.cbo;

import ru.mobilcard.mcoffice.database.models.cbo.FuelEcologicalClassModel;
import ru.mobilcard.mcoffice.database.mappers.Mapper;

import java.util.Set;

public interface FuelEcologicalClassMapper extends Mapper<FuelEcologicalClassModel, Long> {

    @Override
    Set<FuelEcologicalClassModel> getCollectionData();

    @Override
    FuelEcologicalClassModel getById(Long id);

    @Override
    void insert(FuelEcologicalClassModel model);

    @Override
    void delete(FuelEcologicalClassModel model);

    @Override
    void update(FuelEcologicalClassModel model);

    @Override
    void insertCollection(Set<FuelEcologicalClassModel> model);

    @Override
    void deleteCollection(Set<FuelEcologicalClassModel> model);

    @Override
    void updateCollection(Set<FuelEcologicalClassModel> model);

    @Override
    Set<FuelEcologicalClassModel> getByModel(FuelEcologicalClassModel model);

}
