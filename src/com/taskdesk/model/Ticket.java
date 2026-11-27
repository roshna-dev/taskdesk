package com.taskdesk.model;

import java.util.Date;
import java.util.*;

public class Ticket {
    private static int nextId =1;
    private int id;
    private String title;
    private String description;
    private String status;
    private String priority;
    private User reporter;
    private User assignee;
    private Date createdAt;
    private Date updatedAt;
    private List<Comment> comments = new ArrayList<>();

    Ticket(String title, String description, String status, String priority, User reporter, User assignee) {
        this.id = nextId++;
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
        if(priority==null || (!priority.equalsIgnoreCase("low")&&!priority.equalsIgnoreCase("medium")&& !priority.equalsIgnoreCase("high") && !priority.equalsIgnoreCase("urgent"))) {
            throw new IllegalStateException("Invalid priority: "+priority);
        }
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
    public void setAssignee(Agent assignee) {
        this.assignee = assignee;
    }
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
    public boolean changeStatus(String newStatus) {
        if(newStatus == null) return false;
        else if(this.status.equals("OPEN") && newStatus.equals("IN_PROGRESS")) {
            this.status = newStatus;
            this.updatedAt = new Date();
            return true;
        }
        else if(this.status.equals("IN_PROGRESS") && newStatus.equals("RESOLVED")) {
            this.status = newStatus;
            this.updatedAt=new Date();
            return true;
        }
        else if(this.status.equals("RESOLVED")&& newStatus.equals("OPEN")) {
            this.status=newStatus;
            this.updatedAt=new Date();
            return true;
        }
        else if(this.status.equals("RESOLVED") && newStatus.equals("CLOSED")) {
            this.status=newStatus;
            this.updatedAt=new Date();
            return true;
        }
        else
            return false;
    }
    public void addComment(Comment comment){
        comments.add(comment);
    }

    public List<Comment> getComments() {
        return comments;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null || getClass()!=obj.getClass()) return false;

        Ticket t=(Ticket)obj;
        return this.id==t.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString(){
        return "Ticket:{id: "+id+", Title: "+title+", Description: "+description+", Status: "+status+", Priority: "+priority+", Reporter: "+reporter+", Assignee: "+assignee+", Created at: "+createdAt+", Updated at: "+updatedAt+"}";
}
}
