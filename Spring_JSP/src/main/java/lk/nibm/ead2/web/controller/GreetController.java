package lk.nibm.ead2.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class GreetController {
    @RequestMapping("/greet")
    public ModelAndView showview()
    {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("result");
        mv.addObject("result", "Welcome to Spring MVC!");
        return mv;
    }
}
