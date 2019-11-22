package ru.mobilcard.mcoffice.database.models.wrk;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.mobilcard.mcoffice.database.config.interfaces.annotations.gui.fields.table.TableField;
import ru.mobilcard.mcoffice.database.models.interfaces.Model;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ScanTechRegModel implements Model {

    @TableField(key = "id", value = "Идентификтор")
    private Long id;
    @TableField(key = "name", value = "Наименование", view = true)
    private String name;
    @TableField(key = "numCode", value = "Номер наименования", view = true)
    private String numCode;
}
