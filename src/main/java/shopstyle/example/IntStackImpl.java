package shopstyle.example;

public class IntStackImpl implements IntStack {

    public boolean isEmpty() {
        // TODO: Implement this.
        return true;
    }

    public int peek() {
        // TODO: Implement this.
        return 0;
    }

    public int pop() {
        // TODO: Implement this.
        return 0;
    }

    public void push(int val) {
        // TODO: Implement this.
    }

    // Do not change any code below this line
    private int[] data;

    public IntStackImpl() {
        this(16);
    }

    public IntStackImpl(int initialCapacity) {
        data = new int[initialCapacity];
    }

}
