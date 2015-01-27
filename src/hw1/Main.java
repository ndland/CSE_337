package hw1;

/**
 * Created by nick on 1/26/15.
 */
public class Main {

    public static void main(String args[]) {
        TicketUtil.calulateRideCost(1,3,false);
        System.out.println("Sample run " + TicketUtil.calulateRideCost(1,3,false));
        System.out.println("Sample run discounted " + TicketUtil.calulateRideCost(1,3,true));
        System.out.println("Sample run with numRides " + TicketUtil.calulateRideCost(1,1,3,false));
        System.out.println("Sample run discounted with numRides " + TicketUtil.calulateRideCost(2,1,3,true));
        System.out.println("getMinimalFare " + TicketUtil.getMinimumFare(false));
        System.out.println("getMinimalFare discounted " + TicketUtil.getMinimumFare(true));
    }
}
