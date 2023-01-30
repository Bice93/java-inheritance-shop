package org.lessons.java.shop;

public class Cuffie extends Prodotto {
	private String color;
	private boolean isWireless;
	
	Cuffie (int numberCode, String name, String brand, double price, int iva, String color, boolean isWireless){
		super(numberCode, name, brand, price, iva);
		
		setColor(color);
		setWireless(isWireless);
		
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isWireless() {
		return isWireless;
	}
	
	public void setWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}
}
