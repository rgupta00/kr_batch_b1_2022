package com.day3.session1.a.oo;
//A passanger is moving from LN to Noida "using" metro

// M1	---------- M2/ M3
// inteface is a 100% abstraction 
interface Vehical{
	public abstract void move(String s, String d) ;
}

//abstract class Vehical{
//	public abstract void move(String s, String d) ;
//}

class Car implements Vehical{
	public void move(String s, String d) {
		System.out.println(" passanger is moving from "+ s + " to "+ d+ "using car");
	}
}

class Bike implements Vehical{
	public void move(String s, String d) {
		System.out.println(" passanger is moving from "+ s + " to "+ d+ "using bike");
	}
}

class Metro implements Vehical{
	public void move(String s, String d) {
		System.out.println(" passanger is moving from "+ s + " to "+ d+ "using metro");
	}
}
//SOLID: O: Open close prin...
class Passanger{
	private String name;
	public Passanger(String name) {
		this.name = name;
	}

	public void travel(String s, String d, Vehical vehical) {
		System.out.println("name: "+ name);
		vehical.move(s, d);
	}
}
public class A_RelationShipBwTheObjects {
	
	public static void main(String[] args) {
		//foolish code: if u have one change in the req... ur code have to change at many places :(
		//Bike bike=new Bike();
		Vehical vehical=new Metro();
		Passanger passanger=new Passanger("raj");
		passanger.travel("Preet Vihar", "CP", vehical);
	}

}



