package ru.mobilcard.restservice.models.cbo;

import ru.mobilcard.restservice.models.interfaces.Model;
import ru.mobilcard.restservice.models.types.DocDirectionType;
import ru.mobilcard.restservice.models.types.UnitDisableState;

import java.math.BigDecimal;

public class TaxDocDirModel implements Model {
    private Long id;
    private Long taxId;
    private DocDirectionType docDirection;
    private TaxModel tax;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTaxId() {
        return taxId;
    }

    public void setTaxId(Long taxId) {
        this.taxId = taxId;
    }

    public DocDirectionType getDocDirection() {
        return docDirection;
    }

    public void setDocDirection(DocDirectionType docDirection) {
        this.docDirection = docDirection;
    }

    public TaxModel getTax() {
        return tax;
    }

    public void setTax(TaxModel tax) {
        this.tax = tax;
    }
}
