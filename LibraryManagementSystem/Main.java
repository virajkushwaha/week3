package LibraryManagementSystem;

public class Main {
    // Main method for testing
    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();

        // Adding books
        library.addAtEnd("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 101, true);
        library.addAtBeginning("1984", "George Orwell", "Dystopian", 102, true);
        library.addAtPosition("To Kill a Mockingbird", "Harper Lee", "Classic", 103, true, 1);

        // Displaying books
        System.out.println("Library (Forward):");
        library.displayForward();

        System.out.println("\nLibrary (Reverse):");
        library.displayReverse();

        // Searching for a book
        System.out.println("\nSearching for '1984':");
        library.searchBook("1984");

        // Updating availability
        System.out.println("\nUpdating availability for Book ID 102:");
        library.updateAvailability(102, false);
        library.displayForward();

        // Counting books
        System.out.println("\nCounting books:");
        library.countBooks();

        // Removing a book
        System.out.println("\nRemoving Book with ID 101:");
        library.removeByBookId(101);
        library.displayForward();
    }
}
