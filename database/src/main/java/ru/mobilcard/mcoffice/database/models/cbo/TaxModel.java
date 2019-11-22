package ru.mobilcard.mcoffice.database.models.cbo;

import lombok.*;
import ru.mobilcard.mcoffice.database.config.interfaces.annotations.gui.fields.table.TableField;
import ru.mobilcard.mcoffice.database.models.interfaces.Model;
import ru.mobilcard.mcoffice.database.models.types.UnitDisableState;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaxModel implements Model {

    @TableField(key = "id", value = "Идентификтор")
    private Long id;
    @TableField(key = "name", value = "Наименование", view = true)
    private String name;
    @TableField(key = "taxValue", value = "Налог", view = true)
    private BigDecimal taxValue;
    @TableField(key = "taxState", value = "Состояние налога", view = true)
    private UnitDisableState taxState;
    @TableField(key = "ecrTaxCode", value = "Идентификтор", view = true)
    private Integer ecrTaxCode;
}
