package stack_1;

public class stack {
    private int top;
    private final int maxSize;
    private final int[] stackArray;

    // Constructor to initialize the stack
    
    public stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; // Stack is initially empty
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is Full");
        } else {
            stackArray[++top] = value; // Increment top and add value
            System.out.println("Pushed: " + value);
        }
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1; // Return a sentinel value or throw an exception
        } else {
            return stackArray[top--]; // Return the top value and decrement top
        }
    }

    // Peek at the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1; // Return a sentinel value or throw an exception
        } else {
            return stackArray[top]; // Return the top value without removing it
        }
    }
    
}
