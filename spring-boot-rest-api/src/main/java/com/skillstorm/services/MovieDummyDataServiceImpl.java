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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> findAll() {
		// TODO Auto-generated method stub
		return movies;
	}

	@Override
	public Movie create(Movie movie) {
		movies.add(movie);
		return movie;
	}

	@Override
	public Movie update(Movie movie, int id) {
		// TODO make them use the id to specify which to update
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO search the list and remove the item with the given id
		
	}

}
