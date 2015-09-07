package ch.zhaw.aufgabe.bauernhof;

	
public class Kuh implements Tier {

	private int gewicht;
	private String name;
	
	public Kuh(int gewicht, String name) {
		this.gewicht = gewicht;
		this.name =  name;
	}
	
	@Override
	public void gibLaut() {
		System.out.println("muuhh");
	}

	public int getGewicht() {
		return gewicht;
	}

	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
