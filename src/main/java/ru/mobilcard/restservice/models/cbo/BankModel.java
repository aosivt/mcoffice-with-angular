package ru.mobilcard.restservice.models.cbo;

import lombok.*;
import ru.mobilcard.restservice.models.interfaces.Model;
import ru.mobilcard.restservice.models.types.UnitDisableState;

@Data
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
