package staticinnerclass;



class Outer{
	
	static void m1()
	{
		System.out.println("Outer-m1");
	}
	
	static class Inner{
	
		/*static void m2(){
		
		System.out.println("Inner-m2");
		
	}*/
		void m2() {
			
			System.out.println("Inner-m2");
			
		}
		
	}
	
}

public class Access {

	public static void main(String[] args) {
		
		Outer.m1();
		//Outer.Inner.m2();
		Outer.Inner inner=new Outer.Inner();
		
		inner.m2();
	
	

	
	}

}


