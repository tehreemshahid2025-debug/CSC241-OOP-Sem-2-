package shop;
public class Animal{
    private String name;
    private double price;
    private int id;
    private static int totalAnimals;
    public static String shopName="De luna";
   public Animal(String name, double price){
        setName(name);
        setPrice(price);
        this.id = Animal.totalAnimals += 1;
    }
    public void setName(String name){
         if(name!= null)
              this.name = name;
         else
           System.out.print("Invalid input! Animal name can't be empty.");
    }
    public void setPrice(double price){
         if(price>=0)
              this.price=price;
         else
            System.out.print("Invalid Price!");
    }
    public String getName(){return this.name;}
    public double getPrice(){return this.price;}
    public static int get_Total_Animals(){return totalAnimals;}
    public void display(){
         System.out.print("\nAnimal ID "+ id+ "\n");
         System.out.print("Animal Name: "+name+"\n");
         System.out.print("Price: "+price+"PKR\n");
    }
    public void applyDiscount(double percent){
         double discounted_Price=0;
         discounted_Price=this.price*percent/100;
         this.price=discounted_Price;
    }
     public void applyDiscount(double amount, boolean isFixed){
         double discounted_Price=0;
         if (amount<=this.price)
               discounted_Price= this.price-amount;
         this.price=discounted_Price;           
    }
    
}