package com.taskdesk.model;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer c1=new Customer(12,"Rosh","roshnadevi@gmail.com","CUSTOMER ");
        Customer c2=new Customer(15,"Agi","jagilan@ymail.com","CUSTOMER ");
        Agent a1=new Agent(2,"Dev","dev@gmail.com","AGENT ");
        Agent a2=new Agent(3,"Jagan","jagan@ymail.com","AGENT ");
        //Agent a3=new Agent(4,"Lol","lol@gmail.com","CUSTOMER ");

        Ticket t1=new Ticket("Login Issue","Cannot log in even with the correct password","OPEN","HIGH",c1,a1);
        Ticket t2=new Ticket("Slow dashboard","Dashboard takes more than 10 seconds to load.","OPEN","MEDIUM",c2,a1);
        Ticket t3=new Ticket("Edit profile","Cannot update profile picture","IN_PROGRESS","LOW",c1,a2);
        Ticket t4=new Ticket("Payment failure","Payment fails after clicking the Pay Now button","RESOLVED","URGENT",c2,a2);
        Ticket t5=new Ticket("Password reset","Password reset email is not being received","OPEN","HIGH",c1,a2);

        List<Ticket> tickets=new ArrayList<>();
        tickets.add(t1);
        tickets.add(t2);
        tickets.add(t3);
        tickets.add(t4);
        tickets.add(t5);
        //System.out.println("Your tickets are:"+tickets);
        int ch=0;
        while(ch!=6){
            System.out.println("\n========== TASKDESK ==========");
            System.out.println("1. Create a ticket");
            System.out.println("2. List all tickets");
            System.out.println("3. Assign a ticket");
            System.out.println("4. Change ticket status");
            System.out.println("5. Add a comment");
            System.out.println("6. Quit");

            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch(ch){
                case 1:{
                    sc.nextLine();
                    System.out.println("Creating a ticket..");
                    System.out.println("Enter title:");
                    String title=sc.nextLine();
                    System.out.println("Enter description:");
                    String description=sc.nextLine();
                    System.out.println("Enter priority:");
                    String priority=sc.nextLine();

                    String status = "OPEN";
                    Customer reporter =c1;
                    Agent assignee =a2;

                    Ticket newTicket=new Ticket(title,description,status,priority,reporter,assignee);
                    tickets.add(newTicket);
                    System.out.println("Ticket created successfully");
                    System.out.println(newTicket.toString());
                    break;
                }
                case 2:{
                    System.out.println("Listing all tickets...");
                    for(Ticket t:tickets){
                        System.out.println(t);
                        for(Comment c: t.getComments()){
                            System.out.println(c);
                        }
                    }

                    break;
                }
                case 3:{
                    System.out.println("Assigning a agent...");
                    System.out.println("Enter ticket id:");
                    int id=sc.nextInt();
                    for(Ticket t:tickets){
                        if(t.getId()==id) {
                            t.setAssignee(a1);
                            System.out.println("Ticket assigned successfully");
                            break;
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.println("Changing ticket status");
                    System.out.println("Enter ticket id:");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter ticket status:");
                    String status = sc.nextLine();

                    for (Ticket t : tickets) {
                        if (t.getId() == id) {
                            boolean updated = t.changeStatus(status);

                            if (updated) {
                                System.out.println("Ticket updated successfully");
                            } else {
                                System.out.println("Ticket status not updated");
                            }
                            break;
                        }
                    }
                    break;
                }

                case 5:{
                    System.out.println("Adding a comment");
                    System.out.println("Enter ticket ID:");
                    int id = sc.nextInt();
                    sc.nextLine();

                    boolean found = false;

                    for(Ticket t:tickets){
                        if(t.getId()==id){
                            found=true;

                            System.out.println("Enter your comment:");
                            String body=sc.nextLine();

                            Comment comment =new Comment(t.getTitle(),"Customer",body);
                            t.addComment(comment);

                            System.out.println("Comment added successfully");
                            System.out.println(comment);
                        }
                    }
                    if(!found){
                        System.out.println("Comment not found");
                    }
                    break;
                }
                case 6:{
                    System.out.println("Exiting the application...");
                    break;
                }
            }
            if (ch >= 1 && ch <= 6) {
                System.out.println("You selected option " + ch);
            } else {
                System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }
        }
        sc.close();
       // System.out.println(t1.changeStatus("IN_PROGRESS"));
       // System.out.println(t1.getStatus());
        //filterTickets(tickets,ticket-> ticket.getPriority().equalsIgnoreCase("URGENT"));
        //filterTickets(tickets,ticket ->ticket.getAssignee() == a1);

//        System.out.println(t1.equals(t2));
//        System.out.println(t2.hashCode());
    }
    public static void filterTickets(List<Ticket> tickets, TicketFilter filter) {
        for(Ticket ticket:tickets) {
            if(filter.matches(ticket)) {
                System.out.println(ticket);
            }
        }
    }
}
