package life.xiaobao.spceurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpceurekaclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpceurekaclientApplication.class, args);
	}

}
