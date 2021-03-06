package ru.kpfu.itis.uxcapture.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.uxcapture.utils.Utils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by apple on 08.02.2018.
 */

@Controller
public class DefaultController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(HttpServletRequest request, ModelMap modelMap) {

        modelMap.put("content", "main");

        if(Utils.isAjax(request)) {
            return "site/main";
        } else {
            return "site/index";
        }
    }

}
