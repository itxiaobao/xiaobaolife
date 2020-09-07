package life.xiaobao.scfeignserver.rpc.impl;

import life.xiaobao.scfeignserver.rpc.GetHello;
import org.springframework.stereotype.Component;

@Component
public class GetHelloImpl implements GetHello {

    @Override
    public String sayHello(String name) {
        return "sorry "+name+",this is touch off fallback !!";
    }

}
