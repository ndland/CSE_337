package hw1;

/**
 * Created by nick on 1/26/15.
 */
public class Turnstile {

    private int turnstileZone;
    private int entranceCount = 0;
    private int exitCount = 0;

    public Turnstile(int zone) {
        turnstileZone = zone;
    }

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

    public boolean swipeOut(Ticket ticket) {

        if (ticket.isInTransit()) {
            ticket.charge(TicketUtil.calculateRideCost(ticket.getStartZone(), turnstileZone, ticket.isDiscounted()));
            exitCount++;
        } else {
            return false;
        }

        return false;
    }

    public int getEntranceCount() {

        return entranceCount;
    }

    public int getExitCount() {

        return exitCount;
    }
}
