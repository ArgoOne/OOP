package obi.zad3;

public class Pasazer {

	public String imie;
	public String nazwisko;
	public int pesel;
	private int id;
	private static int licznik = 1;

	public Pasazer(String i, String n, int l) {
		imie = i;
		nazwisko = n;
		pesel = l;
		id = licznik++;
	}

	public String getImie() {
		return imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public int getPesel() {
		return pesel;
	}

	public void setPesel(int pesel) {
		this.pesel = pesel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
