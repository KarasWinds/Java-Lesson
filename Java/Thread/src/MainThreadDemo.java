
public class MainThreadDemo {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("befor change:" + t.getName());
		t.setName("MT");
		System.out.println("after change:" + t.getName());
	}
}
