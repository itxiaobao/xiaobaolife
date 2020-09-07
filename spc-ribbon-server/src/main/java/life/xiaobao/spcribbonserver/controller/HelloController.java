package life.xiaobao.spcribbonserver.controller;

import life.xiaobao.spcribbonserver.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name",defaultValue = "xiaobao")String name){
        return helloService.hello(name);
    }

}
