package ru.mobilcard.mcoffice.database.models.cbo;

import lombok.*;
import ru.mobilcard.mcoffice.database.models.interfaces.Model;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FuelEcologicalClassModel implements Model {

    private Long id;
    private String externalStrId;
    private String cName;
    private Long isDefault;
    private ArticleModel article;


}
