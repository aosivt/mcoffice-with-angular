package ru.mobilcard.restservice.models.cbo;

import ru.mobilcard.restservice.models.interfaces.Model;
import ru.mobilcard.restservice.models.types.TaxSystemType;

public class FuelEcologicalClassModel implements Model {
    private Long id;
    private String externalStrId;
    private String cName;
    private Long isDefault;
    private ArticleModel article;


    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExternalStrId() {
        return externalStrId;
    }

    public void setExternalStrId(String externalStrId) {
        this.externalStrId = externalStrId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Long getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Long isDefault) {
        this.isDefault = isDefault;
    }

    public ArticleModel getArticle() {
        return article;
    }

    public void setArticle(ArticleModel article) {
        this.article = article;
    }
}
