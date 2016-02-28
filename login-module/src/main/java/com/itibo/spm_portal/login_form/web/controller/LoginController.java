package com.itibo.spm_portal.login_form.web.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;


@Controller
public class LoginController {


    @RequestMapping(value = {"login**", "/", "welcome**"}, method = RequestMethod.GET)
    public ModelAndView welcomePage() {

        ModelAndView model = new ModelAndView();
        model.setViewName("login");
        return model;
    }


    @RequestMapping(value = "/admin**",method = RequestMethod.GET)
    public ModelAndView adminPage(){

        ModelAndView model = new ModelAndView();
        model.addObject("title","SPM-Portal");
        model.addObject("message","Hello, you have the biggest eggs here, YEAH!");
        model.setViewName("admin");
        return model;
    }

    @RequestMapping(value = "/user**",method = RequestMethod.GET)
    public ModelAndView userPage(){

        ModelAndView model = new ModelAndView();
        model.addObject("title","SPM-Portal");
        model.addObject("message","Hello, you are just a slave here.Shut up and give your fucking money!");
        model.setViewName("user");
        return model;
    }


}
