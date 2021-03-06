/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.alfa.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class EstadoDeCuenta extends javax.swing.JInternalFrame {

    static void actualizarEstado(){
        cuenta1.setText(String.valueOf(Cuentas.listaDeCuentas[Usuario.listaDeUsuarios[Ingresar.auxId].cuentas[0]].saldo));
        cuenta2.setText(String.valueOf(Cuentas.listaDeCuentas[Usuario.listaDeUsuarios[Ingresar.auxId].cuentas[1]].saldo));
    }
    public EstadoDeCuenta() {
        initComponents();
        actualizarEstado();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cuenta1 = new javax.swing.JTextField();
        añadirSaldo1 = new javax.swing.JButton();
        cant1 = new javax.swing.JTextField();
        cuenta2 = new javax.swing.JTextField();
        añadirSaldo2 = new javax.swing.JButton();
        cant2 = new javax.swing.JTextField();

        setTitle("Estado de cuenta");

        jLabel1.setText("Cuenta 1:");

        jLabel2.setText("Cuenta 2:");

        añadirSaldo1.setText("Añadir saldo");
        añadirSaldo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                añadirSaldo1MouseClicked(evt);
            }
        });

        añadirSaldo2.setText("Añadir saldo");
        añadirSaldo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                añadirSaldo2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cuenta2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(añadirSaldo1)
                    .addComponent(añadirSaldo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cant1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(cant2)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añadirSaldo1)
                    .addComponent(cant1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cant2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cuenta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(añadirSaldo2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void añadirSaldo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirSaldo1MouseClicked
        try{
            Cuentas.listaDeCuentas[Usuario.listaDeUsuarios[Ingresar.auxId].cuentas[0]].saldo += Integer.parseInt(cant1.getText().trim());
        actualizarEstado();
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Ingresa una cantidad (" + ex.getMessage() + ")");
        }
    }//GEN-LAST:event_añadirSaldo1MouseClicked

    private void añadirSaldo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirSaldo2MouseClicked
        try{
            Cuentas.listaDeCuentas[Usuario.listaDeUsuarios[Ingresar.auxId].cuentas[1]].saldo += Integer.parseInt(cant2.getText().trim());
        actualizarEstado();
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Ingresa una cantidad (" + ex.getMessage() + ")");
        }
    }//GEN-LAST:event_añadirSaldo2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadirSaldo1;
    private javax.swing.JButton añadirSaldo2;
    private javax.swing.JTextField cant1;
    private javax.swing.JTextField cant2;
    private static javax.swing.JTextField cuenta1;
    private static javax.swing.JTextField cuenta2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
