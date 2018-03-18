package biblioteka;

public class Autor {
	String ime;
	String prezime;

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	@Override
	public String toString() {
		return "Autor:[ Ime :" + getIme() + ", prezime: " + getPrezime() + "].";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Autor) {
			Autor a = new Autor();
			a = (Autor) obj;
			if (a.getPrezime().equals(prezime) && a.getIme().equals(ime))
				return true;
		}
		return false;

	}

}
