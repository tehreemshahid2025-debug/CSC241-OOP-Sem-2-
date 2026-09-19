public class Student1{
    int completedCredits;
    String studentId;  
    String name;
    void addCredits(int c){
       completedCredits+=c;;
    }
    void addCredits(int c, int bonus){
        completedCredits+=c+bonus;
    }
    int remainingCredits(int total){
        return total-completedCredits;
    }
}