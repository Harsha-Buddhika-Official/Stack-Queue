import java.util.Scanner;

public class mainstack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        stack OP = new stack();

        while (true) {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. isFull");
            System.out.println("4. isEmpty");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    OP.push(value);
                    break;
                case 2:
                    OP.pop();
                    break;
                case 3:
                    OP.isFull();
                    break;
                case 4:
                    OP.isEmpty();
                    break;
                case 5:
                    OP.display();
                    break;
                case 6:
                    System.out.println("Program exited.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}
