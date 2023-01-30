package org.lessons.java.shop;

import java.util.Random;

public class Smartphone extends Prodotto{
	private int imeiCode;
	private int storage;
	
	Smartphone(int numberCode, String name, String brand, double price, int iva, int storage){
		super(numberCode, name, brand, price, iva);
		
		setStorage(storage);
	}
	
	public int getImeiCode() {
		Random r = new Random();
		imeiCode = r.nextInt(999999999);
		return imeiCode;
	}
	
	public void setImeiCode(int imeiCode) {
		this.imeiCode = imeiCode;
	}
	
	public int getStorage() {
		return storage;
	}
	
	public void setStorage(int storage) {
		this.storage = storage;
	}
}
