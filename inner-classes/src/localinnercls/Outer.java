package localinnercls;

public class Outer {

	static {

		System.out.println("Block........");

		class localinner {

			void fun() {

				System.out.println("Class inside the block....");

			}

		}
		new localinner().fun();
		
	}

	 public Outer(){
			
		 System.out.println("Class inside the Constructor");
			
		}
	 
	public static void main(String[] args) {

		System.out.println("Main Block............");
		new Outer();
		
	}


}
