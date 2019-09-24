package ru.mobilcard.mcoffice.database.models.cbo;

import lombok.*;
import ru.mobilcard.mcoffice.database.config.interfaces.annotations.gui.fields.TableFields;
import ru.mobilcard.mcoffice.database.models.interfaces.Model;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleModel implements Model {

    @TableFields(key = "externalStrId", value = "Идентификтор")
    private String externalStrId;
    @TableFields(key = "name1", value = "Наименование", view = true)
    private String name1;
    @TableFields(key = "name2", value = "Еще одно наименование")
    private String name2;
    @TableFields(key = "ecrshortname", value = "Короткое наименование", view = true)
    private String ecrshortname;
    @TableFields(key = "ecrlongname", value = "Длинное наименование", view = true)
    private String ecrlongname;
    @TableFields(key = "idMarket", value = "Идентификатор магазина")
    private Long idMarket;
    @TableFields(key = "idPricegroup", value = "Идентификатор группы")
    private String idPricegroup;
    @TableFields(key = "idParent", value = "Родительский идентификатор")
    private Long idParent;
    @TableFields(key = "articletype", value = "Тип номенклатуры", view = true)
    private String articletype;
    @TableFields(key = "flgDisable", value = "Заблокирован", view = true)
    private String flgDisable;
    @TableFields(key = "note", value = "Описание", view = true)
    private String note;
    @TableFields(key = "unittype", value = "Тип единифи измерения", view = true)
    private String unittype;
    @TableFields(key = "hasMrc", value = "Есть минимальная цена", view = true)
    private Boolean hasMrc;
    @TableFields(key = "hasMrc", value = "Налогооблажение")
    private String idTaxSystem;

    @Override
    public String getId() {
        return externalStrId;
    }
}
