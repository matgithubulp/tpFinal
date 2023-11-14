
package AccesoADatos;

import Dominio.Compra;
import Dominio.DetalleCompra;
import Dominio.Producto;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DetalleCompraData {

    private Connection conexion = null;
    private ProductoData productoData = new ProductoData();
    private CompraData compraData = new CompraData();
    private DetalleCompra compra = null;
    private Producto producto= new Producto();
    
    public DetalleCompraData(){
        conexion = (Connection) Conexion.conectar();
    }     
     
     public void registrarDetalleCompra(DetalleCompra dC){
     String sql = "INSERT INTO detallecompra (idCompra, idProducto, precioCosto, cantidad, estado) VALUES ( ?, ?, ?, ?, ?)";
     
      try {            
            PreparedStatement ps = conexion.prepareStatement(sql);
            
            ps.setInt(1,dC.getIdCompra().getIdCompra());
            ps.setInt(2, dC.getIdProducto().getIdProducto());
            ps.setDouble(3, dC.getPrecioCosto());
            ps.setInt(4, dC.getCantidad());
            ps.setBoolean(5, dC.isEstado());
            ps.executeUpdate();
            
        } catch (SQLException ex) {           
            JOptionPane.showMessageDialog(null, "Error al conectar con DetalleCompra", "Error", 0);
        }    
     }
    
     //NUEVO METODO CREADO PARA OBTENER SOLO UN DETALLE DE COMPRA
     public DetalleCompra obtenerDetalleCompra(String razonSocial) {
    String sql = "SELECT * FROM detallecompra " +
                 "JOIN producto ON (detallecompra.idProducto = producto.idProducto)" +  
                 "JOIN compra ON (detallecompra.idCompra = compra.idCompra) " +
                 "JOIN proveedor ON (compra.idProveedor = proveedor.idProveedor) " +
                 "WHERE proveedor.razonSocial = ? AND proveedor.estado = 1";
    DetalleCompra detalle = null;

    try {
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setString(1, razonSocial);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            detalle = new DetalleCompra();
            detalle.setIdDetalle(rs.getInt("idDetalle"));
            int idProd = rs.getInt("idProducto");
            Producto pro = productoData.consultaProductoPorID();
            detalle.setIdProducto(pro);
            detalle.setPrecioCosto(rs.getDouble("precioCosto"));
            detalle.setCantidad(rs.getInt("cantidad"));
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al conectar con DetalleCompra", "Error", 0);
    }
    
    return detalle;
}
     
     
     public List<DetalleCompra> listarDetalleCOmpra(int idCompra){    
        String  sql = "SELECT * FROM detallecompra JOIN compra ON (detallecompra.idCompra = compra.idCompra) WHERE compra.idCompra = ? AND detallecompra.estado = 1";
        List<DetalleCompra> detalles = new ArrayList<>();
        
        try{
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, idCompra);     
        ResultSet rs = ps.executeQuery();
     
        while(rs.next()){
            
            DetalleCompra detalle = new DetalleCompra();
            detalle.setIdDetalle(rs.getInt("idDetalle"));
            int idProd=rs.getInt("idProducto");
            Producto pro=productoData.consultaProductoPorID();
            detalle.setIdProducto(pro);
            detalle.setPrecioCosto(rs.getDouble("precioCosto"));
            detalle.setCantidad(rs.getInt("cantidad"));

            detalles.add(detalle);            
        }
     
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al conectar con DetalleCompra", "Error", 0);
        }    
         return detalles;
     }     
    
     public List<DetalleCompra> listarDetalleDelProducto (){
        String sql = "SELECT producto.idProducto, producto.nombre, producto.descripcion, producto.precio, detallecompra.cantidad FROM detallecompra "
                + "JOIN producto ON (detallecompra.idProducto = producto.idProducto) WHERE producto.estado = 1 AND detallecompra.estado = 1";
        List<DetalleCompra> list = new ArrayList<>();
            
        try {            
            PreparedStatement ps = conexion.prepareStatement(sql);            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                 compra = new DetalleCompra();
                 producto = new Producto();
                 producto.setNombre(rs.getString("nombre"));
                 producto.setDescripcion(rs.getString("descripcion"));
                 producto.setPrecio(rs.getDouble("precio"));
                 compra.setIdProducto(producto);
                 compra.setCantidad(rs.getInt("cantidad"));                
                 
              list.add(compra);
            }           
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al conectar con DetalleCompra", "Error", JOptionPane.ERROR_MESSAGE);
        }        
         return list;
     }
     
     public void modificarDetalleCompra(DetalleCompra detalle){
        String sql = "UPDATE detallecompra SET  precioCosto = ?, cantidad = ? WHERE estado = 1 AND idDetalle = ?";
         
        try {
           PreparedStatement ps = conexion.prepareStatement(sql);          
           ps.setDouble(1, detalle.getPrecioCosto());
           ps.setInt(2, detalle.getCantidad());
           ps.setInt(3,detalle.getIdDetalle());
           ps.executeUpdate();
           
           JOptionPane.showMessageDialog(null,"Producto Modificado");
            
        } catch (SQLException ex) {
            
           JOptionPane.showMessageDialog(null,"Error Modificar");
        }        
     }
     
     /*
     public void eliminarDetalleCompra(int idDetalle){
        String sql = "UPDATE detallecompra SET estado = 0 WHERE idDetalle = ? AND estado = 1";
     
        PreparedStatement ps;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, idDetalle);
     
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con DetalleCompra", "Error", JOptionPane.ERROR_MESSAGE);
        }     
     }
     */
    
     
     public List<DetalleCompra> actualizaCantidad(int idDetalle){
         String sql = "SELECT producto.nombre, producto.descripcion, detallecompra.cantidad FROM detallecompra JOIN producto ON (detallecompra.idProducto = producto.idProducto)"
                 + " WHERE detallecompra.idDetalle = ? AND detallecompra.estado = 1 AND producto.estado = 1";
         List<DetalleCompra> listDetalle = new ArrayList<>();
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idDetalle);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
              compra = new DetalleCompra();
              producto = new Producto();
              
              producto.setNombre(rs.getString("nombre"));
              producto.setDescripcion(rs.getString("descripcion"));
              compra.setIdProducto(producto);
              compra.setCantidad(rs.getInt("cantidad"));
              listDetalle.add(compra);
            
            }
            
            
        } catch (SQLException ex) {
            
            Logger.getLogger(DetalleCompraData.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return listDetalle;
     }
     
     public List<DetalleCompra> listaDetalles(){
        String sql = "SELECT * FROM detallecompra WHERE estado=1";
        List<DetalleCompra> lista = new ArrayList<>();
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                compra = new DetalleCompra();                
                compra.setIdDetalle(rs.getInt("idDetalle"));
                
                int idCompra = rs.getInt("idCompra");
                Compra comp = compraData.obtenerCompraPorID(idCompra);
                compra.setIdCompra(comp);
                
                int idProducto = rs.getInt("idProducto");
                Producto produ = productoData.consultaProductoPorID();
                compra.setIdProducto(produ);
                
                compra.setPrecioCosto(rs.getDouble("precioCosto"));
                compra.setCantidad(rs.getInt("cantidad"));
                compra.setEstado(rs.getBoolean("estado"));
                
                lista.add(compra);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CompraData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
     }
     
     
}
