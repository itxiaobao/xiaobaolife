package life.xiaobao.scfeignserver.controller;

import life.xiaobao.scfeignserver.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public String sayHello(@RequestParam(value = "name",defaultValue = "xiaobao")String name){

        return helloService.hello(name);
    }

}
