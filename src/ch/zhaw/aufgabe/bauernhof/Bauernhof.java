package ch.zhaw.aufgabe.bauernhof;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import ch.zhaw.aufgabe.bauernhof.KuhComparator.KuhSort;


public class Bauernhof {

	//	HashSet <Tier>stall = new HashSet<Tier>();
	private Set<Tier> stall = new HashSet<Tier>();
	private List<Kuh> kuhstall = new ArrayList<Kuh>();


	public void kuhAusgeben() {
		Collections.sort(kuhstall, new KuhComparator(KuhSort.NAME));
		for (Kuh k : kuhstall) {
			System.out.println(k.getName() + " "
					+ k.getGewicht());
		}
	}

	public void addTier(Tier tier){
		stall.add(tier);
	}
	
	public void addKuh(Kuh kuh){
		kuhstall.add(kuh);
	}


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
