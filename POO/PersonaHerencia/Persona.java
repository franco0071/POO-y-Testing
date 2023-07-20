package PersonaHerencia;

import java.util.ArrayList;

public class Persona { 

  public String nombre;
  public Integer edad;
  String nombrePais;
  public Pais pais;
  ArrayList<String> listaPropiedades = new ArrayList<>();

  public Persona () {
    this.nombre = "Fulano";
    this.edad = 18;
    this.pais = new Pais();
  }

  public Persona (String nombre, Integer edad) {
    this.nombre = nombre;
    this.edad = edad;
    this.pais = new Pais();
    listaPropiedades.add(this.nombre);
    listaPropiedades.add(this.edad.toString());
    listaPropiedades.add(this.pais.nombre);
  }

  public Persona (String nombre, Integer edad, String nombrePais) {
    this.nombre = nombre;
    this.edad = edad;
    this.pais = new Pais(nombrePais);
    listaPropiedades.add(this.nombre);
    listaPropiedades.add(this.edad.toString());
    listaPropiedades.add(this.pais.nombre);
  }

  public Persona (String nombre, Integer edad, Pais nombrePais) {
    this.nombre = nombre;
    this.edad = edad;
    this.pais = nombrePais;
    listaPropiedades.add(this.nombre);
    listaPropiedades.add(this.edad.toString());
    listaPropiedades.add(this.pais.nombre);
  }

  public ArrayList<String> propiedades() {
    return listaPropiedades;
  }

}
