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
public class TaskTest {

    public TaskTest() {
    }

    /**
     * Test of setDeadline method, of class Task.
     */
    @Test
    public void testSetDeadline() {
        LocalDate deadline = LocalDate.of(2023, 4, 1);
        Task instance = new Task();
        assertThrows(IllegalArgumentException.class, () -> {
            instance.setDeadline(deadline);
        });

    }
    
    /**
     * Test of Constructor, of class Task.
     */
    @Test
    public void testConstructor() {
        assertThrows(IllegalArgumentException.class, () -> {
       Task a = new Task("Alice", "headache", LocalDate.of(2023, 4, 1));
        });

    }

}
