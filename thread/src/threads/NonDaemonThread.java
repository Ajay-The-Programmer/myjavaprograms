package threads;

public class NonDaemonThread {

	public static void main(String[] args) throws InterruptedException {

		DaemonThread c1 = new DaemonThread();

		c1.setDaemon(true);
		c1.start();

		System.out.println("Non-DaemonThread Start........");
		for (int i = 1; i <= 100; i++) {
			System.out.println("Non-DaemonThread" + i);
		}
		System.out.println("Non-DaemonThread End...........");

	}

}

class DaemonThread extends Thread {

	public void run() {
		System.out.println("DeamoThread Start........");
		for (int i = 1; i <= 100; i++) {
						System.out.println("DaemonThread" + i);
		}
		System.out.println("DaemonThread End...........");

	}

}
