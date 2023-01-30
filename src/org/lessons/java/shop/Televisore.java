package org.lessons.java.shop;

public class Televisore extends Prodotto{
	private double size;
	private boolean isSmart;
	
	Televisore(int numberCode, String name, String brand, double price, int iva, double size, boolean isSmart){
		super(numberCode, name, brand, price, iva);
		
		setSize(size);
		setSmart(isSmart);
		
	}
	
	public double getSize() {
		return size;
	}
	
	public void setSize(double size) {
		this.size = size;
	}
	
	public boolean isSmart() {
		return isSmart;
	}
	
	public void setSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}
	
	
}
