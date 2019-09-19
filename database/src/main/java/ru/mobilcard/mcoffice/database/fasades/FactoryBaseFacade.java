package ru.mobilcard.mcoffice.database.fasades;

import ru.mobilcard.mcoffice.database.mappers.Mapper;
import ru.mobilcard.mcoffice.database.mappers.cbo.ArticleMapper;
import ru.mobilcard.mcoffice.database.models.cbo.ArticleModel;
import ru.mobilcard.mcoffice.database.models.interfaces.Model;

import java.util.Objects;

public class FactoryBaseFacade {

    private static FactoryBaseFacade instance;

    private FactoryBaseFacade(){};

    public static FactoryBaseFacade getInstance(){
        synchronized (FactoryBaseFacade.class){
            if (Objects.isNull(instance)){
                instance = new FactoryBaseFacade();
            }
        }
        return instance;
    }

    public <MapperType extends Mapper<ModelType, IdentifierType>,ModelType extends Model, IdentifierType>
                               BaseFacade<MapperType, ModelType , IdentifierType> getBaseFacade(){
        return new BaseFacade<MapperType, ModelType , IdentifierType>();
    }

}
