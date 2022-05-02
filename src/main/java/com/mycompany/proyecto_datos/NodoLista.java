/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_datos;

/**
 *
 * @author Jose Ignacio
 */
public class NodoLista {
    // se nombran los atributos
    private Ingredientes value;
    private NodoLista next;
    private NodoLista back;
    // se crea un contructor
    public NodoLista(Ingredientes value){
        this.value=value;
    }
    // se crea los get y set de cada atributo
    public Ingredientes getValue() {
        return value;
    }

    public void setValue(Ingredientes value) {
        this.value = value;
    }

    public NodoLista getNext() {
        return next;
    }

    public void setNext(NodoLista next) {
        this.next = next;
    }

    public NodoLista getBack() {
        return back;
    }

    public void setBack(NodoLista back) {
        this.back = back;
    }

    @Override// se crea el toString
    public String toString() {
        return "NodoLista{" + "value=" + value + ", next=" + next + ", back=" + back + '}';
    } 
}
