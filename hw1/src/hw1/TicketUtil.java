package hw1;

/**
 * Created by nick on 1/26/15.
 */
public class TicketUtil {

    private TicketUtil() {

    }

    public static final int RIDE_COST = 200;
    public static final int RIDE_COST_DISCOUNTED = 150;
    public static final int ZONE_COST = 175;
    public static final int ZONE_COST_DISCOUNTED = 120;
    public static final int INVALID_ZONE = 0;

    /**
     *
     * @param startZone Start zone for the ride
     * @param endZone end zone for the ride
     * @param discounted is the ticket discounted
     * @return the total price of the ride
     */
    public static int calculateRideCost(int startZone, int endZone, boolean discounted) {
        return discounted ? (Math.abs(startZone - endZone) * ZONE_COST_DISCOUNTED) + RIDE_COST_DISCOUNTED : (Math.abs(startZone - endZone) * ZONE_COST) + RIDE_COST;
    }

    /**
     *
     * @param numRides number of rides to charge for the ride
     * @param startZone Start zone for the ride
     * @param endZone end zone for the ride
     * @param discounted is the ticket discounted
     * @return the total price of the ride
     */
    public static int calculateRideCost(int numRides, int startZone, int endZone, boolean discounted) {
        return discounted ? ((Math.abs(startZone - endZone) * ZONE_COST_DISCOUNTED) + RIDE_COST_DISCOUNTED) * numRides : ((Math.abs(startZone - endZone) * ZONE_COST) + RIDE_COST) * numRides;
    }

    /**
     *
     * @param discounted is the ticket discounted
     * @return base ride cost
     */
    public static int getMinimumFare(boolean discounted) {
        return discounted ? RIDE_COST_DISCOUNTED : RIDE_COST;
    }
}
