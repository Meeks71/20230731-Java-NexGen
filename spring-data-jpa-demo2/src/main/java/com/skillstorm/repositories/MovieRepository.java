package com.skillstorm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.models.Movie;

/* Here we have a choice of what type of repository do I want Spring Data JPA to give me?
 * 
 * - CrudRepository = basic CRUD methods
 * - PagingAndSortingRepository = adds pagination functionality
 * - JpaRepository = adds more functionality to flush the persistence context
 *
 */

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{
	// NO CODE NEEDED! Automagically generated for us!
	
}