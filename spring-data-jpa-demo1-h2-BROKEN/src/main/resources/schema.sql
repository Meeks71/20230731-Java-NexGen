drop table if exists MOVIES;
drop table if exists DIRECTORS;

create table DIRECTORS (
	id INT AUTO_INCREMENT PRIMARY KEY,
	first_name VARCHAR(50),
	last_name VARCHAR(50)
);

create table MOVIES (
	id INT AUTO_INCREMENT PRIMARY KEY,
	movie_title VARCHAR(50),
	rating INT,
	director_id INT,
	FOREIGN KEY (director_id) REFERENCES DIRECTORS(id)
);