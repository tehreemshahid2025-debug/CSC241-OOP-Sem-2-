class Book{
   private String title;
   private String author;
   private double price;
   private static int totalBooks;
   public Book(String title, String author, double price){
        setTitle(title);
        setAuthor(author);
        setPrice(price);
        Book.no_Of_Books();
   }
   public Book(String title, String author){
        this(title,author,0.00);
        
   }
   public Book(String title){
        this(title,"Unknown");
   }
   public void setTitle(String title){
        if (!title.isBlank())
           this.title=title;
        else 
           System.out.print("Error: Invalid Title!");
   }
   public void setAuthor(String author){
           this.author=author;
   }
   public void setPrice(double price){
       if (price>=0)
           this.price=price;
        else 
           System.out.print("Error: Invalid Price!");
   }
   public void display(){
        System.out.print("\nBook Title :"+title+"\n");
        System.out.print("Author Name :"+author+"\n");
        System.out.print("Book Price :"+price+"\n");
   }
   private static void no_Of_Books(){
        totalBooks+=1;
   }

   
}