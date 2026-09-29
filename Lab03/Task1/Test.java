public class Test{
   public static void main(String args[]){
       System.out.println("Application to find Maximum number");
       FindMax F1 = new FindMax();
       System.out.println(F1.max(18,8.1));// 18 converts to double as per the higher type
       System.out.println(F1.max(1.7,8.1));
       System.out.println(F1.max("Abeer","Alishba"));
       System.out.println(F1.max(18,'c'));  // primitive types are interconvertable
       System.out.println(F1.max(18,81));  // in case of no compatible type it looks for upper type in case of integer its long
       System.out.println(F1.max(18.0f,81.0f)); // only when f is written float type is called
       System.out.println(F1.max(18.0,81.0f)); // double type is called
       // For byte only when an array of bytes pass one of its vaue it looks for byte or short types  
       // Always looks for higher precedence in same type and if not found looks for other types in higher precedence
       // Character if no method with this type found it uses the ASCI value behind it in integer type
      
   }
}