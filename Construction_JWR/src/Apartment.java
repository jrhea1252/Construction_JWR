
public class Apartment extends Residential {
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable; 
	
	//This is my empty constructor
	public Apartment() {
		super();
		this.numRentableUnits = 0;
		this.avgUnitSize = 0;
		this.parkingAvailable = false;
	}
	
	//This constructor will be preferred 
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits, double avgUnitSize, boolean parkingAvailable) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		this.parkingAvailable = parkingAvailable;
	}

	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	public double getAvgUnitSize() {
		return avgUnitSize;
	}

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	public boolean isParkingAvailable() {
		return parkingAvailable;
	}

	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing code for Apartmnet");
	}
	
	@Override
	public String displayData() {
		return super.displayData() + String.format("\nNumber of Rentable Units: %d\\nAverage Unit Size: %.2f\\nParking Available: %b",
				+ numRentableUnits, avgUnitSize, parkingAvailable);
	}
	//Sting class in .lang won't return correct value
	@Override 
	public String toString(){
		return displayData();
	}
}

