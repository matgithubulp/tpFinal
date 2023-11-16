/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template|
 */
package Vistas;

import AccesoADatos.CompraData;
import AccesoADatos.DetalleCompraData;
import AccesoADatos.ProductoData;
import AccesoADatos.ProveedorData;
import Dominio.Compra;
import Dominio.DetalleCompra;
import Dominio.Producto;
import Dominio.Proveedor;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class MenuGeneral extends javax.swing.JFrame {
    private DefaultTableModel modelo;    
    private DefaultTableModel modelo2;
    private DefaultTableModel modelo3;
    private DefaultTableModel modelo4;
    private DefaultTableModel modelo5;
    private ProveedorData proveedorData = new ProveedorData();
    private Proveedor proveedor = null;
    List<Producto> productos = null;  
    List<Proveedor> proveedores = null;
    private ProductoData productoData = new ProductoData();
    private Producto producto = null;
    private boolean cabeceraProdIni = false;
    private boolean cabeceraCompraIni = false;
    private boolean cabeceraDetalleIni = false;
    private boolean cabeceraRepoIni = false;
    private boolean listaProducto = false;
    private boolean listaCompra = false;
    private boolean listaDetalle = false;
    private boolean listaRepoIni = false;
    private boolean comboProveedor = false;
    private boolean comboProducto = false;
    private boolean btnModifiProve = false;
    private boolean listaProductosCargada = false;
    private Compra compra = null;
    private CompraData compraData = new CompraData();
    private DetalleCompra detalle = null;
    private DetalleCompraData detalleData = new DetalleCompraData();    
    private LocalDate fc = null;
    
    
    public MenuGeneral() {        
        initComponents();        
        modelo = new DefaultTableModel();
        modelo2 = new DefaultTableModel();    
        modelo3 = new DefaultTableModel(); 
        modelo4 = new DefaultTableModel(); 
        modelo5 = new DefaultTableModel();
        cargaTablaIni();
        
    }  
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMenu = new Fondo();
        jlTitulo = new javax.swing.JLabel();
        jlIcono = new javax.swing.JLabel();
        jpPrincipal = new Fondo();
        jlIconoPrin = new javax.swing.JLabel();
        jlPrincipal = new javax.swing.JLabel();
        jpProveedor = new Fondo();
        jlIconoProv = new javax.swing.JLabel();
        jlProveedores = new javax.swing.JLabel();
        jpProducto = new Fondo();
        jlIconoProd = new javax.swing.JLabel();
        jlProducto = new javax.swing.JLabel();
        jpCompra = new Fondo();
        jlIconoCompra = new javax.swing.JLabel();
        jlCompra = new javax.swing.JLabel();
        jPanel2 = new Fondo();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlabelUsuario = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jtpEscritorio = new javax.swing.JTabbedPane();
        jpInicio = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtRepositorio = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jbtnRellenarStock = new javax.swing.JButton();
        jpInivioProveedor = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProveedor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jtxBuscarProveedor = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnDeshabilitar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jtxRazonSocial = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jtxDomicilio = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jtxTelefono = new javax.swing.JTextField();
        jbtnGuardarNewProveedor = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jcbTelefono = new javax.swing.JComboBox<>();
        jtxTelefonoo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnBuscarProveedor = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnHabilitar = new javax.swing.JButton();
        jcbActivos = new javax.swing.JCheckBox();
        jcbNoActivos = new javax.swing.JCheckBox();
        btnActualizarTabla = new javax.swing.JButton();
        jpInicioProducto = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtTablaProducto = new javax.swing.JTable();
        jlProductoTitulo = new javax.swing.JLabel();
        jbNuevoP = new javax.swing.JButton();
        jbModificarP = new javax.swing.JButton();
        jbEliminarP = new javax.swing.JButton();
        jlProductos = new javax.swing.JLabel();
        jpNuevoProducto = new javax.swing.JPanel();
        jlNuevoPTitulo = new javax.swing.JLabel();
        jlNuevoPNombre = new javax.swing.JLabel();
        jlNuevoPDescripcion = new javax.swing.JLabel();
        jlNuevoPPrecio = new javax.swing.JLabel();
        jtNuevoPNombre = new javax.swing.JTextField();
        jtNuevoPDescripcion = new javax.swing.JTextField();
        jtNuevoPPrecio = new javax.swing.JTextField();
        jbGuardarProNuevo = new javax.swing.JButton();
        jbCancelarProNuevo = new javax.swing.JButton();
        jlNuevoPStock = new javax.swing.JLabel();
        jtNuevoPStock = new javax.swing.JTextField();
        jcbListaProductos = new javax.swing.JComboBox<>();
        jcbMasBajo = new javax.swing.JCheckBox();
        jcbListarAlto = new javax.swing.JCheckBox();
        jcbMasComprado = new javax.swing.JCheckBox();
        jbActualizarTProdu = new javax.swing.JButton();
        jpInicioCompra = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtTablaDetalle = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtTablaCompra = new javax.swing.JTable();
        jlCompraDetalleCTabla = new javax.swing.JLabel();
        jlCompraTabla = new javax.swing.JLabel();
        jdcCompraFecha1 = new com.toedter.calendar.JDateChooser();
        jdcCompraFecha2 = new com.toedter.calendar.JDateChooser();
        jpnewCompra = new javax.swing.JPanel();
        jlNuevaCProvedor = new javax.swing.JLabel();
        jcbNuevaCProveedor = new javax.swing.JComboBox<>();
        jlNuevaCProducto = new javax.swing.JLabel();
        jlNuevaCFecha = new javax.swing.JLabel();
        jdcNuevaCFecha = new com.toedter.calendar.JDateChooser();
        jlNuevaCPrecio = new javax.swing.JLabel();
        jtNuevaCPrecio = new javax.swing.JTextField();
        jlNuevaCCantidad = new javax.swing.JLabel();
        jtNuevaCCantidad = new javax.swing.JTextField();
        jbNuevaCComprar = new javax.swing.JButton();
        jlNuevaCompraTitulo = new javax.swing.JLabel();
        jbNuevaCCancelar = new javax.swing.JButton();
        jcbNuevaCProducto = new javax.swing.JComboBox<>();
        jlCompraSeleccionar = new javax.swing.JLabel();
        jlCompraY = new javax.swing.JLabel();
        jbNuevaCompra = new javax.swing.JButton();
        btnBuscarFecha = new javax.swing.JButton();
        jbtnActualizaTabla = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnComprasXProveedor = new javax.swing.JButton();
        jtfCompraXProducto = new javax.swing.JTextField();
        jtfComprasXProveedor = new javax.swing.JTextField();
        btnComprasXProducto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpMenu.setBackground(new java.awt.Color(2, 104, 66));

        jlTitulo.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlTitulo.setText("Administracion");

        jlIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosVistas/image.png"))); // NOI18N

        jpPrincipal.setBackground(new java.awt.Color(2, 104, 66));
        jpPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpPrincipalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpPrincipalMouseExited(evt);
            }
        });

        jlIconoPrin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosVistas/Principal.png"))); // NOI18N

        jlPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jlPrincipal.setText("Principal");

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jlIconoPrin)
                .addGap(18, 18, 18)
                .addComponent(jlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlIconoPrin, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpProveedor.setBackground(new java.awt.Color(2, 104, 66));
        jpProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpProveedorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpProveedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpProveedorMouseExited(evt);
            }
        });

        jlIconoProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosVistas/Proveedor.png"))); // NOI18N

        jlProveedores.setForeground(new java.awt.Color(255, 255, 255));
        jlProveedores.setText("Proveedores");

        javax.swing.GroupLayout jpProveedorLayout = new javax.swing.GroupLayout(jpProveedor);
        jpProveedor.setLayout(jpProveedorLayout);
        jpProveedorLayout.setHorizontalGroup(
            jpProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProveedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlIconoProv)
                .addGap(18, 18, 18)
                .addComponent(jlProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jpProveedorLayout.setVerticalGroup(
            jpProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProveedorLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addComponent(jlIconoProv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpProducto.setBackground(new java.awt.Color(2, 104, 66));
        jpProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpProductoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpProductoMouseExited(evt);
            }
        });

        jlIconoProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosVistas/Producto.png"))); // NOI18N

        jlProducto.setForeground(new java.awt.Color(255, 255, 255));
        jlProducto.setText("Producto");

        javax.swing.GroupLayout jpProductoLayout = new javax.swing.GroupLayout(jpProducto);
        jpProducto.setLayout(jpProductoLayout);
        jpProductoLayout.setHorizontalGroup(
            jpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProductoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlIconoProd)
                .addGap(18, 18, 18)
                .addComponent(jlProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jpProductoLayout.setVerticalGroup(
            jpProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProductoLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addComponent(jlIconoProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpCompra.setBackground(new java.awt.Color(2, 104, 66));
        jpCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpCompraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpCompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpCompraMouseExited(evt);
            }
        });

        jlIconoCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosVistas/Compra.png"))); // NOI18N

        jlCompra.setForeground(new java.awt.Color(255, 255, 255));
        jlCompra.setText("Compra");

        javax.swing.GroupLayout jpCompraLayout = new javax.swing.GroupLayout(jpCompra);
        jpCompra.setLayout(jpCompraLayout);
        jpCompraLayout.setHorizontalGroup(
            jpCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCompraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlIconoCompra)
                .addGap(20, 20, 20)
                .addComponent(jlCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jpCompraLayout.setVerticalGroup(
            jpCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCompraLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jpCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlIconoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlIcono)
                    .addComponent(jlTitulo))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlIcono)
                .addGap(28, 28, 28)
                .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(2, 104, 66));

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bienvenido:");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosVistas/usuario.png"))); // NOI18N

        jlabelUsuario.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RecursosVistas/electrodomestico (2).png"))); // NOI18N

        jButton6.setText("Cerrar Sesion");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 1285, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton6))
                .addGap(434, 434, 434))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jlabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addGap(30, 30, 30))))
        );

        jtRepositorio.setModel(new javax.swing.table.DefaultTableModel(
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
        jtRepositorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtRepositorioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtRepositorio);

        jLabel2.setText("Repositorio de Cantidad");

        jButton1.setText("jButton1");

        jbtnRellenarStock.setText("Rellenar Stock");
        jbtnRellenarStock.setEnabled(false);
        jbtnRellenarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRellenarStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpInicioLayout = new javax.swing.GroupLayout(jpInicio);
        jpInicio.setLayout(jpInicioLayout);
        jpInicioLayout.setHorizontalGroup(
            jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInicioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(57, 57, 57))
            .addGroup(jpInicioLayout.createSequentialGroup()
                .addGroup(jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInicioLayout.createSequentialGroup()
                        .addGap(497, 497, 497)
                        .addComponent(jLabel2))
                    .addGroup(jpInicioLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jbtnRellenarStock)))
                .addContainerGap(611, Short.MAX_VALUE))
        );
        jpInicioLayout.setVerticalGroup(
            jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInicioLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGap(117, 117, 117)
                .addGroup(jpInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnRellenarStock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(67, 67, 67))
        );

        jtpEscritorio.addTab("tab1", jpInicio);

        jtProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo ", "Razon Social", "Domicilio", "Telefono", "Estado"
            }
        ));
        jtProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProveedorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtProveedor);

        jLabel1.setText("Proveedores ");

        jtxBuscarProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxBuscarProveedorMouseClicked(evt);
            }
        });

        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnDeshabilitar.setText("Deshabilitar");
        btnDeshabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeshabilitarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel17.setText("Razon Social");

        jLabel18.setText("Domicilio");

        jLabel19.setText("Telefono:");

        jbtnGuardarNewProveedor.setText("Cargar");
        jbtnGuardarNewProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarNewProveedorActionPerformed(evt);
            }
        });

        jLabel21.setText("Cargar de Proveedor");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jcbTelefono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+54 9" }));

        jLabel7.setText("Cod. de Area:");

        jLabel8.setText("Num. Telefono");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jbtnGuardarNewProveedor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(110, 110, 110)
                                                .addComponent(btnCancelar))))
                                    .addComponent(jtxRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jcbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jtxTelefono))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxTelefonoo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)))
                                    .addComponent(jtxDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(86, 86, 86))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel21)
                .addGap(121, 121, 121)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jtxRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jtxDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jtxTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxTelefonoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnGuardarNewProveedor)
                    .addComponent(btnCancelar))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        btnBuscarProveedor.setText("Buscar");
        btnBuscarProveedor.setEnabled(false);
        btnBuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProveedorActionPerformed(evt);
            }
        });

        jLabel4.setText("Ingrese proveedor");

        btnHabilitar.setText("Habilitar");
        btnHabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabilitarActionPerformed(evt);
            }
        });

        jcbActivos.setText("proveedores ACTIVOS");
        jcbActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbActivosActionPerformed(evt);
            }
        });

        jcbNoActivos.setText("proveedores NO activos");
        jcbNoActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNoActivosActionPerformed(evt);
            }
        });

        btnActualizarTabla.setText("Actualizar Tabla");
        btnActualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpInivioProveedorLayout = new javax.swing.GroupLayout(jpInivioProveedor);
        jpInivioProveedor.setLayout(jpInivioProveedorLayout);
        jpInivioProveedorLayout.setHorizontalGroup(
            jpInivioProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInivioProveedorLayout.createSequentialGroup()
                .addGroup(jpInivioProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInivioProveedorLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jpInivioProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpInivioProveedorLayout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(53, 53, 53)
                                .addComponent(btnModificar)
                                .addGap(104, 104, 104)
                                .addComponent(btnActualizarTabla)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHabilitar)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeshabilitar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpInivioProveedorLayout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(jLabel1))
                    .addGroup(jpInivioProveedorLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel4)
                        .addGap(46, 46, 46)
                        .addComponent(jtxBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(btnBuscarProveedor))
                    .addGroup(jpInivioProveedorLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jcbActivos)
                        .addGap(136, 136, 136)
                        .addComponent(jcbNoActivos)))
                .addGap(125, 125, 125)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(410, Short.MAX_VALUE))
        );
        jpInivioProveedorLayout.setVerticalGroup(
            jpInivioProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInivioProveedorLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jpInivioProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpInivioProveedorLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addGroup(jpInivioProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtxBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarProveedor))
                        .addGap(31, 31, 31)
                        .addGroup(jpInivioProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbActivos)
                            .addComponent(jcbNoActivos))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(jpInivioProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeshabilitar)
                            .addComponent(btnModificar)
                            .addComponent(jButton2)
                            .addComponent(btnHabilitar)
                            .addComponent(btnActualizarTabla))))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jtpEscritorio.addTab("tab2", jpInivioProveedor);

        jtTablaProducto.setModel(new javax.swing.table.DefaultTableModel(
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
        jtTablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaProductoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtTablaProducto);

        jlProductoTitulo.setText("Producto");

        jbNuevoP.setText("Nuevo");
        jbNuevoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoPActionPerformed(evt);
            }
        });

        jbModificarP.setText("Modificar");
        jbModificarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarPActionPerformed(evt);
            }
        });

        jbEliminarP.setText("Eliminar");
        jbEliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarPActionPerformed(evt);
            }
        });

        jlProductos.setText("Productos:");

        jlNuevoPTitulo.setText("Cargar un Producto");

        jlNuevoPNombre.setText("Nombre:");

        jlNuevoPDescripcion.setText("Descripcion:");

        jlNuevoPPrecio.setText("Precio:");

        jbGuardarProNuevo.setText("Guardar");
        jbGuardarProNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarProNuevoActionPerformed(evt);
            }
        });

        jbCancelarProNuevo.setText("Cancelar");
        jbCancelarProNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarProNuevoActionPerformed(evt);
            }
        });

        jlNuevoPStock.setText("Stock:");

        javax.swing.GroupLayout jpNuevoProductoLayout = new javax.swing.GroupLayout(jpNuevoProducto);
        jpNuevoProducto.setLayout(jpNuevoProductoLayout);
        jpNuevoProductoLayout.setHorizontalGroup(
            jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNuevoProductoLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jlNuevoPTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpNuevoProductoLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jbGuardarProNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbCancelarProNuevo)
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNuevoProductoLayout.createSequentialGroup()
                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNuevoProductoLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jlNuevoPNombre)
                        .addGap(36, 36, 36))
                    .addGroup(jpNuevoProductoLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlNuevoPDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlNuevoPPrecio)
                                .addComponent(jlNuevoPStock)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtNuevoPDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNuevoPNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtNuevoPPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                        .addComponent(jtNuevoPStock, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(48, 48, 48))
        );
        jpNuevoProductoLayout.setVerticalGroup(
            jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNuevoProductoLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jlNuevoPTitulo)
                .addGap(119, 119, 119)
                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNuevoPNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNuevoPNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNuevoPDescripcion)
                    .addComponent(jtNuevoPDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNuevoPStock, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtNuevoPStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNuevoPPrecio)
                    .addComponent(jtNuevoPPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jpNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelarProNuevo)
                    .addComponent(jbGuardarProNuevo))
                .addGap(159, 159, 159))
        );

        jcbListaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaProductosActionPerformed(evt);
            }
        });

        jcbMasBajo.setText("Precio mas bajo");
        jcbMasBajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMasBajoActionPerformed(evt);
            }
        });

        jcbListarAlto.setText("Listar mas barato");
        jcbListarAlto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListarAltoActionPerformed(evt);
            }
        });

        jcbMasComprado.setText("Producto mas comprado");
        jcbMasComprado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMasCompradoActionPerformed(evt);
            }
        });

        jbActualizarTProdu.setText("Actualiazar Tabla");
        jbActualizarTProdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarTProduActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpInicioProductoLayout = new javax.swing.GroupLayout(jpInicioProducto);
        jpInicioProducto.setLayout(jpInicioProductoLayout);
        jpInicioProductoLayout.setHorizontalGroup(
            jpInicioProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInicioProductoLayout.createSequentialGroup()
                .addGroup(jpInicioProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInicioProductoLayout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(jlProductoTitulo))
                    .addGroup(jpInicioProductoLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jpInicioProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpInicioProductoLayout.createSequentialGroup()
                                .addGroup(jpInicioProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpInicioProductoLayout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(jlProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(jcbListaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpInicioProductoLayout.createSequentialGroup()
                                        .addComponent(jcbMasBajo)
                                        .addGap(104, 104, 104)
                                        .addComponent(jcbListarAlto)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcbMasComprado))
                            .addGroup(jpInicioProductoLayout.createSequentialGroup()
                                .addComponent(jbNuevoP)
                                .addGap(18, 18, 18)
                                .addComponent(jbModificarP)
                                .addGap(125, 125, 125)
                                .addComponent(jbActualizarTProdu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbEliminarP))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(jpNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(530, Short.MAX_VALUE))
        );
        jpInicioProductoLayout.setVerticalGroup(
            jpInicioProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInicioProductoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jlProductoTitulo)
                .addGap(58, 58, 58)
                .addGroup(jpInicioProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlProductos)
                    .addComponent(jcbListaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jpInicioProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbMasBajo)
                    .addComponent(jcbListarAlto)
                    .addComponent(jcbMasComprado))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(jpInicioProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevoP)
                    .addComponent(jbModificarP)
                    .addComponent(jbEliminarP)
                    .addComponent(jbActualizarTProdu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInicioProductoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        jtpEscritorio.addTab("tab3", jpInicioProducto);

        jtTablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(jtTablaDetalle);

        jtTablaCompra.setModel(new javax.swing.table.DefaultTableModel(
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
        jtTablaCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaCompraMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jtTablaCompra);

        jlCompraDetalleCTabla.setText("DetalleCompra");

        jlCompraTabla.setText("Compra");

        jdcCompraFecha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdcCompraFecha1MouseClicked(evt);
            }
        });

        jlNuevaCProvedor.setText("Proveedor:");

        jlNuevaCProducto.setText("Producto:");

        jlNuevaCFecha.setText("Fecha:");

        jlNuevaCPrecio.setText("Precio:");

        jlNuevaCCantidad.setText("Cantidad:");

        jbNuevaCComprar.setText("Comprar");
        jbNuevaCComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaCComprarActionPerformed(evt);
            }
        });

        jlNuevaCompraTitulo.setText("Compra nueva");

        jbNuevaCCancelar.setText("Cancelar");
        jbNuevaCCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaCCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnewCompraLayout = new javax.swing.GroupLayout(jpnewCompra);
        jpnewCompra.setLayout(jpnewCompraLayout);
        jpnewCompraLayout.setHorizontalGroup(
            jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnewCompraLayout.createSequentialGroup()
                .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnewCompraLayout.createSequentialGroup()
                        .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnewCompraLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jlNuevaCCantidad)
                                .addGap(4, 4, 4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnewCompraLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlNuevaCProvedor)
                                    .addComponent(jlNuevaCProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnewCompraLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlNuevaCFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlNuevaCPrecio))))
                                .addGap(1, 1, 1)))
                        .addGap(22, 22, 22)
                        .addComponent(jtNuevaCCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnewCompraLayout.createSequentialGroup()
                            .addGap(133, 133, 133)
                            .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcbNuevaCProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlNuevaCompraTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcbNuevaCProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jdcNuevaCFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtNuevaCPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnewCompraLayout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jbNuevaCCancelar)))
                    .addGroup(jpnewCompraLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jbNuevaCComprar)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jpnewCompraLayout.setVerticalGroup(
            jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnewCompraLayout.createSequentialGroup()
                .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnewCompraLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlNuevaCompraTitulo)
                        .addGap(79, 79, 79))
                    .addGroup(jpnewCompraLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNuevaCProvedor)
                            .addComponent(jcbNuevaCProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcbNuevaCProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNuevaCProducto))
                .addGap(18, 18, 18)
                .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlNuevaCFecha)
                    .addComponent(jdcNuevaCFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNuevaCPrecio)
                    .addComponent(jtNuevaCPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNuevaCCantidad)
                    .addComponent(jtNuevaCCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jpnewCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevaCComprar)
                    .addComponent(jbNuevaCCancelar))
                .addGap(52, 52, 52))
        );

        jlCompraSeleccionar.setText("Listar por fechas");

        jlCompraY.setText("hasta");

        jbNuevaCompra.setText("Nueva compra");
        jbNuevaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaCompraActionPerformed(evt);
            }
        });

        btnBuscarFecha.setText("Buscar");
        btnBuscarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFechaActionPerformed(evt);
            }
        });

        jbtnActualizaTabla.setText("Actualizar Tablas");
        jbtnActualizaTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnActualizaTablaActionPerformed(evt);
            }
        });

        jLabel10.setText("Compas por proveedor:");

        jLabel11.setText("Compras por producto:");

        btnComprasXProveedor.setText("Buscar");
        btnComprasXProveedor.setEnabled(false);
        btnComprasXProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasXProveedorActionPerformed(evt);
            }
        });

        jtfCompraXProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfCompraXProductoMouseClicked(evt);
            }
        });

        jtfComprasXProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfComprasXProveedorMouseClicked(evt);
            }
        });
        jtfComprasXProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfComprasXProveedorActionPerformed(evt);
            }
        });

        btnComprasXProducto.setText("Buscar");
        btnComprasXProducto.setEnabled(false);
        btnComprasXProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasXProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpInicioCompraLayout = new javax.swing.GroupLayout(jpInicioCompra);
        jpInicioCompra.setLayout(jpInicioCompraLayout);
        jpInicioCompraLayout.setHorizontalGroup(
            jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInicioCompraLayout.createSequentialGroup()
                .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInicioCompraLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlCompraDetalleCTabla)
                            .addComponent(jlCompraTabla))
                        .addGap(47, 47, 47)
                        .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpInicioCompraLayout.createSequentialGroup()
                                .addComponent(jbNuevaCompra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnActualizaTabla))))
                    .addGroup(jpInicioCompraLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpInicioCompraLayout.createSequentialGroup()
                                .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(30, 30, 30)
                                .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpInicioCompraLayout.createSequentialGroup()
                                        .addComponent(jtfCompraXProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnComprasXProducto))
                                    .addGroup(jpInicioCompraLayout.createSequentialGroup()
                                        .addComponent(jtfComprasXProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnComprasXProveedor))))
                            .addGroup(jpInicioCompraLayout.createSequentialGroup()
                                .addComponent(jlCompraSeleccionar)
                                .addGap(45, 45, 45)
                                .addComponent(jdcCompraFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jlCompraY)
                                .addGap(21, 21, 21)
                                .addComponent(jdcCompraFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarFecha)))))
                .addGap(122, 122, 122)
                .addComponent(jpnewCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(671, Short.MAX_VALUE))
        );
        jpInicioCompraLayout.setVerticalGroup(
            jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInicioCompraLayout.createSequentialGroup()
                .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInicioCompraLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jlCompraSeleccionar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInicioCompraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcCompraFecha1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcCompraFecha2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCompraY, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuscarFecha, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(38, 38, 38)
                .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtfComprasXProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComprasXProveedor))
                .addGap(16, 16, 16)
                .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtfCompraXProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComprasXProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCompraTabla))
                .addGap(35, 35, 35)
                .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevaCompra)
                    .addComponent(jbtnActualizaTabla))
                .addGap(28, 28, 28)
                .addGroup(jpInicioCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCompraDetalleCTabla))
                .addGap(62, 62, 62))
            .addGroup(jpInicioCompraLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jpnewCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpEscritorio.addTab("tab4", jpInicioCompra);

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Sistema de PROVEMAX");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jtpEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(539, 539, 539)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jtpEscritorio))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
      // ------- METODOS DE SELECCION (CAMBIO DE COLOR EN EL MENU LATERAL) ------------------
    
    
    private void jpPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPrincipalMouseEntered
        // TODO add your handling code here:
        seleccion(jpPrincipal);
    }//GEN-LAST:event_jpPrincipalMouseEntered

    private void jpPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPrincipalMouseExited
        // TODO add your handling code here:
        sinSeleccionar(jpPrincipal);
    }//GEN-LAST:event_jpPrincipalMouseExited

    private void jpProveedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpProveedorMouseEntered
        // TODO add your handling code here:
        seleccion(jpProveedor);
    }//GEN-LAST:event_jpProveedorMouseEntered

    private void jpProveedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpProveedorMouseExited
        // TODO add your handling code here:
        sinSeleccionar(jpProveedor);
    }//GEN-LAST:event_jpProveedorMouseExited

    private void jpProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpProductoMouseEntered
        // TODO add your handling code here:
        seleccion(jpProducto);
        
    }//GEN-LAST:event_jpProductoMouseEntered

    private void jpProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpProductoMouseExited
        // TODO add your handling code here:
        sinSeleccionar(jpProducto);
    }//GEN-LAST:event_jpProductoMouseExited

    private void jpCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCompraMouseEntered
        // TODO add your handling code here:
        seleccion(jpCompra);
       
    }//GEN-LAST:event_jpCompraMouseEntered

    private void jpCompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCompraMouseExited
        // TODO add your handling code here:
        sinSeleccionar(jpCompra);
    }//GEN-LAST:event_jpCompraMouseExited

    
      // ------- METODOS DE CLICK PARA ACCEDER A LAS VENTANAS CORRESPONDIENTES --------------
    
    
    private void jpPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPrincipalMouseClicked
        
        jtpEscritorio.setSelectedIndex(0);
        cargaTablaIni();
    }//GEN-LAST:event_jpPrincipalMouseClicked

    private void jpProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpProveedorMouseClicked
        
        
        jtpEscritorio.setSelectedIndex(1);
        jPanel1.setVisible(false);       
        
        List<Proveedor> listaTablaProveedor = new ArrayList<>(proveedorData.listarProveedores());
        cargarDatosEnTablaProveedor(listaTablaProveedor);
        
        btnModificar.setEnabled(false);
        btnDeshabilitar.setEnabled(false);
        btnHabilitar.setEnabled(false);
        
    }//GEN-LAST:event_jpProveedorMouseClicked
    
    private void jpProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpProductoMouseClicked
              
        jtpEscritorio.setSelectedIndex(2);
        
        if(!cabeceraProdIni){
            cabeceraProducto();
        }
               
        if(!listaProductosCargada){
            List<Producto> listaComboProducto = new ArrayList<>(productoData.listaProductosSinDuplicado());
            listaComboProducto(listaComboProducto);
        }

            List<Producto> listaTablaProducto = new ArrayList<>(productoData.listaProductos());
            listaProducto(listaTablaProducto);
  
        jbModificarP.setEnabled(false);
        jpNuevoProducto.setVisible(false);
        jbEliminarP.setEnabled(false);
    }//GEN-LAST:event_jpProductoMouseClicked

    private void jpCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCompraMouseClicked
        // TODO add your handling code here:
        jtpEscritorio.setSelectedIndex(3);       
        
        if(!cabeceraCompraIni && !cabeceraDetalleIni){
            cabeceraCompra();
            cabeceraDetalle();
        }
        if(!listaCompra && !listaDetalle){
            List<Compra> listaTablaCompra = new ArrayList<>(compraData.listaCompras());
            listaCompra(listaTablaCompra);
            List<DetalleCompra> listaD= new ArrayList<>(detalleData.listaDetalles());
            listaDetalle(listaD);
        }        
        jpnewCompra.setVisible(false);
    }//GEN-LAST:event_jpCompraMouseClicked

        
      // ------- METODOS PARA LA VENTANA PROVEEDOR ------------------------------------------
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        desactivarBotonesProveedor();  
        jPanel1.setVisible(true);
        jcbTelefono.setSelectedIndex(-1);
        borrarFila2();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbtnGuardarNewProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarNewProveedorActionPerformed
      
        // Obtencion de los datos del proveedor desde los textfield.
        String razonSocial = jtxRazonSocial.getText();
        String domicilio = jtxDomicilio.getText();
        String numeroTelefono = jtxTelefonoo.getText();
        String codigoDeArea = jtxTelefono.getText();

        int codigoAreaPais = jcbTelefono.getSelectedIndex();

        // // Verificaciones de camposs
        
        //PRimera verificacion: verifica que los campos esten lenos, si estos estan vacios entra al if.
        if (razonSocial.isEmpty() || domicilio.isEmpty() || numeroTelefono.isEmpty() || codigoDeArea.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Es necesario llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //el try, esta por que toma la exception: NumberFormatException.
        try {
            //Segunda: verifica si contiene numeros el campo de razonSocial
            if (verificarSiHayNumeros(razonSocial)) {
                JOptionPane.showMessageDialog(null, "La razon social no debe contener numeros.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //tercera: verifica el tamaño del string ingresado
            if (numeroTelefono.length() != 7) {
                JOptionPane.showMessageDialog(null, "El numero de telefono debe contener exactamente 7 digitos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //cuarta: verificacion para que el numero ingresado sea mayot que 0
            int numeroTelefonoEntero = Integer.parseInt(numeroTelefono);
            if (numeroTelefonoEntero < 0) {
                JOptionPane.showMessageDialog(null, "El numero de telefono debe ser un numero positivo.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //quintaa: verifica el tamaño del string ingresado
            if (codigoDeArea.length() != 3) {
                JOptionPane.showMessageDialog(null, "El codigo de area debe contener exactamente 3 digitos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //sexta: verificacion para que el numero ingresado sea mayot que 0
            int codigoDeAreaEntero = Integer.parseInt(codigoDeArea);
            if (codigoDeAreaEntero < 0) {
                JOptionPane.showMessageDialog(null, "El codigo de area debe ser un numero positivo.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El codigo de area o el numero de telefono no deben contener caracteres no numericos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //Verificacion del limite de domicilio.
        if (domicilio.length() > 100) {
            JOptionPane.showMessageDialog(null, "Usted a ingresado: " + domicilio.length() + " caracteres y el limite es de 100.", "Error", JOptionPane.ERROR_MESSAGE);
            jtxDomicilio.setText(" ");
            return;
        }
        //confimar carga de proveedor o no.
        int opcion = JOptionPane.showConfirmDialog(
                null,
                "¿Esta seguro de cargar el nuevo Proveedor?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            //busca proveedor
            proveedor = proveedorData.buscarProveedorNombre(razonSocial);
             // Basicamente el if es para verificar si existe o no el proveedor, si existe muestrar un mensaje de error si no, continua con else
            if (proveedor != null && razonSocial.equals(proveedor.getRazonSocial())) {
                JOptionPane.showMessageDialog(null, "Ya existe un proveedor: " + razonSocial, "Error", JOptionPane.ERROR_MESSAGE);
                List<Proveedor> lista = new ArrayList<>(proveedorData.listarProveedores());
                cargarDatosEnTablaProveedor(lista);
                //crea el nuevo proveedor, carga los datos y actualiza la tabla
             } else {
                String telefono = "+54 9-" + codigoDeArea + "-" + numeroTelefono;
                proveedor = new Proveedor(razonSocial, domicilio, telefono, true);
                proveedorData.agregarProveedor(proveedor);
                limpiarCampos();

                JOptionPane.showMessageDialog(null, "El proveedor se ha cargado con Exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
                btnActualizarTabla.setEnabled(true);
                jcbActivos.setEnabled(true);  
                jcbNoActivos.setEnabled(true);
                List<Proveedor> lista = new ArrayList<>(proveedorData.listarProveedores());
                cargarDatosEnTablaProveedor(lista);

            }
        } else {
            JOptionPane.showMessageDialog(null, "Cambios cancelados.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);

        }
        //una vez realizado todo se vuelven a habilitar los bontones.
        btnActualizarTabla.setEnabled(true);
        jcbActivos.setEnabled(true);  
        jcbNoActivos.setEnabled(true);
        jtxBuscarProveedor.setEnabled(true);
        jPanel1.setVisible(false);
        
    }//GEN-LAST:event_jbtnGuardarNewProveedorActionPerformed
   
    private void btnBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProveedorActionPerformed
        
        String vproveedor = jtxBuscarProveedor.getText();
        modelo2 = (DefaultTableModel) jtProveedor.getModel();
        boolean proveedorYaCargado = false;
        if(!vproveedor.isEmpty()){      
           proveedor = proveedorData.buscarProveedorNombre(vproveedor);
           
           
           if (proveedor != null) {
             Object[] rowData = {
                    proveedor.getIdProveedor(),
                    proveedor.getRazonSocial(),
                    proveedor.getDomicilio(),
                    proveedor.getTelefono(),  
                    proveedor.getEstado(),
            };
            borrarFila2();
            modelo2.addRow(rowData);
            proveedorYaCargado = true;
          } else {
               
            JOptionPane.showMessageDialog(null, "Proveedor no encontrado.", "Error!", JOptionPane.INFORMATION_MESSAGE);
            modelo2.setRowCount(0);
            List<Proveedor> listaTablaProveedor = new ArrayList<>(proveedorData.listarProveedores());
            cargarDatosEnTablaProveedor(listaTablaProveedor);   
            
          }
        }else{
            JOptionPane.showMessageDialog(null, "Es necesario llenar el buscador.", "Error!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarProveedorActionPerformed

    private void btnDeshabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeshabilitarActionPerformed
       int filaSeleccionada = jtProveedor.getSelectedRow();
       
       
        if (filaSeleccionada != -1) {  
        Boolean estado = (Boolean) modelo2.getValueAt(filaSeleccionada, 4);
        String razonSocial = (String) modelo2.getValueAt(filaSeleccionada, 1);
        if(estado == false){
            JOptionPane.showMessageDialog(null, "El proveedor: "+razonSocial+" ya se encuentra Deshabilitado", razonSocial, JOptionPane.INFORMATION_MESSAGE);
            return;
        }
    
        int opcion = JOptionPane.showConfirmDialog( 
                null,
                "Estas seguro de Deshabilitar el proveedor: " + razonSocial,
                "Confirmar", 
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            
            proveedorData.eliminarProveedor(razonSocial);
            JOptionPane.showMessageDialog(null, "Deshabilitado Correctamente.", "Exito", JOptionPane.INFORMATION_MESSAGE);
            List<Proveedor> prove = new ArrayList<>(proveedorData.listarProveedores());
            cargarDatosEnTablaProveedor(prove);
        } else {
            
            JOptionPane.showMessageDialog(null, "Cancelado.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
            
        }
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione un proveedor para DESHABILITAR.", "Error", JOptionPane.INFORMATION_MESSAGE);
    }
        btnModificar.setEnabled(false);
        btnHabilitar.setEnabled(false);
        btnDeshabilitar.setEnabled(false);
        
    }//GEN-LAST:event_btnDeshabilitarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       int filaSeleccionada = jtProveedor.getSelectedRow();      
      
        if (filaSeleccionada != -1) {  
        int idProveedor = (Integer) modelo2.getValueAt(filaSeleccionada, 0);
        String razonSocial = (String) modelo2.getValueAt(filaSeleccionada, 1);
        String domicilio = (String) modelo2.getValueAt(filaSeleccionada, 2);
        String telefono = (String) modelo2.getValueAt(filaSeleccionada, 3);        
              
        proveedor = new Proveedor(idProveedor, razonSocial, domicilio, telefono);   
      
        // JOptionPane para confirmar
        int opcion = JOptionPane.showConfirmDialog( 
                null,
                "Estas seguro de realizar estos cambios?",
                "Confirmar cambios", 
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            
            proveedorData.modificarProveedor(proveedor);
            JOptionPane.showMessageDialog(null, "Cambios realizados con exito.", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            
            JOptionPane.showMessageDialog(null, "Cambios cancelados.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
            
        }
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione un proveedor para modificar.", "Error", JOptionPane.INFORMATION_MESSAGE);
    }
        btnModificar.setEnabled(false);
        btnHabilitar.setEnabled(false);
        btnDeshabilitar.setEnabled(false);
        
    }//GEN-LAST:event_btnModificarActionPerformed
    
    
      // ------- METODOS PARA LA VENTANA PRODUCTO -------------------------------------------
    
    
    private void jbNuevoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoPActionPerformed
        // TODO add your handling code here:
        jpNuevoProducto.setVisible(true);
        desactivarBotonesProducto();
        borrarFilaProducto();
        
    }//GEN-LAST:event_jbNuevoPActionPerformed

    private void jbGuardarProNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarProNuevoActionPerformed
       String carac = ","+" ."+" -"+" ("+" )"+" :";      
        try{
            String nombre = jtNuevoPNombre.getText();
            String descripcion = jtNuevoPDescripcion.getText();
            String stock = jtNuevoPStock.getText();
            String precio1 = jtNuevoPPrecio.getText();            
              
            if(nombre.isEmpty() && descripcion.isEmpty() && precio1.isEmpty() && stock.isEmpty()){
                JOptionPane.showMessageDialog(null, "Es necesario llenar todos los campos.", "Error!", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Es necesario agregar un dato en el campo nombre.", "Error!", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else if (nombre.length() > 20) {
                JOptionPane.showMessageDialog(null, "Ingreso: " + nombre.length() + " caracteres. Supera el limite permitido(20).", "Error!", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else if (contieneLetrasYEspacios(nombre) != true) {
                JOptionPane.showMessageDialog(null, "En el campo de nombre solo estan permitidos caracteres validos.", "Error!", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            if (descripcion.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Es necesario agregar un dato en el campo descripcion.", "Error!", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else if (descripcion.length() > 100) {
                JOptionPane.showMessageDialog(null, "Ingreso: " + descripcion.length() + " caracteres. Supera el limite de 100.", "Error!", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else if (contieneLetrasEspaciosNumeros(descripcion) != true) {
                JOptionPane.showMessageDialog(null, "En el campo de descripcion solo estan permitidos caracteres validos.\n"
                        +carac, "Error!", JOptionPane.INFORMATION_MESSAGE);
                return;
            } 
            
            if(stock.isEmpty()){
                JOptionPane.showMessageDialog(null,"Es necesario indicar un Stock.","Error!",JOptionPane.INFORMATION_MESSAGE);
                return;
            }          
            
            
            if(precio1.isEmpty()){
                JOptionPane.showMessageDialog(null,"Es necesario completar el campo de precio.","Error!",JOptionPane.INFORMATION_MESSAGE);
                return;
            }          
            
            int stock1 = Integer.parseInt(stock);
            double precio = Double.parseDouble(precio1);
            
            
            int opcion = JOptionPane.showConfirmDialog( 
                null,
                "¿Desea cargar este producto?"+"\n"+nombre+" "+descripcion,
                "Confirmar", 
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {   
         
                producto = new Producto(nombre, descripcion, stock1, precio,true);
                productoData.registroProducto(producto);
                JOptionPane.showMessageDialog(null,"Producto agregado","Exito!",JOptionPane.INFORMATION_MESSAGE);                
                actualizarTablaInicio();
              
                List<Producto> ccombo = new ArrayList<>(productoData.listaProductosSinDuplicado());
                listaComboProducto(ccombo);
                limpiarProducto();              

                List<Producto> listaAux = new ArrayList<>(productoData.listaProductos());
                listaProducto(listaAux);               
      
            jpNuevoProducto.setVisible(false);
        } 
     
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Debe ingresar un precio valido."," ",JOptionPane.INFORMATION_MESSAGE);
        }   
        
        activaBotonesProducto();
    }//GEN-LAST:event_jbGuardarProNuevoActionPerformed

    private void jbCancelarProNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarProNuevoActionPerformed
       
         int opcion = JOptionPane.showConfirmDialog( 
                null,
                "¿Esta seguro de cancelar?",
                "Confirmar", 
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {   
            JOptionPane.showMessageDialog(null, "Calcelado", "Exito!", JOptionPane.INFORMATION_MESSAGE);
            
            List<Producto> listaComboProducto = new ArrayList<>(productoData.listaProductosSinDuplicado());
            listaComboProducto(listaComboProducto);
            List<Producto> listaAux = new ArrayList<>(productoData.listaProductos());
            listaProducto(listaAux);    
            jpNuevoProducto.setVisible(false);
        } 
        desactivarBotonesProducto();
        
       
        activaBotonesProducto();
    }//GEN-LAST:event_jbCancelarProNuevoActionPerformed

    private void jcbListaProductosActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        
        borrarFilaProducto();        

        Producto seleccion = (Producto) jcbListaProductos.getSelectedItem();
        if (seleccion != null) {
            productos = new ArrayList<>(productoData.listaProductospoID(seleccion.getNombre()));

            for (Producto lista : productos) {
                modelo.addRow(new Object[]{
                    lista.getNombre(),
                    lista.getDescripcion(),
                    lista.getStock(),
                    lista.getPrecio()});
            }
        } else {
            
            System.out.println("No se ha seleccionado ningun producto.");
        }    
        }                                                     

    private void jtTablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaProductoMouseClicked
        // TODO add your handling code here:
        jbModificarP.setEnabled(true);
        jbEliminarP.setEnabled(true);
    }//GEN-LAST:event_jtTablaProductoMouseClicked

    private void jbModificarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarPActionPerformed
        // TODO add your handling code here:
         int indice = jtTablaProducto.getSelectedRow();

    if (indice != -1) {
        int id = (Integer) modelo.getValueAt(indice, 0);
        String nombre = (String) modelo.getValueAt(indice, 1);
        String descripcion = (String) modelo.getValueAt(indice, 2);
        int stock = 0;
        double precio = 0.0;

        Object stockObject = modelo.getValueAt(indice, 3);
        Object precioObject = modelo.getValueAt(indice, 4);

        
        producto = new Producto(id, nombre, descripcion, stock, precio, true);

        int opcion = JOptionPane.showConfirmDialog(
                null,
                "¿Está seguro de realizar estos cambios?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
           
            try {
                stock = Integer.parseInt(stockObject.toString());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error modificar stock.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                precio = Double.parseDouble(precioObject.toString());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error al modificar precio."+"\n"+"Ingrese formato correcto (00.00)", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
          
            producto.setStock(stock);
            producto.setPrecio(precio);

            productoData.modificarProducto(producto);
            JOptionPane.showMessageDialog(null, "Producto modificado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            
            actualizarTablaInicio();

            List<Producto> listaTablaProducto = new ArrayList<>(productoData.listaProductos());
            listaProducto(listaTablaProducto);
        } else {
            JOptionPane.showMessageDialog(null, "El producto no se ha modificado.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    jbModificarP.setEnabled(false);
    jbEliminarP.setEnabled(false);
        
    }//GEN-LAST:event_jbModificarPActionPerformed

    
      // ------- METODOS PARA LA VENTANA COMPRA ---------------------------------------------
    
    
    private void jbNuevaCComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevaCComprarActionPerformed
    proveedor = (Proveedor) jcbNuevaCProveedor.getSelectedItem();
    producto = (Producto) jcbNuevaCProducto.getSelectedItem();
    LocalDate fc = null;
    int indiceProve = (int) jcbNuevaCProveedor.getSelectedIndex();
    int indiceProdu = (int) jcbNuevaCProducto.getSelectedIndex();
    
    String cant = jtNuevaCCantidad.getText();
    String pre = jtNuevaCPrecio.getText();
        
    Date fecha = (Date) jdcNuevaCFecha.getDate();
    
    
        if (indiceProve == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, es necesario seleccionar un proveedor.", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }else if(indiceProdu == 0){
             JOptionPane.showMessageDialog(null, "Por favor, es necesario seleccionar un producto.", "Error", JOptionPane.ERROR_MESSAGE);
             return;
        }else if( fecha == null){
             JOptionPane.showMessageDialog(null, "Por favor, complete el campo de fecha.", "Error", JOptionPane.ERROR_MESSAGE);
             return;
        }
        if(pre.isEmpty()){ 
            JOptionPane.showMessageDialog(null, "Debe llenar el campo precio.", "Error", JOptionPane.ERROR_MESSAGE);   
            return;
          }

     
        if(cant.isEmpty()){
        JOptionPane.showMessageDialog(null, "Debe llenar el campo cantidad.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
        }
        
        if(fecha != null){

             fc = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        }else{
            JOptionPane.showMessageDialog(null, "Debe ingresar una fecha valida.", "Error", JOptionPane.ERROR_MESSAGE);  
            return;
        }

    try {
        double precio = Double.parseDouble(jtNuevaCPrecio.getText());
        int cantidad = Integer.parseInt(jtNuevaCCantidad.getText());
        
        
        if (precio <= 0) {
        JOptionPane.showMessageDialog(null, "El precio debe ser mayor que cero.", "Error", JOptionPane.ERROR_MESSAGE);
        return; 
        }
     
        if (cantidad <= 0) {
        JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor que cero.", "Error", JOptionPane.ERROR_MESSAGE);
        return; 
        }
        
       
        int opcion = JOptionPane.showConfirmDialog( 
                null,
                "¿Estás seguro de realizar esta compra?: ",
                "Confirmar", 
                JOptionPane.YES_NO_OPTION);
        

        if (opcion == JOptionPane.YES_OPTION) {          
                
            int nuevoStock = producto.getStock() + cantidad;
            producto.setStock(nuevoStock);
            productoData.modificarProducto(producto);           
            
            compra = new Compra(proveedor, fc, true);
            compraData.registrarCompra(compra);
            detalle = new DetalleCompra(compra, producto, precio, cantidad, true);
            detalleData.registrarDetalleCompra(detalle);

            JOptionPane.showMessageDialog(null, "Compra realizada con EXITO.", "Exito", JOptionPane.INFORMATION_MESSAGE);
            jbtnActualizaTabla.setEnabled(true);
            btnBuscarFecha.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Compra cancelada.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
            jbtnActualizaTabla.setEnabled(true);
            btnBuscarFecha.setEnabled(true);
            jtfCompraXProducto.setEnabled(true);
            jtfComprasXProveedor.setEnabled(true);
        }
        
        actualizarTablaInicio();
        limpiarCompra();
        borrarFilaCompra();
        borrarFilaDetalle();

        int indice = jtTablaCompra.getSelectedRow();

        if (indice == -1) {
            List<Compra> listaAux = new ArrayList<>(compraData.listaCompras());
            listaCompra(listaAux);
            List<DetalleCompra> listaAuxDetalle = new ArrayList<>(detalleData.listaDetalles());
            listaDetalle(listaAuxDetalle);
            jbtnActualizaTabla.setEnabled(true);
        btnBuscarFecha.setEnabled(true);
        jtfCompraXProducto.setEnabled(true);
        jtfComprasXProveedor.setEnabled(true);
        }
//        jbtnActualizaTabla.setEnabled(true);
//        btnBuscarFecha.setEnabled(true);
//        jtfCompraXProducto.setEnabled(true);
//        jtfComprasXProveedor.setEnabled(true);
        jpnewCompra.setVisible(false);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error en formato de precio o cantidad. Deben ser numeros validos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    listaComboProveedor(); 
    listaProductoCompra();  
    activarBotonesCompra();
    
    }//GEN-LAST:event_jbNuevaCComprarActionPerformed

    private void jbNuevaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevaCompraActionPerformed
        
        jpnewCompra.setVisible(true);
        desactivarBotonesCompra();
        borrarFilaCompra();
        borrarFilaDetalle();
        if(!comboProveedor && !comboProducto){
             listaComboProveedor(); 
             listaProductoCompra();
        }       
    }//GEN-LAST:event_jbNuevaCompraActionPerformed

    private void jbNuevaCCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevaCCancelarActionPerformed
         int opcion = JOptionPane.showConfirmDialog( 
                null,
                "¿Esta seguro de cancelar?",
                "Confirmar", 
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {   
            JOptionPane.showMessageDialog(null, "Calcelado", "Exito!", JOptionPane.INFORMATION_MESSAGE);
            List<Compra> listaAux = new ArrayList<>(compraData.listaCompras());
            listaCompra(listaAux);
            List<DetalleCompra> listaAuxDetalle = new ArrayList<>(detalleData.listaDetalles());
            listaDetalle(listaAuxDetalle);
            jpnewCompra.setVisible(false);
        }

        listaComboProveedor(); 
        listaProductoCompra();         
        activarBotonesCompra();        
    }//GEN-LAST:event_jbNuevaCCancelarActionPerformed

    private void jbEliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarPActionPerformed
       int indice = jtTablaProducto.getSelectedRow();      
       
       if(indice != -1){
          
         String name = (String) modelo.getValueAt(indice, 1);         
         
         int opcion = JOptionPane.showConfirmDialog( 
                null,
                "Estas seguro de eliminar el producto "+name,
                "Confirmar Eliminacion", 
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            
           String nombre = (String) modelo.getValueAt(indice, 0);
           productoData.eliminarProducto(nombre, name);           
           
           JOptionPane.showMessageDialog(null, "El producto a sido eliminado", "Exito!", JOptionPane.INFORMATION_MESSAGE);
           List<Producto> listacombo = new ArrayList<>(productoData.listaProductosSinDuplicado());
           listaComboProducto(listacombo);
         int indice2 = jtTablaProducto.getSelectedRow();

            if (indice2 == -1) {
            List<Producto> listaAux = new ArrayList<>(productoData.listaProductos());
            listaProducto(listaAux);
            }
           
          
        } else {
            
            JOptionPane.showMessageDialog(null, " No se ha eliminado el producto "+name+".", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
            
        }
        
        }
       
        jbModificarP.setEnabled(false);
        jbEliminarP.setEnabled(false);
        
    }//GEN-LAST:event_jbEliminarPActionPerformed

    private void jtTablaCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaCompraMouseClicked
        int indice = jtTablaCompra.getSelectedRow();
       
        if(indice == -1){
            List<Compra> listaAux = new ArrayList<>(compraData.listaCompras());
            listaCompra(listaAux);
            List<DetalleCompra> listaAuxDetalle = new ArrayList<>(detalleData.listaDetalles());
            listaDetalle(listaAuxDetalle);
        }else {
            proveedor = (Proveedor)modelo3.getValueAt(indice, 0);
            String razonSocial = proveedor.getRazonSocial();
            mostrarDetalleUnaCompra(razonSocial);
        }
    }//GEN-LAST:event_jtTablaCompraMouseClicked

    private void jtProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProveedorMouseClicked
        btnModificar.setEnabled(true);
        btnDeshabilitar.setEnabled(true);
        btnHabilitar.setEnabled(true);
    }//GEN-LAST:event_jtProveedorMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
                
        int opcion = JOptionPane.showConfirmDialog( 
                null,
                "¿Esta seguro de cancelar?",
                "Confirmar", 
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {   
            JOptionPane.showMessageDialog(null, "Calcelado", "Exito!", JOptionPane.INFORMATION_MESSAGE);
            List<Proveedor> listita = new ArrayList<>(proveedorData.listarProveedores());
            cargarDatosEnTablaProveedor(listita);
            jPanel1.setVisible(false);
        } 
        
        btnActualizarTabla.setEnabled(true);
        jcbActivos.setEnabled(true);  
        jcbNoActivos.setEnabled(true);
        jtxBuscarProveedor.setEnabled(true);
        jPanel1.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnHabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabilitarActionPerformed
         int filaSeleccionada = jtProveedor.getSelectedRow();
       

        if (filaSeleccionada != -1) {  
        Boolean estado = (Boolean) modelo2.getValueAt(filaSeleccionada, 4);
        String razonSocial = (String) modelo2.getValueAt(filaSeleccionada, 1);
        
        if(estado == true){
            JOptionPane.showMessageDialog(null, "El proveedor: "+razonSocial+" ya se encuentra Habilitado", razonSocial, JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        int opcion = JOptionPane.showConfirmDialog( 
                null,
                "Estas seguro de HABILITAR el proveedor: " + razonSocial,
                "Confirmar", 
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            
            proveedorData.darDeAltaProveedor(razonSocial);
            JOptionPane.showMessageDialog(null, "Habilitado correctamente.", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            
            JOptionPane.showMessageDialog(null, "Cancelado.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
            
        }
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione un proveedor para HABILITAR.", "Error", JOptionPane.INFORMATION_MESSAGE);
    }
        btnModificar.setEnabled(false);
        btnHabilitar.setEnabled(false);
        btnDeshabilitar.setEnabled(false);
    }//GEN-LAST:event_btnHabilitarActionPerformed

    private void jcbActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbActivosActionPerformed
        jtxBuscarProveedor.setText("");
        btnModificar.setEnabled(false);
        btnHabilitar.setEnabled(false);
        btnDeshabilitar.setEnabled(false);
            
      boolean activosSeleccionados = jcbActivos.isSelected();
       if (jcbActivos.isSelected()) {   
        jcbNoActivos.setSelected(false);
     }
      
     if (activosSeleccionados) {
        
        List<Proveedor> listita = new ArrayList<>(proveedorData.listarProveedoresActivos());
        cargarDatosEnTablaProveedor(listita);
      } else {
        
        List<Proveedor> listita = new ArrayList<>(proveedorData.listarProveedores());
        cargarDatosEnTablaProveedor(listita);
      }
        
    }//GEN-LAST:event_jcbActivosActionPerformed

    private void jcbNoActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNoActivosActionPerformed
            boolean activosSeleccionados = jcbNoActivos.isSelected();
            
            if (jcbNoActivos.isSelected()) {

               jcbActivos.setSelected(false);
              }
             if (activosSeleccionados) {      
               List<Proveedor> listita = new ArrayList<>(proveedorData.listarProveedoresNoActivos());
               cargarDatosEnTablaProveedor(listita);
             } else {

               List<Proveedor> listita = new ArrayList<>(proveedorData.listarProveedores());
               cargarDatosEnTablaProveedor(listita);
           }
    }//GEN-LAST:event_jcbNoActivosActionPerformed

    private void btnActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTablaActionPerformed
        
        List<Proveedor> listita = new ArrayList<>(proveedorData.listarProveedores());
        cargarDatosEnTablaProveedor(listita);
        jtxBuscarProveedor.setText("");
        btnModificar.setEnabled(false);
        btnHabilitar.setEnabled(false);
        btnDeshabilitar.setEnabled(false);
        
    }//GEN-LAST:event_btnActualizarTablaActionPerformed

    private void btnBuscarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFechaActionPerformed
        Date date1 = jdcCompraFecha1.getDate();
        Date date2 = jdcCompraFecha2.getDate();

        if(date1 != null && date2 == null){
             LocalDate fecha = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
             List<Compra> compri = compraData.entreUnaFecha(fecha);
             
            if (!compri.isEmpty()) {
                listaCompra = false;
                listaDetalle = false;

                if (!listaCompra && !listaDetalle) {  
                    borrarFilaCompra();
                    listaCompra(compri);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay compras en esta fecha.", "Informacipn", JOptionPane.INFORMATION_MESSAGE);
            }
             
             
        }else if (date1 != null && date2 != null) {
            LocalDate fecha1 = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fecha2 = date2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            List<Compra> comprita = compraData.entreFechas(fecha1, fecha2);

            if (!comprita.isEmpty()) {
                listaCompra = false;
                listaDetalle = false;

                if (!listaCompra && !listaDetalle) {  
                    borrarFilaCompra();
                    listaCompra(comprita);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay compras entre las fechas seleccionadas", "Informacipn", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar fechas validas", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        jdcCompraFecha1.setDate(null);
        jdcCompraFecha2.setDate(null);
        
    }//GEN-LAST:event_btnBuscarFechaActionPerformed

    private void jbtnActualizaTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnActualizaTablaActionPerformed
        listaCompra = false; listaDetalle = false;
        if(!listaCompra && !listaDetalle){
          borrarFilaCompra();  
         List<Compra> comprita = compraData.listaCompras();
         List<DetalleCompra> detallito = detalleData.listaDetalles();
         listaCompra(comprita);
         listaDetalle(detallito);
        }
        
        jdcCompraFecha1.setDate(null);
        jdcCompraFecha2.setDate(null);
        jtfComprasXProveedor.setText("");
        jtfCompraXProducto.setText("");
        btnComprasXProveedor.setEnabled(false);
        btnComprasXProducto.setEnabled(false);
        
        
    }//GEN-LAST:event_jbtnActualizaTablaActionPerformed

    private void jcbMasBajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMasBajoActionPerformed
        List<Producto> listita = productoData.listarProductoMenor();  
        listaProducto(listita);
        jcbListarAlto.setSelected(false);  
        jcbMasComprado.setSelected(false);
    }//GEN-LAST:event_jcbMasBajoActionPerformed

    private void jcbListarAltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListarAltoActionPerformed
        System.out.println("");
        
       compra = new Compra();
       compraData.ultimaCompra();
    }//GEN-LAST:event_jcbListarAltoActionPerformed

    private void jcbMasCompradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMasCompradoActionPerformed
       
    
        
    }//GEN-LAST:event_jcbMasCompradoActionPerformed

    private void jbtnRellenarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRellenarStockActionPerformed
        jtpEscritorio.setSelectedIndex(3);
        jpnewCompra.setVisible(true);
        
        if(!comboProveedor && !comboProducto){
             listaComboProveedor(); 
             listaProductoCompra();
        }              
        desactivarBotonesCompra();       
        if(!cabeceraCompraIni && !cabeceraDetalleIni){
            cabeceraCompra();
            cabeceraDetalle();
        }
        if(!listaCompra && !listaDetalle){
            List<Compra> listaTablaCompra = new ArrayList<>(compraData.listaCompras());
            listaCompra(listaTablaCompra);
            List<DetalleCompra> listaD= new ArrayList<>(detalleData.listaDetalles());
            listaDetalle(listaD);
        }  
        borrarFilaCompra();
        borrarFilaDetalle();       
    }//GEN-LAST:event_jbtnRellenarStockActionPerformed

    private void jtRepositorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtRepositorioMouseClicked
        jbtnRellenarStock.setEnabled(true);
    }//GEN-LAST:event_jtRepositorioMouseClicked

    private void jbActualizarTProduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarTProduActionPerformed
        // TODO add your handling code here:        
           
            List<Producto> carrito = new ArrayList<>(productoData.listaProductos());
            listaProducto(carrito);
      
            jbModificarP.setEnabled(false);
            jbEliminarP.setEnabled(false);
            //jcbListarAlto-jcbMasComprado-jcbMasBajo
            jcbListarAlto.setSelected(false);
            jcbMasBajo.setSelected(false);
            jcbMasComprado.setSelected(false);
            

    }//GEN-LAST:event_jbActualizarTProduActionPerformed

    private void btnComprasXProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasXProveedorActionPerformed
            String proveedorIngresado = jtfComprasXProveedor.getText();

            if(proveedorIngresado.isEmpty()){
                JOptionPane.showMessageDialog(null, "Debe ingresar un proveedor para buscar.", "Error", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else if (proveedorIngresado.length() > 20) {           
                JOptionPane.showMessageDialog(null, "Debe ingresar un proveedor válido", "Error", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else if(contieneLetrasYEspacios(proveedorIngresado)) {
                proveedor = new Proveedor();
                proveedor = proveedorData.buscarProveedorNombre(proveedorIngresado);

                if(proveedor == null){
                    JOptionPane.showMessageDialog(null, "El proveedor ingresado no existe.", "Inexistente", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                try {
                    List<Compra> listita = new ArrayList<>();
                    modelo3.setRowCount(0);
                    listita = compraData.listarComprasPorProveedor(proveedorIngresado);
                    listaCompra(listita);
                } catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(null, "Error al procesar la lista de compras. " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "El proveedor contiene caracteres invalidos.", "Error!", JOptionPane.INFORMATION_MESSAGE);
            }


            
          
    }//GEN-LAST:event_btnComprasXProveedorActionPerformed

    private void jtfComprasXProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfComprasXProveedorMouseClicked
        btnComprasXProveedor.setEnabled(true);
    }//GEN-LAST:event_jtfComprasXProveedorMouseClicked

    private void jtfComprasXProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfComprasXProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfComprasXProveedorActionPerformed

    private void jdcCompraFecha1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdcCompraFecha1MouseClicked
        
    }//GEN-LAST:event_jdcCompraFecha1MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
  
       cerrarSesion();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jtxBuscarProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxBuscarProveedorMouseClicked
        btnBuscarProveedor.setEnabled(true);
        jcbActivos.setSelected(false);
        jcbNoActivos.setSelected(false);
        List<Proveedor> listita = new ArrayList<>(proveedorData.listarProveedores());
        cargarDatosEnTablaProveedor(listita);
        jtxBuscarProveedor.setText("");
        btnModificar.setEnabled(false);
        btnHabilitar.setEnabled(false);
        btnDeshabilitar.setEnabled(false);
    }//GEN-LAST:event_jtxBuscarProveedorMouseClicked

    private void btnComprasXProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasXProductoActionPerformed
        String productoIngresado = jtfCompraXProducto.getText();

            if(productoIngresado.isEmpty()){
                JOptionPane.showMessageDialog(null, "Debe ingresar un produto para poder buscar.", "Error", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else if (productoIngresado.length() > 20) {           
                JOptionPane.showMessageDialog(null, "Debe ingresar un producto valido", "Error", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else if(contieneLetrasYEspacios(productoIngresado)) {
                proveedor = new Proveedor();
                proveedor = proveedorData.buscarProveedorNombre(productoIngresado);

                if(proveedor == null){
                    JOptionPane.showMessageDialog(null, "El producto ingresado no existe.", "Inexistente", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                try {
                    List<Compra> listita = new ArrayList<>();
                    modelo3.setRowCount(0);
                    listita = compraData.listarComprasPorProveedor(productoIngresado);
                    listaCompra(listita);
                } catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(null, "Error al procesar la lista de compras. " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "El proveedor contiene caracteres invalidos.", "Error!", JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_btnComprasXProductoActionPerformed

    private void jtfCompraXProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfCompraXProductoMouseClicked
        btnComprasXProducto.setEnabled(true);
    }//GEN-LAST:event_jtfCompraXProductoMouseClicked

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
        UIManager.put("nimbusSelectionBackground", new Color(115, 198, 182 ));
        UIManager.put("control", new Color(223, 243, 237  ));
        try {
            
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGeneral().setVisible(true);
            }
        });
    }
    
    
      // --------------------------- METODOS AUXILIARES ------------------------------------- 
    
    
      // ------- Metodos para cargar la cebecera de las tablas ------------------------------
    
    
    private void cabeceraInicial(){
        ArrayList<Object> titulos = new ArrayList<>();
        
            titulos.add("Nombre");
            titulos.add("descipcion");
            titulos.add("Precio");
            titulos.add("Stock");
            
        for(Object filas : titulos){
            modelo5.addColumn(filas);            
        }
        
        jtRepositorio.setModel(modelo5);
        cabeceraRepoIni = true;       
    }
    
    private void cabeceraProducto(){         
        ArrayList<Object> titulos = new ArrayList<>();       
                          
             titulos.add("id");
             titulos.add("Nombre");
             titulos.add("Descripcion");
             titulos.add("Stock");
             titulos.add("Precio");            
        
        for(Object filas : titulos){
            modelo.addColumn(filas);
        }
       
        jtTablaProducto.setModel(modelo);
        jtTablaProducto.getColumnModel().getColumn(0).setMaxWidth(0);
        jtTablaProducto.getColumnModel().getColumn(0).setMinWidth(0);
        jtTablaProducto.getColumnModel().getColumn(0).setPreferredWidth(0);
        cabeceraProdIni = true;                      
    }
        
    private void cabeceraCompra(){         
        ArrayList<Object> titulos = new ArrayList<>();        
 
             titulos.add("Proveedor");
             titulos.add("Fecha");
             titulos.add("Estado");                      
        
        for(Object filas : titulos){
            modelo3.addColumn(filas);
        }       
        jtTablaCompra.setModel(modelo3);
        cabeceraCompraIni = true;                      
    }    
       
    private void cabeceraDetalle(){         
        ArrayList<Object> titulos = new ArrayList<>();      
      
             titulos.add("Producto");
             titulos.add("Precio Costo");
             titulos.add("Cantidad");
             titulos.add("Estado");          
        
        for(Object filas : titulos){
            modelo4.addColumn(filas);
        }
       
        jtTablaDetalle.setModel(modelo4);
        cabeceraDetalleIni = true;                      
    }
    
    
      // ------- Metodos para cargar datos dentro de las tablas -----------------------------
    
    
    
    private void actualizarTablaInicio() {
        modelo5.setRowCount(0);
        
        List<Producto> listaProductos = new ArrayList<>(productoData.listaProductos());
        listaProductoIni(listaProductos);
    }
    
    
    private void cargaTablaIni(){
         if(!cabeceraRepoIni){
            cabeceraInicial();
        }
        if(!listaRepoIni){
            List<Producto> ProduIni = new ArrayList<>(productoData.listaProductos());
            listaProductoIni(ProduIni);
            
        }        
    }
    
    private DetalleCompra listaProductoUnico(DetalleCompra detalle){
        DetalleCompra ss = new DetalleCompra();
        Producto pd = new Producto(); 
          if(detalle != null){
                ss.getIdProducto().getNombre();
                ss.getIdProducto().getDescripcion();
                ss.getIdProducto().getPrecio();
                ss.getCantidad();
                
            }
        return ss;
    }
    private void listaProductoIni(List<Producto> productos){
        
        for(Producto pr : productos){
            Object[] rowData = {
                pr.getNombre(),
                pr.getDescripcion(),
                pr.getPrecio(),
                pr.getStock()
                    
            };
          
            modelo5.addRow(rowData);
        }
        listaRepoIni = true;        
    }
    
    private void cargarDatosEnTablaProveedor(List<Proveedor> proveedores) {        
        
        modelo2 = (DefaultTableModel) jtProveedor.getModel();
        modelo2.setRowCount(0);
        
        for (Proveedor proveedor : proveedores) {
        
        Object[] rowData = {
                proveedor.getIdProveedor(),
                proveedor.getRazonSocial(),
                proveedor.getDomicilio(),
                proveedor.getTelefono(),
                proveedor.getEstado()
        };        
        modelo2.addRow(rowData);
        }
    }   
    
    private void listaProducto(List<Producto> productos){
        
        modelo.setRowCount(0);
        modelo = (DefaultTableModel) jtTablaProducto.getModel();
        
        for (Producto produ : productos) {
        
        Object[] rowData = {
            produ.getIdProducto(),
            produ.getNombre(),
            produ.getDescripcion(),
            produ.getStock(),
            produ.getPrecio()
        };        
        modelo.addRow(rowData);
        }
    }    
    
    private void listaCompra(List<Compra> compras){
        
        for(Compra carrito : compras ){
            Object[] rowData = {
                carrito.getProveedor(),
                carrito.getFecha(),
                carrito.isEstado()
            };
            modelo3.addRow(rowData);
        }
        listaCompra = true;
    }
    
    private void mostrarDetalleUnaCompra(String id){
        modelo4.setRowCount(0);
        detalle = new DetalleCompra();
        detalle = detalleData.obtenerDetalleCompra(id);
        
        if (detalle != null) {
        Object[] rowData = {                
            detalle.getIdProducto(),
            detalle.getPrecioCosto(),
            detalle.getCantidad(),
            detalle.isEstado()
        };
        modelo4.addRow(rowData);
        listaDetalle = true;
        }
    
    }
    
    private void listaDetalle(List<DetalleCompra> detalles){
        modelo4.setRowCount(0);
        
        for(DetalleCompra dc : detalles ){
            Object[] rowData = {                
                dc.getIdProducto(),
                dc.getPrecioCosto(),
                dc.getCantidad(),
                dc.isEstado()
            };
            modelo4.addRow(rowData);
        }
        listaDetalle = true;
    }
    
    
      // ------- Metodos para carga de CombosBoxs -------------------------------------------
    
     
    
  
     
    private void listaComboProducto(List<Producto> productos){
                
        jcbListaProductos.removeAllItems();
        
        jcbListaProductos.addItem(new Producto("-------------- SELECCIONAR --------------", "",0, 0.0, false));
        
        
        for (Producto lista : productos) {
            jcbListaProductos.addItem(lista);
        }        
        listaProductosCargada = true;    
    }
    
    private void listaComboProveedor(){
        jcbNuevaCProveedor.removeAllItems();
        proveedores = new ArrayList<>();        
        proveedores.add(new Proveedor("---- SELECCIONAR ----","","",false));
        proveedores.addAll(proveedorData.listarProveedores());
        
        for(Proveedor lista : proveedores){
            jcbNuevaCProveedor.addItem(lista);
        }
        comboProveedor = true;
    }
    
    private void listaProductoCompra(){
        jcbNuevaCProducto.removeAllItems();
        productos = new ArrayList<>();
        productos.add(new Producto("---- SELECCIONAR ----","",0,0,false));
        productos.addAll(productoData.listaProductos());
        
        for(Producto lista : productos){
            jcbNuevaCProducto.addItem(lista);
        }
        comboProducto = true;
    }
    
     
      // ------- Metodos para borrar filas de las tablas ---------------------------------
    
    
    private void borrarFilaProducto(){        
        int indice = modelo.getRowCount()-1;
        
        for(int i = indice;i >= 0;i--){
            modelo.removeRow(i);           
        }       
    }
     
    private void borrarFila2(){        
        int indice = modelo2.getRowCount()-1;
        
        for(int i = indice;i >= 0;i--){
            modelo2.removeRow(i);           
        }       
    }
    
    private void borrarFilaCompra(){        
        int indice = modelo3.getRowCount()-1;
        
        for(int i = indice;i >= 0;i--){
            modelo3.removeRow(i);           
        }       
    }
    
    private void borrarFilaDetalle(){        
        int indice = modelo4.getRowCount()-1;
        
        for(int i = indice;i >= 0;i--){
            modelo4.removeRow(i);           
        }       
    }
    
    
      // ------- Metodos para limpiar Campos ------------------------------------------------
    
    
    private void limpiarCampos(){
        jtxRazonSocial.setText("");
        jtxDomicilio.setText("");
        jtxTelefono.setText("");   
        jtxTelefonoo.setText("");
    }
    
    private void limpiarProducto(){
        jtNuevoPNombre.setText("");
        jtNuevoPDescripcion.setText("");
        jtNuevoPStock.setText("");
        jtNuevoPPrecio.setText("");           
    }
    
    private void limpiarCompra(){
        jdcNuevaCFecha.setDate(null);
        jtNuevaCPrecio.setText("");
        jtNuevaCCantidad.setText("");
    }
    
    
      // ------- Metodos para validar campos ------------------------------------------------
    
    
    private boolean verificarSiHayNumeros(String texto) {
        return texto.matches(".*\\d.*");
    }
    
    public static boolean contieneLetrasYEspacios(String fraseRecibida) {
    for (char c : fraseRecibida.toCharArray()) {
        if (!esCaracterSinNumero(c)) {
            return false;
          }
       }
        return true;
    }
    
     public static boolean contieneLetrasEspaciosNumeros(String fraseRecibida) {
     for (char c : fraseRecibida.toCharArray()) {
        if (!esCaracterPermitido(c)) {
            return false;
          }
       }
        return true;
    }
    
    //metodos auxiliares para el uso de validacion de campos------------------------------
     
    
    public static boolean esCaracterPermitido(char c) {
    return (c >= 'a' && c <= 'z') ||
           (c >= 'A' && c <= 'Z') ||
           (c >= '0' && c <= '9') ||
           c == ' ' || c == ',' || c == '.' || c == '-' || c == '(' || c == ')';
    }
    
    public static boolean esCaracterSinNumero(char c) {
    return (c >= 'a' && c <= 'z') ||
           (c >= 'A' && c <= 'Z') ||
           c == ' ' || c == ',' || c == '.' || c == '-' || c == '(' || c == ')' || c == ':';
    }
    
      // -------- Metodo para settear el usuario en el menuGeneral --------------------------
    
    
    public void labelUsuario(String nombre){
        jlabelUsuario.setText(nombre);
    }
    
      
      // ------- Metodos para Seleccion (cambia de color al pasar el mouse) -----------------
    
    
    private void seleccion(JPanel panel){
        panel.setBackground(new Color(0,157,113));        
    }
    
    private void sinSeleccionar(JPanel panel){
        panel.setBackground(new Color(2,104,66));
    }
    //MEOTOD SUPER AUXILIAR
    
    
    //auxiliar para activar o desactivar botones PROVEEDOR
    
    private void desactivarBotonesProveedor(){
        btnModificar.setEnabled(false);
        btnActualizarTabla.setEnabled(false);
        btnHabilitar.setEnabled(false);
        btnDeshabilitar.setEnabled(false);
        jcbActivos.setEnabled(false);
        jcbNoActivos.setEnabled(false);
        btnBuscarProveedor.setEnabled(false); 
        jtxBuscarProveedor.setEnabled(false);
        
    }
   
   private void desactivarBotonesProducto(){
        jcbListaProductos.setEnabled(false);
        jcbMasBajo.setEnabled(false);
        jcbListarAlto.setEnabled(false);
        jcbMasComprado.setEnabled(false); 
        jbActualizarTProdu.setEnabled(false);
        jbModificarP.setEnabled(false);
        jbEliminarP.setEnabled(false);
   
   }
   
   private void activaBotonesProducto(){
        jcbListaProductos.setEnabled(true);
        jcbMasBajo.setEnabled(true);
        jcbListarAlto.setEnabled(true);
        jcbMasComprado.setEnabled(true); 
        jbActualizarTProdu.setEnabled(true);
   }
   
   private void desactivarBotonesCompra(){
       jdcCompraFecha1.setEnabled(false);
       jdcCompraFecha2.setEnabled(false);
       btnBuscarFecha.setEnabled(false);
       jtfComprasXProveedor.setEnabled(false);
       jtfCompraXProducto.setEnabled(false);
       jbtnActualizaTabla.setEnabled(false);
       btnComprasXProveedor.setEnabled(false);
       btnComprasXProducto.setEnabled(false);    
   }
   
   private void activarBotonesCompra(){
       jdcCompraFecha1.setEnabled(true);
       jdcCompraFecha2.setEnabled(true);
       btnBuscarFecha.setEnabled(true);
       jtfComprasXProveedor.setEnabled(true);
       jtfCompraXProducto.setEnabled(true);
       jbtnActualizaTabla.setEnabled(true);
   }
    
     private void cerrarSesion() {
        int opcion = JOptionPane.showConfirmDialog(
                null,
                "¿Esta seguro de cerrar la sesion?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
           this.setVisible(false);;
            Login login = new Login();
            JOptionPane.showMessageDialog(null, "Sesion cerrada.", "algun titulo", JOptionPane.INFORMATION_MESSAGE);
            login.setVisible(true);
       
        }
    }
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarTabla;
    private javax.swing.JButton btnBuscarFecha;
    private javax.swing.JButton btnBuscarProveedor;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnComprasXProducto;
    private javax.swing.JButton btnComprasXProveedor;
    private javax.swing.JButton btnDeshabilitar;
    private javax.swing.JButton btnHabilitar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton jbActualizarTProdu;
    private javax.swing.JButton jbCancelarProNuevo;
    private javax.swing.JButton jbEliminarP;
    private javax.swing.JButton jbGuardarProNuevo;
    private javax.swing.JButton jbModificarP;
    private javax.swing.JButton jbNuevaCCancelar;
    private javax.swing.JButton jbNuevaCComprar;
    private javax.swing.JButton jbNuevaCompra;
    private javax.swing.JButton jbNuevoP;
    private javax.swing.JButton jbtnActualizaTabla;
    private javax.swing.JButton jbtnGuardarNewProveedor;
    private javax.swing.JButton jbtnRellenarStock;
    private javax.swing.JCheckBox jcbActivos;
    private javax.swing.JComboBox<Producto> jcbListaProductos;
    private javax.swing.JCheckBox jcbListarAlto;
    private javax.swing.JCheckBox jcbMasBajo;
    private javax.swing.JCheckBox jcbMasComprado;
    private javax.swing.JCheckBox jcbNoActivos;
    private javax.swing.JComboBox<Producto> jcbNuevaCProducto;
    private javax.swing.JComboBox<Proveedor> jcbNuevaCProveedor;
    private javax.swing.JComboBox<String> jcbTelefono;
    private com.toedter.calendar.JDateChooser jdcCompraFecha1;
    private com.toedter.calendar.JDateChooser jdcCompraFecha2;
    private com.toedter.calendar.JDateChooser jdcNuevaCFecha;
    private javax.swing.JLabel jlCompra;
    private javax.swing.JLabel jlCompraDetalleCTabla;
    private javax.swing.JLabel jlCompraSeleccionar;
    private javax.swing.JLabel jlCompraTabla;
    private javax.swing.JLabel jlCompraY;
    private javax.swing.JLabel jlIcono;
    private javax.swing.JLabel jlIconoCompra;
    private javax.swing.JLabel jlIconoPrin;
    private javax.swing.JLabel jlIconoProd;
    private javax.swing.JLabel jlIconoProv;
    private javax.swing.JLabel jlNuevaCCantidad;
    private javax.swing.JLabel jlNuevaCFecha;
    private javax.swing.JLabel jlNuevaCPrecio;
    private javax.swing.JLabel jlNuevaCProducto;
    private javax.swing.JLabel jlNuevaCProvedor;
    private javax.swing.JLabel jlNuevaCompraTitulo;
    private javax.swing.JLabel jlNuevoPDescripcion;
    private javax.swing.JLabel jlNuevoPNombre;
    private javax.swing.JLabel jlNuevoPPrecio;
    private javax.swing.JLabel jlNuevoPStock;
    private javax.swing.JLabel jlNuevoPTitulo;
    private javax.swing.JLabel jlPrincipal;
    private javax.swing.JLabel jlProducto;
    private javax.swing.JLabel jlProductoTitulo;
    private javax.swing.JLabel jlProductos;
    private javax.swing.JLabel jlProveedores;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jlabelUsuario;
    private javax.swing.JPanel jpCompra;
    private javax.swing.JPanel jpInicio;
    private javax.swing.JPanel jpInicioCompra;
    private javax.swing.JPanel jpInicioProducto;
    private javax.swing.JPanel jpInivioProveedor;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JPanel jpNuevoProducto;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpProducto;
    private javax.swing.JPanel jpProveedor;
    private javax.swing.JPanel jpnewCompra;
    private javax.swing.JTextField jtNuevaCCantidad;
    private javax.swing.JTextField jtNuevaCPrecio;
    private javax.swing.JTextField jtNuevoPDescripcion;
    private javax.swing.JTextField jtNuevoPNombre;
    private javax.swing.JTextField jtNuevoPPrecio;
    private javax.swing.JTextField jtNuevoPStock;
    private javax.swing.JTable jtProveedor;
    private javax.swing.JTable jtRepositorio;
    private javax.swing.JTable jtTablaCompra;
    private javax.swing.JTable jtTablaDetalle;
    private javax.swing.JTable jtTablaProducto;
    private javax.swing.JTextField jtfCompraXProducto;
    private javax.swing.JTextField jtfComprasXProveedor;
    private javax.swing.JTabbedPane jtpEscritorio;
    private javax.swing.JTextField jtxBuscarProveedor;
    private javax.swing.JTextField jtxDomicilio;
    private javax.swing.JTextField jtxRazonSocial;
    private javax.swing.JTextField jtxTelefono;
    private javax.swing.JTextField jtxTelefonoo;
    // End of variables declaration//GEN-END:variables

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
