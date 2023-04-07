/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package teamarson.week6queuesandsets;

import java.time.LocalDate;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author leoze
 */
public class BoundedPriorityQueueSetTest {

    public BoundedPriorityQueueSetTest() {
    }

    /**
     * Test of size method, of class BoundedPriorityQueueSet. Empty queue
     */
    @Test
    public void testSizeEmpty() {
        System.out.println("empty queue");
        BoundedPriorityQueueSet queue = new BoundedPriorityQueueSet();
        assertEquals(0, queue.size());
    }

    /**
     * Test of size method, of class BoundedPriorityQueueSet. Queue with values
     */
    @Test
    public void testSizeWithValues() {

        Task a = new Task("Alice", "headache", LocalDate.of(2023, 4, 15));
        Task b = new Task("Bob", "Broken leg", LocalDate.of(2023, 4, 14));
        Task c = new Task("Charlie", "Broken thumb", LocalDate.of(2023, 4, 13));

        BoundedPriorityQueueSet queue = new BoundedPriorityQueueSet();
        queue.add(a);
        queue.add(b);
        queue.add(c);

        int expectedSize = 3;
        int actualSize = queue.size();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of isEmpty method, of class BoundedPriorityQueueSet. Test the queue
     * is empty
     */
    @Test
    public void testIsEmpty() {
        BoundedPriorityQueueSet queue = new BoundedPriorityQueueSet();
        boolean expResult = true;
        boolean result = queue.isEmpty();
        assertEquals(expResult, result);

        int expectedSize = 0;
        int resultsize = queue.size();
        assertEquals(expectedSize, resultsize);

    }

    /**
     * Test of isEmpty method, of class BoundedPriorityQueueSet. Test the queue
     * is empty
     */
    @Test
    public void testIsEmptyWithValue() {
        BoundedPriorityQueueSet queue = new BoundedPriorityQueueSet();
        Task a = new Task("Alice", "headache", LocalDate.of(2023, 4, 15));
        queue.add(a);
        boolean expResult = false;
        boolean result = queue.isEmpty();
        assertEquals(expResult, result);

        int expectedSize = 1;
        int resultsize = queue.size();
        System.out.println("Size of queue " + queue.size());
        assertEquals(expectedSize, resultsize);

    }

    /**
     * Test of isFull method, of class BoundedPriorityQueueSet. Empty queue
     */
    @Test
    public void testIsFullEmpty() {
        BoundedPriorityQueueSet queue = new BoundedPriorityQueueSet();
        boolean expResult = false;
        boolean result = queue.isFull();
        assertEquals(expResult, result);

        int expectedSize = 0;
        int resultsize = queue.size();
        assertEquals(expectedSize, resultsize);
    }

    /**
     * Test of isFull method, of class BoundedPriorityQueueSet. Queue with some
     * values but space still available
     */
    @Test
    public void testIsFullSomeValues() {
        BoundedPriorityQueueSet queue = new BoundedPriorityQueueSet();
        Task a = new Task("Alice", "headache", LocalDate.of(2023, 4, 15));
        queue.add(a);
        boolean expResult = false;
        boolean result = queue.isFull();
        assertEquals(expResult, result);

        int expectedSize = 1;
        int resultsize = queue.size();
        assertEquals(expectedSize, resultsize);

    }

    /**
     * Test of isFull method, of class BoundedPriorityQueueSet. Queue with full
     * size
     */
    @Test
    public void testIsFullFulQueue() {
        BoundedPriorityQueueSet queue = new BoundedPriorityQueueSet();
        Task a = new Task("Alice", "headache", LocalDate.of(2023, 5, 1));
        Task b = new Task("John", "Cancer", LocalDate.of(2023, 5, 2));
        Task c = new Task("Pierce", "lost pinky", LocalDate.of(2023, 5, 3));
        Task d = new Task("Harry", "Dialisis", LocalDate.of(2023, 5, 4));
        Task e = new Task("Jonathen", "Stab Wound", LocalDate.of(2023, 5, 5));
        Task f = new Task("Homer", "Stubbed toe", LocalDate.of(2023, 5, 6));
        Task g = new Task("Peter", "Broken toe", LocalDate.of(2023, 5, 7));
        Task h = new Task("Bart", "Lost ear", LocalDate.of(2023, 5, 8));
        Task i = new Task("Stewie", "!st degree burn", LocalDate.of(2023, 5, 9));
        Task j = new Task("Lisa", "Stomach bug", LocalDate.of(2023, 5, 10));
        queue.add(a);
        queue.add(b);
        queue.add(c);
        queue.add(d);
        queue.add(e);
        queue.add(f);
        queue.add(g);
        queue.add(h);
        queue.add(i);
        queue.add(j);
        boolean expResult = true;
        boolean result = queue.isFull();
        assertEquals(expResult, result);
        System.out.println("Size of the queue " + queue.size());
        int expectedSize = 10;
        int resultsize = queue.size();
        assertEquals(expectedSize, resultsize);

    }

    /**
     * Test of peek method, of class BoundedPriorityQueueSet. Empty queue-so
     * throws the exception
     */
    @Test
    public void testPeekEmptyException() {
        BoundedPriorityQueueSet queue = new BoundedPriorityQueueSet();
        assertThrows(NoSuchElementException.class, () -> {
            queue.peek();
            System.out.println("Queue is empty");
        });
    }

    /**
     * Test of peek method, of class BoundedPriorityQueueSet. Empty queue-so has
     * values in the queue with different order of priority
     */
    @Test
    public void testPeekWithValues() {
        BoundedPriorityQueueSet queue = new BoundedPriorityQueueSet();
        Task a = new Task("Alice", "Burned", LocalDate.of(2023, 5, 2));
        Task b = new Task("John", "Lost leg", LocalDate.of(2023, 5, 3));
        Task c = new Task("Adam", "headache", LocalDate.of(2023, 5, 1));
        queue.add(a);
        queue.add(b);
        queue.add(c);
        System.out.println(queue.peek());
        Task expected = c;
        Task actual = queue.peek();
        assertEquals(expected, actual);
    }

    /**
     * Test of remove method, of class BoundedPriorityQueueSet. trying to remove
     * from a empty queue
     */
    @Test
    public void testRemoveFromEmpty() {
        BoundedPriorityQueueSet queue = new BoundedPriorityQueueSet();
        assertThrows(NoSuchElementException.class, () -> {
            queue.remove();
        });
    }

    /**
     * Test of remove method, of class BoundedPriorityQueueSet. trying to remove
     * Remove from queue with few values in it
     */
    @Test
    public void testRemoveSomeValues() {
        BoundedPriorityQueueSet queue = new BoundedPriorityQueueSet();
        Task a = new Task("Alice", "Burned", LocalDate.of(2023, 5, 2));
        Task b = new Task("Adam", "Lost leg", LocalDate.of(2023, 5, 3));
        Task c = new Task("Leon", "headache", LocalDate.of(2023, 5, 1));
        queue.add(a);
        queue.add(b);
        queue.add(c);

        Task excpected = c;
        Task actual = queue.remove();
        assertEquals(excpected, actual);

        int expectedSize = 2;
        int actualSize = queue.size();
        assertEquals(expectedSize, actualSize);

        Task expectedNew = a;
        Task actualNew = queue.peek();
        assertEquals(expectedNew, actualNew);

        assertFalse(queue.isEmpty());

    }

    /**
     * Test of add method, of class BoundedPriorityQueueSet. Adding to an empty
     * queue
     */
    @Test
    public void testAddEmpty() {
        BoundedPriorityQueueSet queue = new BoundedPriorityQueueSet();
        Task a = new Task("Alice", "Burned", LocalDate.of(2023, 5, 2));
        queue.add(a);

        Task excpected = a;
        Task actual = queue.peek();
        assertEquals(excpected, actual);

        int expectedSize = 1;
        int actualSize = queue.size();
        assertEquals(expectedSize, actualSize);

        assertFalse(queue.isEmpty());

    }

    /**
     * Test of add method, of class BoundedPriorityQueueSet.
     * Adding to a queue but with higher priority
     */
    @Test
    public void testAddPriorityTop() {
        BoundedPriorityQueueSet queue = new BoundedPriorityQueueSet();
        Task a = new Task("Alice", "Burned", LocalDate.of(2023, 5, 2));
        Task b = new Task("Adam", "Lost leg", LocalDate.of(2023, 5, 3));
        Task c = new Task("Marge", "headache", LocalDate.of(2023, 5, 1));
        queue.add(a);
        queue.add(b);
        queue.add(c);

        Task excpected = c;
        Task actual = queue.peek();
        assertEquals(excpected, actual);

        int expectedSize = 3;
        int actualSize = queue.size();
        assertEquals(expectedSize, actualSize);

        assertFalse(queue.isEmpty());

    }

    /**
     * Test of add method, of class BoundedPriorityQueueSet. Adding to a queue
     * with the task in there already
     */
    @Test
    public void testAddDuplicate() {
        BoundedPriorityQueueSet queue = new BoundedPriorityQueueSet();
        Task a = new Task("Alice", "Burned", LocalDate.of(2023, 5, 2));
        Task b = new Task("Adam", "Lost leg", LocalDate.of(2023, 5, 3));
        Task c = new Task("Marge", "headache", LocalDate.of(2023, 5, 1));
        Task d = new Task("Marge", "headache", LocalDate.of(2023, 5, 1));

        queue.add(a);
        queue.add(b);
        queue.add(c);
        assertThrows(DuplicateElementException.class, () -> {
            queue.add(d);
        });

    }

    /**
     * Test of add method, of class BoundedPriorityQueueSet. 
     * Adding to a full queue, throw exception 
     * 
     */
    @Test
    public void testAddFull() {
        BoundedPriorityQueueSet queue = new BoundedPriorityQueueSet();
        Task a = new Task("Alice", "headache", LocalDate.of(2023, 5, 1));
        Task b = new Task("John", "Cancer", LocalDate.of(2023, 5, 2));
        Task c = new Task("Pierce", "lost pinky", LocalDate.of(2023, 5, 3));
        Task d = new Task("Harry", "Dialisis", LocalDate.of(2023, 5, 4));
        Task e = new Task("Jonathen", "Stab Wound", LocalDate.of(2023, 5, 5));
        Task f = new Task("Homer", "Stubbed toe", LocalDate.of(2023, 5, 6));
        Task g = new Task("Peter", "Broken toe", LocalDate.of(2023, 5, 7));
        Task h = new Task("Bart", "Lost ear", LocalDate.of(2023, 5, 8));
        Task i = new Task("Stewie", "1st degree burn", LocalDate.of(2023, 5, 9));
        Task j = new Task("Lisa", "Stomach bug", LocalDate.of(2023, 5, 10));
        Task k = new Task("Lisa", "Stomach bug", LocalDate.of(2023, 5, 11));
        queue.add(a);
        queue.add(b);
        queue.add(c);
        queue.add(d);
        queue.add(e);
        queue.add(f);
        queue.add(g);
        queue.add(h);
        queue.add(i);
        queue.add(j);
        assertThrows(IllegalArgumentException.class, () -> {
            queue.add(k);
        });

        int expectedSize = 10;
        int actualSize = queue.size();
        assertEquals(expectedSize, actualSize);

        assertFalse(queue.isEmpty());

    }

}
