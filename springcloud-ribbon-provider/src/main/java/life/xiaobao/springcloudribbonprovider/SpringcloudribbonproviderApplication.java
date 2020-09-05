package life.xiaobao.springcloudribbonprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient  //让注册中心能够扫描到该注册服务
@ComponentScan
public class SpringcloudribbonproviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudribbonproviderApplication.class, args);
	}

    @Bean
    @Autowired  //依赖注入
    @LoadBalanced   //开启负载均衡
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
