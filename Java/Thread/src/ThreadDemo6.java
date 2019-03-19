
public class ThreadDemo6 extends Thread {
	public ThreadDemo6(String name) {
		super(name);
	}
			
	public static void main(String[] args) {
		new ThreadDemo6("Thread 1") {
			public void run() {
				for (int i = 0; i < 100; i++)
					System.out.println(getName() + ":Number" + i);
			}
		}.start();
		new ThreadDemo6("Thread 2") {
			public void run() {
				for (int i = 0; i < 100; i++)
					System.out.println(getName() + ":Number" + i);
			}
		}.start();

	}

}
