package br.com.getnet.retaguarda.v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("br.com.getnet.retaguarda.v1.repository") 
@EntityScan("br.com.getnet.retaguarda.v1.model")
@SpringBootApplication
public class Application {
	
	public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
