package org.exceptions.books;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Book[] books = new Book[1];
		
		String titolo, autore, editore;
		
		int numeroPagine;
		
		Scanner s = new Scanner(System.in);
		
		try {
			for (int i = 0; i < books.length; i++) {
					System.out.print("Inserire titolo libro: ");
					titolo = s.nextLine();
					
					System.out.print("Inserire pagine libro: ");
					numeroPagine = Integer.parseInt(s.nextLine());
					
					System.out.print("Inserire autore libro: ");
					autore = s.nextLine();
					
					System.out.print("Inserire editore libro: ");
					editore = s.nextLine();
						
					books[i] = new Book(titolo, autore, editore, numeroPagine);
					books[i].verificaTitolo(titolo);
				
			}
		} catch (Exception e) {
			System.out.println( e.getMessage());
		}	
		
		for (int i = 0; i < books.length; i++) {
			System.out.println("Titolo: " + books[i].getTitolo() +" "+ "Pagine: " + books[i].getNumeroPagine() + " " + "Autore: " + books[i].getAutore() + " " + "Editore: " + books[i].getEditore());
		}
		
		s.close();
	}
	
}
