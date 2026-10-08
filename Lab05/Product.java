public class Product{
    private String id;
    private String name;
    private double price;
    private int quantity;
    private static double maxPrice;
    private static double minPrice;
    private static int count=0;
    private Date md;
    public Product(String name, double price, int quantity){
          this(name,price,quantity,new Date(1,1,1));
    }
    public Product(String name, double price, int quantity,Date mf){
          setName(name);
          setPrice(price);
          setQuantity(quantity);
          this.id=String.format("P%03d",count++);
          this.md = mf;
          if (count==1){
                 Product.minPrice=price;
	 	 Product.maxPrice=price;
              }
          else
            {Product.setMaxPrice(price);
             Product.setMinPrice(price);}
          
    }
    public void setName(String name){
         this.name=name;
    }
    public void setPrice(double price){
        if (price>=0)
             this.price = price;
    }
    public void setQuantity(int quantity){
        if (quantity>0)
              this.quantity=quantity;
    }
    private static void setMaxPrice(double price){
          if (price>maxPrice)
                  maxPrice=price;
    }
    public  static double getMaxPrice(){return maxPrice;}
    private static void setMinPrice(double price){ 
	    if (price<minPrice)
                  minPrice=price;
    }
    public  static double getMinPrice(){return minPrice;}
    public void display(){
        System.out.println("\nProduct Id: "+id);
        System.out.println("Product Name: "+name);
	System.out.println("Product Price:"+price);
	System.out.println("Product Quantity:"+quantity);
        System.out.println("Product Manufacturing Date:"+ md);
    }
}
