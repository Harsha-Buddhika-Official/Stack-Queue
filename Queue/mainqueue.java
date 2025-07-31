import java.util.Scanner;

class mainqueue {
	public static void main(String args[]) {
		queue op = new queue();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Choose operation: \n1-Enqueue \n2-Dequeue \n3-IsFull \n4-IsEmpty \n5-Exit");
			int choice = sc.nextInt();
			switch (choice) {
				case 1:
					System.out.println("Enter value to enqueue: ");
					int val = sc.nextInt();
					op.enqueue(val);
					break;
				case 2:
					op.dequeue();
					break;
				case 3:
					if (op.isFull()) {
						System.out.println("Queue is full.");
					} else {
						System.out.println("Queue is not full.");
					}
					break;
				case 4:
					if (op.isEmpty()) {
						System.out.println("Queue is empty.");
					} else {
						System.out.println("Queue is not empty.");
					}
					break;
				case 5:
					System.out.println("Exiting...");
					sc.close();
					return;
				default:
					System.out.println("Invalid choice. Try again.");
			}
		}
	}
}
