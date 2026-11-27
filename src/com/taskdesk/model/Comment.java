package com.taskdesk.model;

import java.util.Date;

public class Comment {
    private static int nextId=1;
    private int id;
    private String ticket;
    private String author;
    private String body;
    private Date createdAt;

    Comment( String ticket, String author, String body) {
        this.id = nextId++;
        this.ticket=ticket;
        this.author=author;
        this.body=body;
        this.createdAt=new Date();
    }
    public int getId(){
        return id;
    }
//    public void setId(int id){
//        this.id=id;
//    }
    public String getTicket(){
        return ticket;
    }
//    public void setTicket(String ticket){
//        this.ticket=ticket;
//    }
    public String getAuthor(){
        return author;
    }
//    public void setAuthor(String author){
//        this.author=author;
//    }
    public String getBody(){
        return body;
    }
//    public void setBody(String body){
//        this.body=body;
//    }
    public Date getCreatedAt(){
        return createdAt;
    }
//    public void setCreatedAt(Date createdAt){
//        this.createdAt=createdAt;
//    }

    @Override
    public String toString() {
        return "Comment {id=" + id + ", ticket=" + ticket + ", author=" + author + ", body=" + body+ ", createdAt=" + createdAt + "}";
    }
}
