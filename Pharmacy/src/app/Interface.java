package app;
import model.*;
public class Interface{
	public static void main(String[] args){
		Patient P1 = new Patient("Arslan Mumtaz");
		Patient P2 = new Patient("Awais Zahoor");
		Patient P3 = new Patient("Zunnurain Zahid");
		Patient[]  patients = {P1,P2,P3};
        	Ward W1 = new Ward(patients);
		W1.issueMeds();
		W1.showMeds();
	}
}