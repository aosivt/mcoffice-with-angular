package ru.mobilcard.restservice.mappers.cbo;

import java.util.Set;

import ru.mobilcard.restservice.mappers.Mapper;

import ru.mobilcard.restservice.models.cbo.Tag1214WayPaymentModel;



public interface Tag1214WayPaymentMapper extends Mapper<Tag1214WayPaymentModel, Long> {

    @Override
    Set<Tag1214WayPaymentModel> getCollectionData();

    @Override
    Tag1214WayPaymentModel getById(Long id);

    @Override
    void insert(Tag1214WayPaymentModel model);

    @Override
    void delete(Tag1214WayPaymentModel model);

    @Override
    void update(Tag1214WayPaymentModel model);

    @Override
    void insertCollection(Set<Tag1214WayPaymentModel> model);

    @Override
    void deleteCollection(Set<Tag1214WayPaymentModel> model);

    @Override
    void updateCollection(Set<Tag1214WayPaymentModel> model);

}
