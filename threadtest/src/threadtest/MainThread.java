package threadtest;

public class MainThread {
	
	public static void main(String[] args) throws InterruptedException {
		
	CustomThread customThread=new CustomThread();
	customThread.start();
			
		System.out.println("Main Thread Start");
	for(int i=1;i<100;i++) {
			
		Thread.sleep(1000);
			System.out.println("Main Value"+i);
			
			
		}System.out.println("Main ThreadEnd...........");
		
		
		
		
	}

}
class CustomThread extends Thread{
	
	public void run() {
		System.out.println("CustomThread Start");
		for(int i=1;i<100;i++) {
		
			System.out.println("CustomValue"+i);
			
			
		}System.out.println("CustomThreadEnd...........");
		
		
	}
	
	
}



