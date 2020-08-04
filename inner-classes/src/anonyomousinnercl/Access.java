package anonyomousinnercl;

interface Lenovo {

	public void fun();// By default every function is public and abstract in interface

}

public class Access {

	public static void main(String[] args) {

		Lenovo lenovo = new Lenovo() {

			public void fun() {

				System.out.println("Anonymous lenovo fun.........");

			}
			//it is one kind of local inner class

		};

		lenovo.fun();

	}

}
