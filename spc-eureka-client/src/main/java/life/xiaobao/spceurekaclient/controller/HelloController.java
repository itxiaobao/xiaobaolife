package life.xiaobao.spceurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @Value("${spring.application.name}")
    String appname;

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name",defaultValue = "xiaobao") String name){

        return "hello "+name+",I'm from "+appname+" and port is "+port;
    }

}
