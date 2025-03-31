
import java.util.Scanner;

class MyQueue {
    private int rear, front, size;
    private int queue[];

    // Constructor to initialize queue
    public MyQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // Check if the queue is full
    boolean isFull() {
        return rear == size - 1;
    }

    // Check if the queue is empty
    boolean isEmpty() {
        return front == -1 || front > rear;
    }

    // Enqueue (Insert element)
    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            if (front == -1) front = 0; // Set front for first element
            queue[++rear] = data;// rear+1
            System.out.println("Inserted: " + data);
        }
    }

    // Dequeue (Remove element)
    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Deleted: " + queue[front]);
            front++;
        }
    }

    // Display queue elements
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    // Peek (View front element)
    void peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Front Element: " + queue[front]);
        }
    }
}

public class LinearQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyQueue q = new MyQueue(5); // Queue of size 5

        int choice;
        do {
            // Display menu
            System.out.println("\n*---- Queue Menu ----*");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Check if Full");
            System.out.println("5. Check if Empty");
            System.out.println("6. Peek");
            System.out.println("7. Exit");
            System.out.print("Enter Your Choice: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Data: ");
                    int data = sc.nextInt();
                    q.enqueue(data);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println(q.isFull() ? "Queue is Full" : "Queue is not Full");
                    break;
                case 5:
                    System.out.println(q.isEmpty() ? "Queue is Empty" : "Queue is not Empty");
                    break;
                case 6:
                    q.peek();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice! Try again.");
            }
        } while (choice != 7); // Loop until user chooses to exit

        sc.close(); // Close the scanner
    }
}
