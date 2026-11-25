interface Watchable{
    void watch();
}

abstract class Movie implements Watchable{
    String title;

    Movie(String title){
        this.title = title;
    }
}

class ActionMovie extends Movie{
    ActionMovie(String title){
        super(title);
    }
    @Override
    public void watch(){
        System.out.println("Watching action movie: "+title);
    }
}

class ComedyMovie extends Movie{
    ComedyMovie(String title){
        super(title);
    }
    @Override
    public void watch(){
        System.out.println("Watching comedy movie: "+title);
    }
}

public class MovieNight {
    public static void main(String[] args) {
        Movie action= new ActionMovie("Inception");
        Movie comedy= new ComedyMovie("21 Jump Street");

        action.watch();
        comedy.watch();
    }
}
