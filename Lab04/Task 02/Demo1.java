public class Demo1{
     public static void main(String[] args){
     Person1 P1 = new Person1("Tehreem Shahid","SP26-BAI-050@cuilahore.edu.pk",new Date(10,01,2008));
     Person1 P2 =new Person1("Minahil Sehar","SP26-BAI-032@cuilahore.edu.pk",new Date(29,07,2006),"Faislabad");
     Person1 P3 = new Person1("Abeer Amina","SP26-BAI-005@cuilahore.edu.pk");
     P1.setId("CII-SP26-BAI-050");
     System.out.println(P1.getId());
     System.out.println(P1.getName());
     System.out.println(P1.getEmail());
     P1.displayDOB();
     System.out.println(P1.getCity());
     P2.setId("CII-SP26-BAI-032");
     System.out.println(P2.getId());
     System.out.println(P2.getName());
     System.out.println(P2.getEmail());
     P2.displayDOB();
     System.out.println(P2.getCity()); 
     P3.setId("CII-SP26-BAI-005");
     System.out.println(P3.getId());
     System.out.println(P3.getName());
     System.out.println(P3.getEmail());
     P3.displayDOB();
     System.out.println(P3.getCity());
     }
}