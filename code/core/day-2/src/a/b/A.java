package a.b;

public class A {

	private int a = 33;
	int b = 330;
	protected int c = 3300;

	public int d = 33000;

	private void fooPrivate() {
		System.out.println("private method ");
	}

	//default method/data can not be access outsid the package in "any way"
	void fooDefault() {
		System.out.println("default method ");
	}

	//protected method/data can only be access outside the package in iff that another class of another package subclas it
	protected void fooProtected() {
		System.out.println("protected method ");
	}

	public void fooPublic() {
		System.out.println("public method ");
	}

}
