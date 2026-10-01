public class Demo{
     public static void main(String[] args){
     Person P1 = new Person("Tehreem Shahid","SP26-BAI-050@cuilahore.edu.pk","January 10,2008");
     Person P2 =new Person("Minahil Sehar","SP26-BAI-032@cuilahore.edu.pk","July 29,2006","Faislabad");
     Person P3 = new Person("Abeer Amina","SP26-BAI-005@cuilahore.edu.pk");
     P1.setId("CII-SP26-BAI-050");
     System.out.println(P1.getId());
     System.out.println(P1.getName());
     System.out.println(P1.getEmail());
     System.out.println(P1.getDOB());
     System.out.println(P1.getCity());
     P2.setId("CII-SP26-BAI-032");
     System.out.println(P2.getId());
     System.out.println(P2.getName());
     System.out.println(P2.getEmail());
     System.out.println(P2.getDOB());
     System.out.println(P2.getCity()); 
     P3.setId("CII-SP26-BAI-005");
     System.out.println(P3.getId());
     System.out.println(P3.getName());
     System.out.println(P3.getEmail());
     System.out.println(P3.getDOB());
     System.out.println(P3.getCity());
     }
}