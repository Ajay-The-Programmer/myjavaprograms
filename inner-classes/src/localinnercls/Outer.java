package localinnercls;

public class Outer {

	static {

		System.out.println("Block........");

		class LocalInner {

			void fun() {

				System.out.println("Class inside the block....");

			}

		}
		new LocalInner().fun();

	}

	Outer() {

		System.out.println("Class inside the Constructor");
		class LocalInner {

			public void fun() {
				System.out.println("Class inside Function");
				
				class InnerInner{
					
					void fun() {
						System.out.println("insiide function.....");
					}
					
				}
			}

		}
		new LocalInner().fun();

	}

	public static void main(String[] args) {

		System.out.println("Main Block............");
		new Outer();

	}

}
