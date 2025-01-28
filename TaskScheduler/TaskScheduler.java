package TaskScheduler;

public class TaskScheduler {

    // Node class to represent each task
    static class Node {
        int taskId;
        String taskName;
        int priority;
        String dueDate;
        Node next;

        // Constructor
        public Node(int taskId, String taskName, int priority, String dueDate) {
            this.taskId = taskId;
            this.taskName = taskName;
            this.priority = priority;
            this.dueDate = dueDate;
            this.next = null;
        }
    }

    private Node head; // Head of the circular linked list
    private Node tail; // Tail of the circular linked list
    private Node current; // Pointer to the current task
    private int size;    // Size of the circular linked list

    // Add a task at the beginning
    public void addAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        Node newNode = new Node(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newNode;
            tail.next = head; // Circular link
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        size++;
    }

    // Add a task at the end
    public void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Node newNode = new Node(taskId, taskName, priority, dueDate);
        if (tail == null) {
            head = tail = newNode;
            tail.next = head; // Circular link
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        size++;
    }

    // Add a task at a specific position
    public void addAtPosition(int taskId, String taskName, int priority, String dueDate, int position) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        if (position == 0) {
            addAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        if (position == size) {
            addAtEnd(taskId, taskName, priority, dueDate);
            return;
        }
        Node newNode = new Node(taskId, taskName, priority, dueDate);
        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    // Remove a task by Task ID
    public void removeByTaskId(int taskId) {
        if (head == null) {
            System.out.println("The list is empty. No task to delete.");
            return;
        }
        Node temp = head;
        Node prev = null;
        do {
            if (temp.taskId == taskId) {
                if (temp == head) {
                    head = head.next;
                    tail.next = head;
                } else if (temp == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                }
                size--;
                System.out.println("Task with ID " + taskId + " removed successfully.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Task with ID " + taskId + " not found.");
    }

    // View the current task and move to the next task
    public void viewCurrentTask() {
        if (current == null) {
            current = head;
        }
        if (current != null) {
            System.out.println("Current Task: ID = " + current.taskId + ", Name = " + current.taskName + ", Priority = " + current.priority + ", Due Date = " + current.dueDate);
            current = current.next;
        } else {
            System.out.println("No tasks available.");
        }
    }

    // Display all tasks starting from the head node
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks in the list.");
            return;
        }
        Node temp = head;
        do {
            System.out.println("Task: ID = " + temp.taskId + ", Name = " + temp.taskName + ", Priority = " + temp.priority + ", Due Date = " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search for a task by Priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks in the list.");
            return;
        }
        Node temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                System.out.println("Task Found: ID = " + temp.taskId + ", Name = " + temp.taskName + ", Priority = " + temp.priority + ", Due Date = " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) {
            System.out.println("No tasks found with priority " + priority + ".");
        }
    }

    // Get the size of the list
    public int getSize() {
        return size;
    }


}
