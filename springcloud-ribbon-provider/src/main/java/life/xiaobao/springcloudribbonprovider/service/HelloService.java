package life.xiaobao.springcloudribbonprovider.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello(){
        return "ribbon-provider:hello";
    }

}
