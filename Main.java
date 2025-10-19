//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // object
            ArraysWithStack<String> stack = new ArraysWithStack<>();

            // Push elements
            stack.push("Saturday");
            stack.push("Sunday");
            stack.push("Monday");

            // Display elements
            stack.display();

            // Peek top element
            System.out.println("Top element of stack now is " + stack.peek());

            // Pop one element
            System.out.println("Removed element " + stack.pop());

            // Display elements again
            stack.display();

            // Show current size
            System.out.println("Default size size: " + stack.size());
        }
    }
