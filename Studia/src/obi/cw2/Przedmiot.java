package obi.cw2;

public class Przedmiot {
		
		public String nazwa;
		public String prowadzacy;
		
		public Przedmiot (String n, String p){
			nazwa = n;
			prowadzacy = p;
		}

		public String getNazwa() {
			return nazwa;
		}

		public void setNazwa(String nazwa) {
			this.nazwa = nazwa;
		}

		public String getProwadzacy() {
			return prowadzacy;
		}

		public void setProwadzacy(String prowadzacy) {
			this.prowadzacy = prowadzacy;
		}
	
}
