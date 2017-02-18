package tr.ahmetturkmen.InheritanceE3;

/**
 * Created by ahmetturkmen on 2/19/17.
 */
public class TestPerson {
	public static void main(String[] args) {

		// Testing student class

		Student s1 = new Student("Murat ","54th Street");
		s1.addCourseGrade("EE203",67);
		s1.addCourseGrade("ME22",80);
		s1.printGrades();
		System.out.println("Average is : "+ s1.getAverageGrade());


		// Testing teacher class

		Teacher t1 = new Teacher("Mike", " KK Village No 74");
		System.out.println(t1);
		String[] courses = {"IM101","IM102","IM103"};

		for ( String course : courses ) {
			if ( t1.addCourse(course) ) {
				System.out.println(course + " added");
			} else {
				System.out.println(course + " cannot be added");
			}
		}
		for ( String course: courses) {
			if ( t1.removeCourse(course) ) {
				System.out.println(course + " is removed");
			} else {
				System.out.println(course + " cannot be removed ");
			}

		}
	}
}
