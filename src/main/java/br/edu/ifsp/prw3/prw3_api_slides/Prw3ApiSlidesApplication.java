package br.edu.ifsp.prw3.prw3_api_slides;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport(pageSerializationMode = EnableSpringDataWebSupport.PageSerializationMode.VIA_DTO)
public class Prw3ApiSlidesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Prw3ApiSlidesApplication.class, args);
	}

}
