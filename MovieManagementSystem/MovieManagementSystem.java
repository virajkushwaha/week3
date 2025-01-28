package MovieManagementSystem;

public class MovieManagementSystem {

    // Node class to represent each movie
    static class Node {
        String title;
        String director;
        int year;
        double rating;
        Node next;
        Node prev;

        // Constructor
        public Node(String title, String director, int year, double rating) {
            this.title = title;
            this.director = director;
            this.year = year;
            this.rating = rating;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head; // Head of the doubly linked list
    private Node tail; // Tail of the doubly linked list
    private int size;  // Size of the doubly linked list

    // Add a movie record at the beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        Node newNode = new Node(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // Add a movie record at the end
    public void addAtEnd(String title, String director, int year, double rating) {
        Node newNode = new Node(title, director, year, rating);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Add a movie record at a specific position
    public void addAtPosition(String title, String director, int year, double rating, int position) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        if (position == 0) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        if (position == size) {
            addAtEnd(title, director, year, rating);
            return;
        }
        Node newNode = new Node(title, director, year, rating);
        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
        size++;
    }

    // Remove a movie record by Movie Title
    public void removeByTitle(String title) {
        if (head == null) {
            System.out.println("The list is empty. No record to delete.");
            return;
        }
        Node temp = head;
        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Movie with title \"" + title + "\" not found.");
            return;
        }
        if (temp == head) {
            head = head.next;
            if (head != null) head.prev = null;
        } else if (temp == tail) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        size--;
        System.out.println("Movie \"" + title + "\" removed successfully.");
    }

    // Search for a movie record by Director or Rating
    public void searchByDirectorOrRating(String director, Double rating) {
        Node temp = head;
        boolean found = false;
        while (temp != null) {
            if ((director != null && temp.director.equals(director)) ||
                    (rating != null && temp.rating == rating)) {
                System.out.println("Movie Found: Title = " + temp.title +
                        ", Director = " + temp.director +
                        ", Year = " + temp.year +
                        ", Rating = " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No movie found matching the criteria.");
        }
    }

    // Display all movie records in forward order
    public void displayForward() {
        if (head == null) {
            System.out.println("No records found.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println("Title: " + temp.title +
                    ", Director: " + temp.director +
                    ", Year: " + temp.year +
                    ", Rating: " + temp.rating);
            temp = temp.next;
        }
    }

    // Display all movie records in reverse order
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No records found.");
            return;
        }
        Node temp = tail;
        while (temp != null) {
            System.out.println("Title: " + temp.title +
                    ", Director: " + temp.director +
                    ", Year: " + temp.year +
                    ", Rating: " + temp.rating);
            temp = temp.prev;
        }
    }

    // Update a movie's Rating by Movie Title
    public void updateRatingByTitle(String title, double newRating) {
        Node temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated successfully for movie \"" + title + "\".");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie with title \"" + title + "\" not found.");
    }

    // Get the size of the list
    public int getSize() {
        return size;
    }


}
