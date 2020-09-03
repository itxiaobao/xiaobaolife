package life.xiaobao.springbootinitialzr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return "hello...<br> create by springboot+initialzr";
    }

}
