package com.miyabi.sushi.restaurant.miyabiSushiGapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public ModelAndView frontEndUserHomePage(HttpServletRequest request,HttpServletResponse response,ModelAndView mav) {

        mav.setViewName("/homeFe");
        return mav;
    }

    @GetMapping(value = "/gallary")
    public ModelAndView frontEndPhotoGallaryPage(HttpServletRequest request,HttpServletResponse response,ModelAndView mav) {

        mav.setViewName("/photoGal");
        return mav;
    }

    @GetMapping(value = "/about")
    public ModelAndView frontEndAboutPage(HttpServletRequest request,HttpServletResponse response,ModelAndView mav) {

        mav.setViewName("/about");
        return mav;
    }

}
