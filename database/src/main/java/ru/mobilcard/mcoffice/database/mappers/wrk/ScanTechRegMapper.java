package ru.mobilcard.mcoffice.database.mappers.wrk;

import ru.mobilcard.mcoffice.database.models.wrk.ScanTechRegModel;
import ru.mobilcard.mcoffice.database.mappers.Mapper;

import java.util.Set;

public interface ScanTechRegMapper extends Mapper<ScanTechRegModel, Long> {

    @Override
    Set<ScanTechRegModel> getCollectionData();

    @Override
    ScanTechRegModel getById(Long id);

    @Override
    void insert(ScanTechRegModel model);

    @Override
    void delete(ScanTechRegModel model);

    @Override
    void update(ScanTechRegModel model);

    @Override
    void insertCollection(Set<ScanTechRegModel> model);

    @Override
    void deleteCollection(Set<ScanTechRegModel> model);

    @Override
    void updateCollection(Set<ScanTechRegModel> model);

    @Override
    Set<ScanTechRegModel> getByModel(ScanTechRegModel model);

}
