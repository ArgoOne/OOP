package homework.zad2; //deklaracja pakietu//

public class Skrzydlo { //deklaracja publicznej klasy: nazwa jest taka sama jak pliku//
	private int dlugosc; //pole prywatne dlugosc typu int//
	private int wysokosc; //pole prywatne wysokosc typu int//
	private Klamka klamka; //inicjacja pola klamka z klasy Klamka//
	private boolean otwarte = false; /*inicjacja pola prywatnego 
	otwarte typu boolean wartościa false */

	public Skrzydlo(int dlugosc, int wysokosc) { //konstruktor publiczny przyjmujacy argumenty typu int//
		this.dlugosc = dlugosc; //przysłanienie zmiennej przez pole o tej samej nazwie//
		this.wysokosc = wysokosc; //przysłanienie zmiennej przez pole o tej samej nazwie//
	}
	
	public Skrzydlo(int dlugosc, int wysokosc, Klamka klamka) { //konstruktor publiczny przyjmujacy argumenty//
		this(dlugosc,wysokosc); //wywołanie konstruktora dwuargumentowego dlugosc, wysokosc//
		this.klamka = klamka; //przysłanienie zmiennej przez pole o tej samej nazwie//
	}

	public int getDlugosc() { //publiczna metoda zwracajaca wartosc wysokosc typu int//
		return dlugosc;
	}
	
	public void setDlugosc(int dlugosc) { //publiczna metoda dostępowa ustawiająca wartosc pola dlugosc //
		this.dlugosc = dlugosc; //zmienna dlugosc zostaje przyslonieta polem o tej samej nazwie//
	}
	
	public int getWysokosc() { //publiczna metoda zwracajaca wartosc wysokosc typu int//
		return wysokosc;
	}
	
	public void setWysokosc(int wysokosc) { //publiczna metoda dostępowa ustawiająca wartosc pola wysokosc //
		this.wysokosc = wysokosc; //zmienna wysokosc zostaje przyslonieta polem o tej samej nazwie//
	}
	
	public Klamka getKlamka() { //publiczna metoda zwracajaca wartosc klamka z klasy Klamka//
		return klamka;
	}
	
	public void setKlamka(Klamka klamka) { //publiczna metoda dostępowa ustawiająca wartosc pola klamka //
		this.klamka = klamka; //zmienna klamka zostaje przyslonieta polem o tej samej nazwie/
	}
	
	public boolean isOtwarte() { //publiczna metoda zwracajaca wartosc Otwarte typu boolean//
		return otwarte;
		
	}
	public void setOtwarte(boolean otwarte) { //publiczna metoda dostepowa ustawiajaca wartosc pola otwarte//
		this.otwarte = otwarte; //zmienna otwarte zostaje przyslonieta polem o tej samej nazwie//
	}
	
	public String stan() { //deklaracja metody publicznej o nazwie stan typu String//
		String wymiary = dlugosc+"x"+wysokosc; //deklaracja pola wymiary//
		String otwarcie = otwarte ? "otwarte" : "zamkniete"; //deklaracja pola otwarcie//
		String stanKlamki = klamka!= null ? klamka.stan() : "bez klamki"; //deklaracja pola stanKlamki//
		return wymiary  +" "+ otwarcie +" "+ stanKlamki; //zwracanie wartosci//
	}
}