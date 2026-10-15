public class Bus{
	private String busNumber;
	private Seat[][] seats;
	public Bus(){
		this("Default Bus",2);
	}
	public Bus(String number, int rows){
		this.busNumber=number;
		int index=1;
		seats = new Seat[rows][4];
		for(int i=0;i<rows;i++){
			for(int j=0;j<4;j++){
				seats[i][j]=new Seat(index);
				index++;
			}
		}
	}
	public void display(){
		System.out.println("Bus Number:"+busNumber);
		for(int i=0;i<seats.length;i++){
			System.out.print("Row "+i+":");
			for(int j=0;j<seats[i].length;j++){
				int seat_No =seats[i][j].getSeat();
				boolean status=seats[i][j].checkStatus();
				if(j==1){
					if(status){
						System.out.printf("%3d{} X ||",seat_No);
					}
					else{
						System.out.printf("%3d{} O ||",seat_No);
					}
				 }
				else{
					if(status){
						System.out.printf("%3d{} X ",seat_No);
					}
					else{
						System.out.printf("%3d{} O ",seat_No);
					}
				}
			}
			System.out.print("\n");	
		}
	}
	public void reserveSeat(int seatNumber){
        	for(int i=0;i<seats.length;i++){
			for(int j=0;j<seats[i].length;j++){
				if(seats[i][j].getSeat()==seatNumber){
					if(seats[i][j].checkStatus()){
						System.out.println("Reserving seat"+seatNumber+": Already Reserved");
					}
					else{
						seats[i][j].reserve();
						System.out.println("Reserving seat"+seatNumber+": Successful");
					}
					return;
				}
			}
		}
		System.out.println("Seat"+seatNumber+"does not exist");
	}
	public int countAvailableSeats(){
		int count=0;
		for(int i=0;i<seats.length;i++){
			for(int j=0;j<seats[i].length;j++){
				boolean status = seats[i][j].checkStatus();
				if(!status){
					count++;
				}
			}
		}
		return count;
	}
	
}