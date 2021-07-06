package aula03;

import java.util.LinkedList;

public class video {
	
	private int id;
	private String title;
	private String category;
	private int age;
	private Boolean avalible;
	private LinkedList<Double> rating;
	
	public video(int id, String title, String category, int age) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.age = age;
		this.setAvalible(true);
		videoclube.setVideo(this);
		this.rating = new LinkedList<Double>();
	}

	public int getId() {
		return this.id;
	}

	public String getTitle() {
		return this.title;
	}

	public String getCategory() {
		return this.category;
	}

	public int getAge() {
		return this.age;
	}

	public String ageString() {
		return "M" + this.age;
	}

	public Boolean isAvalible() {
		return this.avalible;
	}

	public void setAvalible(Boolean avalible) {
		this.avalible = avalible;
	}
	
	public String showByAge (data d) {
		return null;
	}
	
	public Boolean validRating (double rating) {
		if(rating <= 10  && rating >= 1) {
			return true;
		}
		return false;
	}
	
	public Double totalRating () {
		double t = 0;
		for (double r : this.rating) {
			t += r;
		}
		return t;
	}
	public Double mediaRating () {
		return this.totalRating()/this.rating.size();
	}
	
	public void addRating (double r) {
		if(validRating(r))	
			this.rating.add(r);
	}
}
