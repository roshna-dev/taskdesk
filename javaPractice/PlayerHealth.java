class Player{
    private String name;
    private int health;

    Player(String name, int health){
        this.name=name;
        this.health=health;
    }
    String getName(){
        return name;
    }
    int getHealth(){
        return health;
    }
    void setHealth(int newHealth){
        if(newHealth<0 || newHealth>1000){
            System.out.println("Invalid Health: "+newHealth);
            return;
        }
        this.health=newHealth;
    }
    //behavioral methods
    void heal(int amountOfRecovery){
        setHealth(health+amountOfRecovery);
    }
}
public class PlayerHealth {
    public static void main(String[] args) {
        Player p1=new Player("Ronaldo",900);
        System.out.println("Name of the player:"+p1.getName());
        p1.heal(20);
        System.out.println("Player health:"+p1.getHealth());
    }
}
