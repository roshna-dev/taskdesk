public class courseAccess {
    public static void main(String[] args) {
       String paymentStatus = "SUCCESS";

       if(paymentStatus.equals("SUCCESS")){
           System.out.println("You have access to the course");
       }
       else if(paymentStatus.equals("REFUNDED")){
           System.out.println("You have refunded the course");
       }
       else if(paymentStatus.equals("PENDING")){
           System.out.println("You request is pending");
       }
       else{
           System.out.println("Sorry you don't have access to the course");
       }

       //switch condition
        switch(paymentStatus){
            case "SUCCESS" -> System.out.println("You have access to the course");
            case "REFUNDED" -> System.out.println("You have refunded the course");
            case "PENDING" -> System.out.println("You request is pending");
            default -> System.out.println("Sorry you don't have access to the course");
            }
       int watchedLessons = 5;
       int totalLessons = 10;

       //how many lessons completed?
        for(int i =1;i<=watchedLessons;i++){
            System.out.println("Lesson "+i+" is completed");
        }

        int l=1;
        while(l<=watchedLessons){
            System.out.println("Lesson "+l+" is completed");
            l++;

        }
        }
    }
