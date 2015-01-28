package hw1;

/**
 * Created by nick on 1/26/15.
 */
public class Ticket {

    private int startZone;
    private boolean isInTransit;
    private boolean isFareDiscounted;
    private int ticketBalance;

    public Ticket(int value, boolean discounted) {
        ticketBalance = value;
        isFareDiscounted = discounted;
    }

    public void beginTrip(int zone) {
        startZone = zone;
        isInTransit = true;
    }

    public int getStartZone() {
        return isInTransit ? startZone : TicketUtil.INVALID_ZONE;
    }

    public boolean isDiscounted() {

        return isFareDiscounted;
    }

    public int getBalance() {

        return ticketBalance;
    }

    public boolean charge(int rideCost) {
        if (ticketBalance < rideCost) {
            return false;
        } else {
            ticketBalance -= rideCost;
            return true;
        }
    }

    public boolean isInTransit() {

        return isInTransit;
    }
}
