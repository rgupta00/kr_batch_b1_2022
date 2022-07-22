package q2;
class MyJob implements Runnable{

	@Override
	public void run() {
		System.out.println("myjob....");
	}
	
}
public class DemoThread2 {

	public static void main(String[] args) {
		Thread thread=new Thread(new MyJob());
		thread.start();
		thread.start();
	}
}
