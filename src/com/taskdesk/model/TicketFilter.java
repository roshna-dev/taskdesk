package com.taskdesk.model;

@FunctionalInterface
public interface TicketFilter {
    boolean matches(Ticket ticket);
}
