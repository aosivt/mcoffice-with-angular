package ru.mobilcard.restservice.models.cbo;

import ru.mobilcard.restservice.models.interfaces.Model;
import ru.mobilcard.restservice.models.types.UnitDisableState;

public class CountryModel implements Model {
    private Long id;
    private String name;
    private String nameShort;
    private String countryEn13;


    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameShort() {
        return nameShort;
    }

    public void setNameShort(String nameShort) {
        this.nameShort = nameShort;
    }

    public String getCountryEn13() {
        return countryEn13;
    }

    public void setCountryEn13(String countryEn13) {
        this.countryEn13 = countryEn13;
    }
}
