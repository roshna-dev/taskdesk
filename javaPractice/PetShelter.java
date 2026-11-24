class Animal{
    String name;
    Animal(){
        System.out.println("Animal constructor");
    }
    Animal(String name){
        this.name=name;
    }
    void sound(){
        System.out.println(name + " makes a sound");
    }
}
class Dog extends Animal{
    String dogName;
    Dog(String dogName){
        super(dogName);
    }
    void sound(){
        System.out.println(super.name +" says woof!");
    }
}
class Cat extends Animal{
    @Override //annotation
    void sound(){
        super.sound();
        System.out.println("Cat says meow!");
    }
}
public class PetShelter {
    public static void main(String[] args) {
//        Dog d=new Dog("Alex");
//        d.sound();
        Animal animal = new Cat();
        animal.sound();
    }
}
