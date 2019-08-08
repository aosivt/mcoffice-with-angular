package ru.mobilcard.restservice.models.cbo;

import ru.mobilcard.restservice.models.interfaces.Model;
import ru.mobilcard.restservice.models.types.UnitDisableState;

import java.math.BigDecimal;

public class TaxModel implements Model {
    private Long id;
    private String name;
    private BigDecimal taxValue;
    private UnitDisableState taxState;
    private Integer ecrTaxCode;


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


    public BigDecimal getTaxValue() {
        return taxValue;
    }

    public void setTaxValue(BigDecimal taxValue) {
        this.taxValue = taxValue;
    }

    public UnitDisableState getTaxState() {
        return taxState;
    }

    public void setTaxState(UnitDisableState taxState) {
        this.taxState = taxState;
    }

    public Integer getEcrTaxCode() {
        return ecrTaxCode;
    }

    public void setEcrTaxCode(Integer ecrTaxCode) {
        this.ecrTaxCode = ecrTaxCode;
    }
}
