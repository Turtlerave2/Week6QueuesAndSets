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
     * Test of isEmpty method, of class BoundedPriorityQueueSet.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFull method, of class BoundedPriorityQueueSet.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        boolean expResult = false;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
