import java.util.Scanner;

public class taskdeskConsole {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true) {

            //get ticket title
            System.out.println("enter ticket title:");
            String title = sc.nextLine();

            //when user enters 'quit
            if(title.equalsIgnoreCase("quit")){
                break;
            }
            //get priority
            System.out.println("enter priority:");
            String priority = sc.nextLine();

            //validation of fields
            if (title.isBlank() || priority.isBlank()) {
                System.out.println("Invalid Input");
                continue;
            }

            if (!priority.equalsIgnoreCase("high") && !priority.equalsIgnoreCase("medium") && !priority.equalsIgnoreCase("low")) {
                System.out.println("Invalid Input");
                continue;
            }

            //summary
            System.out.println("Summary:" + title + " " + priority);

        }
    }
}
