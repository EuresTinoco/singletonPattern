public class HelpDeskStation {
    private int stationId;

    public HelpDeskStation(int stationId) {
        this.stationId = stationId;
    }

    public void serveNextCustomer() {
        System.out.println("\nHelp Desk Station #" + stationId + " calling next customer...");
        QueueManager.getInstance().nextQueueNumber();
    }

    public void resetSystemQueue(int newNumber) {
        System.out.println("\n[Station #" + stationId + " Override] Resetting central queue to " + newNumber + "...");
        QueueManager.getInstance().resetQueueNumber(newNumber);
    }

    public int getStationId() {
        return stationId;
    }
}