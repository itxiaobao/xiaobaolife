package life.xiaobao.spceurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpceurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpceurekaserverApplication.class, args);
	}

}
