package ru.mobilcard.restservice.models.cbo;

import lombok.*;
import ru.mobilcard.restservice.models.interfaces.Model;
import ru.mobilcard.restservice.models.types.UnitDisableState;

import java.math.BigDecimal;

@Data
public class TaxModel implements Model {
    private Long id;
    private String name;
    private BigDecimal taxValue;
    private UnitDisableState taxState;
    private Integer ecrTaxCode;
}
