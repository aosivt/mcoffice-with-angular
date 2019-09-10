package ru.mobilcard.mcoffice.services.controlls;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.*;



/**
 * @apiNote Controller for default page (example: 404, 403, 500 ...)
 */
@Controller
@CrossOrigin("*")
public class DefaultController {
    /**
     * method empty
     * @return null
     * */
    @RequestMapping(value = "/",method = {RequestMethod.GET, RequestMethod.POST})
    public Object rootPath(Model model) {
        return "forward:/index.html";
    }

}
