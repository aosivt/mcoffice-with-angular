package ru.mobilcard.restservice.mappers;

import ru.mobilcard.restservice.models.interfaces.Dictionary;

import java.util.Set;


public interface Mapper {
    Dictionary getById(Long id);
    Set getCollectionData();
    void insert(Dictionary dictionary);
    void delete(Dictionary dictionary);
}
