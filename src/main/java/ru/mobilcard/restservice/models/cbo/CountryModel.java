package ru.mobilcard.restservice.models.cbo;

import lombok.*;
import ru.mobilcard.restservice.models.interfaces.Model;
import ru.mobilcard.restservice.models.types.UnitDisableState;

@Data
public class CountryModel implements Model {

    private Long id;
    private String name;
    private String nameShort;
    private String countryEn13;


}
