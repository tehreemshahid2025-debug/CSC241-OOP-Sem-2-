public class Main{
	public static void main(String[] args){
		Bus B1 = new Bus("BUS-101",3);
		Bus B2 = new Bus();
		System.out.println("Initial Sitting Arrangement:");
		B1.display();
		int Bus_available=B1.countAvailableSeats();
		System.out.println("Available Seats in Bus 1:"+ Bus_available);
		B1.reserveSeat(2);
		B1.reserveSeat(6);
		B1.reserveSeat(11);
		System.out.println("Updated Sitting Arrangement:");
		B1.display();
		Bus_available=B1.countAvailableSeats();
		System.out.println("Available Seats in Bus 1:"+ Bus_available);
		B2.display();
	        Bus_available=B2.countAvailableSeats();
		System.out.println("Available Seats in Bus 1:"+ Bus_available);
		
	}
}