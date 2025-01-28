package TextEditor;

public class TextEditorUndoRedo {
    private Node currentState;
    private int size;
    private final int MAX_HISTORY_SIZE;

    // Node class representing a state of the text
    static class Node {
        String text;   // Text state
        Node prev;     // Previous state (for undo)
        Node next;     // Next state (for redo)

        // Constructor to initialize text state
        public Node(String text) {
            this.text = text;
            this.prev = null;
            this.next = null;
        }
    }

    // Constructor for TextEditorUndoRedo with a max history size
    public TextEditorUndoRedo(int maxHistorySize) {
        this.MAX_HISTORY_SIZE = maxHistorySize;
        this.size = 0;
        this.currentState = null;
    }

    // Add a new text state to the history
    public void addTextState(String text) {
        Node newNode = new Node(text);
        if (currentState == null) {
            currentState = newNode; // First state
        } else {
            currentState.next = newNode;
            newNode.prev = currentState;
            currentState = newNode; // Set current state to the new one
        }

        // Limit the size of history to MAX_HISTORY_SIZE
        if (size == MAX_HISTORY_SIZE) {
            removeOldestState(); // Remove the oldest state to maintain history size
        } else {
            size++;
        }
    }

    // Undo functionality (move to the previous state)
    public void undo() {
        if (currentState != null && currentState.prev != null) {
            currentState = currentState.prev; // Move to the previous state
            System.out.println("Undo: Current State - " + currentState.text);
        } else {
            System.out.println("No previous state to undo.");
        }
    }

    // Redo functionality (move to the next state)
    public void redo() {
        if (currentState != null && currentState.next != null) {
            currentState = currentState.next; // Move to the next state
            System.out.println("Redo: Current State - " + currentState.text);
        } else {
            System.out.println("No next state to redo.");
        }
    }

    // Display the current text state
    public void displayCurrentState() {
        if (currentState != null) {
            System.out.println("Current State: " + currentState.text);
        } else {
            System.out.println("No text state available.");
        }
    }

    // Remove the oldest state when the history size exceeds the limit
    private void removeOldestState() {
        if (currentState != null && currentState.prev != null) {
            currentState.prev.next = null; // Remove the link to the oldest state
            currentState = currentState.prev; // Move currentState to the previous state
            size--; // Decrease the size
        }
    }


}
