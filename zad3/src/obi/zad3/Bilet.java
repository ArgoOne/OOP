package obi.zad3;

public class Bilet {
	
	public int liczba;
	public double cenaBiletu;
	public double Koszt;
	
 public Bilet (int l, double c) {
		
		liczba=l;
		cenaBiletu=c;
		Koszt=l*c;
	}

	public int getLiczba() {
		return liczba;
	}

	public double getCenaBiletu() {
		return cenaBiletu;
	}

	public double getKoszt() {
		return Koszt;
	}	
}

