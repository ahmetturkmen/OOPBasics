package tr.ahmetturkmen.InheritanceE3;

/**
 * Created by ahmetturkmen on 2/19/17.
 */
public class Person {

	private String name;
	private String address;

	public Person(String name, String address) {
		this.name = name;
		this.address = address;

	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {

		return this.name + "(" + this.address + ")";
	}


}
