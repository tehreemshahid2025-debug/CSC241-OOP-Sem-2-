class Overload{
    // enroll(String)
     void enroll(String courseCode) {
          System.out.println("Enrolled in course" + courseCode);
     } 
    // enroll(String,int)
     void enroll(String courseCode, int section) {
          System.out.println("Enrolled in course" + courseCode +"in section" + section);
     } 
    // enroll(int)
     void enroll(int numericCourseCode) {
          System.out.println("Enrolled in course with numeric code" + numericCourseCode);
     }
}