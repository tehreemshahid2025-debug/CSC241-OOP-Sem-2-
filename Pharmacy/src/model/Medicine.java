package model;
public class Medicine{
	private Category cate;
	private Dosage dose;
	public Medicine(Category cat,Dosage dos){
		this.cate=cat;
		this.dose=dos;
	}
	public Category getCategory(){return cate;}
	public Dosage getDosage(){return dose;}
	public void display(){
		System.out.println(cate+" : "+dose);
	}
}