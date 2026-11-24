package com.taskdesk.model;

public class Main {
    public static void main(String[] args) {
    Customer c1=new Customer(12,"Rosh","roshnadevi@gmail.com","CUSTOMER ");
    Customer c2=new Customer(15,"Agi","jagilan@ymail.com","CUSTOMER ");
    Agent a1=new Agent(2,"Dev","dev@gmail.com","AGENT ");
    Agent a2=new Agent(3,"Jagan","jagan@ymail.com","AGENT ");
    //Agent a3=new Agent(4,"Lol","lol@gmail.com","CUSTOMER ");

        Ticket t1=new Ticket(1,"Login Issue","Cannot log in even with the correct password","OPEN","HIGH ",c1,a1);
        Ticket t2=new Ticket(2,"Slow dashboard","Dashboard takes more than 10 seconds to load.","OPEN","MEDIUM ",c2,a1);
        Ticket t3=new Ticket(3,"Edit profile","Cannot update profile picture","IN_PROGRESS","LOW ",c1,a2);
        Ticket t4=new Ticket(4,"Payment failure","Payment fails after clicking the Pay Now button","RESOLVED","URGENT ",c2,a2);
        Ticket t5=new Ticket(5,"Password reset","Password reset email is not being received","OPEN","HIGH ",c1,a2);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
    }
}
