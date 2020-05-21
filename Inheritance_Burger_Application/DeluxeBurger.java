package Inheritance_Burger_Application;

public class DeluxeBurger extends Hamburger{


    public DeluxeBurger() {
        super("Deluxe","Sausage and Bacon",15, "White");
        super.addHumburgerAddtion1("Chips", 5);
        super.addHumburgerAddtion2("Drinks",10);

    }

    @Override
    public void addHumburgerAddtion1(String name, double price) {
        System.out.println("Can't add from base class!, Overridden method");
    }

    @Override
    public void addHumburgerAddtion2(String name, double price) {
        System.out.println("Can't add from base class!, Overridden method");

    }

    @Override
    public void addHumburgerAddtion3(String name, double price) {
        System.out.println("Can't add from base class!, Overridden method");

    }

    @Override
    public void addHumburgerAddtion4(String name, double price) {
        System.out.println("Can't add from base class!, Overridden method");

    }



}
