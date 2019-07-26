package ru.mobilcard.restservice.mappers;

import ru.mobilcard.restservice.models.interfaces.Model;

import java.util.Set;


public interface Mapper<IdentifierType> {
    Model getById(IdentifierType id);
    Set getCollectionData();
    void insert(Model dictionary);
    void delete(Model dictionary);
}
