package entity;

import java.util.Objects;

public class Persoana {
  private String nume;
  private int varsta;

  public Persoana(String nume) {
    this(nume, 10);
  }

  public Persoana(String nume, int varsta) {
    this.nume = nume;
    this.varsta = varsta;
  }

  public String getNume() {
    return nume;
  }

  public int getVarsta() {
    return varsta;
  }

  @Override
  public String toString() {
    return "Persoana{" +
        "nume='" + nume + '\'' +
        "varsta='" + getVarsta() + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Persoana persoana = (Persoana) o;
    return varsta == persoana.varsta &&
        Objects.equals(nume, persoana.nume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nume, varsta);
  }
}
