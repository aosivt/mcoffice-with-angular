package ru.mobilcard.restservice.controlls.models.metadata;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ru.mobilcard.restservice.controlls.models.BaseController;
import ru.mobilcard.restservice.mappers.cbo.ArticleMapper;
import ru.mobilcard.restservice.mappers.metadata.UserMapper;
import ru.mobilcard.restservice.models.cbo.ArticleModel;
import ru.mobilcard.restservice.models.metadata.UserModel;

@RestController()
@RequestMapping(value = "user",method = {RequestMethod.GET, RequestMethod.POST})
public class UserController extends BaseController<UserMapper, UserModel, Long> {

    @Override
    protected Class<UserMapper> getMapperClass(){
        return UserMapper.class;
    }
    @Override
    protected Class<UserModel> getModelClass(){
        return UserModel.class;
    }

}
