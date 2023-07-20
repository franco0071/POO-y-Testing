package PersonasExcepciones;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Persona { 

  public String nombre;
  public Integer edad;
  String nombrePais;
  public Pais pais;
  ArrayList<String> listaPropiedades = new ArrayList<>();

  public Persona() {
    this.nombre = "Fulano";
    this.edad = 18;
    this.pais = new Pais();
    agregarPropiedades();
  }

  public Persona(String nombre, Integer edad) {
    this.nombre = nombre;
    this.edad = edad;
    this.pais = new Pais();
    agregarPropiedades();
  }

  public Persona(String nombre, Integer edad, String nombrePais) {
    this.nombre = nombre;
    this.edad = edad;
    this.pais = new Pais(nombrePais);
    agregarPropiedades();
  }

  public Persona(String nombre, Integer edad, Pais nombrePais) {
    this.nombre = nombre;
    this.edad = edad;
    this.pais = nombrePais;
    agregarPropiedades();
  }

  public ArrayList<String> propiedades() {
    return listaPropiedades;
  }

  private void agregarPropiedades() {
    listaPropiedades.add(nombre);
    listaPropiedades.add(edad.toString());
    listaPropiedades.add(pais.nombre);
  }

  public Object obtenerPropiedad(String propiedad) throws NoSuchFieldException, IllegalAccessException {
    Field field = getClass().getDeclaredField(propiedad);
    field.setAccessible(true);
    return field.get(this);
  }

}
