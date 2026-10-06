package app;
import shop.Animal;
import shop.Dog;
import shop.Bird;
public class Main{
   public static void main(String[] args){
      Dog dg1 = new Dog("Max",80000,"Golden Retriever");
      Dog dg2 = new Dog("Milo","French Bulldog");
      Bird bd1 = new Bird("Peregrine Falcon",500000,100);
      dg1.display();
      dg2.display();
      bd1.display();
      dg1.applyDiscount(30);
      dg2.applyDiscount(700,true);
      dg1.display();
      dg2.display();
      bd1.display();
      System.out.print("Total Animals:"+Animal.get_Total_Animals()+"\n");
      System.out.print("Shop Name:"+Animal.shopName);
   }
}