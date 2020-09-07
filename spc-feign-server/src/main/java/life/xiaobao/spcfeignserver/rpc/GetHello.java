package life.xiaobao.spcfeignserver.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("eureka-client")
public interface GetHello {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHello(@RequestParam(value = "name") String name);

}
