package ru.mobilcard.restservice.models.cbo;

import ru.mobilcard.restservice.models.interfaces.Model;
import ru.mobilcard.restservice.models.types.TaxSystemType;

public class TaxSystemModel implements Model {
    private TaxSystemType id;
    private String name;

    @Override
    public TaxSystemType getId() {
        return id;
    }

    public void setId(TaxSystemType id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
