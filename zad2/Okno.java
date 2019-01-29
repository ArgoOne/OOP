package homework.zad2; //deklaracja pakietu//

public class Okno {//deklaracja publicznej klasy: nazwa klasy jest taka sama jak pliku//
	private int dlugosc; //pole prywatne dlugosc typu int//
	private int wysokosc; //pole prywatne wysokosc typu int//
	private int liczbaSkrzydel; //pole prywatne liczbaSkrzydel typu int//
	private Skrzydlo[] skrzydla; //tablica prywatna Skrzydlo//
	
	public Okno(int d, int w, int lSkrzydel){//konstruktor publiczny przyjmujacy argumety typu int//
		dlugosc = d; // ustawienie pola dlugosc przy pomocy pierwszego argumentu//
		wysokosc = w; // ustawienie pola wysokosc przy pomocy drugiego argumentu//
		liczbaSkrzydel = lSkrzydel; // ustawienie pola liczbaSkrzydel przy pomocy trzeciego argumentu//
		
		skrzydla = new Skrzydlo[lSkrzydel]; //ustawienie skrzyde³ nowym obiektem reprezentuj¹cym//
		for(int i=0;i<lSkrzydel;i++){ /*pêtla dla wartosci poczatkowej =0,
		 bedacej mniejszej niz lSkrzydel, zwiekszajacej sie o 1 */
			skrzydla[i] = new Skrzydlo(d/lSkrzydel,w, new Klamka()); /*tablica dla liczby porz¹dkowej skrzydla=0,1.. 
		nowa wartosc Skrzydlo zawierajaca wartosci iloraz dlugosc i lSkrzydel, wysokosc oraz nowa wartosc
		odwolujaca sie do klasy Klamka*/
		}
	}
	
	public Okno(int d, int w, Skrzydlo[] sk){ //konstruktor publiczny przyjmujacy argumety typu int //
		dlugosc = d; // ustawienie pola dlugosc przy pomocy pierwszego argumentu//
		wysokosc = w; // ustawienie pola wysokosc przy pomocy drugiego argumentu//
		liczbaSkrzydel = sk.length; //nie jest wykorzystane w podanym konstruktorze//
		skrzydla = sk; //ustawienie pola skrzydla przy pomocy trzeciego argumentu//
	}	
	
	public Okno(int d, int w){ //konstruktor publiczny Okno o wartosciach d,w typu int//
		this(d,w,1); //wywo³anie innego konstruktora z wartoscia liczby skrzydel=1//
	}	
	public Okno(){ //konstruktor publiczny Okno//
		this(1200,1500,1); //wywo³anie innego konstruktora z wartoœciami d=1200, w=1500, lSkrzydel=1//
	}
	
	public int getDlugosc() { //publiczna metoda zwracajaca wartosc dlugosc typu int//
		return dlugosc; //zwrocenie wartosci dlugosc//
	}
	
	public void setDlugosc(int dlugosc) { //metoda dostêpowa ustawiaj¹ca wartosc pola dlugosc //
		this.dlugosc = dlugosc; //zmienna dlugosc zostaje przyslonieta polem o tej samej nazwie//
		
		for(int i=0;i<liczbaSkrzydel;i++){ /*pêtla dla wartosci poczatkowej =0,
			 bedacej mniejszej niz lSkrzydel, zwiekszajacej sie o 1 */
			skrzydla[i].setDlugosc(dlugosc/liczbaSkrzydel); /*tablica dla liczby porz¹dkowej skrzydla=0,1.. 
			zwrocenie wartosci Dlugosc bêd¹cej ilorazem dlugosc i liczbaSkrzydel*/
		}
	}
	
	public int getWysokosc() { //metoda zwracajaca wartosc Wysokosc typu int//
		return wysokosc; 
	}
	
	public void setWysokosc(int wysokosc) { //metoda dostepowa ustawiajaca wartosc pola wysokosc//
		this.wysokosc = wysokosc; //zmienna wysokosc zostaje przyslonieta polem o tej samej nazwie//
		for(int i=0;i<liczbaSkrzydel;i++){ /* pêtla dla wartosci poczatkowej =0,
			mniejszej niz liczbaSkrzydel, zwiekszajacej sie o 1 */
			skrzydla[i].setWysokosc(wysokosc); 
		}
	}
	
	public int getLiczbaSkrzydel() { //metoda publiczna zwracajaca wartosc LiczbaSkrzydel typu int//
		return liczbaSkrzydel;
	}
	
	public Skrzydlo[] getSkrzydla() {
		return skrzydla;
	}

	public void otworz(){ //metoda publiczna nie zwracj¹ca niczego//
		for(int i=0;i<liczbaSkrzydel;i++){ /* pêtla dla wartosci poczatkowej =0,
			 mniejszej niz liczbaSkrzydel, zwiekszajacej sie o 1 */
			skrzydla[i].setOtwarte(true); //ustawienie wartosci true//
		}
	}
	
	public void otworz(int nrSkrzydla){ //metoda zwracajaca wartosc nrSkrzydla typu int//
		if(nrSkrzydla > skrzydla.length) return; //warunek zwrocenie wartosci//
		skrzydla[nrSkrzydla].setOtwarte(true); //ustawienie wartosci true //
	}
	
	public void zamknij(){ //metoda publiczna nie zwracj¹ca niczego//
		for(int i=0;i<liczbaSkrzydel;i++){ /* pêtla dla wartosci poczatkowej =0,
			 mniejszej niz liczbaSkrzydel, zwiekszajacej sie o 1 */
			skrzydla[i].setOtwarte(false); //ustawienie wartosci false//
		}
	}
	
	public void zamknij(int nrSkrzydla){ //metoda zwracajaca wartosc nrSkrzydla typu int//
		if(nrSkrzydla > skrzydla.length) return; //warunek zwrocenie wartosci//
		skrzydla[nrSkrzydla].setOtwarte(false); //ustawienie wartosci false//
	}
	
	public void wypiszStan() { //metoda publiczna nie zwracj¹ca niczego//
		String tekst = "";
		for(int i=0;i<liczbaSkrzydel;i++){ /* pêtla dla wartosci poczatkowej =0,
			 mniejszej niz liczbaSkrzydel, zwiekszajacej sie o 1 */
			tekst += "["+skrzydla[i].stan()+"]"; //co ma byæ wyœwietlane//
		}
		System.out.println(tekst); //Wyœwietlenie na konsoli informacji//
	}
}
