
package com.mycompany.listasdobles;

public class Person {

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the Anterior
     */
    public Person getAnterior() {
        return Anterior;
    }

    /**
     * @param Anterior the Anterior to set
     */
    public void setAnterior(Person Anterior) {
        this.Anterior = Anterior;
    }

    /**
     * @return the Siguiente
     */
    public Person getSiguiente() {
        return Siguiente;
    }

    /**
     * @param Siguiente the Siguiente to set
     */
    public void setSiguiente(Person Siguiente) {
        this.Siguiente = Siguiente;
    }
    private int edad;
    private String name;
    private Person Anterior;
    private Person Siguiente;
}
