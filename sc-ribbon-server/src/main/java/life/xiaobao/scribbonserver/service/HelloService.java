package life.xiaobao.scribbonserver.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hysFallback")  //触发熔断时跳转指定处理方法
    public String hello(String name){

        return restTemplate.getForObject("http://eureka-client/hello?name="+name,String.class);
    }

    /**
     * 熔断测试方法：关闭服务eureka-client时查看返回结果
     * @param name
     * @return
     */
    public String hysFallback(String name){
        //触发熔断提示
        return "hi "+name+",this is touch off hysFallback !!";
    }

}
