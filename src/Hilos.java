import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Dell
 */
public class Hilos extends Observable implements Runnable {
    
    private int Segundos;
    public Hilos(int segundos) {  
        this.Segundos = segundos;
    }
    @Override
    public void run(){
        String Tiempo;        
        try {
            while (true) {
                Tiempo = "";
                if (Segundos < 300) {                   
                    Tiempo += "0" + Segundos;                  
                }             
                else {                   
                    Tiempo += Segundos;                  
                }
                if (Segundos <= 300 && Segundos>=0) {  
                    this.setChanged();      
                    this.notifyObservers(Tiempo);
                    this.clearChanged();
                    Thread.sleep(1000);
                    Segundos--;
                }
            }           
        } catch (InterruptedException ex) {           
            Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);          
        }
    }
}
