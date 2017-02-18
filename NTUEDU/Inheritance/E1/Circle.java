package tr.ahmetturkmen.InheritanceE1;

/**
 * Created by ahmetturkmen on 2/19/17.
 */
public class Circle {


	private double radius;
	private String color;

	public Circle(){
		this.radius= 1.0;
		this.color = "red";
	}

	public Circle(double radius){
		this.radius=radius;

	}
	public Circle(double radius,String color){
		this.color=color;
		this.radius=radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return  this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public double getArea(){
		double area = Math.PI*this.radius*this.radius;
		return area;
	}
}
