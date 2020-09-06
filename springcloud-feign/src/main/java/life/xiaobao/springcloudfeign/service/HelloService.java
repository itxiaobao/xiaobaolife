package life.xiaobao.springcloudfeign.service;

import life.xiaobao.springcloudfeign.rpc.GetHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    private GetHello getHello;

    public String hello(){
        //提供者
        //return "ribbon-provider:hello";

        //消费者，其实提供者与消费者之间只是角色不同而已，他两的逻辑是一样的
        //return restTemplate.getForObject("http://ribbon-provider/hello?name=xiaobao",String.class);

        //feign的方式进行消费
        return getHello.sayHello();
    }

}
