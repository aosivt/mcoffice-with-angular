package ru.mobilcard.restservice.models.wrk;

import ru.mobilcard.restservice.models.interfaces.Model;

public class ScanTechRegModel implements Model {
    private Long id;
    private String name;
    private String numCode;



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

    public String getNumCode() {
        return numCode;
    }

    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }
}
