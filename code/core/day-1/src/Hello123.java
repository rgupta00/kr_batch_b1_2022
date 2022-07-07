public class Hello123 {
	 int i = 55;//instance variable
	public static void main(String[] args) {
		//"this" vs self :static method dont have this
		Hello123 o=new Hello123();
		System.out.println(o.i++);
	}
}
