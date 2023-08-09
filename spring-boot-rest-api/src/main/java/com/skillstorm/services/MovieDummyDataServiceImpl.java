package com.skillstorm.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.skillstorm.models.Movie;

@Service // this is going to  be a component made available to us through the Spring ApplicationContext
public class MovieDummyDataServiceImpl implements MovieService {
	
	private ArrayList<Movie> movies = new ArrayList<>();

	@Override
	public Movie findById(int id) {
		return movies.stream().filter(movie -> movie.getId() == id).findFirst().orElse(null);
	}

	@Override
	public List<Movie> findAll() {
		return movies;
	}

	@Override
	public Movie create(Movie movie) {
		// make sure unique id
		int id = movie.getId();
		long count = movies.stream().filter(data -> data.getId() == id).count();
		if (count > 0) {
			// TODO create a custom exception to throw here
			throw new RuntimeException("Create failed. Movie with id " + id + " already exists. Id must be unique.");
		} else {
			movies.add(movie);
			return movie;
		}
	}

	@Override
	public Movie update(Movie movie, int id) {
		movie.setId(id); // make sure to use the id specified 
		int index = movies.indexOf(movie); // assuming .equals is defined to only compare id
		if (index >= 0) {
			movies.set(index, movie);
			return movie;
		} else {
			// TODO create a custom exception
			throw new RuntimeException("Update failed. No movie with id " + id + " was found.");
		}
	}

	@Override
	public void delete(int id) {
		// TODO search the list and remove the item with the given id
		
	}

}
