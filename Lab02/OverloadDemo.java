public class OverloadDemo{
     public static void main(String[] args){
          Overload d1 = new Overload();
          // d1.enroll("CSC241","A"); (OverloadDemo.java:4: error: incompatible types: String cannot be converted to int   d1.enroll("CSC241","A");)
          // d1.enroll(241, 1); (OverloadDemo.java:5: error: incompatible types: int cannot be converted to String)  d1.enroll(241, 1);
          d1.enroll("CSC241");
          d1.enroll("CSC241",1);
          d1.enroll(241);
         
     }
}
     