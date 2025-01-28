package MovieManagementSystem;

public class Main {
    // Main method for testing
    public static void main(String[] args) {
        MovieManagementSystem mms = new MovieManagementSystem();

        // Adding movies
        mms.addAtEnd("Inception", "Christopher Nolan", 2010, 9.0);
        mms.addAtBeginning("The Godfather", "Francis Ford Coppola", 1972, 9.2);
        mms.addAtPosition("Interstellar", "Christopher Nolan", 2014, 8.6, 1);

        // Displaying all movies
        System.out.println("Movies in Forward Order:");
        mms.displayForward();

        // Displaying movies in reverse order
        System.out.println("\nMovies in Reverse Order:");
        mms.displayReverse();

        // Searching for a movie
        System.out.println("\nSearching for movies by Christopher Nolan:");
        mms.searchByDirectorOrRating("Christopher Nolan", null);

        // Updating a movie's rating
        System.out.println("\nUpdating Rating for Inception:");
        mms.updateRatingByTitle("Inception", 9.5);
        mms.displayForward();

        // Deleting a movie
        System.out.println("\nDeleting Movie: The Godfather");
        mms.removeByTitle("The Godfather");
        mms.displayForward();

        // Checking the size of the list
        System.out.println("\nTotal Movies: " + mms.getSize());
    }
}
