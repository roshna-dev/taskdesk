import java.util.Scanner;

public class movieInvoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the movie name:");
        String name = sc.nextLine();
        System.out.println("Enter number of tickets:");
        int tickets = sc.nextInt();
        //constant ticket price
        double basePrice =120;
        //calculating the total amount to pay
        double totalPrice = basePrice * tickets;
        //printing the values
        System.out.println("Movie name:" + name);
        System.out.println("Number of tickets:" + tickets);
        System.out.println("Total price:" + totalPrice);
    }
}
