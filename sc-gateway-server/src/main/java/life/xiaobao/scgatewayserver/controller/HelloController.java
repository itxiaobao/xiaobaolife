package life.xiaobao.scgatewayserver.controller;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {

    @Bean
    public RouteLocator myRoute(RouteLocatorBuilder builder){
        //使用RouteLocatorBuilder的bean去创建路由
        //路由RouteLocatorBuilder可以让你添加各种predicates和filters
        //predicates断言，顾名思义就是根据具体的请求的规则，由具体的route去处理
        //filters是各种过滤器，用来对请求做各种判断和修改

        //该方式是直接调用对应的API，不需要配置文件。这种写法已过时，现在多是配置的
        //配置方式的测试地址：http://localhost:8187/eureka-client/hello
        //使用配置时，这种方法就不用写，系统会根据配置进行相应的过滤、限流、转发等处理
        return builder.routes()
                .route(p -> p.path("/get") //让请求“/get”请求都转发到“http://httpbin.org/get”，测试访问地址http://localhost:8080/get
                            .filters(f -> f.addRequestHeader("hello","xiaobao")) //请求添加一个header,key为hello，value为xiaobao
                            .uri("http://httpbin.org:80"))  //请求转发地址
                .build();

        /*
        启动后访问地址http://localhost:8080/get
        返回结果：
        {
         "args": {},
         "headers": {
         "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*//**;q=0.8,application/signed-exchange;v=b3",
        "Accept-Encoding": "gzip, deflate, br",
                "Accept-Language": "zh-CN,zh;q=0.9",
                "Content-Length": "0",
                "Forwarded": "proto=http;host=\"localhost:8080\";for=\"0:0:0:0:0:0:0:1:50067\"",
                "Hello": "xiaobao",
                "Host": "httpbin.org",
                "Sec-Fetch-Mode": "navigate",
                "Sec-Fetch-Site": "none",
                "Sec-Fetch-User": "?1",
                "Upgrade-Insecure-Requests": "1",
                "User-Agent": "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Safari/537.36",
                "X-Amzn-Trace-Id": "Root=1-5f58414d-7c15a6b6e59f573e84515bb4",
                "X-Forwarded-Host": "localhost:8080"
            },
            "origin": "0:0:0:0:0:0:0:1, 222.86.219.211",
            "url": "http://localhost:8080/get"
        }*/

    }


}
