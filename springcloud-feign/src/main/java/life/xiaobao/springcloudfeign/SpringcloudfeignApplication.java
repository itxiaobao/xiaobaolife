package life.xiaobao.springcloudfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableDiscoveryClient
@EnableFeignClients //Feign feign消费是通过注解的方式进行的消费模式，它默认打开了负载均衡
public class SpringcloudfeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudfeignApplication.class, args);
	}

}
