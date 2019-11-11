package pe.edu.ss.demoColegio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class DemoColegioApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoColegioApplication.class, args);
	}

}
