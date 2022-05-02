/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_datos;

/**
 *
 * @author Jose Ignacio
 */
public class NodoCola {
    //Se nombran los atributos
    private preparacion prepa;
    private NodoCola next;
    // se crea un constructor
    public NodoCola(preparacion orden){
        this.prepa=prepa;
    }
    // se crean los get y los set
    public preparacion getPrepa() {
        return prepa;
    }

    public void setPrepa(preparacion prepa) {
        this.prepa = prepa;
    }

    public NodoCola getNext() {
        return next;
    }

    public void setNext(NodoCola next) {
        this.next = next;
    }
    
    @Override// se crea el metodo toString
    public String toString() {
        return "NodoCola{" + "prepa=" + prepa + ", next=" + next + '}';
    }
    
}

