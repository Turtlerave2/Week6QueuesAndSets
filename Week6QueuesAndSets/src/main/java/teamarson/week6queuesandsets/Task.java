/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teamarson.week6queuesandsets;

import java.time.LocalDate;

/**
 *
 * @author leoze
 */
public class Task {

    private String owner;
    private String description;
    private LocalDate deadline;

    public Task(String owner, String description, LocalDate deadline) {
        if (deadline.compareTo(LocalDate.now()) <= 0) {
            throw new IllegalArgumentException("Deadline must be after today's date.");
        }
        this.owner = owner;
        this.description = description;
        this.deadline = deadline;
    }

    public Task() {
    }

    public String getOwner() {
        return owner;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDeadline(LocalDate deadline) {
        if (deadline.compareTo(LocalDate.now()) <= 0) {
            throw new IllegalArgumentException("Deadline must be after today's date.");
        }
        this.deadline = deadline;
    }
    
    
    
}
