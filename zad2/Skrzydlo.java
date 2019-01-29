package homework.zad2; //deklaracja pakietu//

public class Skrzydlo { //deklaracja publicznej klasy: nazwa jest taka sama jak pliku//
	private int dlugosc; //pole prywatne dlugosc typu int//
	private int wysokosc; //pole prywatne wysokosc typu int//
	private Klamka klamka; //inicjacja pola klamka z klasy Klamka//
	private boolean otwarte = false; /*inicjacja pola prywatnego 
	otwarte typu boolean wartoœcia false */

	public Skrzydlo(int dlugosc, int wysokosc) { //konstruktor publiczny przyjmujacy argumenty typu int//
		this.dlugosc = dlugosc; //przys³anienie zmiennej przez pole o tej samej nazwie//
		this.wysokosc = wysokosc; //przys³anienie zmiennej przez pole o tej samej nazwie//
	}
	
	public Skrzydlo(int dlugosc, int wysokosc, Klamka klamka) { //konstruktor publiczny przyjmujacy argumenty//
		this(dlugosc,wysokosc); //wywo³anie konstruktora dwuargumentowego dlugosc, wysokosc//
		this.klamka = klamka; //przys³anienie zmiennej przez pole o tej samej nazwie//
	}

	public int getDlugosc() { //publiczna metoda zwracajaca wartosc wysokosc typu int//
		return dlugosc;
	}
	
	public void setDlugosc(int dlugosc) { //publiczna metoda dostêpowa ustawiaj¹ca wartosc pola dlugosc //
		this.dlugosc = dlugosc; //zmienna dlugosc zostaje przyslonieta polem o tej samej nazwie//
	}
	
	public int getWysokosc() { //publiczna metoda zwracajaca wartosc wysokosc typu int//
		return wysokosc;
	}
	
	public void setWysokosc(int wysokosc) { //publiczna metoda dostêpowa ustawiaj¹ca wartosc pola wysokosc //
		this.wysokosc = wysokosc; //zmienna wysokosc zostaje przyslonieta polem o tej samej nazwie//
	}
	
	public Klamka getKlamka() { //publiczna metoda zwracajaca wartosc klamka z klasy Klamka//
		return klamka;
	}
	
	public void setKlamka(Klamka klamka) { //publiczna metoda dostêpowa ustawiaj¹ca wartosc pola klamka //
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
