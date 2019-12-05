package pro13;
/*Write a Java program to create a super class Vehicle having members Company and
price. Derive 2 different classes LightMotorVehicle (members  mileage) and
HeavyMotorVehicle (members  capacity-in-tons). Accept the information for n vehicles
and display the information in appropriate form. While taking data, ask the user about the
type of vehicle first.
*/


class Vehical {
	private String companyName;
	private int price;

	public Vehical(String companyName, int price) {
		super();
		this.companyName = companyName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehical [companyName=" + companyName + ", price=" + price + "]";
	}

}
	