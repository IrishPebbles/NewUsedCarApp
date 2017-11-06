/*
 * Lab 10 by Lena Hand
 * 
 * 11/06/2017
 * 
 * This is a program to hold the details regarding a list of cars. Data is received from the user and 
 * output into a table.
 * 
 * This program is also extended with a Used Car subcl32ass
 */
import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Car> carList = new ArrayList<>();
		boolean userSelection = true;
		
		
		System.out.println("Welcome to the Grand Circus Car Lot!");
		System.out.println();
		
		// Create a list of 6 cars: 3 used, 3 new
		carList.add(new Car("Toyota", "Prius C Three", 2017, 20150.99));
		carList.add(new Car("Kia", "Forte", 2017, 16600.98));
		carList.add(new Car("Honda", "Accord", 2017, 22455.36));
		
		carList.add(new UsedCar("Toyota", "Prius C Two", 2014, 13649.75, 54797));
		carList.add(new UsedCar("Honda", "Fit", 2008, 5535.74, 112710));
		carList.add(new UsedCar("GMC", "Envoy", 2003, 4100, 147746));
		carList.add(new UsedCar("Chrysler", "PT Cruiser", 2010, 6542.96, 84100));
		

		// display their information
		// Print out a table of the cars at the end
		System.out.println("Inventory of Cars: ");
		menu(carList);
		
		//carSelection(userSelection);

	}
	
	public static boolean carSelection(boolean choice) {
		
		return choice;
	}
	
	public static void menu(ArrayList<Car> carList) {

		for (int i = 0; i < carList.size(); i++) {
			System.out.println((i + 1) + ". " + carList.get(i));
		}

		// Add Quit as the last option in the menu
		System.out.println((carList.size() + 1) + ". Quit");
	}

	
}
