package com.example.repofetcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RepoFetcherApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(RepoFetcherApplication.class, args);
	}

	@Bean
	    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
