package org.lessons.java.shop;


public class Prodotto {
	
		//Caratteristiche prodotto
		private int numberCode;
		private String name;
		private String brand;
		private double price;
		private int iva;
		
		//Costruttore
		public Prodotto(int numberCode, String name, String brand, double price, int iva) {
			this.numberCode = numberCode;
			setName(name);
			setBrand(brand);
			setPrice(price);
			setIva(iva);
		};
		
		// Getter e setter
		
		public int getNumberCode() {
			return  numberCode;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getBrand() {
			return brand;
		}
		
		public void setBrand(String brand) {
			this.brand = brand;
		}
		
		public double getPrice() {
			return price;
		}
		
		public void setPrice(double price) {
			this.price = price;
		}
		
		public int getIva() {
			return iva;
		}
		
		public void setIva(int iva) {
			this.iva = iva;
		}
		
		public double getPriceIva() {
			return price + ((price * iva)/100);
		}
		
		public String stringProduct() {
					return "Codice: " + getNumberCode()
					+ " - Nome: " + getName()
					+ " - Brand: " + getBrand()
					+ " - Prezzo: " + getPrice()
					+ " - IVA: " + getIva()
					+ " - Prezzo con iva: " + getPriceIva() + "€";
		}
		
}
