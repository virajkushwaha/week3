package RoundRobinAlgorithm;

public class Main {
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
