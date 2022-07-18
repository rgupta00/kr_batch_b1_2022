package q7;

import java.io.FileNotFoundException;
import java.io.IOException;

interface xyz {
	void abc() throws IOException;
}

interface pqr {
	void abc() throws FileNotFoundException;
}

class Implementation implements xyz, pqr {
	public void abc(){
		/* implementation */ 
	}
}