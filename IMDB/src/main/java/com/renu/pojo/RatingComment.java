package com.renu.pojo;

public class RatingComment {
	private int rating;
	private String comments;
	
	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public RatingComment(String comments) {
		super();
		this.comments = comments;
	}

	public RatingComment(int rating, String comments) {
		super();
		this.rating = rating;
		this.comments = comments;
	}
	

}