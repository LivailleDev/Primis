package com.hulxon.primiscomanda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PrimiscomandaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimiscomandaApplication.class, args);
	}

}
