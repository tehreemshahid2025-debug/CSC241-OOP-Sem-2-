package model;
public class Patient{
	private String name;
	private Medicine[] prescription;
	private int medCount;
	public Patient(String name){
		this.name=name;
		prescription = new Medicine[3];
		medCount=0;
		
	}
	public void addMedicine(Medicine med){
		if (medCount<prescription.length){
	       		prescription[medCount]=med;
			medCount++;
		}
	}
 	public String getName(){return name;}
	public int getMedCount(){return medCount;}
        public Medicine getPrescription(int x){return prescription[x];}
}