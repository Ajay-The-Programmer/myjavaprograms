package pro13;


public class HeavyMotorVehical extends Vehical {
	private int capacity;

	public HeavyMotorVehical(String companyName, int price, int capacity) {
		super(companyName, price);
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return super.toString()+"HeavyMotorVehical [capacity=" + capacity + "]";
	}
}

	
