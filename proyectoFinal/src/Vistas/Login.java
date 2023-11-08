/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.UsuarioData;
import Dominio.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class Login extends javax.swing.JFrame {
    private Usuario user=null;
    private UsuarioData uData= new UsuarioData();

    public Login() {
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

        jPanel2 = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jlUsuario = new javax.swing.JLabel();
        jlContraseña = new javax.swing.JLabel();
        jtUsuario = new javax.swing.JTextField();
        jpContraseña = new javax.swing.JPasswordField();
        jbIniciar = new javax.swing.JButton();
        jbRegistrar = new javax.swing.JButton();
        jlNuevaContraseña = new javax.swing.JLabel();
        jlSuperior = new javax.swing.JLabel();
        jtLogoInicio = new javax.swing.JTabbedPane();
        jpInicio = new javax.swing.JPanel();
        jlIcono = new javax.swing.JLabel();
        jpRegistro = new javax.swing.JPanel();
        jlUsuarioReg = new javax.swing.JLabel();
        jlCorreo = new javax.swing.JLabel();
        jlConReg = new javax.swing.JLabel();
        jlConfirConReg = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jtUsuarioReg = new javax.swing.JTextField();
        jtCorreo = new javax.swing.JTextField();
        jtContraReg = new javax.swing.JTextField();
        jtConfirContra = new javax.swing.JTextField();
        jcbEstado = new javax.swing.JCheckBox();
        jlEstado = new javax.swing.JLabel();
        jbVolver = new javax.swing.JButton();
        jpCambioContraseña = new javax.swing.JPanel();
        jlNuevaContra = new javax.swing.JLabel();
        jlConfirmCon = new javax.swing.JLabel();
        jbGuardarMod = new javax.swing.JButton();
        jtNuevaContraseña = new javax.swing.JTextField();
        jtConfirmar = new javax.swing.JTextField();
        jbVolverInIcio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jlTitulo.setText("LOGIN");

        jlUsuario.setText("Usuario: ");

        jlContraseña.setText("Contraseña: ");

        jbIniciar.setText("Iniciar");
        jbIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIniciarActionPerformed(evt);
            }
        });

        jbRegistrar.setText("Registrase");
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jlNuevaContraseña.setText("¿Olvidaste la Contraseña?");
        jlNuevaContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlNuevaContraseñaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jlTitulo))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jlUsuario)
                .addGap(29, 29, 29)
                .addComponent(jtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jlContraseña)
                .addGap(29, 29, 29)
                .addComponent(jpContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jlNuevaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jbRegistrar)
                .addGap(62, 62, 62)
                .addComponent(jbIniciar))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jlTitulo)
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jlUsuario))
                    .addComponent(jtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jlContraseña))
                    .addComponent(jpContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jlNuevaContraseña)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbRegistrar)
                    .addComponent(jbIniciar)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 0, 360, 500));

        jlSuperior.setBackground(new java.awt.Color(2, 104, 66));
        jlSuperior.setOpaque(true);
        getContentPane().add(jlSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 40));

        jpInicio.setBackground(new java.awt.Color(2, 104, 66));

        jlIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosVistas/logo icon(1).png"))); // NOI18N

        javax.swing.GroupLayout jpInicioLayout = new javax.swing.GroupLayout(jpInicio);
        jpInicio.setLayout(jpInicioLayout);
        jpInicioLayout.setHorizontalGroup(
            jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInicioLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jlIcono)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jpInicioLayout.setVerticalGroup(
            jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInicioLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jlIcono)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        jtLogoInicio.addTab("tab1", jpInicio);

        jpRegistro.setBackground(new java.awt.Color(172, 235, 198));

        jlUsuarioReg.setText("Usuario:");

        jlCorreo.setText("Correo: ");

        jlConReg.setText("Contraseña:");

        jlConfirConReg.setText("Confirmar Contraseña:");

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jlEstado.setText("Estado:");

        jbVolver.setText("Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpRegistroLayout = new javax.swing.GroupLayout(jpRegistro);
        jpRegistro.setLayout(jpRegistroLayout);
        jpRegistroLayout.setHorizontalGroup(
            jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegistroLayout.createSequentialGroup()
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jpRegistroLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlConReg)
                            .addGroup(jpRegistroLayout.createSequentialGroup()
                                .addComponent(jlUsuarioReg)
                                .addGap(6, 6, 6))
                            .addComponent(jlCorreo)
                            .addComponent(jlConfirConReg)
                            .addComponent(jlEstado))
                        .addGap(24, 24, 24)
                        .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbEstado)
                            .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtContraReg, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtConfirContra, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtUsuarioReg, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpRegistroLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jbVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbGuardar)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jpRegistroLayout.setVerticalGroup(
            jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegistroLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlUsuarioReg)
                    .addComponent(jtUsuarioReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCorreo)
                    .addComponent(jtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlConReg)
                    .addComponent(jtContraReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtConfirContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlConfirConReg))
                .addGap(35, 35, 35)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcbEstado)
                    .addComponent(jlEstado))
                .addGap(30, 30, 30)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbVolver))
                .addGap(40, 40, 40))
        );

        jtLogoInicio.addTab("tab2", jpRegistro);

        jpCambioContraseña.setBackground(new java.awt.Color(172, 235, 198));

        jlNuevaContra.setText("Contraseña Nueva: ");

        jlConfirmCon.setText("Confirme Contraseña: ");

        jbGuardarMod.setText("Guardar");
        jbGuardarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarModActionPerformed(evt);
            }
        });

        jbVolverInIcio.setText("Volver");
        jbVolverInIcio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverInIcioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCambioContraseñaLayout = new javax.swing.GroupLayout(jpCambioContraseña);
        jpCambioContraseña.setLayout(jpCambioContraseñaLayout);
        jpCambioContraseñaLayout.setHorizontalGroup(
            jpCambioContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCambioContraseñaLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jbVolverInIcio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbGuardarMod)
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCambioContraseñaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpCambioContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNuevaContra)
                    .addComponent(jlConfirmCon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpCambioContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtNuevaContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(jtConfirmar))
                .addGap(37, 37, 37))
        );
        jpCambioContraseñaLayout.setVerticalGroup(
            jpCambioContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCambioContraseñaLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jpCambioContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNuevaContra)
                    .addComponent(jtNuevaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jpCambioContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlConfirmCon)
                    .addComponent(jtConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jpCambioContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardarMod)
                    .addComponent(jbVolverInIcio))
                .addContainerGap(214, Short.MAX_VALUE))
        );

        jtLogoInicio.addTab("tab3", jpCambioContraseña);

        getContentPane().add(jtLogoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
       // TODO add your handling code here:      
       String nombre = jtUsuarioReg.getText();
       String correo = jtCorreo.getText();
       String contraseña = jtContraReg.getText();
       String confirm = jtConfirContra.getText();
       Boolean estado = jcbEstado.isSelected();  
       
       if(nombre.isEmpty()||correo.isEmpty()||contraseña.isEmpty()||confirm.isEmpty()||estado.equals(false)){
           
           JOptionPane.showMessageDialog(null,"Campos incompletos","",JOptionPane.INFORMATION_MESSAGE);          
       } else if(!contraseña.equals(confirm)){
           
           JOptionPane.showMessageDialog(null,"No coinciden las contraseñas","",JOptionPane.INFORMATION_MESSAGE);
       } else{
            if(user == null){
              user = new Usuario(nombre,contraseña,correo,estado);
              uData.crearUsuario(user);
              jtLogoInicio.setSelectedIndex(0);
              limpiarRegistro();  
            }            
       }                    
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbGuardarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarModActionPerformed
        // TODO add your handling code here:
        String usuario = jtUsuario.getText();
        String contraseña=jtNuevaContraseña.getText();
        String confirmar=jtConfirmar.getText();
        
        if(usuario.isEmpty()||contraseña.isEmpty()||confirmar.isEmpty()){
            
            JOptionPane.showMessageDialog(null,"Debe llenar los campos","",JOptionPane.INFORMATION_MESSAGE);
        }else if(!contraseña.equals(confirmar)){
            
            JOptionPane.showMessageDialog(null,"No coinciden las Contraseñas","",JOptionPane.INFORMATION_MESSAGE);                 
        }else{
            uData.cambiarContasena(usuario, contraseña);
            jtLogoInicio.setSelectedIndex(0);
            limpiarContra();
        }        
    }//GEN-LAST:event_jbGuardarModActionPerformed

    private void jlNuevaContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlNuevaContraseñaMouseClicked
        // TODO add your handling code here:
        jtLogoInicio.setSelectedIndex(2);
    }//GEN-LAST:event_jlNuevaContraseñaMouseClicked

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        // TODO add your handling code here:
        jtLogoInicio.setSelectedIndex(1);

    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jbIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIniciarActionPerformed
        // TODO add your handling code here:
        String usuario = jtUsuario.getText();
        char [] contra = jpContraseña.getPassword();
        String contraseña=String.valueOf(contra);
        user = uData.buscarUsuario(usuario);
       
        
        if(usuario.isEmpty()||contraseña.isEmpty()){
            
            JOptionPane.showMessageDialog(null,"Llene los Campos","",JOptionPane.INFORMATION_MESSAGE);     
        }else if(!contraseña.equals(user.getContrasena())||!usuario.equals(user.getNombreCuenta())){
            
            JOptionPane.showMessageDialog(null,"Contraseña incorrecta","",JOptionPane.INFORMATION_MESSAGE);
        }else{
            MenuGeneral general = new MenuGeneral(); 
            general.setVisible(true);           
        }       
    }//GEN-LAST:event_jbIniciarActionPerformed

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        // TODO add your handling code here:
        jtLogoInicio.setSelectedIndex(0);
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jbVolverInIcioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverInIcioActionPerformed
        // TODO add your handling code here:
        jtLogoInicio.setSelectedIndex(0);
    }//GEN-LAST:event_jbVolverInIcioActionPerformed

    private void limpiarRegistro(){
        jtUsuarioReg.setText("");
        jtCorreo.setText("");
        jtContraReg.setText("");
        jtConfirContra.setText("");
        jcbEstado.setSelected(false);
        
    }
    
    private void limpiarContra(){
        jtNuevaContraseña.setText("");
        jtConfirmar.setText("");
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbGuardarMod;
    private javax.swing.JButton jbIniciar;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JButton jbVolverInIcio;
    private javax.swing.JCheckBox jcbEstado;
    private javax.swing.JLabel jlConReg;
    private javax.swing.JLabel jlConfirConReg;
    private javax.swing.JLabel jlConfirmCon;
    private javax.swing.JLabel jlContraseña;
    private javax.swing.JLabel jlCorreo;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlIcono;
    private javax.swing.JLabel jlNuevaContra;
    private javax.swing.JLabel jlNuevaContraseña;
    private javax.swing.JLabel jlSuperior;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JLabel jlUsuarioReg;
    private javax.swing.JPanel jpCambioContraseña;
    private javax.swing.JPasswordField jpContraseña;
    private javax.swing.JPanel jpInicio;
    private javax.swing.JPanel jpRegistro;
    private javax.swing.JTextField jtConfirContra;
    private javax.swing.JTextField jtConfirmar;
    private javax.swing.JTextField jtContraReg;
    private javax.swing.JTextField jtCorreo;
    private javax.swing.JTabbedPane jtLogoInicio;
    private javax.swing.JTextField jtNuevaContraseña;
    private javax.swing.JTextField jtUsuario;
    private javax.swing.JTextField jtUsuarioReg;
    // End of variables declaration//GEN-END:variables
}
