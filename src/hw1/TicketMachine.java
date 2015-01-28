package hw1;

/**
 * Created by nick on 1/26/15.
 */
public class TicketMachine {

    private int totalNumberOfTicketsSold = 0;
    private int totalSalesOfTickets = 0;

    public  TicketMachine() {

    }

    public Ticket purchaseTicket(int startZone, int endZone, boolean discounted) {
        totalNumberOfTicketsSold++;
        totalSalesOfTickets += TicketUtil.calculateRideCost(startZone, endZone, discounted);

        return new Ticket(TicketUtil.calculateRideCost(startZone, endZone, discounted), discounted);
    }

    public Ticket purchaseTicket(int numRides, int startZone, int endZone, boolean discounted) {
        totalNumberOfTicketsSold++;
        totalSalesOfTickets += TicketUtil.calculateRideCost(numRides, startZone, endZone, discounted);

        return new Ticket(TicketUtil.calculateRideCost(numRides, startZone, endZone, discounted), discounted);
    }

    public Ticket purchaseTicket(int amount, boolean discounted) {
        totalNumberOfTicketsSold++;
        totalSalesOfTickets += amount;

        return new Ticket(amount, discounted);
    }

    public int totalTickets() {

        return totalNumberOfTicketsSold;
    }

    public int totalCost() {

        return totalSalesOfTickets;
    }
}
