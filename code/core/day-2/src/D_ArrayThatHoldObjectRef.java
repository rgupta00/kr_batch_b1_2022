
class Dog {
	private String color;
	
	public Dog(String dogColor) {
		color = dogColor;
	}


	public void sound() {
		System.out.println("bho bho...: "+ color);
	}
}

public class D_ArrayThatHoldObjectRef {

	public static void main(String[] args) {
		//array of objects:

//			 Dog [] dogs=new Dog[4];
//			 dogs[0]=new Dog("white");
//			 
//			 dogs[1]=new Dog("white");
//			 
//			 dogs[2]=new Dog("black");
//			 
//			 dogs[3]=new Dog("white");
		
		 Dog [] dogs= {new Dog("white"), new Dog("black"), new Dog("white"), new Dog("white")};
	
			 printArrayOfDogs(dogs);
	}

	static void printArrayOfDogs(Dog[] dogs) {
		for(Dog dog: dogs)
			 dog.sound();
	}

}
