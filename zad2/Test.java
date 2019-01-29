package homework.zad2; //deklaracja pakietu//

public class Test {//deklaracja publicznej klasy: nazwa klasy jest taka sama jak pliku//
	public static void main(String[] args) { // metoda statyczna main tylko w glownej klasie wywo³ywana w trakcie uruchomienia tego pliku//
		Okno okno1 = new Okno(); //utworzenie obiektu okno1//
		Okno okno2 = new Okno(1800,1800,3); //utworzenie obiektu okno2 i zadanie wartosci//
		
		okno1.otworz(); //wyowolanie metody Otworz (do wszystkich z petli klasa Okno) do obiektu okno1//
		okno2.otworz(0); //wywolanie metody Otworz z wartoscia 0 (nr skrzydla) do obiektu okno2//
		okno2.otworz(2); //wywolanie metody Otworz z wartoscia 2 (nr skrzydla) do obiektu okno2//
		
		okno1.wypiszStan(); //wyowolanie metody WypiszStan do obiektu okno1//
		okno2.wypiszStan(); //wyowolanie metody WypiszStan do obiektu okno2//
		
		okno1.zamknij(); //wyowolanie metody Zamknij do obiektu okno1//
		okno2.setDlugosc(2100); //wywolanie metody dostepowej Dlugosc z wartoscia 2100 dla obiektu okno2//
		okno2.zamknij(0); //wyowolanie metody Zamknij z wartoscia 0 do obiektu okno2//
		Klamka kl = new Klamka(); //utworzenie obiektu k1//
		kl.setCzyKluczyk(true); //wywolanie metody dostepowej CzyKluczyk z wartoscia true dla obiektu k1//
		okno2.getSkrzydla()[1].setKlamka(kl); //wywolanie metody zwracajacej wartosc Skrzydla w ustawieniu k1 jako Klamka dla oiektu okno2//
		okno2.getSkrzydla()[2].setKlamka(null); //wywolanie metody zwracajacej wartosc Skrzydla w ustawieniu null jako Klamka dla oiektu okno2//
		
		okno1.wypiszStan(); //wyowolanie metody WypiszStan do obiektu okno1//
		okno2.wypiszStan(); //wyowolanie metody WypiszStan do obiektu okno2//
		
	}
}
