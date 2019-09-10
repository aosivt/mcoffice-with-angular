package ru.mobilcard.mcoffice.database.models.cbo;

import lombok.*;
import ru.mobilcard.mcoffice.database.models.interfaces.Model;
import ru.mobilcard.mcoffice.database.models.types.UnitDisableState;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaxModel implements Model {
    private Long id;
    private String name;
    private BigDecimal taxValue;
    private UnitDisableState taxState;
    private Integer ecrTaxCode;
}
