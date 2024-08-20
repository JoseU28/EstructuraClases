/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.academico;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-09
 */
public class Ventanaprincipal extends javax.swing.JFrame {

    int arraymenores[];     
    int arraymayores[];
    int viejos[];
    int im=0;
    int ima=0;
    int v=0;
    int tme=0;
    int tma=0;
    int tv=0;
    String muestra="";
    String muestra2="";
    String muestra3="";
    
    
    public Ventanaprincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        academicSystem = new javax.swing.JLabel();
        create = new javax.swing.JButton();
        search = new javax.swing.JButton();
        size = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        academicSystem.setText("SISTEMA ACADEMICO");

        create.setText("Crear");
        create.setEnabled(false);
        create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createMouseClicked(evt);
            }
        });
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        search.setText("Consultar");
        search.setEnabled(false);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        size.setText("Asignar Tamaño");
        size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(create)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(search)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(size)
                    .addComponent(academicSystem))
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(academicSystem)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(create)
                    .addComponent(search))
                .addGap(33, 33, 33)
                .addComponent(size)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
            int edad = Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Diga su edad papi"));
            if(edad<18){
                if(im<tme){
                JOptionPane.showMessageDialog(rootPane, "Usted es menor de edad");
                arraymenores[im]=edad;
                im++;
                }else{
                    JOptionPane.showMessageDialog(rootPane, "No se reciben más menores");
                }
            }else if(edad>=18 && edad<60){
                if(ima<tma){
                JOptionPane.showMessageDialog(rootPane, "Usted es mayor de edad");                    
                arraymayores[ima]=edad;
                ima++;
                }else{
                    JOptionPane.showMessageDialog(rootPane, "No se reciben más mayores");
                }
            }else{
                if(v<tv){
                JOptionPane.showMessageDialog(rootPane, "Usted es adulto mayor");                    
                viejos[v]=edad;
                v++;
                }else{
                    JOptionPane.showMessageDialog(rootPane, "No se reciben más adultos mayores");
                }
            }
            search.setEnabled(true);
    }//GEN-LAST:event_createActionPerformed
    //ToDo hacer 3 arreglos de 5 slots y que el programa finalice cuando ya estén llenos y en consultar mostrar todo en orden
    
    private void createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseClicked
        
    }//GEN-LAST:event_createMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        
        muestra="Edades de los menores registrados:";
        for(int a=0;a<tme;a++){
            if(arraymenores[a]!=0){
                muestra+="  "+arraymenores[a];
            }
        }
        muestra2="Edades de los mayores registrados:";
        for(int a=0;a<tma;a++){
            if(arraymayores[a]!=0){
                muestra2+="  "+arraymayores[a];
            }
        }
        muestra3="Edades de los adultos mayores registrados:";
        for(int a=0;a<tv;a++){
            if(viejos[a]!=0){
                muestra3+="  "+viejos[a];
            }
        }
        JOptionPane.showMessageDialog(rootPane, muestra+"\n"+muestra2+"\n"+muestra3);
//        JOptionPane.showMessageDialog(rootPane, muestra2);
//        JOptionPane.showMessageDialog(rootPane, muestra3);
    }//GEN-LAST:event_searchActionPerformed

    private void sizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeActionPerformed
        // TODO add your handling code here:
        tme= Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Diga el tamaño del grupo de menores de edad"));
        tma= Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Diga el tamaño del grupo de mayores de edad"));
        tv= Integer.parseInt(JOptionPane.showInputDialog(rootPane, "Diga el tamaño del grupo de mayores adultos"));
        arraymenores =new int[tme];     
        arraymayores = new int[tma];
        viejos= new int[tv];
        size.setEnabled(false);
        create.setEnabled(true);
    }//GEN-LAST:event_sizeActionPerformed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowStateChanged

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
            java.util.logging.Logger.getLogger(Ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventanaprincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel academicSystem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton create;
    private javax.swing.JButton search;
    private javax.swing.JButton size;
    // End of variables declaration//GEN-END:variables
}
