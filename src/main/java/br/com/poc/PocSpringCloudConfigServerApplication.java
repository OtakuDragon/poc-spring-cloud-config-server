package br.com.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class PocSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocSpringCloudConfigServerApplication.class, args);
	}
}
