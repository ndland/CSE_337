package hw1;

/**
 * Created by nick on 1/26/15.
 */
public class Ticket {

    private int startZone;
    private boolean isInTransit;
    private boolean isFareDiscounted;
    private int ticketBalance;

    /**
     * Constructor for the new ticket
     * @param value ticket balance
     * @param discounted is the ticket discounted
     */
    public Ticket(int value, boolean discounted) {
        ticketBalance = value;
        isFareDiscounted = discounted;
    }

    /**
     * Start the trip
     * @param zone start zone
     */
    public void beginTrip(int zone) {
        startZone = zone;
        isInTransit = true;
    }

    /**
     *
     * @return the start zone for the trip
     */
    public int getStartZone() {
        return isInTransit ? startZone : TicketUtil.INVALID_ZONE;
    }

    /**
     *
     * @return is the ticket discounted
     */
    public boolean isDiscounted() {

        return isFareDiscounted;
    }

    /**
     *
     * @return get the ticket balance
     */
    public int getBalance() {

        return ticketBalance;
    }

    /**
     *
     * @param rideCost the ride cost
     * @return boolean
     */
    public boolean charge(int rideCost) {
        if (ticketBalance < rideCost) {
            isInTransit = false;
            return false;
        } else {
            isInTransit = false;
            ticketBalance -= rideCost;
            return true;
        }
    }

    /**
     *
     * @return is the ticket currently in transit?
     */
    public boolean isInTransit() {

        return isInTransit;
    }
}
