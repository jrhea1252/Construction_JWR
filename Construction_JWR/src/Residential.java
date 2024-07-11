
public class Residential extends Building {
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	//This will be the empty constructor
	public Residential(){	
		super();
		this.numBedrooms = 0;
		this.numBathrooms = 0;
		this.laundryRoom = false;
	}
	
	//This is my preferred constructor
	public Residential (String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom){
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
	}

	//I generated these getters and setters using eclipse
	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	public int getNumBathrooms() {
		return numBathrooms;
	}

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}
	
	//Draw method exists else where in the program
	@Override 
	public void draw() {
		System.out.println("Drawing code for Residential");
	}
	
	//displayData occurs in other classes in the program
	@Override
	public String displayData() {
		return super.displayData() + String.format("\nNumber of Bedrooms: %d\nNumber of Bathrooms: %d\nLaundry Room: %b",
                numBedrooms, numBathrooms, laundryRoom);
	}
	
	//toString override
	@Override
	public String toString() {
		return displayData();
	}
	
}
