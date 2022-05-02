/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class NodoCola {
    //Se nombran los atributos
    private Preparacion prepa;
    private NodoCola next;
    // se crea un constructor
    public NodoCola(Preparacion orden){
        this.prepa=prepa;
    }
    // se crean los get y los set
    public Preparacion getPrepa() {
        return prepa;
    }

    public void setPrepa(Preparacion prepa) {
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
