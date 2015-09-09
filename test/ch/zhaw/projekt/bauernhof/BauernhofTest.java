package ch.zhaw.projekt.bauernhof;

import static org.junit.Assert.*;

import org.junit.Test;

import ch.zhaw.aufgabe.bauernhof.Bauernhof;
import ch.zhaw.aufgabe.bauernhof.Hund;
import ch.zhaw.aufgabe.bauernhof.Katze;
import ch.zhaw.aufgabe.bauernhof.Kuh;
import ch.zhaw.aufgabe.bauernhof.Tier;

public class BauernhofTest {
	
	private Bauernhof b;

	
	public void setup(){
	    Tier katze = new Katze();
	    Tier hund = new Hund();
	    Tier kuh = new Kuh("Elsa", 750);
	    Tier katze2 = new Katze();
	    
	    Bauernhof b = new Bauernhof();
	    
	    b.addKuh(new Kuh("Elsa", 700));
	    b.addKuh(new Kuh("Lisa", 650));
	    b.addKuh(new Kuh("Anneliese", 800));
	    
	    b.kuhAusgeben();
	    
	    b.addTier(katze);
	    b.addTier(hund);
	    b.addTier(kuh);
	    b.addTier(katze2);
	}

	@Test
	public void testKuh() {
		assertEquals("Elsa", b.getClass());
	}

}
