package ru.mobilcard.mcoffice.database.models.cbo;

import lombok.*;
import ru.mobilcard.mcoffice.database.config.interfaces.annotations.gui.fields.TableField;
import ru.mobilcard.mcoffice.database.models.interfaces.Model;
import ru.mobilcard.mcoffice.database.models.types.TaxSystemType;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaxSystemModel implements Model {

    @TableField(key = "id", value = "Идентификтор")
    private TaxSystemType id;
    @TableField(key = "name", value = "Наименование", view = true)
    private String name;
}
