package runnableinterface;

public class MainThread {

	public static void main(String[] args) {

		Custom runnable=new Custom();
		Thread thread=new Thread(runnable);
		thread.start();
		
	}
}

class Custom implements Runnable {

	public void run() {

		System.out.println("Called CustomThread using runnable interface");
		
		
	}

}
