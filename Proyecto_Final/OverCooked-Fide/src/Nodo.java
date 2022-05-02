/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class Nodo {
    //Se nombran los atributos
    private Ingredientes value;
    private Nodo next;
    // se crea un constructor
    public Nodo (Ingredientes value){
        this.value=value;
    } 
    //se crea los get y set
    public Ingredientes getValue() {
        return value;
    }

    public void setValue(Ingredientes value) {
        this.value = value;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    @Override// por ultimo se crea el toString
    public String toString() {
        return "Nodo{" + "value=" + value + ", next=" + next + '}';
    }
}
