package queue;

 import java.util.Scanner;

class CircularQueue {
    private int front, rear, size;
    private int queue[];

    // Constructor to initialize the queue
    public CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // Check if the queue is full
    boolean isFull() {
        return (rear + 1) % size == front;
    }

    // Check if the queue is empty
    boolean isEmpty() {
        return front == -1;
    }

    // Enqueue (Insert element)
    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            if (front == -1) front = 0; // Set front for the first element
            rear = (rear + 1) % size;  // Circular increment
            queue[rear] = data;
            System.out.println("Inserted: " + data);
        }
    }

    // Dequeue (Remove element)
    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Deleted: " + queue[front]);
            if (front == rear) {  // Last element removed
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;  // Circular increment
            }
        }
    }

    // Display queue elements
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.print("Queue: ");
            int i = front;
            while (true) {
                System.out.print(queue[i] + " ");
                if (i == rear) break;
                i = (i + 1) % size;  // Circular increment
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

public class CircularQueueDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularQueue q = new CircularQueue(5); // Queue of size 5

        int choice;
        do {
            // Display menu
            System.out.println("\n*---- Circular Queue Menu ----*");
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
 {
    
}
