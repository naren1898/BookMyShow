package com.example.bms;

import com.example.bms.models.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import java.util.ArrayList;
@Controller
@SpringBootApplication
public class BmsApplication {
	public static void main(String[] args) {
		SpringApplication.run(BmsApplication.class, args);
		Movie movie = new Movie();
		movie.setName("XYZ");
		movie.setActors(new ArrayList<>());
	}

}


