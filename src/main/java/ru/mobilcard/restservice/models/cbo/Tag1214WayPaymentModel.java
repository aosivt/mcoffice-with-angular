package ru.mobilcard.restservice.models.cbo;

import ru.mobilcard.restservice.models.interfaces.Model;

public class Tag1214WayPaymentModel implements Model {
    private Long id;
    private String name;

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

}
