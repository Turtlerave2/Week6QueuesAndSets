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

    /**
     * Creates a new BoundedPriorityQueueSet with a default maximum size of 10.
     */
    public BoundedPriorityQueueSet() {
        this.maxSize = 10;
        this.size = 0;
        this.first = null;
        this.taskSet = new HashSet<>();
    }

    /**
     * Creates a new BoundedPriorityQueueSet with the specified maximum size.
     *
     * @param maxSize the maximum number of Tasks that can be stored in the
     * queue doesn't return anything
     */
    public BoundedPriorityQueueSet(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.first = null;
        this.taskSet = new HashSet<>();
    }

    /**
     * Returns the current number of Tasks in the queue
     *
     * @return the number of Tasks in the queue
     */
    public int size() {
        return size;
    }

    /**
     * Returns whether the queue is currently empty
     *
     * @return true if there are no Tasks in the queue, false otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns whether the queue is currently full
     *
     * @return true if the queue is at maximum capacity, false otherwise
     */
    public boolean isFull() {
        return size == maxSize;
    }

    /**
     * Returns the first Task in the queue without removing it.
     *
     * @return the first Task in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public Task peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("The queue is empty.");
        }
        return first.data;
    }

    /**
     * Removes and returns the first Task in the queue.
     *
     * @return the first Task in the queue
     * @throws NoSuchElementException if the queue is empty
     */
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

    /**
     * A private help method to get the position of a Task in the queue.
     *
     * @param task the Task to find the position of
     * @return the position of the Task in the queue, or -1 if the Task is not
     * in the queue
     */
    public int getPosition(Task task) {
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

    /**
     * Returns the position at which a Task was added to the queue.
     *
     * @param task the Task to be added to the queue
     * @return the position at which the Task was added
     * @throws DuplicateElementException if the Task is already in the queue
     * @throws IllegalStateException if the queue is already at maximum capacity
     */
    public int add(Task task) {
        if (taskSet.contains(task)) {
            throw new DuplicateElementException();
        }
        if (isFull()) {
            throw new IllegalArgumentException("The queue is full.");
        }
        
        Node newNode = new Node(task);
        if (isEmpty()) {
            first = newNode;
            //checking priority of each task
        } else if (task.compareTo(first.data) < 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node prev = first;
            Node current = first.next;
            //loop through the queue until the current node has
            //lower priority than the new 'task'
            while (current != null && task.compareTo(current.data) >= 0) {
                prev = current;
                current = current.next;
            }
            prev.next = newNode;
            newNode.next = current;
        }
        taskSet.add(task);
        size++;
        return getPosition(task);

    }

    /**
     * A private nested class representing a Node in the queue.
     */
    private class Node {

        Task data;
        Node next;

        Node(Task task) {
            this.data = task;
            this.next = null;
        }
    }

}
