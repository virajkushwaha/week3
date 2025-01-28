package TicketReservationSystem;

public class Main {
    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        // Add some ticket reservations
        system.addTicket(1, "John Doe", "Avengers: Endgame", 12, "2025-01-28 10:00");
        system.addTicket(2, "Alice Smith", "Inception", 8, "2025-01-28 12:00");
        system.addTicket(3, "Bob Johnson", "Spider-Man: No Way Home", 15, "2025-01-28 14:00");

        // Display all tickets
        system.displayTickets();

        // Search for a ticket by Customer Name
        system.searchTicket("Alice Smith");

        // Remove a ticket by Ticket ID
        system.removeTicketByID(2);

        // Display all tickets after removal
        system.displayTickets();

        // Get total number of tickets
        System.out.println("Total Booked Tickets: " + system.getTotalTickets());
    }

}
