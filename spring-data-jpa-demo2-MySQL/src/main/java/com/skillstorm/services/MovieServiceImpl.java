package com.skillstorm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.models.Movie;
import com.skillstorm.repositories.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {
	
	// Step 1: Autowire in a MovieRepository instance
	private MovieRepository repo;

	@Autowired
	public MovieServiceImpl(MovieRepository repo) {
		this.repo = repo;
	}
	
	
	
	// Step 2: Call the findAll method
	public List<Movie> findAll() {
		return repo.findAll();
	}

}
