package pl.buzka.videoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;


@SpringBootApplication
@EnableOpenApi
public class VideoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoAppApplication.class, args);
	}

}
