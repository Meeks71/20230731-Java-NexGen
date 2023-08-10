package com.skillstorm.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.models.Movie;
import com.skillstorm.services.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {
	
	private MovieService service;
	
	public MovieController(MovieService service) {
		this.service = service;
	}

	@GetMapping
	public List<Movie> findAll() {
		return service.findAll();
	}

}