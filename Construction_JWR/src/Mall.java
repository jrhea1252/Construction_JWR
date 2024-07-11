//Author: Joel W. Rhea
public class Mall extends Business {
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	//This will be the empty-argument constructor
	public Mall() {
		super();
		this.numRentedUnits = 0;
		this.medianUnitSize = 0;
		this.numParkingSpaces = 0;
	}
	
	//Used Eclipse to generate part of this preferred constructor
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits, int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentableUnits);
		this.numRentedUnits = numRentedUnits;
		this.medianUnitSize = medianUnitSize;
		this.numParkingSpaces = numParkingSpaces;
	}

	//Eclipse generated getters and setters
	public int getNumRentedUnits() {
		return numRentedUnits;
	}

	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}

	public double getMedianUnitSize() {
		return medianUnitSize;
	}

	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}

	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}

	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}
	
	//This is our draw method with Override because there are other draw methods
	@Override
	public void draw() {
		System.out.println("Drawing code for Mall");
	}
	
	//The displayData method must also be override due to other occurrences
	@Override
	public String displayData() {
		return super.displayData() + String.format("\nThe number of Rented Units is: %d\nMedian Unit Size: %.2f\nNumber of Parking Spaces: %d",
                numRentedUnits, medianUnitSize, numParkingSpaces);
	}
	
	//This ensures proper return value
	@Override
	public String toString() {
		return displayData();
	}
}
