package hw1;

/**
 * Created by nick on 1/26/15.
 */
public class Main {

    public static void main(String args[]) {
        TicketUtil.calculateRideCost(1, 3, false);
        System.out.println("Sample run " + TicketUtil.calculateRideCost(5, 2, false));
        System.out.println("Sample run discounted " + TicketUtil.calculateRideCost(1, 3, true));
        System.out.println("Sample run with numRides " + TicketUtil.calculateRideCost(1, 1, 3, false));
        System.out.println("Sample run discounted with numRides " + TicketUtil.calculateRideCost(2, 1, 3, true));
        System.out.println("getMinimalFare " + TicketUtil.getMinimumFare(false));
        System.out.println("getMinimalFare discounted " + TicketUtil.getMinimumFare(true));

        Ticket ticket = new Ticket(100, false);
        System.out.println("Ticket balance after newly created " + ticket.getBalance());
        System.out.println("Check for isInTransit after beginRide is called");
        ticket.beginTrip(1);
        System.out.println("Ticket isInTransit? " + ticket.isInTransit());
        System.out.println("getStartZone: " + ticket.getStartZone());
        System.out.println("Checkt to see if the ticket is discounted: " + ticket.isDiscounted());
    }
}
