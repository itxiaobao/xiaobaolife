package life.xiaobao.scfeignserver.service;

import life.xiaobao.scfeignserver.rpc.GetHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    GetHello getHello;

    public String hello(String name){

        return getHello.sayHello(name);
    }

}
