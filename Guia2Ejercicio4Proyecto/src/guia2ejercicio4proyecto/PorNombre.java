/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package guia2ejercicio4proyecto;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kawaa
 */
public class PorNombre extends javax.swing.JInternalFrame {
public static DefaultTableModel modelo = new DefaultTableModel(){
    public boolean isCellEditable(int f, int c){
        return false;
    }
};
    /**
     * Creates new form PorNombre
     */
    public PorNombre() {
        initComponents();
        armarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTbuscarnombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Listado por nombre");

        jLabel2.setText("Buscar producto:");

        jTbuscarnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTbuscarnombreActionPerformed(evt);
            }
        });
        jTbuscarnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTbuscarnombreKeyReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(93, 93, 93)
                            .addComponent(jLabel1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(jTbuscarnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTbuscarnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTbuscarnombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTbuscarnombreKeyReleased
             borrarFila();
        for(Productos list: Menu.lista){
                 if(list.getDescripcion().startsWith(jTbuscarnombre.getText())){
                     modelo.addRow(new Object []{list.getCodigo(),list.getDescripcion(),list.getPrecio(),list.getStock()});
                 }
                 
             }
    }//GEN-LAST:event_jTbuscarnombreKeyReleased

    private void jTbuscarnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTbuscarnombreActionPerformed
         
    }//GEN-LAST:event_jTbuscarnombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTbuscarnombre;
    // End of variables declaration//GEN-END:variables

 private void armarTabla(){
     modelo.addColumn("Código");
     modelo.addColumn("Descripcion");
     modelo.addColumn("Precio");
     modelo.addColumn("Stock");
     jTable1.setModel(modelo);
     
 }
private void borrarFila(){
    int f= jTable1.getRowCount()-1;
    for(;f>=0;f--){
        modelo.removeRow(f);
    }
           
}

}
