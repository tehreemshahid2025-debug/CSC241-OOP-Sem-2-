public class Studentinfo{
     int number;
     String name;
     void changeNumber(int x){
         x=99;
     }
     void changeName(Student st){
          st.completedCredits=99;
     }
     void replaceStudentName(Student st){
          st= new Student();
          st.name = "Amal";
     }
    static void main(String[] args){
           Studentinfo stin1 = new Studentinfo();
           Student s1 = new Student();
           s1.studentId = "SP26-BAI-050";
           s1.name = "Tehreem Shahid";
           s1.completedCredits= 15;
           System.out.println(s1.studentId);
           System.out.println(s1.name);
           System.out.println(s1.completedCredits);
           int Number = 25;
           stin1.changeNumber(Number);
           System.out.println(Number);
           stin1.changeName(s1);
           stin1.replaceStudentName(s1);
           System.out.println(s1.studentId);
           System.out.println(s1.name);
           System.out.println(s1.completedCredits);
    }

}