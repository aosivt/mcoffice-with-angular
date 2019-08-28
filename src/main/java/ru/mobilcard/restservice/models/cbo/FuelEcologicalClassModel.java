package ru.mobilcard.restservice.models.cbo;

import lombok.*;
import ru.mobilcard.restservice.models.interfaces.Model;
import ru.mobilcard.restservice.models.types.TaxSystemType;

@Data
public class FuelEcologicalClassModel implements Model {

    private Long id;
    private String externalStrId;
    private String cName;
    private Long isDefault;
    private ArticleModel article;


}
