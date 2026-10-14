package model;
import java.util.Random;
public class Pharmacy{
	private Medicine [] stock;
	private int nextIndex;
	public Pharmacy(){
		stock = new Medicine[12];
                int index=0;
		for(Category categ : Category.values()){
			for(Dosage dose : Dosage.values()){
				stock[index]=new Medicine(categ,dose);
				index++;
			}
		}
                
	}
	public void shuffleStock(){
		Random ran = new Random();
                for(int i=0;i<stock.length;i++){
			int j=ran.nextInt(stock.length);
			Medicine temporary=stock[i];
			stock[i]=stock[j];
                        stock[j]=temporary;
		}
	}
	public Medicine dispense(){
		if (nextIndex>=stock.length){
			return null;
		}
		else{
			Medicine box = stock [nextIndex];
			nextIndex++;
			return box;
		}    
	}
	public int getRemainingStock(){
		return stock.length-nextIndex;
	}
}