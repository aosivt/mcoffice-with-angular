package ru.mobilcard.mcoffice.database.models.cbo;

import lombok.*;
import ru.mobilcard.mcoffice.database.config.interfaces.annotations.gui.fields.TableField;
import ru.mobilcard.mcoffice.database.models.interfaces.Model;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FuelEcologicalClassModel implements Model {

    @TableField(key = "id", value = "Идентификтор")
    private Long id;
    @TableField(key = "externalStrId", value = "Идентификтор")
    private String externalStrId;
    @TableField(key = "cName", value = "Наименование", view = true)
    private String cName;
    @TableField(key = "isDefault", value = "По умолчанию", view = true)
    private Long isDefault;
    @TableField(key = "article", value = "По номенклатуре", defaultField = "ecrlongname", view = true)
    private ArticleModel article;


}
