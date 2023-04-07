/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package teamarson.week6queuesandsets;

import java.time.LocalDate;
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
        Task b = new Task("Alice", "headache", LocalDate.of(2023, 5, 2));
        Task c = new Task("Alice", "headache", LocalDate.of(2023, 5, 3));
        Task d = new Task("Alice", "headache", LocalDate.of(2023, 5, 4));
        Task e = new Task("Alice", "headache", LocalDate.of(2023, 5, 5));
        Task f = new Task("Alice", "headache", LocalDate.of(2023, 5, 6));
        Task g = new Task("Alice", "headache", LocalDate.of(2023, 5, 7));
        Task h = new Task("Alice", "headache", LocalDate.of(2023, 5, 8));
        Task i = new Task("Alice", "headache", LocalDate.of(2023, 5, 9));
        Task j = new Task("Alice", "headache", LocalDate.of(2023, 5, 10));
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
     * Test of peek method, of class BoundedPriorityQueueSet.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        Task expResult = null;
        Task result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class BoundedPriorityQueueSet.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        Task expResult = null;
        Task result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class BoundedPriorityQueueSet.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Task task = null;
        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        int expResult = 0;
        int result = instance.add(task);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}