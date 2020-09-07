package life.xiaobao.sceurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SceurekaclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SceurekaclientApplication.class, args);
	}

}
