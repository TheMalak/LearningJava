package collections;

import java.util.*;

public class Main {
  public static void main(String[] args) {

    // la lista almacena el orden pero es más lenta
    // en una lista se pueden duplicar los elementos
    List bussinessDays = new ArrayList<>();
    bussinessDays.add("Monday");
    bussinessDays.add("Tuesday");
    bussinessDays.add("Wednesday");
    bussinessDays.add("Thursday");
    bussinessDays.add("Friday");

    // print(bussinessDays);

    // si el orden no importa set es la mejor opción ya que eso la hace más rápida
    // en set los elementos no pueden duplicarse, cuando es identico lo desecha
    Set miSet = new HashSet();
    miSet.add("Monday");
    miSet.add("Tuesday");
    miSet.add("Wednesday");
    miSet.add("Thursday");
    miSet.add("Friday"); // alguno de estos será eliminado.
    miSet.add("Friday");

    // print(miSet);

    Map myMap = new HashMap();
    myMap.put("value1", "Juan");
    myMap.put("value2", "Roberto");
    myMap.put("value3", "David");

    String element = (String) myMap.get("value2");

    print(myMap.values()); // un set no muestra un orden.
  }

  public static void print(Collection c) {
    if (c instanceof ArrayList) {
      System.out.println("arrayList");
      c.forEach(e -> System.out.println(e));
    } else {
      System.out.println("hashset");
      c.forEach(e -> System.out.println(e));
    }
  }
}
