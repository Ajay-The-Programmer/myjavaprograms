package nonstaticclass;

class Outer {

	void m1() {

		System.out.println("Outer-m1");
	}

	class Inner {

		void m2() {
			System.out.println("Outer-m2");

		}

	}

}

public class Access2 {

	public static void main(String[] args) {

		Outer outer = new Outer();

		outer.m1();
		Outer.Inner inner = outer.new Inner();
		inner.m2();

	}

}
