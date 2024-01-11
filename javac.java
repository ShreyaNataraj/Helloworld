public class javac{
  public class StackExample {
    public static void main(String[] args) {
        // Create an instance of the Stack class
        Stack stack = new Stack();

        // Push some elements onto the stack
        stack.push(5);
        stack.push(10);
        stack.push(15);

        // Display the elements in the stack
        System.out.println("Stack elements: " + stack);

        // Pop an element from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Display the elements in the stack after popping
        System.out.println("Stack elements after popping: " + stack);
    }
}

class Stack {
    private static final int MAX_SIZE = 10;
    private int[] elements;
    private int top;

    // Constructor to initialize the stack
    public Stack() {
        elements = new int[MAX_SIZE];
        top = -1;
    }

    // Method to push an element onto the stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element.");
        } else {
            elements[++top] = element;
        }
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1; // Assuming -1 represents an invalid value for the stack
        } else {
            return elements[top--];
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    // Method to display the elements in the stack
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i <= top; i++) {
            result.append(elements[i]);
            if (i < top) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}

}