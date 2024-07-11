//Author: Joel W. Rhea
public class Building {
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup; 
	
	//This is the first of two constructors and is the empty constructor
	public Building() {
		this.projectName = "";
		this.completeAddress = "";
		this.totalSquareFeet =0.0;
		this.occupancyGroup = "";
		this.subgroup = "";
	}
	
	//This is the second constructor and is the preferred constructor
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet =totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}
	
	//These are Eclipse generated getters and setters
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCompleteAddress() {
		return completeAddress;
	}

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}

	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}

	public String getOccupancyGroup() {
		return occupancyGroup;
	}

	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}

	public String getSubgroup() {
		return subgroup;
	}

	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}
	
	//This method is meant to eventually draw to the screen but for now just prints.
	public void draw() {
		System.out.println("Drawing code for Building");
	}
	
	//This is the formatted String that contains all of the object information.
	public String displayData() {
		return String.format("Project Name: %s\nAddress: %s\nSquare Feet: %.2f\nOccupancy Group: %s\nOccupancy Subgroup: %s",
                projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
	}
	
	//This will override the .lang toString
	@Override
	public String toString() {
		return displayData();
	}

}
