package Serializable;

import Serializable.*;

public class Main {
    public static void main(String[] args) {
        /*implementando el serializable*/
        Person person = new Person();
        person.setName("Juan");
        person.setLastName("Torres");
        System.out.println(person.toString());
    }
}
