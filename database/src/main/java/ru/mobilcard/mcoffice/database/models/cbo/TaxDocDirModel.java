package ru.mobilcard.mcoffice.database.models.cbo;

import lombok.*;
import ru.mobilcard.mcoffice.database.config.interfaces.annotations.gui.fields.TableField;
import ru.mobilcard.mcoffice.database.models.interfaces.Model;
import ru.mobilcard.mcoffice.database.models.types.DocDirectionType;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaxDocDirModel implements Model {

    @TableField(key = "id", value = "Идентификтор")
    private Long id;
    @TableField(key = "taxId", value = "Идентификтор")
    private Long taxId;
    @TableField(key = "docDirection", value = "Идентификтор" , view = true)
    private DocDirectionType docDirection;
    @TableField(key = "tax", value = "Налог", view = true)
    private TaxModel tax;

}
