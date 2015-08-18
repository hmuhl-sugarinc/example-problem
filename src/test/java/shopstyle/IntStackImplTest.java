package shopstyle.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntStackImplTest {

    @Test
    public void testEmptyStack() {
        IntStack stack = new IntStackImpl();

        assertTrue(stack.isEmpty());
    }

    @Test
    public void testNonEmptyStack() {
        IntStack stack = new IntStackImpl();

        stack.push(10);

        assertFalse(stack.isEmpty());
    }

    @Test
    public void testPeek() {
        IntStack stack = new IntStackImpl();

        stack.push(10);
        assertEquals(10, stack.peek());

        stack.push(20);
        assertEquals(20, stack.peek());
    }

    @Test
    public void testPop() {
        IntStack stack = new IntStackImpl();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(30, stack.pop());
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
    }

    @Test
    public void testManyPushes() {
        IntStack stack = new IntStackImpl();

        for (int i = 0; i < 10000; i++) {
            stack.push(i);
        }
    }
}