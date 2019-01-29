package obi.cw2;

public class Test {

	public static void main(String[] args) {
		
		Przedmiot p,r;
		
		p = new Przedmiot ("Podstawy Java", "Kwiatkowski");

		System.out.println(p.getNazwa() + " " +  p.getProwadzacy());
				
		r = new Przedmiot ("Informatyka", "Warecki");

		System.out.println(r.getNazwa() + " " +  r.getProwadzacy());
	}

}
