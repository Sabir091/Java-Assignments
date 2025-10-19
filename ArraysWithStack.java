import java.util.Arrays;
import java.util.EmptyStackException;

public class ArraysWithStack<T> {
    private static final int ORIGINAL = 2;
    private int top;
    private T[] stack;

    // No Arg Constructor
    ArraysWithStack() {
        this(ORIGINAL);
    }

    ArraysWithStack(int Initial_Size) {
        top = 0;
        stack = (T[]) (new Object[Initial_Size]);
    }

    // size of the array
    public int size() {
        return top;
    }

    // push method
    public void push(T element) {
        if (size() == stack.length)
            Expand();
        stack[top] = element;
        top++;
    }

    // part of pop
    public T pop() {
        if (isEmpty())
            throw new EmptyStackException();
        else {
            T Value = stack[--top];
            stack[top] = null;
            return Value;
        }
    }

    // peek Method function
    public T peek() {
        if (isEmpty())
            throw new EmptyStackException();
        else
            return stack[top - 1];
    }

    // isEmpty method
    public boolean isEmpty() {
        return top == 0;
    }

    // expand method
    public void Expand() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

    // display
    public void display() {
        if (isEmpty())
            throw new EmptyStackException();
        else
            System.out.println("Elements of an array: ");
        for (int i = 0; i < top; i++)
            System.out.println(stack[i] + " ");
        System.out.println();
    }
}
