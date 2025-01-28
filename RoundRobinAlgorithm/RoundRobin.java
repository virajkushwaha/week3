package RoundRobinAlgorithm;

public class RoundRobin{
    public Node head;
    public Node tail;
    public int size;

    // Node class to represent each process
    static class Node {
        Node next;
        int processID;
        int burstTime;
        int priority;

        // Constructor
        public Node(Node next, int processID, int burstTime, int priority) {
            this.next = next;
            this.processID = processID;
            this.burstTime = burstTime;
            this.priority = priority;
        }

        // Constructor to initialize process without next
        public Node(int processID, int burstTime, int priority) {
            this.processID = processID;
            this.burstTime = burstTime;
            this.priority = priority;
        }
    }

    // Add a new process at the end of the circular linked list
    public void addProcess(int processID, int burstTime, int priority) {
        Node newNode = new Node(processID, burstTime, priority);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // Circular link
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Circular link
        }
        size++;
    }

    // Remove a process by its Process ID
    public void removeProcess(int processID) {
        if (head == null) {
            System.out.println("No processes in the queue!");
            return;
        }

        Node temp = head;
        Node prev = null;

        // Check if the node to be removed is the head node
        if (temp.processID == processID) {
            if (temp.next == head) { // Only one node in the list
                head = null;
                tail = null;
            } else {
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = head.next;
                head = head.next;
            }
            size--;
            return;
        }

        // Traverse the list and remove the process
        while (temp != null && temp.processID != processID) {
            prev = temp;
            temp = temp.next;
            if (temp == head) break;
        }

        if (temp == null || temp.processID != processID) {
            System.out.println("Process ID not found!");
            return;
        }

        prev.next = temp.next;
        if (temp == tail) {
            tail = prev;
        }
        size--;
    }

    // Simulate the Round Robin Scheduling
    public void roundRobinScheduling(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule!");
            return;
        }

        Node temp = head;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        int processCount = 0;

        // Start the round-robin scheduling
        while (size > 0) {
            processCount++;
            if (temp.burstTime > timeQuantum) {
                temp.burstTime -= timeQuantum;
                totalWaitingTime += timeQuantum;
            } else {
                totalWaitingTime += temp.burstTime;
                totalTurnaroundTime += (totalWaitingTime + temp.burstTime);
                System.out.println("Process " + temp.processID + " completed.");
                removeProcess(temp.processID); // Remove process when completed
            }
            temp = temp.next;
        }

        // Calculate average waiting time and turnaround time
        double avgWaitingTime = (double) totalWaitingTime / processCount;
        double avgTurnaroundTime = (double) totalTurnaroundTime / processCount;

        System.out.println("Average Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
    }

    // Display the current processes in the circular linked list
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue!");
            return;
        }

        Node temp = head;
        do {
            System.out.println("Process ID: " + temp.processID + ", Burst Time: " + temp.burstTime + ", Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        RoundRobin rrScheduler = new RoundRobin();

        // Add processes to the circular linked list
        rrScheduler.addProcess(1, 10, 2);
        rrScheduler.addProcess(2, 5, 1);
        rrScheduler.addProcess(3, 8, 3);

        // Display initial processes
        System.out.println("Initial Process List:");
        rrScheduler.displayProcesses();

        // Set time quantum for round-robin scheduling
        int timeQuantum = 3;

        // Simulate the Round Robin Scheduling
        System.out.println("\nSimulating Round Robin Scheduling:");
        rrScheduler.roundRobinScheduling(timeQuantum);
    }
}
