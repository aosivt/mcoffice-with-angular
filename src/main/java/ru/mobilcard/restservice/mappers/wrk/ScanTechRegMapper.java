package ru.mobilcard.restservice.mappers.wrk;

import ru.mobilcard.restservice.mappers.Mapper;
import ru.mobilcard.restservice.models.cbo.CountryModel;
import ru.mobilcard.restservice.models.wrk.ScanTechRegModel;

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
