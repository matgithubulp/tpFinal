/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.UsuarioData;
import Dominio.Usuario;
import static Vistas.MenuGeneral.contieneLetrasEspaciosNumeros;
import static Vistas.MenuGeneral.contieneLetrasYEspacios;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author pablo
 */
public class Login extends javax.swing.JFrame {
    private Usuario usuario = null;
    private UsuarioData usuarioData = new UsuarioData();

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

        jpLogin = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jlUsuario = new javax.swing.JLabel();
        jlContraseña = new javax.swing.JLabel();
        jtUsuario = new javax.swing.JTextField();
        jpContraseña = new javax.swing.JPasswordField();
        jbIniciar = new javax.swing.JButton();
        jbRegistrar = new javax.swing.JButton();
        jlNuevaContraseña = new javax.swing.JLabel();
        jlPie = new javax.swing.JLabel();
        ImageIcon icono=new ImageIcon(getClass().getResource("../RecursosVistas/sd.jpg"));
        Image miImagen=icono.getImage();
        jlSuperior = new javax.swing.JLabel(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);
            }

        };
        jtLogoInicio = new javax.swing.JTabbedPane();
        jpInicio = new Fondo();
        jlIcono = new javax.swing.JLabel();
        jpRegistro = new javax.swing.JPanel();
        jlUsuarioReg = new javax.swing.JLabel();
        jlCorreoReg = new javax.swing.JLabel();
        jlConReg = new javax.swing.JLabel();
        jlConfirConReg = new javax.swing.JLabel();
        jbGuardarReg = new javax.swing.JButton();
        jtUsuarioReg = new javax.swing.JTextField();
        jtCorreoReg = new javax.swing.JTextField();
        jtContraReg = new javax.swing.JTextField();
        jtConfirContraReg = new javax.swing.JTextField();
        jbCancelarReg = new javax.swing.JButton();
        jpCambioContraseña = new javax.swing.JPanel();
        jlContraNuevaCambio = new javax.swing.JLabel();
        jlConfirContraCambio = new javax.swing.JLabel();
        jbGuardarCambio = new javax.swing.JButton();
        jtNuevaContraCambio = new javax.swing.JTextField();
        jtConfirmarContraCambio = new javax.swing.JTextField();
        jbCancelarCambio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpLogin.setBackground(new java.awt.Color(255, 255, 255));

        jlTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jlTitulo.setText("INICIO DE SESION");

        jlUsuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jlUsuario.setText("Usuario: ");

        jlContraseña.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jlContraseña.setText("Contraseña: ");

        jbIniciar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jbIniciar.setText("Iniciar");
        jbIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIniciarActionPerformed(evt);
            }
        });

        jbRegistrar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jbRegistrar.setText("Registrase");
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jlNuevaContraseña.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jlNuevaContraseña.setText("¿Olvidaste la Contraseña?");
        jlNuevaContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlNuevaContraseñaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlNuevaContraseñaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlNuevaContraseñaMouseExited(evt);
            }
        });

        jlPie.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 10)); // NOI18N
        jlPie.setText("by - EJARQUE and ROMERO -");

        javax.swing.GroupLayout jpLoginLayout = new javax.swing.GroupLayout(jpLogin);
        jpLogin.setLayout(jpLoginLayout);
        jpLoginLayout.setHorizontalGroup(
            jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLoginLayout.createSequentialGroup()
                .addGroup(jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpLoginLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpLoginLayout.createSequentialGroup()
                                .addComponent(jbRegistrar)
                                .addGap(62, 62, 62)
                                .addComponent(jbIniciar))
                            .addGroup(jpLoginLayout.createSequentialGroup()
                                .addGroup(jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlContraseña)
                                    .addComponent(jlUsuario))
                                .addGap(29, 29, 29)
                                .addGroup(jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(jpContraseña)))))
                    .addGroup(jpLoginLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlTitulo)
                            .addComponent(jlNuevaContraseña))))
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(jpLoginLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jlPie)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpLoginLayout.setVerticalGroup(
            jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLoginLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jlTitulo)
                .addGap(51, 51, 51)
                .addGroup(jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlUsuario)
                    .addComponent(jtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlContraseña)
                    .addComponent(jpContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jlNuevaContraseña)
                .addGap(36, 36, 36)
                .addGroup(jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbIniciar)
                    .addComponent(jbRegistrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlPie)
                .addGap(23, 23, 23))
        );

        jlSuperior.setBackground(new java.awt.Color(2, 104, 66));
        jlSuperior.setOpaque(true);

        jpInicio.setBackground(new java.awt.Color(2, 104, 66));

        jlIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosVistas/image.png"))); // NOI18N

        javax.swing.GroupLayout jpInicioLayout = new javax.swing.GroupLayout(jpInicio);
        jpInicio.setLayout(jpInicioLayout);
        jpInicioLayout.setHorizontalGroup(
            jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInicioLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jlIcono)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jpInicioLayout.setVerticalGroup(
            jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInicioLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jlIcono)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        jtLogoInicio.addTab("tab1", jpInicio);

        jpRegistro.setBackground(new java.awt.Color(223, 243, 237));

        jlUsuarioReg.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jlUsuarioReg.setText("Usuario:");

        jlCorreoReg.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jlCorreoReg.setText("Correo: ");

        jlConReg.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jlConReg.setText("Contraseña:");

        jlConfirConReg.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jlConfirConReg.setText("Confirmar Contraseña:");

        jbGuardarReg.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jbGuardarReg.setText("Guardar");
        jbGuardarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarRegActionPerformed(evt);
            }
        });

        jbCancelarReg.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jbCancelarReg.setText("Cancelar");
        jbCancelarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarRegActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpRegistroLayout = new javax.swing.GroupLayout(jpRegistro);
        jpRegistro.setLayout(jpRegistroLayout);
        jpRegistroLayout.setHorizontalGroup(
            jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegistroLayout.createSequentialGroup()
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jpRegistroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlConReg)
                            .addComponent(jlConfirConReg)
                            .addComponent(jlCorreoReg)
                            .addComponent(jlUsuarioReg))
                        .addGap(18, 18, 18)
                        .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtContraReg, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtConfirContraReg, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtCorreoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtUsuarioReg, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpRegistroLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jbGuardarReg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbCancelarReg)))
                .addContainerGap(82, Short.MAX_VALUE))
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
                    .addComponent(jlCorreoReg)
                    .addComponent(jtCorreoReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlConReg)
                    .addComponent(jtContraReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtConfirContraReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlConfirConReg))
                .addGap(76, 76, 76)
                .addGroup(jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelarReg)
                    .addComponent(jbGuardarReg))
                .addGap(53, 53, 53))
        );

        jtLogoInicio.addTab("tab2", jpRegistro);

        jpCambioContraseña.setBackground(new java.awt.Color(223, 243, 237));

        jlContraNuevaCambio.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jlContraNuevaCambio.setText("Contraseña Nueva: ");

        jlConfirContraCambio.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jlConfirContraCambio.setText("Confirme Contraseña: ");

        jbGuardarCambio.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jbGuardarCambio.setText("Guardar");
        jbGuardarCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarCambioActionPerformed(evt);
            }
        });

        jbCancelarCambio.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jbCancelarCambio.setText("Cancelar");
        jbCancelarCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarCambioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCambioContraseñaLayout = new javax.swing.GroupLayout(jpCambioContraseña);
        jpCambioContraseña.setLayout(jpCambioContraseñaLayout);
        jpCambioContraseñaLayout.setHorizontalGroup(
            jpCambioContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCambioContraseñaLayout.createSequentialGroup()
                .addGroup(jpCambioContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpCambioContraseñaLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jpCambioContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlContraNuevaCambio)
                            .addComponent(jlConfirContraCambio))
                        .addGap(18, 18, 18)
                        .addGroup(jpCambioContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNuevaContraCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtConfirmarContraCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpCambioContraseñaLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jbGuardarCambio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbCancelarCambio)))
                .addGap(51, 89, Short.MAX_VALUE))
        );
        jpCambioContraseñaLayout.setVerticalGroup(
            jpCambioContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCambioContraseñaLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jpCambioContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlContraNuevaCambio)
                    .addComponent(jtNuevaContraCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jpCambioContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlConfirContraCambio)
                    .addComponent(jtConfirmarContraCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jpCambioContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelarCambio)
                    .addComponent(jbGuardarCambio))
                .addContainerGap(192, Short.MAX_VALUE))
        );

        jtLogoInicio.addTab("tab3", jpCambioContraseña);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(356, 356, 356)
                .addComponent(jpLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jlSuperior, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtLogoInicio, javax.swing.GroupLayout.Alignment.LEADING))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jtLogoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jpLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
      // ------------------------------------------ METODOS DE REGISTRO USUARIO -----------------------------------------------------
    
    
    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        // TODO add your handling code here: 
        jtLogoInicio.setSelectedIndex(1);
        limpiarRegistro();         

        jtUsuario.setEnabled(false);
        jpContraseña.setEnabled(false);
        jbIniciar.setEnabled(false);
        jbRegistrar.setEnabled(false);
    }//GEN-LAST:event_jbRegistrarActionPerformed
    
    private void jbGuardarRegActionPerformed(java.awt.event.ActionEvent evt) {                                             
       // TODO add your handling code here: 
       String nombre = jtUsuarioReg.getText();
       String correo = jtCorreoReg.getText();
       String contraseña = jtContraReg.getText();
       String confirma = jtConfirContraReg.getText();
       
       if(nombre.isEmpty() && correo.isEmpty() && contraseña.isEmpty() && confirma.isEmpty()){
            JOptionPane.showMessageDialog(null,"Por favor, debe completar todos los campos."," ",JOptionPane.INFORMATION_MESSAGE);
            return;
       }
       if(nombre.isEmpty()){
           JOptionPane.showMessageDialog(null,"Por favor, debe completar el campo de nombre."," ",JOptionPane.INFORMATION_MESSAGE);
            return;
       }else if(nombre.length()> 20){
           JOptionPane.showMessageDialog(null,"Supera el limite de caracteres<20>."," ",JOptionPane.INFORMATION_MESSAGE);
           return;
       }else if(contieneLetrasYEspacios(nombre) != true){
           JOptionPane.showMessageDialog(null,"Por favor, debe ingresar caracteres validos."," ",JOptionPane.INFORMATION_MESSAGE);
           return;
       }
       
       if(correo.isEmpty()){
           JOptionPane.showMessageDialog(null,"Por favor, debe completar el campo de nombre."," ",JOptionPane.INFORMATION_MESSAGE);
            return;
       }else if(correo.length()> 35){
           JOptionPane.showMessageDialog(null,"Supera el limite de caracteres<20>."," ",JOptionPane.INFORMATION_MESSAGE);
           return;
       }else if(contieneLetrasEspaciosNumeros(nombre) != true){
           JOptionPane.showMessageDialog(null,"Por favor, debe ingresar caracteres validos."," ",JOptionPane.INFORMATION_MESSAGE);
           return;
       }
       
       if(contraseña.isEmpty()){
           JOptionPane.showMessageDialog(null,"Por favor, debe completar el campo de nombre."," ",JOptionPane.INFORMATION_MESSAGE);
            return;
       }else if(contraseña.length()<= 6){
           JOptionPane.showMessageDialog(null,"La contraseña es muy corta. Por favor, ingrese un minimo de 8 caracteres."," ",JOptionPane.INFORMATION_MESSAGE);
           return;
       }else if(contraseña.length() > 16){
           JOptionPane.showMessageDialog(null,"La contraseña es muy larga. Por favor, ingresa un  maximo de 16 caracteres."," ",JOptionPane.INFORMATION_MESSAGE);
           return;
       } else if(!contraseña.equals(confirma) ){
            JOptionPane.showMessageDialog(null,"Las Contraseñas deben coincidir."," ",JOptionPane.INFORMATION_MESSAGE);
            return;
       }else{
           usuario = new Usuario(nombre,contraseña,correo,true);
           usuarioData.crearUsuario(usuario);
           JOptionPane.showMessageDialog(null,"Nuevo Usuario Registrado"," ",JOptionPane.INFORMATION_MESSAGE);
           jtLogoInicio.setSelectedIndex(0);
           jtUsuario.setText(nombre);
           jtUsuario.setEnabled(true);
           jpContraseña.setEnabled(true);
           jbIniciar.setEnabled(true);
           jbRegistrar.setEnabled(true);
       }       
    }                                                

    private void jbCancelarRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarRegActionPerformed
        // TODO add your handling code here:
        jtLogoInicio.setSelectedIndex(0);
        jtUsuario.setEnabled(true);
           jpContraseña.setEnabled(true);
           jbIniciar.setEnabled(true);
           jbRegistrar.setEnabled(true);
    }//GEN-LAST:event_jbCancelarRegActionPerformed

    
      // ------------------------------------------ METODOS DE CAMBIO DE CONTRASEÑA --------------------------------------------------
    
    
    private void jlNuevaContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlNuevaContraseñaMouseClicked
        // TODO add your handling code here:
        jtLogoInicio.setSelectedIndex(2); 
        limpiarNuevaContra();
    }//GEN-LAST:event_jlNuevaContraseñaMouseClicked

    private void jbGuardarCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarCambioActionPerformed
        // TODO add your handling code here:        
        String nombre = jtUsuario.getText();
        String nuevaContraseña = jtNuevaContraCambio.getText();
        String confirma = jtConfirmarContraCambio.getText();
        
        if(nombre.isEmpty() || nuevaContraseña.isEmpty() || confirma.isEmpty()){
            JOptionPane.showMessageDialog(null,"Complete los campos"," ",JOptionPane.INFORMATION_MESSAGE);
        }else if(!nuevaContraseña.equals(confirma)){
            JOptionPane.showMessageDialog(null,"Contraseñas no coinciden"," ",JOptionPane.INFORMATION_MESSAGE);        
        }else {
            usuarioData.cambiarContasena(nombre, nuevaContraseña);
            jtLogoInicio.setSelectedIndex(0);
        }         
    }//GEN-LAST:event_jbGuardarCambioActionPerformed

    private void jbCancelarCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarCambioActionPerformed
        // TODO add your handling code here:
        jtLogoInicio.setSelectedIndex(0);
    }//GEN-LAST:event_jbCancelarCambioActionPerformed

    
      // ------------------------------------------ METODOS PARA SUBRAYAR TEXTO "OLVIDASTE CONTRASEÑA" -------------------------------
    
    
    private void jlNuevaContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlNuevaContraseñaMouseEntered
        // TODO add your handling code here:
        Font font = jlNuevaContraseña.getFont();
        Map atributos = font.getAttributes();
        
        atributos.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
        jlNuevaContraseña.setFont(font.deriveFont(atributos));
    }//GEN-LAST:event_jlNuevaContraseñaMouseEntered

    private void jlNuevaContraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlNuevaContraseñaMouseExited
        // TODO add your handling code here:
        Font font = jlNuevaContraseña.getFont();
        Map atributos = font.getAttributes();
        
        atributos.put(TextAttribute.UNDERLINE,-1);
        jlNuevaContraseña.setFont(font.deriveFont(atributos));
    }//GEN-LAST:event_jlNuevaContraseñaMouseExited

   
      // ------------------------------------------ INICIO DE SESION -----------------------------------------------------------------
    
    
    private void jbIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIniciarActionPerformed
        // TODO add your handling code here:
        String nombre = jtUsuario.getText();
        String contraseña =String.valueOf(jpContraseña.getPassword());        
        usuario = usuarioData.buscarUsuario(nombre);
        
        if(nombre.isEmpty() && contraseña.isEmpty()){
            JOptionPane.showMessageDialog(null,"Por favor, es necesario llenar los campos."," ",JOptionPane.INFORMATION_MESSAGE);
            return;
        }else if(nombre.isEmpty()){
            JOptionPane.showMessageDialog(null,"Por favor, es necesario llenar el campo de nombre"," ",JOptionPane.INFORMATION_MESSAGE);
            return;
        }else if(contraseña.isEmpty()){
            JOptionPane.showMessageDialog(null,"Por favor, es necesario llenar el campo de contraseña."," ",JOptionPane.INFORMATION_MESSAGE);
            return;
        } else if(usuario == null){
            JOptionPane.showMessageDialog(null,"No existe el Usuario: "+nombre);            
        }else if(!contraseña.equals(usuario.getContrasena())){ 
            JOptionPane.showMessageDialog(null,"La contraseña es invalida.");
        }else{
            
            MenuGeneral menugeneral = new MenuGeneral();
            menugeneral.setVisible(true); 
            UIManager.put("nimbusBase", new Color(17,120,100));
            UIManager.put("nimbusSelectionBackground", new Color(115, 198, 182 ));
            UIManager.put("control", new Color(223, 243, 237  ));
            menugeneral.labelUsuario(nombre);
        }      
    }//GEN-LAST:event_jbIniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
          UIManager.put("nimbusBase", new Color(17,120,100));
                   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
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
    
    
      // ---------------------------------------------- METODOS AUXILIARES --------------------------------------------------------------
    
    private void limpiarRegistro(){
        jtUsuarioReg.setText("");
        jtCorreoReg.setText("");
        jtContraReg.setText("");
        jtConfirContraReg.setText("");
    }
    
    private void limpiarNuevaContra(){
        jtNuevaContraCambio.setText("");
        jtConfirmarContraCambio.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCancelarCambio;
    private javax.swing.JButton jbCancelarReg;
    private javax.swing.JButton jbGuardarCambio;
    private javax.swing.JButton jbGuardarReg;
    private javax.swing.JButton jbIniciar;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JLabel jlConReg;
    private javax.swing.JLabel jlConfirConReg;
    private javax.swing.JLabel jlConfirContraCambio;
    private javax.swing.JLabel jlContraNuevaCambio;
    private javax.swing.JLabel jlContraseña;
    private javax.swing.JLabel jlCorreoReg;
    private javax.swing.JLabel jlIcono;
    private javax.swing.JLabel jlNuevaContraseña;
    private javax.swing.JLabel jlPie;
    private javax.swing.JLabel jlSuperior;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JLabel jlUsuarioReg;
    private javax.swing.JPanel jpCambioContraseña;
    private javax.swing.JPasswordField jpContraseña;
    private javax.swing.JPanel jpInicio;
    private javax.swing.JPanel jpLogin;
    private javax.swing.JPanel jpRegistro;
    private javax.swing.JTextField jtConfirContraReg;
    private javax.swing.JTextField jtConfirmarContraCambio;
    private javax.swing.JTextField jtContraReg;
    private javax.swing.JTextField jtCorreoReg;
    private javax.swing.JTabbedPane jtLogoInicio;
    private javax.swing.JTextField jtNuevaContraCambio;
    private javax.swing.JTextField jtUsuario;
    private javax.swing.JTextField jtUsuarioReg;
    // End of variables declaration//GEN-END:variables

    
       // -------------------------------------- CLASE CREADA PARA SETTEAR UNA IMAGEN A UN JPANEL -------------------------------------
    
    
    class Fondo extends JPanel{
        private Image img;
        
        public void paint (Graphics g){
            img = new ImageIcon(getClass().getResource("../RecursosVistas/sd.jpg")).getImage();
            g.drawImage(img, 0,0, getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }       
    }    
   
}
