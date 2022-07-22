package q1;

class Rocket {
	 static void blastOff() {
		System.out.print("bang ");
	}
	static void go() {
		 blastOff();
	 }
}
public class Shuttle extends Rocket {
	public static void main(String[] args) {
		Rocket r=new Shuttle();
		r.go();
	}
	static void go() {
		blastOff();
		// Rocket.blastOff(); // line A
	}
	//@Override
	static void blastOff() {
		System.out.print("sh-bang ");
	}
}