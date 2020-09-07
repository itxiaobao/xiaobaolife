package life.xiaobao.sceurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SceurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SceurekaserverApplication.class, args);
	}

}
