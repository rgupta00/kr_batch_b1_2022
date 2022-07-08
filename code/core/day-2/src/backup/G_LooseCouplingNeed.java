package backup;
//a passanger amit is traveling from Preet Vihar to Noida using Metro
class Metro {
	public void move(String s, String d) {
		System.out.println("moving from " + s + " to " + d + " using metro");
	}
}

class Car {
	public void move(String s, String d) {
		System.out.println("moving from " + s + " to " + d + " using car");
	}
}

class Passanger {
	private String name;

	public Passanger(String name) {
		this.name = name;
	}

	public void travel(String s, String d, Car car) {
		car.move(s, d);
	}
}

public class G_LooseCouplingNeed {

	public static void main(String[] args) {
		// Metro metro=new Metro();
		Car car = new Car();
		Passanger passanger = new Passanger("ravi");
		passanger.travel("PV", "Noida", car);

	}

}
