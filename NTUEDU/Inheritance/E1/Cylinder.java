package tr.ahmetturkmen.InheritanceE1;

/**
 * Created by ahmetturkmen on 2/19/17.
 */
public class Cylinder extends Circle {

	private double height;

	public Cylinder(){
		super();
		this.height=1.0;
	}
	public Cylinder(double height){
		this.height=height;
	}
	public Cylinder(double height, double radius){
		super(radius);
		this.height=height;
	}

	public Cylinder(double height,double radius,String color){
		super(radius, color);
		this.height=height;

	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Cylinder{" +
				"height=" + height +
				'}';
	}
	public double getVolume(){
		double volume =  Math.PI*getHeight()*getRadius()*getRadius();
		return volume;

	}
}