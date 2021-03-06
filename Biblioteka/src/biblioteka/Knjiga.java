package biblioteka;

import java.util.LinkedList;

public class Knjiga {
	String naslov;
	String isbn;
	LinkedList<Autor> autori;
	String izdavac;
	String izdanje;

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getIzdavac() {
		return izdavac;
	}

	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}

	public String getIzdanje() {
		return izdanje;
	}

	public void setIzdanje(String izdanje) {
		this.izdanje = izdanje;
	}

	@Override
	public String toString() {
		return "Knjiga: [ Naslov: " + naslov + ", isbn: " + isbn + "].";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Knjiga) {
			Knjiga k = (Knjiga) obj;
			if (k.getNaslov().equals(naslov) && k.getIsbn().equals(isbn))
				return true;
		}
		return false;
	}
}
