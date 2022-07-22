package q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo2 {
	
	public static void main(String[] args) {
	//	String arr[]= {"foo","bar"};
//		List l=Arrays.asList(arr);
		List l=new ArrayList();
		l.add("33");	//add the data
		l.add("44");
	   l.set(1, 56.99);	//used to update the data
		System.out.println(l);
	}

}
