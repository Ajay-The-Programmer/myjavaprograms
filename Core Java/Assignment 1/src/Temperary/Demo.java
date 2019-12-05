package Temperary;

public class Demo {

	public static void main(String[] args) {
		A obj=new A(10);
}

}
class A {
	int a;

	public A(int a) {
	
		System.out.println(a);
	
	}
	
	
}
class B extends A{
	int p,q;

	public B(int p,int q) {
		System.out.println("derived");
	}
}
