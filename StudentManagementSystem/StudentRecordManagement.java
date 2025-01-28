package StudentManagementSystem;
public class StudentRecordManagement {

    // Node class to represent each student's record
    static class Node {
        int rollNumber;
        String name;
        int age;
        String grade;
        Node next;

        // Constructor
        public Node(int rollNumber, String name, int age, String grade) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    // Add a new student record at the beginning
    public void addAtBeginning(int rollNumber, String name, int age, String grade) {
        Node newNode = new Node(rollNumber, name, age, grade);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Add a new student record at the end
    public void addAtEnd(int rollNumber, String name, int age, String grade) {
        Node newNode = new Node(rollNumber, name, age, grade);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    // Add a new student record at a specific position
    public void addAtPosition(int rollNumber, String name, int age, String grade, int position) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        if (position == 0) {
            addAtBeginning(rollNumber, name, age, grade);
            return;
        }
        Node newNode = new Node(rollNumber, name, age, grade);
        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    // Delete a student record by Roll Number
    public void deleteByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("The list is empty. No record to delete.");
            return;
        }
        if (head.rollNumber == rollNumber) {
            head = head.next;
            size--;
            System.out.println("Record deleted successfully.");
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Record with Roll Number " + rollNumber + " not found.");
        } else {
            temp.next = temp.next.next;
            size--;
            System.out.println("Record deleted successfully.");
        }
    }

    // Search for a student record by Roll Number
    public void searchByRollNumber(int rollNumber) {
        Node temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                System.out.println("Student Found: Roll Number = " + temp.rollNumber +
                        ", Name = " + temp.name + ", Age = " + temp.age +
                        ", Grade = " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }

    // Display all student records
    public void displayAllRecords() {
        if (head == null) {
            System.out.println("No records found.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println("Roll Number: " + temp.rollNumber +
                    ", Name: " + temp.name +
                    ", Age: " + temp.age +
                    ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    // Update a student's grade by Roll Number
    public void updateGradeByRollNumber(int rollNumber, String newGrade) {
        Node temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully for Roll Number " + rollNumber);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }

    // Get the size of the list
    public int getSize() {
        return size;
    }
}