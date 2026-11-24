class Book{
    String title;
    String author;
    double price;
    boolean isBestSeller;

    //constructor
    Book(){
        System.out.println("Default Constructor"); //no parameter
    }
    Book(String title, String author, double price, boolean isBestSeller){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isBestSeller = isBestSeller;
    }
}
public class BookLibrary {
    public static void main(String[] args) {
        Book dune= new Book("Dune","Frank Herbert", 499, true);
       // System.out.println(dune); this shows the address of the dune object in heap memory
        System.out.println(dune.title);
        System.out.println(dune.author);
        System.out.println(dune.price);
        System.out.println(dune.isBestSeller);

        Book alchemist = new Book("The Alchemist","Paulo Coelho", 299, true);
        System.out.println(alchemist.title);
        System.out.println(alchemist.author);
        System.out.println(alchemist.price);
        System.out.println(alchemist.isBestSeller);

    }
}
