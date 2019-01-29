package homework.zad2; //deklaracja pakietu//

public class Klamka { //deklaracja publicznej klasy: nazwa klasy jest taka sama jak pliku//
	private boolean czyKluczyk = false; /*inicjacja pola prywatnego 
	czyKluczyk typu boolean wartościa false */
	
	public boolean isCzyKluczyk() { //metoda zwracajaca wartosc czyKluczyk typu boolean//
		return czyKluczyk;
	}
	
	public void setCzyKluczyk(boolean czyKluczyk) { //metoda dostepowa ustawiajaca wartosc pola czyKluczyk//
		this.czyKluczyk = czyKluczyk; //zmienna czyKluczyk zostaje przyslonieta polem o tej samej nazwie//
	}
	
	public String stan() {//deklaracja metody publicznej o nazwie stan typu String//
		return czyKluczyk ? "z kluczem": "bez klucza"; /*zwrócenie odpowiedzi czyKluczyk
		wartościami z kluczem lub bez klucza*/
	}
}//koniec implementacji klasy Klamka//