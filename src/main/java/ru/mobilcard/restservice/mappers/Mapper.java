package ru.mobilcard.restservice.mappers;

import ru.mobilcard.restservice.models.interfaces.Model;

import java.util.Set;


public interface Mapper<ModelType extends Model,IdentifierType> {
    ModelType getById(IdentifierType id);
    Set<ModelType> getCollectionData();
    void insert(ModelType model);
    void delete(ModelType model);
}
