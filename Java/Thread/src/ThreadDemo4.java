
public class ThreadDemo4 extends Thread {
	public ThreadDemo4(String name) {
		super(name);
		start();
	}

	public void run() {
		for (int i = 0; i < 100; i++)
			System.out.println(getName() + ":Number" + i);
	}

	public static void main(String[] args) {
		new ThreadDemo4("Thread 1");
		new ThreadDemo4("Thread 2");

	}

}
