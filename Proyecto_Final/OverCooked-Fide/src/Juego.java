
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTextArea;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Dell
 */
public final class Juego extends javax.swing.JFrame {
    ArrayList<JTextArea> ordenes;
    ArrayList<JButton> botones;
    
    private static ListaBanda banda;
    private static Preparacion prepa;
    int puntoss;

    /**
     * Creates new form Frm_Principal
     */
    public Juego() {
        
        Ingredientes in1=new Ingredientes("Pan", 2);
        Ingredientes in2=new Ingredientes("Carne", 3);
        Ingredientes in3=new Ingredientes("Lechuga", 4);
        Ingredientes in4=new Ingredientes("Queso", 5);
        /*-------------------------------------*/
        ordenes = new ArrayList<>();
        ordenes.add(Pantalla1);
        ordenes.add(Pantalla2);
        ordenes.add(Pantalla3);
        /*-------------------------------------*/
        prepa = new Preparacion();
        /*-------------------------------------*/
        botones = new ArrayList<>();
        botones.add(btn_pan);
        botones.add(btn_carne);
        botones.add(btn_queso);
        botones.add(btn_lechuga);
        /*-------------------------------------*/
        this.banda = new ListaBanda();
        banda.insert(in1); 
        banda.insert(in2); 
        banda.insert(in3); 
        banda.insert(in4); 
        
        Cola c= new Cola();
        /*-------------------------------------*/
        Preparacion p1 = new Preparacion();
        p1.insert(in1);
        p1.insert(in2);
        p1.insert(in3);
        p1.insert(in4);
        c.insert(p1);
        /*-------------------------------------*/
        Preparacion p2= new Preparacion();
        p1.insert(in1);
        p1.insert(in2);
        p1.insert(in4);
        c.insert(p2);
        /*-------------------------------------*/
        Preparacion p3=new Preparacion ();
        p1.insert(in1);
        p1.insert(in2);
        c.insert(p3);
        /*-------------------------------------*/
        initComponents();
        /*-----------------ACTUALIZACIONES--------------------*/
        update();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tiempo = new javax.swing.JLabel();
        btn_pan = new javax.swing.JButton();
        btn_carne = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        btn_queso = new javax.swing.JButton();
        btn_lechuga = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        puntos = new javax.swing.JTextArea();
        btn_servirorden = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Pantalla2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        Pantalla1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Pantalla3 = new javax.swing.JTextArea();
        btn_listo = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tiempo.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        tiempo.setText("Tiempo:");

        btn_pan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pan.jpeg"))); // NOI18N
        btn_pan.setText("Pan");
        btn_pan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_panActionPerformed(evt);
            }
        });

        btn_carne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carni.jpeg"))); // NOI18N
        btn_carne.setText("Carne");
        btn_carne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carneActionPerformed(evt);
            }
        });

        jScrollPane6.setViewportView(jTextPane2);

        btn_queso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/quesi.jpeg"))); // NOI18N
        btn_queso.setText("Queso");
        btn_queso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quesoActionPerformed(evt);
            }
        });

        btn_lechuga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lechugi.jpeg"))); // NOI18N
        btn_lechuga.setText("Lechuga");
        btn_lechuga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lechugaActionPerformed(evt);
            }
        });

        puntos.setColumns(20);
        puntos.setLineWrap(true);
        puntos.setRows(5);
        puntos.setText("Puntos: ");
        jScrollPane5.setViewportView(puntos);

        btn_servirorden.setText("Servir Orden");
        btn_servirorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_servirordenActionPerformed(evt);
            }
        });

        Pantalla2.setColumns(20);
        Pantalla2.setLineWrap(true);
        Pantalla2.setRows(5);
        Pantalla2.setText("2.");
        jScrollPane3.setViewportView(Pantalla2);

        Pantalla1.setColumns(20);
        Pantalla1.setLineWrap(true);
        Pantalla1.setRows(5);
        Pantalla1.setText("1.");
        jScrollPane4.setViewportView(Pantalla1);

        Pantalla3.setColumns(20);
        Pantalla3.setLineWrap(true);
        Pantalla3.setRows(5);
        Pantalla3.setText("3.");
        jScrollPane2.setViewportView(Pantalla3);

        btn_listo.setText("Orden Lista");
        btn_listo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listoActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(btn_pan, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(btn_carne, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(btn_queso, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(61, 61, 61)
                                .addComponent(btn_lechuga, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(107, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_listo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btn_servirorden, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_pan, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_carne, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_queso, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_lechuga, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_servirorden, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_listo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_panActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_panActionPerformed
        
        prepa.insert(banda.extract(btn_pan.getText()));
        update();
    }//GEN-LAST:event_btn_panActionPerformed

    private void btn_carneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carneActionPerformed
        
        prepa.insert(banda.extract(btn_carne.getText()));
        update();
    }//GEN-LAST:event_btn_carneActionPerformed

    private void btn_quesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quesoActionPerformed
        
        prepa.insert(banda.extract(btn_queso.getText()));
        update();
    }//GEN-LAST:event_btn_quesoActionPerformed

    private void btn_lechugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lechugaActionPerformed
        
        prepa.insert(banda.extract(btn_lechuga.getText()));
        update();
    }//GEN-LAST:event_btn_lechugaActionPerformed

    private void btn_servirordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_servirordenActionPerformed
        // TODO add your handling code here:
        FinalRegistro regis = new FinalRegistro();
        regis.setTitle("Información de las ordenes realizadas");
        regis.setLocationRelativeTo(null);
        regis.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_servirordenActionPerformed

    private void btn_listoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listoActionPerformed
        // TODO add your handling code here:
        if(banda.extraer2().getPuntos() == prepa.getPuntos()){
            puntos.setText(prepa.getPuntos()+" puntos");
            puntoss +=prepa.getPuntos();
            prepa.delete();
            update2();
        }
        else{
            puntos.setText("Orden incorrecta");           
        }
    }//GEN-LAST:event_btn_listoActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        this.prepa.delete();
        borrar();
    }//GEN-LAST:event_btn_eliminarActionPerformed
    public void update3(){//pantalla
        jTextPane2.setText("Puntaje actual:"+this.puntoss);
    }
    public void borrar(){
        update();
        update2();
    }
    private void update2(){//las listas
        jTextPane2.setText(prepa.toString());
    }
    public void update(){
        int contador =0;
        for (JButton btn : botones){   
            contador++;
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Pantalla1;
    private javax.swing.JTextArea Pantalla2;
    private javax.swing.JTextArea Pantalla3;
    private javax.swing.JButton btn_carne;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_lechuga;
    private javax.swing.JButton btn_listo;
    private javax.swing.JButton btn_pan;
    private javax.swing.JButton btn_queso;
    private javax.swing.JButton btn_servirorden;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextArea puntos;
    private javax.swing.JLabel tiempo;
    // End of variables declaration//GEN-END:variables
}
