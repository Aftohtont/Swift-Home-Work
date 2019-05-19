package saveobjecttofile.task00;

import java.io.Serializable;

public class Movie implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String title;
	private String director;
	private String[] actors;

	public Movie(String title, String director, String[] actors) {
		this.title = title;
		this.director = director;
		this.actors = actors;
	}
	
	public String getTitle() {
		return title;
	}
	public String getDirector() {
		return director;
	}
	
	
	
}
