package TicketReservationSystem;

public class TicketReservationSystem {

    private Node head;
    private Node tail;
    private int size;

    // Node class representing a ticket
    static class Node {
        int ticketID;
        String customerName;
        String movieName;
        int seatNumber;
        String bookingTime;
        Node next;

        // Constructor to initialize a ticket
        public Node(int ticketID, String customerName, String movieName, int seatNumber, String bookingTime) {
            this.ticketID = ticketID;
            this.customerName = customerName;
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.bookingTime = bookingTime;
            this.next = null;
        }
    }

    // Constructor for TicketReservationSystem
    public TicketReservationSystem() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Add a new ticket reservation at the end of the circular list
    public void addTicket(int ticketID, String customerName, String movieName, int seatNumber, String bookingTime) {
        Node newNode = new Node(ticketID, customerName, movieName, seatNumber, bookingTime);
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

    // Remove a ticket by Ticket ID
    public void removeTicketByID(int ticketID) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }
        Node current = head;
        Node prev = null;

        do {
            if (current.ticketID == ticketID) {
                if (prev == null) {
                    // Removing the head node
                    head = current.next;
                    tail.next = head; // Update the circular link
                } else {
                    prev.next = current.next;
                    if (current == tail) {
                        tail = prev; // Update tail if needed
                    }
                }
                size--;
                System.out.println("Ticket with ID " + ticketID + " removed.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head); // Loop back to the first node

        System.out.println("Ticket with ID " + ticketID + " not found.");
    }

    // Display all tickets in the list
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets to display.");
            return;
        }
        Node current = head;
        do {
            System.out.println("Ticket ID: " + current.ticketID + ", Customer: " + current.customerName +
                    ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Booking Time: " + current.bookingTime);
            current = current.next;
        } while (current != head); // Loop back to the first node
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String searchTerm) {
        if (head == null) {
            System.out.println("No tickets to search.");
            return;
        }
        Node current = head;
        boolean found = false;
        do {
            if (current.customerName.equalsIgnoreCase(searchTerm) || current.movieName.equalsIgnoreCase(searchTerm)) {
                System.out.println("Found Ticket: ID: " + current.ticketID + ", Customer: " + current.customerName +
                        ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Booking Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != head); // Loop back to the first node

        if (!found) {
            System.out.println("No ticket found for search term: " + searchTerm);
        }
    }

    // Calculate the total number of booked tickets
    public int getTotalTickets() {
        return size;
    }


}

