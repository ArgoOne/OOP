package obi.cw3;

public class Drukarka {

	private String nazwa;
	private static int licznik = 1;
	private int id;
	private int strony;
	private int toner;

	public Drukarka(String n, int s){
		nazwa = n;
		id = licznik ++;	
		strony = s;
		
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	int getId() {
		return id;
	}
	
	{
		this.id = licznik+1;
	}
	
	public int getStrony() {
		return strony;
	}
	public void setStrony(int strony) {
		this.strony = strony;
	}
	public int getToner() {
		return toner;
	}
	public void setToner(int toner) {
		this.toner = toner;
		
	}
	public void drukuj(){
		 strony--;
		 toner++;
	 }
		
	}


