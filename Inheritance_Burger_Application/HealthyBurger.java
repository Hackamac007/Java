package Inheritance_Burger_Application;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {

        super("Healthy", meat, price, "Brown Red Rye");
    }

    public void addhealthAddtion1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1price= price;
    }

    public void addhealthAddition2(String name, double price){
        this.healthyExtra2Name= name;
        this.healthyExtra2Price= price;
    }

    @Override
    public double itemizeHamburger() {
       // Important to understand that we will use super to check for previous 4 items
        double hamburgerprice= super.itemizeHamburger();
        if(this.healthyExtra1Name!=null) {
            hamburgerprice += this.healthyExtra1price;
            System.out.println("Added " + this.healthyExtra1Name+" for extra price of "+ this.healthyExtra1price);
        }
        if(this.healthyExtra2Name!=null) {
            hamburgerprice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name+" for extra price of "+ this.healthyExtra2Price);
        }
        return hamburgerprice;
    }
}
