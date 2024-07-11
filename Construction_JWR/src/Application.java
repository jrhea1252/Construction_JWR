
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This will test the super class Building's empty and preferred constructor and getters and setters
		Building emptyBuilding = new Building();
        System.out.println(emptyBuilding.toString());
        emptyBuilding.draw();
		
		Building building = new Building("Gaines House", "123 Main Street, Louisville, Kentucky 40201", 2540, "Residential", "R1");
        System.out.println(building.toString());
        building.draw();
        
        building.setProjectName("New Gaines House");
        building.setCompleteAddress("321 Main Street, Louisville, Kentucky 40201");
        building.setTotalSquareFeet(2600);
        building.setOccupancyGroup("Residential");
        building.setSubgroup("R2");
        System.out.println(building.getProjectName());
        System.out.println(building.getCompleteAddress());
        System.out.println(building.getTotalSquareFeet());
        System.out.println(building.getOccupancyGroup());
        System.out.println(building.getSubgroup());
        System.out.println("---------------------------------------");
        System.out.println();

        // This will test the business class's empty and preferred constructor and getters and setters
        Business emptyBusiness = new Business();
        System.out.println(emptyBusiness.toString());
        emptyBusiness.draw();
        
        Business business = new Business("Office Structure", "789 Company Road, Louisville, Kentucky 40202", 5000, "Business", "B", 11);
        System.out.println(business.toString());
        business.draw();
        
        business.setNumRentableUnits(14);
        System.out.println(business.getNumRentableUnits());
        System.out.println("---------------------------------------");
        System.out.println();
        
        // This will test the mall class's empty and preferred constructor and getters and setters
        Mall emptyMall = new Mall();
        System.out.println(emptyMall.toString());
        emptyMall.draw();
        
        Mall mall = new Mall("Super Mall", "345 Shopping Blvd, Louisville, Kentucky 40203", 15000, "Business", "B", 40, 30, 311.5, 150);
        System.out.println(mall.toString());
        mall.draw();
        
        mall.setNumRentedUnits(55);
        mall.setMedianUnitSize(700.0);
        mall.setNumParkingSpaces(430);
        System.out.println(mall.getNumRentedUnits());
        System.out.println(mall.getMedianUnitSize());
        System.out.println(mall.getNumParkingSpaces());
        System.out.println("---------------------------------------");
        System.out.println();

        // This will test the residential class's empty and preferred constructor and getters and setters
        Residential emptyResidential = new Residential();
        System.out.println(emptyResidential.toString());
        emptyResidential.draw();
        
        Residential residential = new Residential("Sunrise Commons", "121 Residential Lane, Louisville, Kentucky 40204", 3000, "Residential", "R2", 12, 7, true);
        System.out.println(residential.toString());
        residential.draw();
        
        residential.setNumBedrooms(15);
        residential.setNumBathrooms(8);
        residential.setLaundryRoom(false);
        System.out.println(residential.getNumBedrooms());
        System.out.println(residential.getNumBathrooms());
        System.out.println(residential.isLaundryRoom());
        System.out.println("---------------------------------------");
        System.out.println();

        // This will test the apartment class's empty and preferred constructor and getters and setters
        Apartment emptyApartment = new Apartment();
        System.out.println(emptyApartment.toString());
        emptyApartment.draw();
        
        Apartment apartment = new Apartment("Cozy Apartments", "545 Residential Lane, Louisville, Kentucky 40204", 3001, "Residential", "R2", 23, 9, true, 21, 867.5, true);
        System.out.println(apartment.toString());
        apartment.draw();
        
        apartment.setNumRentableUnits(23);
        apartment.setAvgUnitSize(950.0);
        apartment.setParkingAvailable(false);
        System.out.println(apartment.getNumRentableUnits());
        System.out.println(apartment.getAvgUnitSize());
        System.out.println(apartment.isParkingAvailable());
        System.out.println("---------------------------------------");
        System.out.println();

        // This will test the single family home class's empty and preferred constructor and getters and setters
        SingleFamilyHome emptySingleFamilyHome = new SingleFamilyHome();
        System.out.println(emptySingleFamilyHome.toString());
        emptySingleFamilyHome.draw();
        
        SingleFamilyHome singleFamilyHome = new SingleFamilyHome("Gaines House", "123 Main Street, Louisville, Kentucky 40201", 2540, "Residential", "R1", 4, 3, true, true);
        System.out.println(singleFamilyHome.toString());
        singleFamilyHome.draw();
        
        singleFamilyHome.setGarage(false);
        System.out.println(singleFamilyHome.isGarage());

	}

}
