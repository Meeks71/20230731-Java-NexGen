package com.skillstorm.services;

import java.util.List;

import com.skillstorm.models.Movie;

public interface MovieService {
	// for interfaces the default access modifier is public
	
	Movie findById(int id);
	
	List<Movie> findAll(); 
	
	Movie create(Movie movie);
	
	Movie update(Movie movie, int id);
	
	void delete(int id);

}
