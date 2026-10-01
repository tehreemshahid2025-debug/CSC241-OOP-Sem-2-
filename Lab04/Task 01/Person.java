public class Person{
    private String id = "CII-SP26-BAI-000";
    private String name;
    private String eMail;
    private String date_Of_Birth;
    private String city;
    public Person(String name, String eMail, String date_Of_Birth){
         this(name,eMail,date_Of_Birth,"Unknown");
    }
    public Person(String name, String eMail, String date_Of_Birth,String city){
          setName(name);
          setEmail(eMail);
          setDOB(date_Of_Birth);
          setCity(city);
    }
     public Person(String name, String eMail){
          this(name, eMail,"00-00-0000");
    }
    public void setId(String id){
         this.id=id;
    }
    public void setName(String name){
         this.name=name;
    }
    public void setEmail(String email){
         this.eMail=email;
    } 
    public void setDOB(String date_Of_Birth){
         this.date_Of_Birth=date_Of_Birth;
    } 
    public void setCity(String city){
         this.city=city;
    }
    public String getId(){
         return id;
    }
    public String getName(){
         return name;
    }
    public String getEmail(){
         return eMail;
    } 
    public String getDOB(){
         return date_Of_Birth;
    } 
    public String getCity(){
         return city;
    }
}
