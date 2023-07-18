import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== TO-DO LIST MENU =====");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. View list");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character after reading the integer

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to add: ");
                    String newItem = scanner.nextLine();
                    todoList.add(newItem);
                    System.out.println("Item added to the list.");
                    break;
                case 2:
                    if (todoList.isEmpty()) {
                        System.out.println("The to-do list is empty.");
                    } else {
                        System.out.print("Enter the index of the item to remove: ");
                        int indexToRemove = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character after reading the integer

                        if (indexToRemove >= 0 && indexToRemove < todoList.size()) {
                            String removedItem = todoList.remove(indexToRemove);
                            System.out.println("Item '" + removedItem + "' removed from the list.");
                        } else {
                            System.out.println("Invalid index. Please try again.");
                        }
                    }
                    break;
                case 3:
                    if (todoList.isEmpty()) {
                        System.out.println("The to-do list is empty.");
                    } else {
                        System.out.println("===== TO-DO LIST =====");
                        for (int i = 0; i < todoList.size(); i++) {
                            System.out.println(i + ". " + todoList.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the to-do list. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }

            System.out.println(); // Add a line break for better readability
        }
    }
}
