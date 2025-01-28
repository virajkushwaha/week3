package InventoryManagement;

public class Main {

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement();

        // Adding items to inventory
        inventory.addItemAtBeginning("Apple", 101, 50, 1.5);
        inventory.addItemAtEnd("Banana", 102, 30, 0.8);
        inventory.addItemAtEnd("Orange", 103, 60, 1.2);
        inventory.addItemAtPosition("Mango", 104, 40, 1.8, 2);

        // Display inventory
        inventory.displayInventory();

        // Update quantity
        inventory.updateItemQuantity(103, 70);

        // Remove item by ID
        inventory.removeItemByID(102);

        // Display inventory after updates
        inventory.displayInventory();

        // Search for item by ID or name
        inventory.searchItem("Orange");

        // Calculate total value of inventory
        System.out.println("Total Inventory Value: " + inventory.getTotalInventoryValue());

        // Sort inventory by Price in descending order
        inventory.sortInventory("price", false);
        inventory.displayInventory();
    }
}
