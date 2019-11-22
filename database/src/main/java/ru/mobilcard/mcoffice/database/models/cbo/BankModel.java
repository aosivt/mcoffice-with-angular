package ru.mobilcard.mcoffice.database.models.cbo;

import lombok.*;
import ru.mobilcard.mcoffice.database.config.interfaces.annotations.gui.fields.table.TableField;
import ru.mobilcard.mcoffice.database.models.interfaces.Model;
import ru.mobilcard.mcoffice.database.models.types.UnitDisableState;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BankModel implements Model {

    @TableField(key = "id", value = "Идентификтор")
    private Long id;
    @TableField(key = "bankBik", value = "БИК", view = true)
    private String bankBik;
    @TableField(key = "korAccount", value = "Кор счет", view = true)
    private String korAccount;
    @TableField(key = "name", value = "Наименование", view = true)
    private String name;
    @TableField(key = "nameShort", value = "Короткое наименование", view = true)
    private String nameShort;
    @TableField(key = "inn", value = "ИНН", view = true)
    private String inn;
    @TableField(key = "kpp", value = "КПП", view = true)
    private String kpp;
    @TableField(key = "bankState", value = "Состояние")
    private UnitDisableState bankState;

}
