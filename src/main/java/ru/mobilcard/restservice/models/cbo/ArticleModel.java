package ru.mobilcard.restservice.models.cbo;

import ru.mobilcard.restservice.models.interfaces.Model;

public class ArticleModel implements Model {
    private String externalStrId;
    private String name1;
    private String name2;
    private String ecrshortname;
    private String ecrlongname;
    private String idMarket;
    private String idPricegroup;
    private String idParent;
    private String articletype;
    private String flgDisable;
    private String note;
    private String unittype;
    private String hasMrc;
    private String idTaxSystem;


    @Override
    public String getId() {
        return externalStrId;
    }

    public String getExternalStrId() {
        return externalStrId;
    }

    public void setExternalStrId(String externalStrId) {
        this.externalStrId = externalStrId;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getEcrshortname() {
        return ecrshortname;
    }

    public void setEcrshortname(String ecrshortname) {
        this.ecrshortname = ecrshortname;
    }

    public String getEcrlongname() {
        return ecrlongname;
    }

    public void setEcrlongname(String ecrlongname) {
        this.ecrlongname = ecrlongname;
    }

    public String getIdMarket() {
        return idMarket;
    }

    public void setIdMarket(String idMarket) {
        this.idMarket = idMarket;
    }

    public String getIdPricegroup() {
        return idPricegroup;
    }

    public void setIdPricegroup(String idPricegroup) {
        this.idPricegroup = idPricegroup;
    }

    public String getIdParent() {
        return idParent;
    }

    public void setIdParent(String idParent) {
        this.idParent = idParent;
    }

    public String getArticletype() {
        return articletype;
    }

    public void setArticletype(String articletype) {
        this.articletype = articletype;
    }

    public String getFlgDisable() {
        return flgDisable;
    }

    public void setFlgDisable(String flgDisable) {
        this.flgDisable = flgDisable;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getUnittype() {
        return unittype;
    }

    public void setUnittype(String unittype) {
        this.unittype = unittype;
    }

    public String getHasMrc() {
        return hasMrc;
    }

    public void setHasMrc(String hasMrc) {
        this.hasMrc = hasMrc;
    }

    public String getIdTaxSystem() {
        return idTaxSystem;
    }

    public void setIdTaxSystem(String idTaxSystem) {
        this.idTaxSystem = idTaxSystem;
    }
}
