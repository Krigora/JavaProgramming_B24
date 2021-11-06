package day50_inheritance;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Airport {

    public static void main(String[] args) {

        FlightTicket ticket = new FlightTicket("first", "NEW YORK", "Florida");
        /*
        we cannot access directly
        ticket.type;
        ticket.departureLocation;
        ticket.arrivalLocation;
                */

        System.out.println(ticket.getType());
        System.out.println(ticket.getDepartureLocation());
        System.out.println(ticket.getArrivalLocation());





    }
}




