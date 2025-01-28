package StudentManagementSystem;

public class Main {
    // Main method for testing
    public static void main(String[] args) {
        StudentRecordManagement srm = new StudentRecordManagement();

        // Adding records
        srm.addAtEnd(101, "Alice", 20, "A");
        srm.addAtEnd(102, "Bob", 21, "B");
        srm.addAtBeginning(100, "John", 22, "C");
        srm.addAtPosition(103, "Eve", 19, "B+", 2);

        // Displaying all records
        System.out.println("All Student Records:");
        srm.displayAllRecords();

        // Searching for a record
        System.out.println("\nSearching for Roll Number 102:");
        srm.searchByRollNumber(102);

        // Updating a grade
        System.out.println("\nUpdating Grade for Roll Number 103:");
        srm.updateGradeByRollNumber(103, "A+");
        srm.displayAllRecords();

        // Deleting a record
        System.out.println("\nDeleting Record with Roll Number 100:");
        srm.deleteByRollNumber(100);
        srm.displayAllRecords();

        // Checking the size of the list
        System.out.println("\nTotal Records: " + srm.getSize());
    }
}
