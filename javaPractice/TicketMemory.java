class ConcertTicket {
    private String showName;
    private String seatNumber;

    ConcertTicket(String showName, String seatNumber) {
        this.showName = showName;
        this.seatNumber = seatNumber;
    }
    //toString
    //equals
    //hashCode

    @Override
    public String toString() {
        return "Concert Ticket {show name: " + showName + ", seat number: " + seatNumber + "}";
    }

    @Override
    public int hashCode() {
        return showName.hashCode() + seatNumber.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj instanceof ConcertTicket;
    }
}
public class TicketMemory {
    public static void main(String[] args) {
        ConcertTicket ticket =new ConcertTicket("ColdPlay","22A");
        System.out.println(ticket);
    }
}
