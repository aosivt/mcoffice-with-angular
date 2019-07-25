package ru.mobilcard.restservice.mappers.cbo;

import org.apache.ibatis.annotations.*;
import ru.mobilcard.restservice.mappers.Mapper;
import ru.mobilcard.restservice.models.cbo.BankModel;
import ru.mobilcard.restservice.models.interfaces.Dictionary;

import java.util.Set;

public interface BankMapper extends Mapper {

    @Select("select * from cbo.banks")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "bankBik", column = "bankbik"),
            @Result(property = "korAccount", column = "koraccount"),
            @Result(property = "name", column = "nname"),
            @Result(property = "nameShort", column = "nameshort"),
            @Result(property = "inn", column = "inn"),
            @Result(property = "kpp", column = "kpp"),
            @Result(property = "bankState", column = "bank_state")
    })
    Set<BankModel> getCollectionData();

    @Select("select * from cbo.banks b where b.id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "bankBik", column = "bankbik"),
            @Result(property = "korAccount", column = "koraccount"),
            @Result(property = "name", column = "nname"),
            @Result(property = "nameShort", column = "nameshort"),
            @Result(property = "inn", column = "inn"),
            @Result(property = "kpp", column = "kpp"),
            @Result(property = "bankState", column = "bank_state")
    })
    BankModel getById(Long id);

    @Insert("insert into cbo.banks (bankbik,koraccount,nname,nameshort,inn,kpp,bank_state) " +
            "VALUES(#{bankBik}, #{korAccount}, #{name}, #{nameShort}, #{inn}, #{kpp}, #{bankState})")
    void insert(Dictionary dictionary);

    @Delete("delete from cbo.banks where id = #{id}")
    void delete(Dictionary dictionary);


}
