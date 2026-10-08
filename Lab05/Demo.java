public class Demo{
     public static void main(String[] args){
        Product P1 = new Product("Hair curler",15000,2);
        Product P2 = new Product("Blush",2000,5);
	Product P3 = new Product("Hair Dryer",7000,1);
	Product P4 = new Product("Foundation",2000,3,new Date(31,01,2026));
        P1.display();
        P2.display();
        P3.display();
	P4.display();
        System.out.println("Maximum Price:"+Product.getMaxPrice());
	System.out.println("Minimum Price:"+Product.getMinPrice());
	}
        
}