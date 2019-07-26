package ru.mobilcard.restservice.mappers.metadata;

import ru.mobilcard.restservice.mappers.Mapper;
import ru.mobilcard.restservice.models.interfaces.Model;
import ru.mobilcard.restservice.models.metadata.UserModel;

import java.util.Set;

public interface UserMapper extends Mapper<UserModel, Long> {

    @Override
    UserModel getById(Long id);

    @Override
    Set<UserModel> getCollectionData();

    @Override
    void insert(UserModel model);

    @Override
    void delete(UserModel model);
}
