package org.lessons.java.shop;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Prodotto[] catalogo = new Prodotto[4];
		
		for (int i = 0; i < catalogo.length; i++) {
			System.out.println("Che tipo di prodotto vuoi inserire?");
			System.out.println("* Televisore");
			System.out.println("* Smartphone");
			System.out.println("* Cuffie");
			System.out.println();
			String category = s.nextLine();
			category = category.substring(0, 1).toUpperCase() + category.substring(1);

			
			System.out.println("Inserire Codice Prodotto: ");
			int numberCode = Integer.parseInt(s.nextLine());
			
			System.out.println("Inserire Nome Prodotto: ");
			String name = s.nextLine();
			
			System.out.println("Inserire Marca Prodotto: ");
			String brand = s.nextLine();
			
			System.out.println("Inserire Prezzo Prodotto: ");
			double price = Double.parseDouble(s.nextLine());
			
			System.out.println("Inserire l'IVA Prodotto: ");
			int iva = Integer.parseInt(s.nextLine());
			
			if (category.equals("Televisore")) {
				
				System.out.println("Inserire dimensione Prodotto: ");
				double size = Double.parseDouble(s.nextLine());
				
				System.out.println("Il prodotto è Smart? ");
				boolean isSmart = Boolean.parseBoolean(s.nextLine());
				
				catalogo[i] = new Televisore (numberCode, name, brand, price, iva, size, isSmart);
				
			} else if (category.equals("Smartphone")) {
				
				System.out.println("Inserire la quantità di memoria del Prodotto: ");
				int storage = Integer.parseInt(s.nextLine());
				
				catalogo[i] = new Smartphone (numberCode, name, brand, price, iva, storage);
			} else if (category.equals("Cuffie")) {
				System.out.println("Inserire il Colore Prodotto: ");
				String color = s.nextLine();
				
				System.out.println("Il prodotto è Wireless? ");
				boolean isWireless = Boolean.parseBoolean(s.nextLine());
				
				catalogo[i] = new Cuffie (numberCode, name, brand, price, iva, color, isWireless);
				
			}
			
		}
		
		System.out.println("Catalogo Prodotti: ");
		System.out.println();
		
		for (int j = 0; j < catalogo.length; j++) {
			System.out.println(catalogo[j].stringProduct());
			System.out.println();
			System.out.println("****");
			System.out.println();
		}
		
		s.close();
	}

}
