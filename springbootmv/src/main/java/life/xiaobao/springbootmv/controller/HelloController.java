package life.xiaobao.springbootmv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    public String hello(){

        return "<div style=\"position: absolute;top: 50%;left: 50%;height: 10%;width: 30%;margin: -5% 0 0 -15%;\"><h1>开发中.....敬请期待！！！<h1></div>";
    }

}
