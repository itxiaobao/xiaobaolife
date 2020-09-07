package life.xiaobao.scfeignserver.rpc;

import life.xiaobao.scfeignserver.rpc.impl.GetHelloImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "eureka-client",fallback = GetHelloImpl.class)  //fallback,hystrix的熔断处理
public interface GetHello {

    @RequestMapping("/hello")
    String sayHello(String name);

}
