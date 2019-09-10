package ru.mobilcard.mcoffice.database.models.cbo;


public class TestBankModel extends BaseTestModel<BankModel> {

    private final static String PATH_REFERENCE = "BankMapper";


    @Override
    protected String getReferencePathMapper() {
        return PATH_REFERENCE;
    }
}
