package multithreading;

public class MainThreadPro {
	public static void main(String args[]) {
		
		A obj=new A();
		obj.start();
		B obj2=new B();
		Thread obj3=new Thread(obj2);
		obj3.start();
		C c=new C();
		Thread obj4=new Thread(c);
		obj4.start();
	
	}

}
 class A extends Thread{
	 
	public void run(){
		q
			for(int i=0;i<10;i+=2) {
			System.out.println("Odd"+i);
	}
}}
class B implements Runnable{
	
	public void run() {
	for(int j=2;j<10;j+=2) {
		System.out.println("Even"+j);
		
	}
	
} }
class C implements Runnable{
	
	public void run() {
	for(int j=3;j<20;j+=2) {
		System.out.println("Third"+j);
		
	}
	
}}