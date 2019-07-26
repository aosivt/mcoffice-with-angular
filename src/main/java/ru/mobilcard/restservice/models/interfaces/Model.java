package ru.mobilcard.restservice.models.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import ru.mobilcard.restservice.models.cbo.BankModel;

@JsonDeserialize(as = BankModel.class)
public interface Model {
    Object getId();
}
