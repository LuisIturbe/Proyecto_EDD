/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Liliana
 */
public class Reg extends javax.swing.JPanel
{

    Usuario user = new Usuario();
    ArregloDinamico arr;

    /**
     * Creates new form Registro
     *
     * @param arrU
     */
    public Reg(ArregloDinamico arrU)
    {
        initComponents();
        arr = arrU;
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

        jPanel1 = new fondoPanel();
        tit = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        contra = new javax.swing.JLabel();
        txtContra = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 140, 188));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        tit.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 36)); // NOI18N
        tit.setForeground(new java.awt.Color(255, 255, 255));
        tit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tit.setText("Registarse");

        usuario.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setText("Usuario");

        txtUser.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtUserKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtUserKeyTyped(evt);
            }
        });

        contra.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        contra.setForeground(new java.awt.Color(255, 255, 255));
        contra.setText("Contraseña");

        txtContra.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtContraKeyTyped(evt);
            }
        });

        jButton1.setText("Crear");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usuario)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contra)
                            .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(108, 108, 108))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tit)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tit)
                .addGap(47, 47, 47)
                .addComponent(usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contra)
                .addGap(10, 10, 10)
                .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButton1MouseClicked
    {//GEN-HEADEREND:event_jButton1MouseClicked
        if (txtUser.getText().length() >= 4)
        {
            if (txtContra.getText().length() >= 4)
            {
                user.setNombre(txtUser.getText());
                user.setContra(txtContra.getText());
                arr.inserta(user);
                JOptionPane.showMessageDialog(this, "Registrado con éxito", "HECHO", JOptionPane.OK_OPTION);
                txtUser.setText("");
                txtContra.setText("");
            } else
            {
                JOptionPane.showMessageDialog(this, "La contraseña debe ser mayor a 3 caracteres", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
                txtContra.requestFocus();
            }
        } else
        {
            JOptionPane.showMessageDialog(this, "El usuario debe ser mayor a 3 caracteres", "ATENCIÓN", JOptionPane.INFORMATION_MESSAGE);
            txtUser.requestFocus();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtUserKeyPressed
    {//GEN-HEADEREND:event_txtUserKeyPressed
        if (evt.getKeyChar() == '\n' && txtUser.getText().length() >= 4)
        {
            txtContra.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtContraKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtContraKeyTyped
    {//GEN-HEADEREND:event_txtContraKeyTyped
        if (evt.getKeyChar() == '\n' && txtContra.getText().length() >= 4)
        {
            user.setNombre(txtUser.getText());
            user.setContra(txtContra.getText());
            arr.inserta(user);
            JOptionPane.showMessageDialog(this, "Registrado con éxito", "HECHO", JOptionPane.OK_OPTION);
            txtUser.setText("");
            txtContra.setText("");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraKeyTyped

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtUserKeyTyped
    {//GEN-HEADEREND:event_txtUserKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contra;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tit;
    private javax.swing.JTextField txtContra;
    private javax.swing.JTextField txtUser;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
    class fondoPanel extends JPanel
    {
        private Image imagen;
        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("/Iconos/bgRI.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
