package life.xiaobao.scadminclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ScadminclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScadminclientApplication.class, args);
	}

}
