package life.xiaobao.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloCongtroller {

    @RequestMapping("/")
    public String hello(Model model){
        model.addAttribute("message","create by springmvc !!!");
        return "hello";
    }

    @RequestMapping("/mvhello")
    public ModelAndView mvHello(){
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("message","create by springmvc(ModelAndView) !!");
        return mv;
    }

}
