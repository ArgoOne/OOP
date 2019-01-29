package obi.cw3;

public class Test {

	public static void main(String[] args) {
	
		Drukarka d1, d2, d3;
		
		d1 = new Drukarka ("Canon", 45);
		
		System.out.println(d1.getNazwa()+" "+d1.getId()+" "+d1.getStrony());
		
		d2 = new Drukarka ("HP", 67);
		
		System.out.println(d2.getNazwa()+" "+d2.getId()+" "+d2.getStrony());
		
		d3 = new Drukarka ("Nex", 81);
		
		System.out.println(d3.getNazwa()+" "+d3.getId()+" "+d3.getStrony());
		
		d1.drukuj();
		d2.drukuj();
		d3.drukuj();
		
		System.out.println(d1.getNazwa()+" "+d1.getId()+" "+d1.getStrony()+" "+d1.getToner());
		System.out.println(d2.getNazwa()+" "+d2.getId()+" "+d2.getStrony()+" "+d2.getToner());
		System.out.println(d3.getNazwa()+" "+d3.getId()+" "+d3.getStrony()+" "+d3.getToner());
	}

}
