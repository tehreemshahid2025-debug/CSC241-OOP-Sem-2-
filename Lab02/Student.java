class Student{
      String studentId;
      String name;
      int completedCredits;
      void addCredits(int credits){
          completedCredits+=credits;
      }
      int remainingCredits(int total){
          return total-completedCredits;
      }
      String summary(){
           String Summary=studentId + " " + name + " " + completedCredits;
           return Summary;
      }
}
