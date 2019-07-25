package ru.mobilcard.restservice.mappers.cbo;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import ru.mobilcard.restservice.mappers.Mapper;
import ru.mobilcard.restservice.models.cbo.ArticleModel;
import ru.mobilcard.restservice.models.cbo.BankModel;
import ru.mobilcard.restservice.models.interfaces.Dictionary;

import java.util.Set;

public interface ArticleMapper extends Mapper {
    @Select("SELECT external_str_id, name1, name2, " +
            "ecrshortname, ecrlongname, id_market, " +
            "id_pricegroup, id_parent, articletype, " +
            "flg_disable, note, unittype, has_mrc, id_tax_system " +
            "FROM cbo.cbo_articles;")
    @Results({
            @Result(property = "externalStrId", column = "external_str_id"),
            @Result(property = "name1", column = "name1"),
            @Result(property = "name2", column = "name2"),
            @Result(property = "ecrshortname", column = "ecrshortname"),
            @Result(property = "ecrlongname", column = "ecrlongname"),
            @Result(property = "idMarket", column = "id_market"),
            @Result(property = "idPricegroup", column = "id_pricegroup"),
            @Result(property = "idParent", column = "id_parent"),
            @Result(property = "articletype", column = "articletype"),
            @Result(property = "flgDisable", column = "flg_disable"),
            @Result(property = "note", column = "note"),
            @Result(property = "unittype", column = "unittype"),
            @Result(property = "hasMrc", column = "has_mrc"),
            @Result(property = "idTaxSystem", column = "id_tax_system")
    })
    @Override
    Set<ArticleModel> getCollectionData();

    @Select("SELECT external_str_id, name1, name2, " +
            "ecrshortname, ecrlongname, id_market, " +
            "id_pricegroup, id_parent, articletype, " +
            "flg_disable, note, unittype, has_mrc, id_tax_system " +
            "FROM cbo.cbo_articles a where a.external_str_id = = #{externalStrId}")
    @Results({
            @Result(property = "externalStrId", column = "external_str_id"),
            @Result(property = "name1", column = "name1"),
            @Result(property = "name2", column = "name2"),
            @Result(property = "ecrshortname", column = "ecrshortname"),
            @Result(property = "ecrlongname", column = "ecrlongname"),
            @Result(property = "idMarket", column = "id_market"),
            @Result(property = "idPricegroup", column = "id_pricegroup"),
            @Result(property = "idParent", column = "id_parent"),
            @Result(property = "articletype", column = "articletype"),
            @Result(property = "flgDisable", column = "flg_disable"),
            @Result(property = "note", column = "note"),
            @Result(property = "unittype", column = "unittype"),
            @Result(property = "hasMrc", column = "has_mrc"),
            @Result(property = "idTaxSystem", column = "id_tax_system")
    })
    @Override
    Dictionary getById(Long id);

    @Override
    void insert(Dictionary dictionary);

    @Override
    void delete(Dictionary dictionary);
}
