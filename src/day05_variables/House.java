package day05_variables;

public class House {

    // Can write this type: boolean house = 2, computer = 1, watch = 5;

    /* Create a class House
    create a main method
    - Each the datatype you feel is most appropriate for each variable.
    - Create the following variables:
    house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),
    - Print each variable with a message with the value
    Ex: The number of bedrooms is: 4
    The number of bathrooms is: 3 */

    public static void main(String[] args) {

        String houseType = "Condo";
        String address = "Iowa City/IA";
        int zipcode = 12658;
        double costOfTheHouse = 1_250.05;
        int numberOfBedrooms = 2;
        int numberOfBathrooms = 2;
        int numberOfKitchen = 1;
        boolean isThereABasement = false, isThereAnAttic = false;

        boolean isThereAPool = false;
        boolean isTheHouseForSale = true;
        boolean isAParkNearBy = true;
        double raitingOfSurroundingSchoolDistricts =4.7;

        String message = " The " + houseType + " on " + address + ", " + zipcode + " costs $" + costOfTheHouse + "\nThe " + houseType + " has " + numberOfBedrooms + " bedrooms, " + numberOfBathrooms + " bathrooms, " + numberOfKitchen + " kitchen.\nIt also includes a basement: " + isThereABasement + ", has an attic: " + isThereAnAttic + ", has a pool: " + isThereAPool + ", is on sale: " + isTheHouseForSale + ", and has a park: " + isAParkNearBy + ". \nThe school in the area have a rating of " + raitingOfSurroundingSchoolDistricts + ".";


        System.out.println(message);




    }

}

