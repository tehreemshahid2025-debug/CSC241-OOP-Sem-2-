package model;
public class Ward{
	private Pharmacy pharma;
	private Patient[] pati;
	public Ward(Patient[] pati){
                this.pati = pati;
		pharma = new Pharmacy();
		pharma.shuffleStock();
	}
	public void issueMeds(){
		for(int i=0;i<3;i++){
			for(int j=0;j<pati.length;j++){
				Medicine med =pharma.dispense();
				pati[j].addMedicine(med);
			}
		}
	}
	public void showMeds(){
		for(int i=0; i< pati.length;i++){
			String name= pati[i].getName();
			System.out.println("Patient Name:"+name);
			for(int j=0; j<pati[i].getMedCount();j++){
				pati[i].getPrescription(j).display();
			}
		}
	}
}