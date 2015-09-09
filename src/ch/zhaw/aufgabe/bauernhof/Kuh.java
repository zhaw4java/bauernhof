package ch.zhaw.aufgabe.bauernhof;

	
public class Kuh implements Tier {

	private int gewicht;
	private String name;
	
	public Kuh(String name,int gewicht) {
		this.gewicht = gewicht;
		this.name =  name;
	}
	
//	 @Override
//	  public int compareTo(Kuh o) {
////	    return this.getName().compareTo(o.getName());
//	    return this.getGewicht() - o.getGewicht();
//	  }
	
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
