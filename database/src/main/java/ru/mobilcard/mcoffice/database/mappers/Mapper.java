package ru.mobilcard.mcoffice.database.mappers;

import ru.mobilcard.mcoffice.database.models.interfaces.Model;

import java.util.Set;


public interface Mapper<ModelType extends Model,IdentifierType> {
    ModelType getById(IdentifierType id);
    Set<ModelType> getByModel(ModelType model);
    Set<ModelType> getCollectionData();
    void insert(ModelType model);
    void insertCollection(Set<ModelType> model);
    void delete(ModelType model);
    void deleteCollection(Set<ModelType> model);
    void update(ModelType model);
    void updateCollection(Set<ModelType> model);
}
