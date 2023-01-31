package org.exceptions.books;

public class Book {

	private String titolo, autore, editore;
	
	private int numeroPagine;

	public Book(String titolo, String autore, String editore, int numeroPagine) throws Exception {
		super();
		this.titolo = titolo;
		verificaTitolo(titolo);
		this.autore = autore;
		this.editore = editore;
		this.numeroPagine = numeroPagine;
	}
	
	public void setTitolo ( String titolo) throws Exception {
		verificaTitolo(titolo);
		
		this.titolo = titolo;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	
	public void setNumeroPagine ( int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}
	
	public int getNumeroPagine() {
		return numeroPagine;
	}
	
	
	public void setAutore ( String autore) {
		this.autore = autore;
	}
	
	public String getAutore() {
		return autore;
	}
	
	
	public void setEditore ( String editore) {
		this.editore = editore;
	}
	
	public String getEditore() {
		return editore;
	}
	
	public void verificaTitolo(String titolo) throws Exception {
		if (titolo.length() <= 0) {
			throw new Exception("Titolo non valido");
		}
		
		this.titolo = titolo;
	}
	
	
}
