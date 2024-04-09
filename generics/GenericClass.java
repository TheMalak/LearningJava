package generics;

// uso de genericos
/*
<E> Elemento utilizado por el framework de colecciones
<K> llave utilizado en mapas
<T> tpe usado por lo general son clases
<N> number, utilizado para numeros
<V> value utilizado para valores
<S,U,V> más tipos
 */

public class GenericClass<T> {
  T object;

  public GenericClass(T object) {
    this.object = object;
  }

  public void getType() {
    System.out.println("type <T> is: " + object.getClass().getSimpleName());
  }
}
