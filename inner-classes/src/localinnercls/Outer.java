package localinnercls;

public class Outer {

	static {

		System.out.println("Block........");

		class localinner {

			void fun() {

				System.out.println("Class inside the block....");

			}

		}

	}

	public static void main(String[] args) {

		System.out.println("Main Block............");
		
	}

}
