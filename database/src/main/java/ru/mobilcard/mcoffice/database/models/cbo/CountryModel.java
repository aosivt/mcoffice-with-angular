package ru.mobilcard.mcoffice.database.models.cbo;

import lombok.*;
import ru.mobilcard.mcoffice.database.models.interfaces.Model;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CountryModel implements Model {

    private Long id;
    private String name;
    private String nameShort;
    private String countryEn13;


}
