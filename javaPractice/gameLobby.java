public class gameLobby {
    public static void main(String[] args) {
        int age=22;
        int coins= 120;
        int entryFees=5;
        boolean isBanned = false;

        int coinsAfterEntry=coins-entryFees;
        boolean hasEnoughCoins= coins>=coinsAfterEntry;
        boolean isAdult =age>=18;

        boolean canPlayerEnter= isAdult && hasEnoughCoins && !isBanned;
        System.out.println(canPlayerEnter);
    }
}
