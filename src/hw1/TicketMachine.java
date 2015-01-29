package hw1;

/**
 * Created by nick on 1/26/15.
 */
public class TicketMachine {

    private int totalNumberOfTicketsSold = 0;
    private int totalSalesOfTickets = 0;

    public  TicketMachine() {

    }

    /**
     *
     * @param startZone start zone for ride
     * @param endZone end zone for ride
     * @param discounted is ticket discounted
     * @return a new ticket
     */
    public Ticket purchaseTicket(int startZone, int endZone, boolean discounted) {
        totalNumberOfTicketsSold++;
        totalSalesOfTickets += TicketUtil.calculateRideCost(startZone, endZone, discounted);

        return new Ticket(TicketUtil.calculateRideCost(startZone, endZone, discounted), discounted);
    }

    /**
     *
     * @param numRides number of rides to purchase
     * @param startZone start zone for ride
     * @param endZone end zone for ride
     * @param discounted is ticket discounted
     * @return a new ticket
     */
    public Ticket purchaseTicket(int numRides, int startZone, int endZone, boolean discounted) {
        totalNumberOfTicketsSold++;
        totalSalesOfTickets += TicketUtil.calculateRideCost(numRides, startZone, endZone, discounted);

        return new Ticket(TicketUtil.calculateRideCost(numRides, startZone, endZone, discounted), discounted);
    }

    /**
     *
     * @param amount amount for the current ride
     * @param discounted is ticket discounted
     * @return a new ticket
     */
    public Ticket purchaseTicket(int amount, boolean discounted) {
        totalNumberOfTicketsSold++;
        totalSalesOfTickets += amount;

        return new Ticket(amount, discounted);
    }

    /**
     *
     * @return total number of tickets sold
     */
    public int totalTickets() {

        return totalNumberOfTicketsSold;
    }

    /**
     *
     * @return total cost of tickets sold
     */
    public int totalCost() {

        return totalSalesOfTickets;
    }
}
