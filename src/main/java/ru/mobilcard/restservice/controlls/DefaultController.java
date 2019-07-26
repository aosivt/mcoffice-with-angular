package ru.mobilcard.restservice.controlls;


import org.springframework.web.bind.annotation.*;

/**
 * @apiNote Controller for default page (example: 404, 403, 500 ...)
 */
@RestController()
public class DefaultController {
    /**
     * method empty
     * @return null
     * */
    @RequestMapping(value = "/",method = {RequestMethod.GET, RequestMethod.POST})
    public Object rootPath() {
        return null;
    }

}
