package ru.mobilcard.restservice.mappers.cbo;

import org.apache.ibatis.annotations.*;
import ru.mobilcard.restservice.mappers.Mapper;
import ru.mobilcard.restservice.models.cbo.BankModel;
import ru.mobilcard.restservice.models.interfaces.Model;

import java.util.Set;

public interface BankMapper extends Mapper<BankModel, Long> {

    @Override
    Set<BankModel> getCollectionData();

    @Override
    BankModel getById(Long id);

    @Override
    void insert(BankModel model);

    @Override
    void delete(BankModel model);


}
