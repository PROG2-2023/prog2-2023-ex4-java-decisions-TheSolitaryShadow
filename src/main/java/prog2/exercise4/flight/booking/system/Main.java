package prog2.exercise4.flight.booking.system;

import java.time.LocalDate;

public class Main 
{
    public static void main( String[] args )
    {
        String departureDate = "2023-03-12";
        LocalDate theDepartureDate = LocalDate.parse(departureDate);
        String returnDate = "2023-03-14";
        LocalDate theReturnDate = LocalDate.parse(returnDate);

        String random = "FOFO"+Math.random()+"IN";
        String substring = random.substring(random.length()-4);
        
        String sourceAirport = "NANJING LUKOU INTERNATIONAL AIRPORT" ;
        String destinationAirport = "OULU AIRPORT";

        FlightBooking fb = new FlightBooking("John Doe", theDepartureDate, theReturnDate, 2, 3);
        fb.setFlightCompany("Flights-of-Fancy");

        fb.setTripSource("1");
        fb.setTripDestination("1", "2");

        fb.setTripType("1");
        fb.setBookingClass("1");
        String ticketNumber = fb.getTicketNumber();
        fb.setDepartureDate(theDepartureDate);
        fb.setReturnDate(theReturnDate);
        LocalDate result = fb.getReturnDate();
        fb.setDepartingTicketPrice(2, 5);
        fb.setReturnTicketPrice();

        fb.setTotalTicketPrice();
        double returnedPrice = fb.getTotalTicketPrice();



        System.out.println(fb.toString());
    }
}