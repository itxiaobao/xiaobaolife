package life.xiaobao.springcloudfeign.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "ribbon-consumer")  //value = 目标服务器
public interface GetHello {

    @RequestMapping(value = "/hello?name=feign",method = RequestMethod.GET)
    public String sayHello();

}
