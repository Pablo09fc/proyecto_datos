
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTextArea;

public final class Juego extends javax.swing.JFrame {
    ArrayList<JButton> botones;
    
    
    /**
     * Creates new form Frm_Principal
     */
    public Juego() {
        this.puntoss=0;

        Ingredientes in1=new Ingredientes("Pan", 2);
        Ingredientes in2=new Ingredientes("Carne", 3);
        Ingredientes in3=new Ingredientes("Lechuga", 4);
        Ingredientes in4=new Ingredientes("Queso", 5);
        
        
        /*-------------------------------------*/
        this.cola  = new Cola();
        Preparacion p1 = new Preparacion();
        p1.insert(in1);
        p1.insert(in2);
        p1.insert(in3);
        p1.insert(in4);
        cola.insert(p1);
        /*-------------------------------------*/
        Preparacion p2= new Preparacion();
        p2.insert(in1);
        p2.insert(in2);
        p2.insert(in4);
        cola.insert(p2);
        /*-------------------------------------*/
        Preparacion p3=new Preparacion ();
        p3.insert(in1);
        p3.insert(in2);
        cola.insert(p3);
        /*-------------------------------------*/     
        this.banda = new ListaBanda();
        banda.insert(in1); //pan
        banda.insert(in2); //carne
        banda.insert(in3); //lechuga
        banda.insert(in4); //queso
        
       
        /*-------------------------------------*/
        this.prepa = new Preparacion();
        botones = new ArrayList<>();
        initComponents();
        botones.add(btn_pan);
        botones.add(btn_carne);
        botones.add(btn_queso);
        botones.add(btn_lechuga);
        
        Pantalla1.setText(""+p1);
        Pantalla2.setText(""+p2);
        Pantalla3.setText(""+p3);
        
        

    }
   
    private void actualizarOrdenActual(){
        jTextPane2.setText(prepa.toString());
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
        setBackground(new java.awt.Color(64, 38, 38));

        tiempo.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        tiempo.setText("Tiempo restante: ");

        btn_pan.setText("Pan");
        btn_pan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_panActionPerformed(evt);
            }
        });

        btn_carne.setText("Carne");
        btn_carne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carneActionPerformed(evt);
            }
        });

        jScrollPane6.setViewportView(jTextPane2);

        btn_queso.setText("Queso");
        btn_queso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quesoActionPerformed(evt);
            }
        });

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
                        .addComponent(tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(btn_pan, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addComponent(btn_carne, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_queso, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_lechuga, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_listo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_servirorden, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_pan, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_carne, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_queso, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_lechuga, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane4)
                        .addComponent(jScrollPane3)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_listo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_servirorden, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_panActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_panActionPerformed
        this.prepa.insert(banda.extract(btn_pan.getText()));
        update();
    }//GEN-LAST:event_btn_panActionPerformed

    private void btn_carneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carneActionPerformed
        this.prepa.insert(banda.extract(btn_carne.getText()));
        update();
    }//GEN-LAST:event_btn_carneActionPerformed

    private void btn_quesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quesoActionPerformed
        this.prepa.insert(banda.extract(btn_queso.getText()));
        update();
    }//GEN-LAST:event_btn_quesoActionPerformed

    private void btn_lechugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lechugaActionPerformed
        this.prepa.insert(banda.extract(btn_lechuga.getText()));
        update();
    }//GEN-LAST:event_btn_lechugaActionPerformed

    private void btn_servirordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_servirordenActionPerformed
        // TODO add your handling code here:
        FinalRegistro regis = new FinalRegistro();
        regis.setTitle("Informaci??n de las ordenes realizadas");
        regis.setLocationRelativeTo(null);
        regis.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_servirordenActionPerformed

    private void btn_listoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listoActionPerformed
        // TODO add your handling code here:
        if(cola.extract2().getPuntos() == prepa.getPuntos()){
            puntos.setText(prepa.getPuntos()+" puntos");
            this.puntoss +=prepa.getPuntos();
            this.prepa.delete();
            actualizarOrdenActual();
        }
        else{
            puntos.setText("Orden incorrecta");           
        }
    }//GEN-LAST:event_btn_listoActionPerformed
    public void actualizarPizarra(){//pantalla
        jTextPane2.setText("Puntaje actual:"+this.puntoss);
    }
    
    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        this.prepa.delete();
    }//GEN-LAST:event_btn_eliminarActionPerformed
    
    public void update(){
        actualizarOrdenActual();
        actualizarPizarra();
    }
    
    
    
    
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
    private static ListaBanda banda;
    private static Preparacion prepa;
    private static Cola cola;
    
    int puntoss;
    
    
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
