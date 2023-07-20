package PersonaHerencia;

import java.util.ArrayList;

public class Pais { 

  public String nombre;
  ArrayList<String> listaPropiedades = new ArrayList<>();

  public Pais () {
    this.nombre = "Argentina";
  }

  public Pais (String nombre) {
    this.nombre = nombre;
  }

  public ArrayList<String> propiedades() {

    listaPropiedades.add(this.nombre);

    return listaPropiedades;
  }

}
