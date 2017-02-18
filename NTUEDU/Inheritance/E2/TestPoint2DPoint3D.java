package tr.ahmetturkmen.InheritanceE2;

/**
 * Created by ahmetturkmen on 2/19/17.
 */
public class TestPoint2DPoint3D {


	public static void main(String[] args) {


		Point2D p2a = new Point2D(1, 2);
		System.out.println(p2a);
		Point2D p2b = new Point2D();
		System.out.println(p2b);


		// Test Getters and Setters

		p2a.setX(3);
		p2a.setY(4);
		System.out.println(p2a);
		System.out.println("x is : " + p2a.getX() + "\n" +
				"y is : " + p2a.getY());

		Point3D p3a = new Point3D(11, 12, 13);
		System.out.println(p3a);
		Point2D p3b = new Point3D();
		System.out.println(p3b);

		p3a.setY(22);  // setting from superclass
		p3a.setX(21);  // setting from superclass
		p3a.setZ(23);   // setting from (Point3D) subclass
		System.out.println("x is : " + p3a.getX() + "\n" +
				"y is : " + p3a.getY() + "\n" +
				"z is : " + p3a.getZ());

	}

}
