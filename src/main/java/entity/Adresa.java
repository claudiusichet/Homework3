package entity;

public class Adresa {

  private String codPostal;
  private String strada;
  private String numar;
  
  public Adresa(String codPostal, String strada, String numar) {
    super();
    this.codPostal = codPostal;
    this.strada = strada;
    this.numar = numar;
  }

  public String getCodPostal() {
    return codPostal;
  }

  public String getStrada() {
    return strada;
  }

  public String getNumar() {
    return numar;
  }

  @Override
  public String toString() {
    return "Adresa [codPostal=" + codPostal + ", strada=" + strada + ", numar=" + numar + "]";
  }
  
}
