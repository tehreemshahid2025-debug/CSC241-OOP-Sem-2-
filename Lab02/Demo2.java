public class Demo2{
     public static void main(String[] args){
          Student1 s = new Student1();
          s.studentId="SP26-BAI-050";
          s.name="Tehreem Shahid";
          s.completedCredits= 18;
          s.addCredits(3);
          s.addCredits(3,1);
          System.out.println(s.remainingCredits(130));
     }
}