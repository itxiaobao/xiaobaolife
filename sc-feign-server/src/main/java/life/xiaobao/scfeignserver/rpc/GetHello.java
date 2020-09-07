package life.xiaobao.scfeignserver.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("eureka-client")
public interface GetHello {

    @RequestMapping("/hello")
    String sayHello(String name);

}
