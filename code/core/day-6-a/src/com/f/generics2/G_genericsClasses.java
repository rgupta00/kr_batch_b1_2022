package com.f.generics2;

//how to write generics class with ease...?
class Foo<T> {
	private T i;

	public T getI() {
		return i;
	}

	public void setI(T i) {
		this.i = i;
	}
}

public class G_genericsClasses {

	public static void main(String[] args) {
			Foo<Integer> f=new Foo<>();
			f.setI(3);
			System.out.println(f.getI());
			
			Foo<Double> f2=new Foo<>();
			f2.setI(3.7);
			System.out.println(f2.getI());
			
	}

}
