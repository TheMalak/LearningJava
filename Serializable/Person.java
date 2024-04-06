package Serializable;


import java.io.Serializable;

public class Person implements Serializable {

    /* para que una clase sea serializable, debe implementar dicha interfaz*/

    /*todo atributo debe ser privado*/
    private String name;
    private String lastName;

    /*debe existir al menos un constructor privado*/

    public Person() {}

    /*puede existir un constructor con parámetros pero es opcional*/

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    /*si se necesita pueden haber métodos*/

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    /*por ultimo todo parametro debe tener sus modificadores de acceso*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
