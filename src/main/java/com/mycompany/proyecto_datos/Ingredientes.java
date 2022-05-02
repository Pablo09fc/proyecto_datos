package com.mycompany.proyecto_datos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class Ingredientes {
    //Se nombran las variables
    String ingrediente;
    int puntos;
    // se crea un contructor
    public Ingredientes (String ingrediente, int puntos){
        this.ingrediente = ingrediente;
        this.puntos = puntos;
    }
    // se crean los get y set
    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override //Se crea el toString 
    public String toString() {
        return "Ingredientes{" + "ingrediente=" + ingrediente + ", puntos=" + puntos + '}';
    }
}
