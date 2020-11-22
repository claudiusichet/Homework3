package homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import activity.Hobby;
import comparators.AgeComparator;
import comparators.NameComparator;
import entity.Adresa;
import entity.Persoana;

public class Main {

  public static void main(String[] args) {
    Comparator<Persoana> nameComparator = new NameComparator();
    Comparator<Persoana> ageComparator = new AgeComparator();
    Comparator<Persoana> persoanaComparator = nameComparator.thenComparing(ageComparator);

    TreeSet<Persoana> persoane = new TreeSet<>(persoanaComparator);

    Persoana jd1 = new Persoana("John Doe", 30);
    Persoana jd2 = new Persoana("John Doe", 25);
    Persoana jd3 = new Persoana("John Doe", 32);
    Persoana jj = new Persoana("John Jones", 50);
    Persoana ja = new Persoana("John Atkins", 18);
    Persoana tt = new Persoana("Tim Tom", 55);


    persoane.add(tt);
    persoane.add(jd1);
    persoane.add(jd2);
    persoane.add(jd3);
    persoane.add(jj);
    persoane.add(ja);

    for (Persoana persoana : persoane) {
      System.out.println(persoana.toString());
    }

    Map<Persoana, List<Hobby>> hobbies = new HashMap<Persoana, List<Hobby>>();

    hobbies.put(tt, Arrays.asList(new Hobby("Football", 2, Arrays.asList(new Adresa("400405", "str. Petofi Sandor", "20/a"), new Adresa("400405", "str. Nagy Sandor", "10/a"))), new Hobby("Surf", 2, Arrays.asList(new Adresa("400405", "str. Petofi Sandor", "20/a")))));
    hobbies.put(jd1, Arrays.asList(new Hobby("Football", 4, Arrays.asList(new Adresa("400405", "str. Petofi Sandor", "20/a"))), new Hobby("Bowling", 1, Arrays.asList(new Adresa("400405", "str. Petofi Sandor", "20/a")))));

    for (Map.Entry<Persoana, List<Hobby>> entry : hobbies.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
  }

}
