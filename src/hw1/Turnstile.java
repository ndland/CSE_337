package hw1;

/**
 * Created by Nicholas Land on 1/26/15.
 */
public class Turnstile {

    private int turnstileZone;
    private int entranceCount = 0;
    private int exitCount = 0;

    /**
     *
     * @param zone Zone that turnstile is located in.
     */
    public Turnstile(int zone) {
        turnstileZone = zone;
    }

    /**
     * This method will charge a ticket if it is currently in transit, then
     * try to charge for the new trip. Otherwise, it'll just begin the new
     * trip.
     * @param ticket Ticket to be swiped in
     * @return boolean
     */
    public boolean swipeIn(Ticket ticket) {

        if (ticket.isInTransit()) {
            ticket.charge(TicketUtil.calculateRideCost(ticket.getStartZone(), turnstileZone, ticket.isDiscounted()));
            return false;
        } else if (ticket.getBalance() < TicketUtil.getMinimumFare(ticket.isDiscounted())) {
            return false;
        } else {
            ticket.beginTrip(turnstileZone);
            entranceCount++;
            return true;
        }
    }

    /**
     * This method will charge for the current trip, and switch the transit status
     * to false.
     * @param ticket
     * @return
     */
    public boolean swipeOut(Ticket ticket) {

        if (ticket.isInTransit()) {
            ticket.charge(TicketUtil.calculateRideCost(ticket.getStartZone(), turnstileZone, ticket.isDiscounted()));
            exitCount++;
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @return the total number of swipe ins
     */
    public int getEntranceCount() {

        return entranceCount;
    }

    /**
     *
     * @return the total number of swipe outs
     */
    public int getExitCount() {

        return exitCount;
    }
}
