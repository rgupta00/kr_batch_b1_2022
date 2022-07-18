package q6;

class Tree {
	Tree getInstance() {
		return new Tree();
	}
}

class Fruit extends Tree {
	Object getInstance() {
		return this;
	}
}

class Mango extends Fruit {
}

public class Demo {

}
