package SocialMedia;

public class Main {
    public static void main(String[] args) {
        SocialMediaConn smConnections = new SocialMediaConn();

        // Add users to the system
        smConnections.addUser(1, "Alice", 25);
        smConnections.addUser(2, "Bob", 30);
        smConnections.addUser(3, "Charlie", 28);

        // Add some friend connections
        smConnections.addFriendConnection(1, 2);
        smConnections.addFriendConnection(1, 3);

        // Display all users
        System.out.println("All Users:");
        smConnections.displayAllUsers();

        // Display friends of a specific user
        smConnections.displayFriends(1);

        // Find mutual friends between two users
        smConnections.findMutualFriends(1, 2);

        // Remove a friend connection
        smConnections.removeFriendConnection(1, 2);
        smConnections.displayFriends(1);

        // Count the number of friends for each user
        smConnections.countFriends();
    }
}
