public class Demo{
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.studentId="SP26-BAI-011";
        s1.name= "Alishba Javed";
        s1.completedCredits=15;
        s2.studentId="SP26-BAI-032";
        s2.name= "Minahil Sehar";
        s2.completedCredits=16;
        s3.studentId="SP26-BAI-050";
        s3.name= "Tehreem Shahid";
        s3.completedCredits=17;
        System.out.println(s1.studentId);
        System.out.println(s1.name);
        System.out.println(s1.completedCredits);
        System.out.println(s2.studentId);
        System.out.println(s2.name);
        System.out.println(s2.completedCredits);
        System.out.println(s3.studentId);
        System.out.println(s3.name);
        System.out.println(s3.completedCredits);
        s1.addCredits(3);
        System.out.println(s1.studentId);
        System.out.println(s1.name);
        System.out.println(s1.completedCredits);
        System.out.println(s2.studentId);
        System.out.println(s2.name);
        System.out.println(s2.completedCredits);
        System.out.println(s3.studentId);
        System.out.println(s3.name);
        System.out.println(s3.completedCredits);
// only the credits of one specific objects changes bcz each object refer to different address so others remain same
        System.out.println("Remaining Credits"+s2.remainingCredits(120));
        System.out.println("Summary:"+ s3.summary());
   }
}