package q6;

import java.io.Serializable;

public class ImpPerson extends Person implements Serializable{

	public static void main(String str[]) {
		ImpPerson p = new ImpPerson();
		System.out.print(p instanceof Serializable);// instanceof works at run time 
	}
}
