package shop;
public class Bird extends Animal{
      private int wingSpan;
      public Bird(String name, double price,int wingSpan){
           super(name,price);
           setWingSpan(wingSpan);
      }
      public void setWingSpan(int wingSpan){
           if(wingSpan>=0)
               this.wingSpan=wingSpan;
           else 
               System.out.print("Invalid Wing Span!");
      }
     public void display(){
          super.display();
          System.out.print("Wing Span: "+wingSpan+"cm\n");
     }
}