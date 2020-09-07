package life.xiaobao.spcfeignserver.controller;

import life.xiaobao.spcfeignserver.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public String sayHello(String name){

        return helloService.hello(name);
    }

}
