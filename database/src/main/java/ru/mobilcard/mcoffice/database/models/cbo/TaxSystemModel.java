package ru.mobilcard.mcoffice.database.models.cbo;

import lombok.*;
import ru.mobilcard.mcoffice.database.models.interfaces.Model;
import ru.mobilcard.mcoffice.database.models.types.TaxSystemType;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaxSystemModel implements Model {

    private TaxSystemType id;
    private String name;
}
