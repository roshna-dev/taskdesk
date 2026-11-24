public class watchList {
    public static void main(String[] args) {
        //store list of anime
        String topPick = "naruto";
        String ogTitle = new String("One Piece");

        System.out.println(topPick);
        System.out.println(ogTitle);
        System.out.println(topPick.toUpperCase());
        System.out.println("After format: " + formatAnimeTitle(ogTitle));
        //ARRAYS
        String[] watchList = {"jujutsu kaisen", "your name", "silent voice", "demonslayer"};
        String[] recommendedList = new String[3];

        System.out.print("Watch list:");
        for (String anime : watchList) {
            System.out.print(anime + ", ");
        }
        System.out.print(recommendedList);
        for(String anime : recommendedList){
            System.out.print(anime + ", ");
        }
    }
    static String formatAnimeTitle(String animeTitle){
        System.out.println("Before format: "+animeTitle);
        return animeTitle.toLowerCase();
    }
}

