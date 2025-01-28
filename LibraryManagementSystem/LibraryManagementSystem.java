package LibraryManagementSystem;

public class LibraryManagementSystem {

    // Node class to represent each book in the library
    static class Node {
        String bookTitle;
        String author;
        String genre;
        int bookId;
        boolean isAvailable;
        Node next;
        Node prev;

        // Constructor
        public Node(String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
            this.bookTitle = bookTitle;
            this.author = author;
            this.genre = genre;
            this.bookId = bookId;
            this.isAvailable = isAvailable;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;

    // Add a book at the beginning
    public void addAtBeginning(String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
        Node newNode = new Node(bookTitle, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add a book at the end
    public void addAtEnd(String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
        Node newNode = new Node(bookTitle, author, genre, bookId, isAvailable);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Add a book at a specific position
    public void addAtPosition(String bookTitle, String author, String genre, int bookId, boolean isAvailable, int position) {
        if (position < 0) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        if (position == 0) {
            addAtBeginning(bookTitle, author, genre, bookId, isAvailable);
            return;
        }
        Node newNode = new Node(bookTitle, author, genre, bookId, isAvailable);
        Node temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newNode;
        } else {
            tail = newNode;
        }
        temp.next = newNode;
    }

    // Remove a book by Book ID
    public void removeByBookId(int bookId) {
        if (head == null) {
            System.out.println("The library is empty. No book to remove.");
            return;
        }
        if (head.bookId == bookId) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            System.out.println("Book with ID " + bookId + " removed successfully.");
            return;
        }
        Node temp = head;
        while (temp != null && temp.bookId != bookId) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Book with ID " + bookId + " not found.");
        } else {
            if (temp.next != null) {
                temp.next.prev = temp.prev;
            } else {
                tail = temp.prev;
            }
            if (temp.prev != null) {
                temp.prev.next = temp.next;
            }
            System.out.println("Book with ID " + bookId + " removed successfully.");
        }
    }

    // Search for a book by Book Title or Author
    public void searchBook(String query) {
        Node temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.bookTitle.equalsIgnoreCase(query) || temp.author.equalsIgnoreCase(query)) {
                System.out.println("Book Found: Title = " + temp.bookTitle + ", Author = " + temp.author + ", Genre = " + temp.genre + ", ID = " + temp.bookId + ", Available = " + temp.isAvailable);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("Book not found.");
        }
    }

    // Update a book's Availability Status
    public void updateAvailability(int bookId, boolean isAvailable) {
        Node temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = isAvailable;
                System.out.println("Availability status updated for Book ID " + bookId + ".");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    // Display all books in forward order
    public void displayForward() {
        if (head == null) {
            System.out.println("The library is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println("Book: Title = " + temp.bookTitle + ", Author = " + temp.author + ", Genre = " + temp.genre + ", ID = " + temp.bookId + ", Available = " + temp.isAvailable);
            temp = temp.next;
        }
    }

    // Display all books in reverse order
    public void displayReverse() {
        if (tail == null) {
            System.out.println("The library is empty.");
            return;
        }
        Node temp = tail;
        while (temp != null) {
            System.out.println("Book: Title = " + temp.bookTitle + ", Author = " + temp.author + ", Genre = " + temp.genre + ", ID = " + temp.bookId + ", Available = " + temp.isAvailable);
            temp = temp.prev;
        }
    }

    // Count the total number of books in the library
    public void countBooks() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total number of books in the library: " + count);
    }


}
