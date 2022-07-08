//ooad
// a trainer of java name "Raj" is using black color marker of reynold to teach

class Marker {
	private String brand;
	private String color;

	public Marker(String brand, String color) {
		this.brand = brand;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void write() {
		System.out.println("marking with " + brand + " marker of color " + color);
	}

}

class Trainer {
	private String name;
	private String subject;

	
	
	public void teach(Marker marker, String topic) {
		System.out.println("lets discuss... "+ topic);
		marker.write();
	}
	
	public Trainer(String name, String subject) {
		this.name = name;
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void printTrainerDetails() {
		System.out.println("name: " + name);
		System.out.println("subject: " + subject);
	}
}

public class H_UseAEx2 {

	public static void main(String[] args) {

	}

}
