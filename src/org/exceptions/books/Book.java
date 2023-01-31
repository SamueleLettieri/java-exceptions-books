package org.exceptions.books;

public class Book {

	private String titolo, autore, editore;
	
	private int numeroPagine;

	public Book(String titolo, String autore, String editore, int numeroPagine) throws Exception {
		super();
		this.titolo = titolo;
		verificaTitolo(titolo);
		this.autore = autore;
		verificaAutore(autore);
		this.editore = editore;
		verificaEditore(editore);
		this.numeroPagine = numeroPagine;
		verificaNumeroPagine(numeroPagine);
	}
	
	public void setTitolo ( String titolo) throws Exception {
		verificaTitolo(titolo);
		
		this.titolo = titolo;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	
	public void setNumeroPagine ( int numeroPagine) throws Exception {
		verificaNumeroPagine(numeroPagine);
		
		this.numeroPagine = numeroPagine;
	}
	
	public int getNumeroPagine() {
		return numeroPagine;
	}
	
	
	public void setAutore ( String autore) throws Exception {
		verificaAutore(autore);
		
		this.autore = autore;
	}
	
	public String getAutore() {
		return autore;
	}
	
	
	public void setEditore ( String editore) throws Exception {
		verificaEditore(editore);
		
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
	
	public void verificaNumeroPagine(int numeroPagine) throws Exception {
		if (numeroPagine <= 0) {
			throw new Exception("NumeroPagine non valido");
		}
		
		this.numeroPagine = numeroPagine;
	}
	
	public void verificaAutore(String autore) throws Exception {
		if (autore.length() <= 0) {
			throw new Exception("Autore non valido");
		}
		
		this.autore = autore;
	}
	
	public void verificaEditore(String editore) throws Exception {
		if (editore.length() <= 0) {
			throw new Exception("Editore non valido");
		}
		
		this.editore = editore;
	}
	
	
	
	
}
