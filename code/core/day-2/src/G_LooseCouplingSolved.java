import java.util.Scanner;

//a passanger amit is traveling from Preet Vihar to Noida using Metro

abstract class Vehical {
	public abstract void move(String s, String d);
}

class Bike extends Vehical {
	public void move(String s, String d) {
		System.out.println("moving from " + s + " to " + d + " using bike");
	}
}

class Metro extends Vehical {
	public void move(String s, String d) {
		System.out.println("moving from " + s + " to " + d + " using metro");
	}
}

class Car extends Vehical {
	public void move(String s, String d) {
		System.out.println("moving from " + s + " to " + d + " using car");
	}
}

//now we never have to change the code of passanger in order the change of the vehical
class Passanger {
	private String name;

	public Passanger(String name) {
		this.name = name;
	}

	public void travel(String s, String d, Vehical vehical) {
		vehical.move(s, d);
	}
}

public class G_LooseCouplingSolved {

	public static void main(String[] args) {

		Vehical vehical = null;
		System.out.println("PE ur choice 1. for Bike 2. for Car 3. for metro");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();

		if (choice == 1)
			vehical = new Bike();
		if (choice == 2)
			vehical = new Car();
		if (choice == 3)
			vehical = new Metro();

		if (vehical != null) {
			Passanger passanger = new Passanger("ravi");
			passanger.travel("PV", "Noida", vehical);
		} else
			System.out.println("wrong choice");

	}

}
