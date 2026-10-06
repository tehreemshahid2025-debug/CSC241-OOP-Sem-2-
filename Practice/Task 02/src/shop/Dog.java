package shop;
public class Dog extends Animal{
      private String breed;
      public Dog(String name, double price,String breed){
             super(name,price);
             setBreed(breed);
     }
     public Dog(String name,String breed){
             this(name,0.00,breed);
     }
     public void setBreed(String breed){
          this.breed=breed;
     }
      public void display(){
          super.display();
          System.out.print("Breed:"+breed+"\n");
     }
}