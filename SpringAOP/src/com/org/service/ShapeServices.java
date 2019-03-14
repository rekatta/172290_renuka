package com.org.service;

import com.org.pojo.Circle;
import com.org.pojo.Traingle;

public class ShapeServices {
	private Circle circle;
	private Traingle traingle;
	
	@loggable
	public Circle getCircle() {
		System.out.println("get circle called");
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Traingle getTraingle() {
		return traingle;
	}
	public void setTraingle(Traingle traingle) {
		this.traingle = traingle;
	}
	

}
