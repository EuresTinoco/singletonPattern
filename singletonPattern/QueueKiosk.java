public class QueueKiosk {
    public int generateTicket() {
        int ticketNumber = QueueManager.getInstance().issueQueueNumber();
        System.out.println("[Kiosk] Visitor obtained Ticket #" + ticketNumber);
        return ticketNumber;
    }
}