package synchronization;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {

		CustomThread c1 = new CustomThread();
		CustomThread2 c2 = new CustomThread2();
		c1.start();
		c2.start();

		c1.join();
		c2.join();
		System.out.println("Total Value is = " + Modify.x);

	}

}

class CustomThread extends Thread {

	public void run() {
		System.out.println("CustomThread Start");
		for (int i = 1; i <= 1000; i++) {

			Modify.modify();
		}
		System.out.println("CustomThreadEnd...........");

	}

}

class CustomThread2 extends Thread {

	public void run() {
		System.out.println("CustomThread2 Start");
		for (int i = 1; i <= 1000; i++) {

			Modify.modify();

		}
		System.out.println("CustomThread2 End...........");

	}

}

class Modify {

	static int x = 0;

	static synchronized void modify() {

		Modify.x = Modify.x + 1;

	}

}
