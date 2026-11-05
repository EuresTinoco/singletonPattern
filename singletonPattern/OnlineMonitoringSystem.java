public class OnlineMonitoringSystem {
    public void displayCurrentQueue() {
        QueueManager qm = QueueManager.getInstance();
        System.out.println("==========================================");
        System.out.println("     ONLINE MONITORING SYSTEM DISPLAY     ");
        System.out.println("  Currently Serving: Ticket #" + qm.getServingQueueNumber());
        System.out.println("  Last Ticket Issued: Ticket #" + qm.getCurrentQueueNumber());
        System.out.println("==========================================");
    }
}