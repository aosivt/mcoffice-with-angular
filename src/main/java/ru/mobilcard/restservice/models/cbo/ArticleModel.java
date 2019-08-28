package ru.mobilcard.restservice.models.cbo;

import lombok.*;
import ru.mobilcard.restservice.models.interfaces.Model;

@Data
public class ArticleModel implements Model {
    private String externalStrId;
    private String name1;
    private String name2;
    private String ecrshortname;
    private String ecrlongname;
    private Long idMarket;
    private String idPricegroup;
    private Long idParent;
    private String articletype;
    private String flgDisable;
    private String note;
    private String unittype;
    private Boolean hasMrc;
    private String idTaxSystem;

    @Override
    public String getId() {
        return externalStrId;
    }

}
