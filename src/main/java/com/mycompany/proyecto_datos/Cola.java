package com.mycompany.proyecto_datos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class Cola {
    //se crean los atributos
    private NodoCola begin;
    private NodoCola end;
    //  se crea el contructor
    public void Cola(){
        this.begin=null;
        this.end=null;
    }
    // se inicia el metodo insert
    public void insert(Preparacion dato){
        NodoCola n= new NodoCola();
        n.setPrepa(dato);
        n.setNext(null);
        if(this.begin==null && end==null){
            this.begin=n;
            this.end=n;
        }
        end.setNext(n);
        end = end.getNext();
    }
    // se inicia los metodos de extraccion llamdos extract y extract2
    public Preparacion extract(){
        Preparacion dato = this.begin.getPrepa();
        begin = begin.getNext();
        return dato;
    }
    // se inicia el metodo empty
        public boolean empty(){
        boolean cola = false;
        if(this.begin==null && end==null)
            cola = true;
    return cola;
    }
    // se inicia el metodo buscar llamado search
    public boolean search(String s){
        NodoCola temp = this.begin;
        boolean resultado= false;
        while (temp!=null){
            if(temp.getPrepa().getpreparacion().getValue().getIngrediente().equals(s)){
                resultado = true;
            }
        temp=temp.getNext();
        }
    return resultado;    
    }
    // se inicia el metodo inPos
    public String InPos(int pos){
        String s="";
        int cont=0;
        NodoCola temp = this.begin;
        while(temp!=null && cont<3){
            if(cont == pos){
                s+=temp.getPrepa().toString();
                cont=6;
            }
            else{
            cont++;
            temp=temp.getNext();
            }
        }
        return s;
    }
    // // se inicia el metodo contador con la variable count
    public int count(){
        int counter = 0;
        NodoCola temp = this.begin;
        while(temp != null){
            counter++;
            temp=temp.getNext();
        }
    return counter;  
    }
    // se crea po ultimo el metodo toString
    public String toString(){
        String t="";
        NodoCola temp=this.begin;
        while(temp!=null){
            t+=temp.getPrepa()+" | ";
            temp=temp.getNext();
        }
    return t;
    }
    
}
