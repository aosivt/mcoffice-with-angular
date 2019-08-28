package ru.mobilcard.restservice.models.cbo;

import lombok.*;
import ru.mobilcard.restservice.models.interfaces.Model;
import ru.mobilcard.restservice.models.types.TaxSystemType;

@Data
public class TaxSystemModel implements Model {

    private TaxSystemType id;
    private String name;
}
