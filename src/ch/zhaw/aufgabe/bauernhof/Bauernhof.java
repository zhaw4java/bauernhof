package ch.zhaw.aufgabe.bauernhof;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public abstract class Bauernhof {

	//	HashSet <Tier>stall = new HashSet<Tier>();
	private Set<Tier> stall = new HashSet<Tier>();
	private List<Kuh> kuhstall = new ArrayList<Kuh>();

	public static void main(String[] args) {

	}


	/*
	 * Methode um die Namen und Gewichte der K�he im Kuhstall auf der Konsole ausgeben zu k�nnen (Loop �ber Kuhstall).
	 */
	public void gibGewichtKuh() {
		Collections.sort(kuhstall);
		for (Kuh k : kuhstall) {
			System.out.println(k.getName() + " "
					+ k.getGewicht());
		}

	}

	/*
	 * 
	 * Der Bauernhof hat eine Methode addTier. Damit wird dem Set ein Tier-Objekt hinzugefügt.
	 */
	public void addTier(Tier tier){
		stall.add(tier);
	}


	/*
	 * Der Bauernhof hat eine Methode lautgeben. In dieser Methode wird die gibLaut-Methode jedes Tieres, welches sich im Stall
befindet, aufgerufen (Loop über das Set).
	 */
	public void gibLaut(){
		for (Tier tier : stall) {
			tier.gibLaut();
		}
	}


	public void testgibLaut(){	
		// Iterator wird angefordert
		Iterator it = stall.iterator();
		// HashSet wird mit dem Iterator durchlaufen
		while (it.hasNext())
		{
			// Next gibt das aktuelle HashSet-Objekt zurück 
			// und geht zum nächsten über
			String setText = (String) it.next();
			System.out.println(setText);
		}
	}



}
