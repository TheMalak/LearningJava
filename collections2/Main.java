package collections2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

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
