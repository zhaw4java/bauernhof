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
	private Kuh k1;
	private Kuh k2;
	private Kuh k3;
	private Kuh k4;

	
	public void setup(){
		k1 = new Kuh("Else", 300);
	    k2 = new Kuh("Zora", 600);
	    k3 = new Kuh("zora", 600);
	    k4 = new Kuh("Lisa", 650);
	    Bauernhof b = new Bauernhof();

	}
	
	private void addItems() {
		 b.addKuh(k1);
		 b.addKuh(k2);
		 b.addKuh(k3);
		 b.addKuh(k4);

	}

	@Test
	public void testKuh() {
		setup();
		assertEquals("Book", b.kuhAusgeben());
		assertEquals(300, b.kuhAusgeben());
	}



}
