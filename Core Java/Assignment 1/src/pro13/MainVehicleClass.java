package pro13;

import java.util.Scanner;

public class MainVehicleClass {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*System.out.println("how many vehicle info do want to store: ");
		int record=in.nextInt();*/
		
		System.out.println("Enter vehical choice:\n1.LightMotorVehicle\n2.HeavyMotorVehicle");
		int vehicleChoise = in.nextInt();
		if (vehicleChoise == 1) {
			System.out.println("Enter number of LightMotorVehical you want to create:");
			int n = in.nextInt();
			Vehical lightMotorVehical[] = new LightMotorVehical[n];
			for (int i = 0; i < n; i++) {
				System.out.println("Enter " + (i + 1) + " lightMotorVehical details:");
				System.out.println("Enter company name:");
				String companyName = in.next();
				System.out.println("Enter price:");
				int price = in.nextInt();
				System.out.println("Enter milage:");
				int milage = in.nextInt();
				lightMotorVehical[i] = new LightMotorVehical(companyName, price, milage);
				System.out.println("LightMotoVehical Details:");
				System.out.println(lightMotorVehical[i]);
			}
		} else if (vehicleChoise == 2) {
			System.out.println("Enter number of heavyMotorVehical you want to create:");
			int n = in.nextInt();
			Vehical heavyMotorVehical[] = new HeavyMotorVehical[n];
			for (int i = 0; i < n; i++) {
				System.out.println("Enter " + (i + 1) + " heavyMotorVehical details:");
				System.out.println("Enter company name:");
				String companyName = in.next();
				System.out.println("Enter price:");
				int price = in.nextInt();
				System.out.println("Enter capacity:");
				int capacity = in.nextInt();
				heavyMotorVehical[i] = new HeavyMotorVehical(companyName, price, capacity);
				System.out.println("HeavyMotoVehical Details:");
				System.out.println(heavyMotorVehical[i]);
						
			}
		}

		in.close();

}}



