//Author: Joel W. Rhea
public class Business extends Building {
	protected int numRentableUnits;
	
	//This is an empty constructor
	public Business() {
        super();
        this.numRentableUnits = 0;
	}
	//This creates the preferred constructor
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits) {
	       super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
	       this.numRentableUnits = numRentableUnits;
	}
	//Eclipse generate getter and setter
	public int getNumRentableUnits() {
		return numRentableUnits;
	}
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
	//The draw method is an override here because there is a draw method in the super class
	@Override
	public void draw() {
		System.out.println("Drawing code for Business");
	}
	//displayData method exists in superclass 
	@Override
	public String displayData() {
	return super.displayData() + String.format("\nNumber of Rentable Units: %d", numRentableUnits);
	}
	//Override the toString method
	@Override
	public String toString() {
		return displayData();
	}
}
