/*
package ac.ke.egerton.egerton.controllers;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
@Controller
public class AuthenticationController {
@Autowired
    UserService userService;

    @RequestMapping(value="/login",method= RequestMethod.GET)
    public ModelAndView login(){
    ModelAndView modelAndView=new ModelAndView();
    ModelAndView.setViewName("login");
    return modelAndView;
    }
    @RequestMapping(value="/register",method=RequestMethod.GET)
    public Model register(){
        ModelAndView modelAndView=new ModelAndView();
        User user=new User();
        modelAndView.addObject("user",user);
        modelAndView.setViewName("register");
        return  modelAndView;
    }
    @RequestMapping(value="/home",method = RequestMethod.GET)
public modelAndView home(){
        modelAndView=new ModelAndView();
        modelAndView.set
    }
    }



*/
