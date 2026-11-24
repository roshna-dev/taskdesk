import java.util.*;
public class Utils {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String str=sc.nextLine();
        System.out.println("Name after capitalization:"+capitalize(str));
        System.out.println("Enter values of a, b, c:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Greatest of three numbers is:"+greatestOfThreeNumbers(a,b,c));
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" is "+factorial(n));
        System.out.println("Enter a day of a week:");
        String day=sc.next();
        System.out.println(DaysOfTheWeek(day));
        System.out.println("Enter a number:");
        int m=sc.nextInt();
        System.out.println("Sum of digits of "+m+" is:"+sumOfDigits(m));
    }

    static String capitalize(String str){
        str=str.toUpperCase();
        return str;
    }
    static int greatestOfThreeNumbers(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
            return b;
        }
        else {
            return c;
        }
    }
    static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact *=i;
        }
        return fact;
    }
    static String DaysOfTheWeek(String day) {
        switch(day.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                return "Its a weekday! Time to work!";
            case "saturday":
            case "sunday":
                return "Its a weekend! Enjoy!";
        }
        return "invalid day, day is case sensitive";
    }
    static int sumOfDigits(int m){
        int sum=0;
        while(m > 0) {
            sum += m % 10;
            m = m / 10;
        }
        return sum;
    }
}
