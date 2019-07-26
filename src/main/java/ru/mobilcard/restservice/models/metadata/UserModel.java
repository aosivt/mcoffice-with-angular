package ru.mobilcard.restservice.models.metadata;

import ru.mobilcard.restservice.models.interfaces.Model;

public class UserModel implements Model {

    private Long id;
    private String name;
    private String psw;

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

    public String getPassword() {
        return psw;
    }

    public void setPassword(String psw) {
        this.psw = psw;
    }
}
