public class Seat{
	private int seatNumber;
	private boolean reserved;
	public Seat(int seat){
		this.seatNumber=seat;
		this.reserved = false;
	}
	public boolean reserve(){
		this.reserved=true;
		return true;
	}
	public boolean checkStatus(){
		return reserved;
	}
	public int getSeat(){
		return this.seatNumber;
	}
}