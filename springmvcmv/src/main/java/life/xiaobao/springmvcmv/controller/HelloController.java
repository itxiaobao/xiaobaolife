package life.xiaobao.springmvcmv.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String hello(Model model){
        model.addAttribute("message","create by springmvc base on maven.");
        return "hello";
    }

}
