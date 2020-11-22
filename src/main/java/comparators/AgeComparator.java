package comparators;

import java.util.Comparator;

import entity.Persoana;

public class AgeComparator implements Comparator<Persoana> {

  @Override
  public int compare(Persoana o1, Persoana o2) {
    return o1.getVarsta() - o2.getVarsta();
  }

}
