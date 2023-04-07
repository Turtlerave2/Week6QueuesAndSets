/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package teamarson.week6queuesandsets;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

/**
 *
 * @author leoze
 */
public class BoundedPriorityQueueSet {

    private int maxSize;
    private int size;
    private Node first;
    private Set<Task> taskSet;
    
    
    public BoundedPriorityQueueSet() {
        this.maxSize = 10;
        this.size = 0;
        this.first = null;
        this.taskSet = new HashSet<>();
    }
    
     public BoundedPriorityQueueSet(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.first = null;
        this.taskSet = new HashSet<>();
    }
    
      public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == maxSize;
    }
    
     public Task peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("The queue is empty.");
        }
        return first.data;
    }
    
     public Task remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("The queue is empty.");
        }
        Node removedNode = first;
        first = first.next;
        taskSet.remove(removedNode.data);
        size--;
        return removedNode.data;
    }
     
     private int getPosition(Task task) {
        Node curr = first;
        int position = 1;
        while (curr != null) {
            if (curr.data.equals(task)) {
                return position;
            }
            curr = curr.next;
            position++;
        }
        return -1;
    }

    private class Node {
        Task data;
        Node next;

        Node(Task task) {
            this.data = task;
            this.next = null;
        }
    }
    
    
}
