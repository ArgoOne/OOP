package obi.zad3;

public class Test {

	public static void main(String[] args) {
		
		Pasazer p1;
		p1 = new Pasazer ("Jan","Kowalski",579029542);
		Lot l1;
		l1 = new Lot ("Warszawa", "Hamburg");
		Bilet b1;
		b1 = new Bilet (2,562);
		
		Pasazer p2;
		p2 = new Pasazer ("Anna","Nowak",67890020);
		Lot l2;
		l2 = new Lot ("Warszawa", "Praga");
		Bilet b2;
		b2 = new Bilet (1,280);
		
		Rezerwacja r1;
		r1 = new Rezerwacja (p1,l1,b1);
		r1.rezerwuj();
		Rezerwacja r2;
		r2 = new Rezerwacja (p2,l2,b2);
		r2.rezerwuj();
	}
}
