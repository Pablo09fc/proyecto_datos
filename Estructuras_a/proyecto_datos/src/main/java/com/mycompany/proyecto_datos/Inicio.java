package com.mycompany.proyecto_datos;



/**
 *
 * @author Asus
 */
public class Inicio {

    public static void main(String[] args) {
        
        Iniciar_sistema();
        
    }
    
    
     public static void Iniciar_sistema(){
        
        Frm_Inicio_Sesion inicio = new Frm_Inicio_Sesion();
        
        inicio.setTitle("Ingreso al Sistema del Hospital Amor Sanador");
        
        inicio.setLocationRelativeTo(null);
        
        
        inicio.setVisible(true);
        
    }
    
    
}
