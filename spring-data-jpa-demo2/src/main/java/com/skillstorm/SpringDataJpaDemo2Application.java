package com.skillstorm;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.skillstorm.models.Director;
import com.skillstorm.models.Movie;

@SpringBootApplication
public class SpringDataJpaDemo2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaDemo2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Director d = new Director();
		
		Movie m = new Movie();
		m.setDirector(d);
		
		Set<Movie> movies = new HashSet<>();
		movies.add(m);
		
		d.setMovies(movies);
		
		System.out.println(m);
		
	}

}