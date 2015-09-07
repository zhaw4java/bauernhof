package ch.zhaw.aufgabe.bauernhof;

import java.util.HashSet;
import java.util.Set;

public abstract class Bauernhof {
	
//	HashSet <Tier>stall = new HashSet<Tier>();
	private Set<Tier> stall = new HashSet<Tier>();
//	private List<Kuh> kuhstall = new ArrayList<Kuh>();
	  
	public static void main(String[] args) {
		
	}
	
	public void addTier(Tier tier){
		stall.add(tier);
	}
	
	
	public void gibLaut(){
		for (Tier tier : stall) {
		      tier.gibLaut();
		    }
	}
	
	

}
