/* 
 * Lena Hand
 * 
 * 11/06/2017
 * 
 * This is the UsedCar class for the CarApp program
 */
public class UsedCar extends Car {
	
	private double mileage;
	
	/**
	 * empty method
	 */
	public UsedCar() {
		
	}

	/**
	 * @param mileage
	 */
	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	/**
	 * @return the mileage
	 */
	public double getMileage() {
		return mileage;
	}

	/**
	 * @param mileage the mileage to set
	 */
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	@Override
	public String toString() {
		return String.format("%-10s %-15s %-8d $%,10.2f %,.0f miles ", super.getMake(), super.getModel(),
				super.getYear(), super.getPrice(), this.mileage);
	}
}
