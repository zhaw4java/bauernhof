package ch.zhaw.aufgabe.bauernhof;

import java.util.Comparator;


public class KuhComparator implements Comparator<Kuh> {

  private KuhSort sort;
  
  public KuhComparator(KuhSort sort) {
    this.sort = sort;
  }
  
  @Override
  public int compare(Kuh o1, Kuh o2) {
    
    switch(sort) {
      case GEWICHT: return o1.getGewicht() - o2.getGewicht();
      case NAME: return o1.getName().compareTo(o2.getName());
      default: return o1.getGewicht() - o2.getGewicht();
    }
  
  }
  
  public enum KuhSort {
    NAME, GEWICHT
  }

}

