package shopstyle.example;

public interface IntStack {

    /**
     *  Returns true if the stack is empty, false otherwise.
     */
    public boolean isEmpty();

    /**
     *  Returns the value on the top of the stack, without modifying the stack
     */
    public int peek();

    /**
     *  Removes the top value from the stack and returns it.
     */
    public int pop();

    /**
     *  Adds a value to the top of the stack. This may require increasing the internal storage
     *  capacity of this object.
     */
    public void push(int val);

}