package pro13;

public class LightMotorVehical extends Vehical {
		private int milage;

		public LightMotorVehical(String companyName, int price, int milage) {
			super(companyName, price);
			this.milage = milage;
		}

		@Override
		public String toString() {
			return super.toString()+"LightMotorVehical [milage=" + milage + "]";
		}

		
	}

