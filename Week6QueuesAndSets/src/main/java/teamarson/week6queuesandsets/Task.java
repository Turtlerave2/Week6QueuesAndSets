/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teamarson.week6queuesandsets;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author leoze
 */
public class Task implements Comparable<Task> {

    private String owner;
    private String description;
    private LocalDate deadline;

    /**
     * Creates a new task with the given owner, description, and deadline.
     * Validation is done to deadline variable
     *
     * @param owner the owner of the task
     * @param description a description of the task
     * @param deadline the deadline for the task
     * @throws IllegalArgumentException if the deadline is before or equal to
     * today's date
     */
    public Task(String owner, String description, LocalDate deadline) {
        if (deadline.compareTo(LocalDate.now()) <= 0) {
            throw new IllegalArgumentException("Deadline must be after today's date.");
        }
        this.owner = owner;
        this.description = description;
        this.deadline = deadline;
    }

    /**
     * A no parameter constructor
     */
    public Task() {

    }

    //getters for the task class
    public String getOwner() {
        return owner;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    //setters for the task class
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //validation is done for the deadline before setting
    public void setDeadline(LocalDate deadline) {
        if (deadline.compareTo(LocalDate.now()) <= 0) {
            throw new IllegalArgumentException("Deadline must be after today's date.");
        }
        this.deadline = deadline;
    }

    /**
     * Returns a hash code value for the Task object based on the values of its
     * owner, description, and deadline fields.
     *
     * @return an integer hash code value for the Task object.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.owner);
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + Objects.hashCode(this.deadline);
        return hash;
    }

    /**
     * Indicates whether some other object is "equal to" this one. Tasks are
     * considered equal if they have the same owner, description, and deadline
     * fields.
     *
     * @param obj the object to compare to.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Task other = (Task) obj;
        if (!Objects.equals(this.owner, other.owner)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return Objects.equals(this.deadline, other.deadline);
    }

    /**
     * Returns a string representation of the task including all variables.
     *
     * @return a string representation of the task
     */
    @Override
    public String toString() {
        return "Task{" + "owner=" + owner + ", description=" + description + ", deadline=" + deadline + '}';
    }

    /**
     * Compares this task to another task based on their deadlines.
     *
     * @param t the task to compare to
     * @return a negative integer, zero, or a positive integer as this task is
     * less than, equal to, or greater than the other task
     */
    @Override
    public int compareTo(Task t) {
        return this.deadline.compareTo(t.getDeadline());
    }

}
