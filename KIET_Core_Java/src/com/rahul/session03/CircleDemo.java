package com.rahul.session03;

public class CircleDemo {
public static void main(String[] args) {
	Circle c =new Circle();
	//The field Circle.radius is not visible
	//c.radius=10;
	c.setRadius(10);
	c.area();
}
}
