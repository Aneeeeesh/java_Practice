package Exercises;
import java.util.*;


public class Exercise_2 {
	public static void main(String[] args) {
		Shape s1 ;
		s1 = new Rectangle(5,10);
		System.out.println(s1.getArea());
		s1 = new Circle(5);
		System.out.println(s1.getArea());
		s1 = new Triangle(6,4);
		System.out.println(s1.getArea());
	}
}

abstract class Shape{
	public int x,y;
	public double getArea() {
		return 0;
	}
}

class Rectangle extends Shape{
	public int width,length;
	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}
	public double getArea() {
		return width*length;
	}
}

class Circle extends Shape{
	public int radius;
	static final double pi = 3.1428;
	public Circle(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return pi*radius*radius;
	}
}

class Triangle extends Shape{
	public int base, height;
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	public double getArea() {
		return 0.5*base*height;
	}
}