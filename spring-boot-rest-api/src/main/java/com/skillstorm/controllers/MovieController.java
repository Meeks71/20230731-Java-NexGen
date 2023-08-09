package com.skillstorm.controllers;

import java.time.Duration;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.models.Movie;
import com.skillstorm.services.MovieService;

//@Controller
@RestController
@RequestMapping("/movies/v1")
public class MovieController {
	
	/*
	 * @SpringBootApplication
	 * @Controller and @RestController - use Controller if you want your method to return the name of a view (hello.html) 
	 *                                 - use RestController if you want your method to return data in the response body 
	 *                                         (it is a convenience annotation for @Controller and @ResponseBody)
	 * @ResponseBody
	 * @RequestBody
	 * @Autowired property, constructor, setter injection
	 * @PathVariable
	 * @ResponseStatus vs using a ResponseEntity<>
	 * 
	 * TODO
	 * @RequestParameter
	 * 
	 * Controller vs Service vs Repository layer
	 * 
	 * 
	 */
	
//	@Autowired // Don't do property injection instead use constructor or setter injection to make testing easier
	private MovieService service;
	
//	@Autowired // this is optional if you only have one constructor
	public MovieController(MovieService service ) {
		this.service = service;
	}
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@GetMapping("/hello") // localhost:8080/hello
	@ResponseBody
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/{id}") // localhost:8080/movies/v1/128
	public ResponseEntity<Movie> findById(@PathVariable int id) {
		logger.debug("Movie id handed in was " + id);
		Movie movie = service.findById(id);
		if (movie == null)
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(movie, HttpStatus.OK);
	}
	
	@GetMapping // localhost:8080/movies/v1
	public List<Movie> findAll() {
		return service.findAll();
	}
	
	// Postman will hand us the Movie object as json
	// How does the json become a Java object?
	//  spring-start-web pulled in the jackson-core and jackson-databind etc dependencies 
	//  jackson is going to parse the data for us
	@PostMapping 
	@ResponseStatus(code = HttpStatus.CREATED)
	// @ResonseBody is implied by the fact this is a RestController
	// so the object will be json
	public Movie create(@RequestBody Movie movie) {
		logger.debug("Movie handed in was " + movie);
		// TODO actually save this somewhere...
		return service.create(movie);
	}
	
	@PutMapping("/{id}")
	public Movie update(@RequestBody Movie movie, @PathVariable int id) {
		logger.debug("Movie handed in was " + movie);
		// TODO actually save this somewhere...
		return service.update(movie, id);
	}
	
	@DeleteMapping("/{id}") // localhost:8080/movies/v1/354
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable int id) { // must match variable name and path variable name else use // (@PathVariable(name = "id", required = true) int id) {
		logger.debug("Movie id handed in was " + id);
	}
	
	

}
