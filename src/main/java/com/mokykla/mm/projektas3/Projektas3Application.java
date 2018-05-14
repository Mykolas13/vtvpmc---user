package com.mokykla.mm.projektas3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class Projektas3Application {

	@Bean
	public Docket swaggerDocket() {

		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.mokykla.mm.projektas3"))
				.build();

	}
	private ApiInfo apiInfo() {

		return new ApiInfoBuilder()
				.title("Mykoliuko dokumentai REST Documentation")
				.version("0.0.1-SNAPSHOT")
				.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(Projektas3Application.class, args);
	}
}
