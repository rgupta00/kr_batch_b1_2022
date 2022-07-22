package q1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;

class SocketException2 extends SocketException{
	
}


interface xyz {
	void abc() throws IOException;
}

interface pqr {
	void abc() throws SocketException;
}

//OVERRIEN METHOD CAN NOT THROW BIGGER( hierarchy) EX THEN THE BASE METHOD 
class Implementation implements xyz, pqr {
	
	public void abc() throws SocketException2{
		/* implementation */
	}
}

public class Demo {

	public static void main(String[] args) {

	}

}
