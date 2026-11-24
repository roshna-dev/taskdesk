package com.taskdesk.model;

import java.util.Date;

public class Ticket {
    private int id;
    private String title;
    private String description;
    private String status;
    private String priority;
    private User reporter;
    private User assignee;
    private Date createdAt;
    private Date updatedAt;

    Ticket(int id, String title, String description, String status, String priority, User reporter, User assignee) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.reporter = reporter;
        this.assignee = assignee;
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }
    public int getId() {
        return id;
    }
//    public void setId(int id) {
//        this.id = id;
//    }
    public String getTitle() {
        return title;
    }
//    public void setTitle(String title) {
//        this.title = title;
//    }
    public String getDescription() {
        return description;
    }
//    public void setDescription(String description) {
//        this.description = description;
//    }
    public String getStatus() {
        return status;
    }
//    public void setStatus(String status) {
//        this.status = status;
//    }
    public String getPriority() {
        return priority;
    }
//    public void setPriority(String priority) {
//        this.priority = priority;
//    }
    public User getReporter() {
        return reporter;
    }
//    public void setReporter(String reporter) {
//        this.reporter = reporter;
//    }
    public User getAssignee() {
        return assignee;
    }
//    public void setAssignee(String assignee) {
//        this.assignee = assignee;
//    }
    public Date getCreatedAt() {
        return createdAt;
    }
//    public void setCreatedAt(Date createdAt) {
//        this.createdAt = createdAt;
//    }
    public Date getUpdatedAt() {
        return updatedAt;
    }
//    public void setUpdatedAt(Date updatedAt) {
//        this.updatedAt = updatedAt;
//    }
    @Override
    public String toString(){
        return "Ticket:{id: "+id+", Title: "+title+", Description: "+description+", Status: "+status+", Priority: "+priority+", Reporter: "+reporter+", Assignee: "+assignee+", Created at: "+createdAt+", Updated at: "+updatedAt+"}";
}
}
