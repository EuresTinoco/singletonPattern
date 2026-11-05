public class QueueManager {
    // Single instance of QueueManager
    private static QueueManager instance;

    private int currentQueueNumber; // Latest ticket issued
    private int servingQueueNumber; // Current ticket being served

    // Private constructor prevents instantiation from outside
    private QueueManager() {
        this.currentQueueNumber = 0;
        this.servingQueueNumber = 0;
    }

    // Thread-safe Singleton access point
    public static synchronized QueueManager getInstance() {
        if (instance == null) {
            instance = new QueueManager();
        }
        return instance;
    }

    // Issue a new queue number for a visitor
    public synchronized int issueQueueNumber() {
        currentQueueNumber++;
        return currentQueueNumber;
    }

    // Advance to the next ticket to serve
    public synchronized void nextQueueNumber() {
        if (servingQueueNumber < currentQueueNumber) {
            servingQueueNumber++;
            System.out.println("[QueueManager] Now serving Ticket #" + servingQueueNumber);
        } else {
            System.out.println("[QueueManager] No customers waiting in queue.");
        }
    }

    // Reset queue state to a specific input number
    public synchronized void resetQueueNumber(int newNumber) {
        this.currentQueueNumber = newNumber;
        this.servingQueueNumber = newNumber;
        System.out.println("[QueueManager] Queue system RESET to number: " + newNumber);
    }

    public int getCurrentQueueNumber() {
        return currentQueueNumber;
    }

    public int getServingQueueNumber() {
        return servingQueueNumber;
    }
}