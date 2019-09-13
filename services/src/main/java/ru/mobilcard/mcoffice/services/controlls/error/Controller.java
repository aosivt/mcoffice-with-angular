package ru.mobilcard.mcoffice.services.controlls.error;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@org.springframework.stereotype.Controller
@CrossOrigin("*")
public class Controller implements ErrorController {
    @RequestMapping("/error")
    public String handleError(HttpServletResponse response) {

        return "index";
    }
    @Override
    public String getErrorPath() {
        return "/error";
    }
}
