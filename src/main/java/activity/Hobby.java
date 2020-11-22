package activity;

import java.util.ArrayList;
import java.util.List;

import entity.Adresa;

public class Hobby {

  private String name;
  private int frequency;
  private List<Adresa> adresses = new ArrayList<Adresa>();

  public Hobby(String name, int frequency, List<Adresa> adresses) {
    super();
    this.name = name;
    this.frequency = frequency;
    this.adresses = adresses;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getFrequency() {
    return frequency;
  }

  public void setFrequency(int frequency) {
    this.frequency = frequency;
  }

  public List<Adresa> getAdresses() {
    return adresses;
  }

  public void setAdresses(List<Adresa> adresses) {
    this.adresses = adresses;
  }

  @Override
  public String toString() {
    return "Hobby [name=" + name + ", frequency=" + frequency + ", Adresses=" + adresses + "]";
  }

}
