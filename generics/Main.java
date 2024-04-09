package generics;

// uso de genericos
/*
<E> Elemento utilizado por el framework de colecciones
<K> llave utilizado en mapas
<T> tpe usado por lo general son clases NO PRIMITIVOS
<N> number, utilizado para numeros
<V> value utilizado para valores
<S,U,V> más tipos
 */

public class Main {
  public static void main(String[] args) {
    GenericClass<Integer> generico = new GenericClass<>(3);
    generico.getType();

    GenericClass<String> generico2 = new GenericClass<>("Hola mundo");
    generico2.getType();
  }
}
