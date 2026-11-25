class CoffeeOrder{
    static final String SHOP_NAME =" Bean & Brew"; //shared constant
    private static int totalOrders;

    private String drinkName;
    CoffeeOrder(String drinkName){
        this.drinkName = drinkName;
        totalOrders++;
    }
    void printReceipt(){
        System.out.println(drinkName+" from "+SHOP_NAME);
    }
    static int getTotalOrders(){
        return totalOrders;
    }
}

public class CoffeeShop {
    public static void main(String[] args){
        CoffeeOrder latte=new CoffeeOrder("Latte");
        CoffeeOrder mocha=new CoffeeOrder("Mocha");

        latte.printReceipt();
        mocha.printReceipt();

        System.out.println("Total orders: "+CoffeeOrder.getTotalOrders());
        System.out.println("Shop name: "+CoffeeOrder.SHOP_NAME);
    }
}
