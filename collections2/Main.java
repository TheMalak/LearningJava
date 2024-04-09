package collections2;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    // las colleciones trabajan con colecciones.

    // <E> Elemento utilizado por el framework de colecciones
    // al final es un objeto pero la E se usa para colleciones
    // toda el api de collections soporta genericos.
    List<String> element = new ArrayList<>();
    // element.add(3); //esto genera un error ya que en el generico hemos indicado el uso de string
    element.add("hola");
    String getElementofList = element.get(0);
    System.out.println(getElementofList);
    print(element);

      HashMap<String, String> mapOfStrings = new HashMap<>();
      mapOfStrings.put("1", "one");
      mapOfStrings.put("2", "two");
      //cuando regresa el valor o la llave lo vuelve una coleccion.
      print(mapOfStrings.values());
      System.out.println("-------------------------");
      removeElementFromMap(mapOfStrings, "1");
      print(mapOfStrings.values());
  }

  public static void removeElementFromMap(Map<String, String> c, String v) {
      c.remove(v);
  }

  public static void print(Collection<String> c) {
    c.forEach(
        s -> {
          s.length(); // podemos acceder a funciones de la clase String ya que hemos le hemos
          // quitado la cualidad generica.
          System.out.println(s);
        });
  }
}
