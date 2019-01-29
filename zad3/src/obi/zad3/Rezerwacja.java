package obi.zad3;

public class Rezerwacja {

	private Pasazer pasazer;
	private Lot lot;
	private Bilet bilet;
	public Rezerwacja() {
	}

	public Rezerwacja(Pasazer pasazer, Lot lot, Bilet bilet) {
		this.pasazer = pasazer;
		this.lot = lot;
		this.bilet = bilet;
	}
	
	public void rezerwuj () {
		System.out.println("Rezerwacja dla numer ID: "
				+pasazer.getId()+" "+pasazer.getImie()+" "+pasazer.getNazwisko()+" "
				+pasazer.getPesel());	
		System.out.println("Trasa lotu: "+lot.getSkad()+"-"+lot.getDokad()+" Liczba biletow: "
				+bilet.getLiczba()+" Koszt biletow: "+bilet.getKoszt());
	}
}
