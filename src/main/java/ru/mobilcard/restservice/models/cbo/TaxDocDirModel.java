package ru.mobilcard.restservice.models.cbo;

import lombok.*;
import ru.mobilcard.restservice.models.interfaces.Model;
import ru.mobilcard.restservice.models.types.DocDirectionType;
import ru.mobilcard.restservice.models.types.UnitDisableState;

import java.math.BigDecimal;

@Data
public class TaxDocDirModel implements Model {

    private Long id;
    private Long taxId;
    private DocDirectionType docDirection;
    private TaxModel tax;

}
