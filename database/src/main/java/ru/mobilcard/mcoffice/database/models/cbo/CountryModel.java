package ru.mobilcard.mcoffice.database.models.cbo;

import lombok.*;
import ru.mobilcard.mcoffice.database.config.interfaces.annotations.gui.fields.TableField;
import ru.mobilcard.mcoffice.database.models.interfaces.Model;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CountryModel implements Model {

    @TableField(key = "id", value = "Идентификтор")
    private Long id;
    @TableField(key = "name", value = "Наименование", view = true)
    private String name;
    @TableField(key = "nameShort", value = "Короткое наименование", view = true)
    private String nameShort;
    @TableField(key = "countryEn13", value = "Номер страны", view = true)
    private String countryEn13;

}
