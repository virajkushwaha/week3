package TextEditor;

public class Main {
    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        TextEditorUndoRedo editor = new TextEditorUndoRedo(5); // Max 5 history states

        // Simulate typing and adding states
        editor.addTextState("Hello");
        editor.addTextState("Hello, World");
        editor.addTextState("Hello, World!");
        editor.addTextState("Hello, World!!");
        editor.addTextState("Hello, World!!!");

        // Display current state
        editor.displayCurrentState();

        // Undo and Redo actions
        editor.undo();
        editor.undo();
        editor.redo();
        editor.undo();
        editor.redo();

        // Adding a new state should remove the oldest one if history exceeds the limit
        editor.addTextState("New state added after undo/redo");
        editor.displayCurrentState();
    }
}
