package hw1;

/**
 * Created by nick on 1/26/15.
 */
public class Main {

    static Turnstile t1 = new Turnstile(1);
    static Turnstile t2 = new Turnstile(2);
    static Turnstile t3 = new Turnstile(3);
    static Turnstile t4 = new Turnstile(4);
    static Turnstile t5 = new Turnstile(5);
    static TicketMachine tickMac = new TicketMachine();

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        String msg = "Non-discounted fare from zone 5 to zone 2 should be 725: ";
        System.out.println(msg + TicketUtil.calculateRideCost(5, 2, false));

        Ticket ticket1 = tickMac.purchaseTicket(5, 2, false);


        test(ticket1);

        Ticket ticket2 = tickMac.purchaseTicket(4, 0, true);
        test(ticket2);

        Ticket ticket3 = tickMac.purchaseTicket(510, false);
        test(ticket3);


    }

    public static void test(Ticket tester) {
        System.out.println();
        System.out.println("----------------------------------------------------");

        System.out.println("Tickets Sold: " + tickMac.totalTickets());
        System.out.println("Total Value of tickets Sold: " + tickMac.totalCost());
        System.out.println("Initial Balance: " + tester.getBalance());
        System.out.println("Is the ticket in transit? " + tester.isInTransit());

        t5.swipeIn(tester);
        System.out.println("TICKET SWIPED IN");

        System.out.println();

        System.out.println("Is the ticket in transit? " + tester.isInTransit());
        System.out.println("Balance: " + tester.getBalance());

        System.out.println("TICKET SWIPED OUT");
        t2.swipeOut(tester);

        System.out.println("Is the ticket in transit? " + tester.isInTransit());
        System.out.println("Balance: " + tester.getBalance());

        System.out.println("Turnstiles Entrances and Exits");
        System.out.println("------------------------------");
        System.out.println("    t1        " + t1.getEntranceCount() + "           " + t1.getExitCount());
        System.out.println("    t2        " + t2.getEntranceCount() + "           " + t2.getExitCount());
        System.out.println("    t3        " + t3.getEntranceCount() + "           " + t3.getExitCount());
        System.out.println("    t4        " + t4.getEntranceCount() + "           " + t4.getExitCount());
        System.out.println("    t5        " + t5.getEntranceCount() + "           " + t5.getExitCount());
    }
}
