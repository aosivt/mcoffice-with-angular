package ru.mobilcard.mcoffice.database.models.cbo;

import lombok.*;
import ru.mobilcard.mcoffice.database.config.interfaces.annotations.gui.fields.TableField;
import ru.mobilcard.mcoffice.database.models.interfaces.Model;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Tag1214WayPaymentModel implements Model {

    @TableField(key = "id", value = "Идентификтор")
    private Long id;
    @TableField(key = "name", value = "Наименование", view = true)
    private String name;

}
