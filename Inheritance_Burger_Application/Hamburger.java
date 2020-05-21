package Inheritance_Burger_Application;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRolltype;

    private String addition1Name;
    private double addition1Price;


    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;


    public Hamburger(String name, String meat, double price, String breadRolltype) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRolltype = breadRolltype;
    }

    public void addHumburgerAddtion1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHumburgerAddtion2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHumburgerAddtion3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHumburgerAddtion4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger(){
        double hamburgerprice=this.price;
        System.out.println(this.name+" hamburger on a "+this.breadRolltype+ " roll with "+this.meat+ ". Price is : "+ this.price);

        if(this.addition1Name!=null){
            hamburgerprice += this.addition1Price;
            System.out.println("Added " + this.addition1Name+" for extra price of "+ this.addition1Price);
        }
        if(this.addition2Name!=null){
            hamburgerprice += this.addition2Price;
            System.out.println("Added " + this.addition2Name+" for extra price of "+ this.addition2Price);
        }
        if(this.addition3Name!=null){
            hamburgerprice += this.addition3Price;
            System.out.println("Added " + this.addition3Name+" for extra price of "+ this.addition4Price);
        }
        if(this.addition4Name!=null){
            hamburgerprice += this.addition4Price;
            System.out.println("Added " + this.addition4Name+" for extra price of "+ this.addition4Price);
        }
        return hamburgerprice;
    }


}
