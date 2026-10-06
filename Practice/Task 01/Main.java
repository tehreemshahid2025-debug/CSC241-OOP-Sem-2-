public class Main{
    public static void main(String[] args){
         System.out.print("Welcome to the Library!");
         Book bk1 = new Book("The Kite Runner","Khalid Hussaini",1500);
         Book bk2 = new Book("Namal","Nimra Ahmed",2000);
         Book bk3 = new Book("Forty Rules of Love ","Elif Shafaq");
         Book bk4 = new Book("Hasil");
         bk1.display();
         bk2.display();
         bk3.display();
         bk4.display();
    }
}