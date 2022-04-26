package day48_encapsulation.flight_ticket;

public class FlightTicket {

    /*
     FlightTicket
            instance variables:
                type (first, business, economy)
                departure location
                arrival location
                */
    private String type;
    private String departureLocation;
    private String arrivalLocation;

/*
            constructor: initialize all fields
                -> only allow the given ticket types to be set

            encapsulate all the fields
     */

    public FlightTicket (String type, String departureLocation, String arrivalLocation){
        setType(type);
        setArrivalLocation(arrivalLocation);
        setDepartureLocation(departureLocation);
    }



    public void setType (String type) {
        if( type.equalsIgnoreCase("first")  || type.equalsIgnoreCase("business") || type.equalsIgnoreCase("economy") ) {

            this.type = type;

        } else {
            System.out.println("Invalid ticket type");
        }
    }

    public void setDepartureLocation (String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public void setArrivalLocation (String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    @Override
    public String toString () {
        String seat = "";

        if (type.equalsIgnoreCase("first")) {
            seat = "First class";

        } else if (type.equalsIgnoreCase("business")) {
            seat = "business";
        } else if (type.equalsIgnoreCase("economy")) {
            seat = "economy";
        }
        return "Your Seat type is " + seat + "\nDeparture from " + departureLocation + "\nArrival to ----- " + arrivalLocation;
    }




}
