package com.skillstorm.models;

import java.time.Duration;

public class Movie {

	private int id; // TODO tomorrow have spring data jpa generate this
	private String title;
	private String genre;
	private String director;
	private Duration runtime;

	// TODO add actors

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Duration getRuntime() {
		return runtime;
	}

	public void setRuntime(Duration runtime) {
		this.runtime = runtime;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", genre=" + genre + ", director=" + director + ", runtime="
				+ runtime + "]";
	}
	

}
