public class Main {
    public static void main(String[] args) {
        // Initialize Components
        QueueKiosk kiosk = new QueueKiosk();
        OnlineMonitoringSystem monitor = new OnlineMonitoringSystem();

        HelpDeskStation desk1 = new HelpDeskStation(1);
        HelpDeskStation desk2 = new HelpDeskStation(2);
        HelpDeskStation desk3 = new HelpDeskStation(3);

        System.out.println("--- 1. VISITORS GET TICKETS FROM KIOSK ---");
        kiosk.generateTicket(); // Ticket #1
        kiosk.generateTicket(); // Ticket #2
        kiosk.generateTicket(); // Ticket #3
        kiosk.generateTicket(); // Ticket #4

        monitor.displayCurrentQueue();

        System.out.println("\n--- 2. HELP DESK STATIONS SERVE CUSTOMERS ---");
        desk1.serveNextCustomer(); // Serves #1
        desk2.serveNextCustomer(); // Serves #2

        monitor.displayCurrentQueue();

        System.out.println("\n--- 3. STATION 3 RESETS QUEUE SYSTEM (REORGANIZATION/TECHNICAL ISSUE) ---");
        desk3.resetSystemQueue(100);

        monitor.displayCurrentQueue();

        System.out.println("\n--- 4. RESUMING NORMAL OPERATION AFTER RESET ---");
        kiosk.generateTicket(); // Ticket #101
        desk1.serveNextCustomer(); // Serves #101

        monitor.displayCurrentQueue();
    }
}