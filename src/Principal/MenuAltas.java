/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.awt.BorderLayout;

/**
 *
 * @author Liliana
 */
public class MenuAltas extends javax.swing.JPanel
{
    MenuP mp = new MenuP();
    MenuAdmin mi = new MenuAdmin(mp);

    /**
     * Creates new form menuAltas
     */
    public MenuAltas(MenuP m, MenuAdmin mnu)
    {
        initComponents();
        mp = m;
        mi = mnu;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        farmacia = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ciudad = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        sucursal = new javax.swing.JLabel();
        producto = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        farmacia.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        farmacia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        farmacia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Farmacias.png"))); // NOI18N
        farmacia.setText("Dar de alta una Farmacia");
        farmacia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        farmacia.setMaximumSize(new java.awt.Dimension(184, 71));
        farmacia.setMinimumSize(new java.awt.Dimension(184, 71));
        farmacia.setPreferredSize(new java.awt.Dimension(184, 71));
        farmacia.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                farmaciaMouseClicked(evt);
            }
        });

        ciudad.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        ciudad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ciudad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Ciudad.png"))); // NOI18N
        ciudad.setText("Dar de alta una Ciudad");
        ciudad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ciudad.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                ciudadMouseClicked(evt);
            }
        });

        sucursal.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        sucursal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sucursal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Sucursal.png"))); // NOI18N
        sucursal.setText("Dar de alta una Sucursal");
        sucursal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sucursal.setPreferredSize(new java.awt.Dimension(191, 71));
        sucursal.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                sucursalMouseClicked(evt);
            }
        });

        producto.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        producto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Producto.png"))); // NOI18N
        producto.setText("Añadir Producto");
        producto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        producto.setPreferredSize(new java.awt.Dimension(151, 71));
        producto.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                productoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator3)
            .addComponent(producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(farmacia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ciudad, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
            .addComponent(sucursal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(farmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(ciudad)
                .addGap(7, 7, 7)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void farmaciaMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_farmaciaMouseClicked
    {//GEN-HEADEREND:event_farmaciaMouseClicked
        // TODO add your handling code here:
        AltaFarmacia af = new AltaFarmacia();
        af.setSize(975, 600);
        af.setLocation(0, 0);
        mi.getAltas().setIcon(farmacia.getIcon());
        mp.getFondoAB().removeAll();
        mp.getFondoAB().add(af, BorderLayout.CENTER);
        mp.getFondoAB().revalidate();
        mp.getFondoAB().repaint();
    }//GEN-LAST:event_farmaciaMouseClicked

    private void ciudadMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_ciudadMouseClicked
    {//GEN-HEADEREND:event_ciudadMouseClicked
        // TODO add your handling code here:
        AltaCiudad ac = new AltaCiudad();
        ac.setSize(975, 600);
        ac.setLocation(0, 0);
        mi.getAltas().setIcon(ciudad.getIcon());
        mp.getFondoAB().removeAll();
        mp.getFondoAB().add(ac, BorderLayout.CENTER);
        mp.getFondoAB().revalidate();
        mp.getFondoAB().repaint();
    }//GEN-LAST:event_ciudadMouseClicked

    private void sucursalMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_sucursalMouseClicked
    {//GEN-HEADEREND:event_sucursalMouseClicked
        // TODO add your handling code here:
        AltaSucursal as = new AltaSucursal();
        as.setSize(975,600);
        as.setLocation(0, 0);
        mi.getAltas().setIcon(sucursal.getIcon());
        mp.getFondoAB().removeAll();
        mp.getFondoAB().add(as, BorderLayout.CENTER);
        mp.getFondoAB().revalidate();
        mp.getFondoAB().repaint();
    }//GEN-LAST:event_sucursalMouseClicked

    private void productoMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_productoMouseClicked
    {//GEN-HEADEREND:event_productoMouseClicked
        // TODO add your handling code here:
        AltaProducto ap = new AltaProducto();
        ap.setSize(975,600);
        ap.setLocation(0,0);
        mi.getAltas().setIcon(producto.getIcon());
        mp.getFondoAB().removeAll();
        mp.getFondoAB().add(ap, BorderLayout.CENTER);
        mp.getFondoAB().revalidate();
        mp.getFondoAB().repaint();
    }//GEN-LAST:event_productoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ciudad;
    private javax.swing.JLabel farmacia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel producto;
    private javax.swing.JLabel sucursal;
    // End of variables declaration//GEN-END:variables
}
