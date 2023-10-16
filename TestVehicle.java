package test;

import static core.VehicleValidationRules.*;

//import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import core.Color;
import core.Vehicle;

public class TestVehicle {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Vehicle> vehicles = new ArrayList<>();
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println(
							"choose any option\n1)add vehicle in showroom\n" + "2)Display all vehicles\n0)Exit");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("enter details : chno,color,bp,date,company");
						vehicles.add(
								allInputCheck(sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next(), vehicles));
						break;
					case 2:
						System.out.println(vehicles);
						break;
					case 0:System.out.println("Thank You!!!");
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
					sc.nextLine();
				}

			}
		}

	}

}
