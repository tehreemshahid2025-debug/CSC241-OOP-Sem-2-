public class Date{
	
	private int day; //1-31
	private int month; //1-12 
 	private int year;  // +ve

	
	Date(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public String toString(){
	 	return String.format("%d-%d-%d",day,month,year);
	}


}