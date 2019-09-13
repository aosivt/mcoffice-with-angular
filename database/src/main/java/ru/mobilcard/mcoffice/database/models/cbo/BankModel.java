package ru.mobilcard.mcoffice.database.models.cbo;

import lombok.*;
import ru.mobilcard.mcoffice.database.models.interfaces.Model;
import ru.mobilcard.mcoffice.database.models.types.UnitDisableState;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BankModel implements Model {

    private Long id;
    private String bankBik;
    private String korAccount;
    private String name;
    private String nameShort;
    private String inn;
    private String kpp;
    private UnitDisableState bankState;

}
