package tr.ahmetturkmen.InheritanceE1;

/**
 * Created by ahmetturkmen on 2/19/17.
 */
public class TestCylinder {


	public static void main(String[] args) {

		Cylinder cy1 = new Cylinder();
		System.out.println("Radius is : " + cy1.getRadius() +"\n"+
				"Height is : " + cy1.getHeight() +"\n"+
				"Color is : " + cy1.getColor() +"\n"+
				"Base area is : " + cy1.getArea() +"\n"+
				"Volume is " + cy1.getVolume());

		Cylinder cy2 = new Cylinder(2.0, 5.0);
//		System.out.println(cy2.getColor());
		System.out.println("Radius is : " + cy2.getRadius() +"\n"+
				"Height is : " + cy2.getHeight() +"\n"+
				"Color is : " + cy2.getColor() +"\n"+
				"Base area is : " + cy2.getArea() +"\n"+
				"Volume is " + cy2.getVolume());


	}
}
