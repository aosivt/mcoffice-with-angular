package ru.mobilcard.mcoffice.database.models.cbo;

import lombok.*;
import ru.mobilcard.mcoffice.database.config.interfaces.annotations.gui.fields.TableField;
import ru.mobilcard.mcoffice.database.models.interfaces.Model;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleModel implements Model {

    @TableField(key = "externalStrId", value = "Идентификтор")
    private String externalStrId;
    @TableField(key = "name1", value = "Наименование", view = true)
    private String name1;
    @TableField(key = "name2", value = "Еще одно наименование")
    private String name2;
    @TableField(key = "ecrshortname", value = "Короткое наименование", view = true)
    private String ecrshortname;
    @TableField(key = "ecrlongname", value = "Длинное наименование", view = true)
    private String ecrlongname;
    @TableField(key = "idMarket", value = "Идентификатор магазина")
    private Long idMarket;
    @TableField(key = "idPricegroup", value = "Идентификатор группы")
    private String idPricegroup;
    @TableField(key = "idParent", value = "Родительский идентификатор")
    private Long idParent;
    @TableField(key = "articletype", value = "Тип номенклатуры", view = true)
    private String articletype;
    @TableField(key = "flgDisable", value = "Заблокирован", view = true)
    private String flgDisable;
    @TableField(key = "note", value = "Описание", view = true)
    private String note;
    @TableField(key = "unittype", value = "Тип единифи измерения", view = true)
    private String unittype;
    @TableField(key = "hasMrc", value = "Есть минимальная цена", view = true)
    private Boolean hasMrc;
    @TableField(key = "hasMrc", value = "Налогооблажение")
    private String idTaxSystem;

    @Override
    public String getId() {
        return externalStrId;
    }
}
