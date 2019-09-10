package ru.mobilcard.mcoffice.database.models.cbo;

import lombok.*;
import ru.mobilcard.mcoffice.database.models.interfaces.Model;
import ru.mobilcard.mcoffice.database.models.types.DocDirectionType;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaxDocDirModel implements Model {

    private Long id;
    private Long taxId;
    private DocDirectionType docDirection;
    private TaxModel tax;

}
