
package AccesoADatos;

import Dominio.Producto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ProductoData {
    private Producto producto = null;
    private Connection conexion = null;
    
    public ProductoData(){
        conexion = Conexion.conectar();
    }
    
    public void registroProducto(Producto produ){ 
        String sql = "INSERT INTO producto (nombre, descripcion, stock, precio, estado) VALUES(?, ?, ?, ?, ?)";
       
        try{
            PreparedStatement ps = conexion.prepareStatement(sql);
            
            ps.setString(1, produ.getNombre());
            ps.setString(2, produ.getDescripcion());
            ps.setInt(3, produ.getStock());
            ps.setDouble(4, produ.getPrecio());           
            ps.setBoolean(5, produ.isEstado());
            
            ps.executeUpdate();            
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"producto incorrecto");
        }
    }
    
    public void modificarProducto(Producto produ){                
        String sql = "UPDATE producto SET nombre = ?, descripcion = ?, stock = ?, precio = ?, estado = ? WHERE idProducto = ?";
                
        try{
            PreparedStatement ps = conexion.prepareStatement(sql);            
           
            ps.setString(1, produ.getNombre());
            ps.setString(2, produ.getDescripcion());
            ps.setInt(3,produ.getStock());
            ps.setDouble(4, produ.getPrecio());            
            ps.setBoolean(5, produ.isEstado());
            ps.setInt(6, produ.getIdProducto());
            
            ps.executeUpdate();
           
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Producto no encontrado","error de conexion",0);
        }
    }
    
    public void eliminarProducto(String nombre, String descripcion){
        String sql = "UPDATE producto SET estado = 0 WHERE nombre = ? AND descripcion = ?";
        try{
            PreparedStatement ps = conexion.prepareStatement(sql);
            
            ps.setString(1,nombre);
            ps.setString(2, descripcion);
            ps.executeUpdate();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al conectar con Producto");
        }
    }
    
    public List<Producto> listarProductoMayor() {
    String sql ="SELECT * FROM producto WHERE estado = 1 ORDER BY precio DESC";
    List<Producto> listita = new ArrayList<>();

    try {
        PreparedStatement ps = conexion.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while(rs.next()){
            Producto producto = new Producto();
            producto.setIdProducto(rs.getInt("idProducto"));
            producto.setNombre(rs.getString("nombre"));
            producto.setDescripcion(rs.getString("descripcion"));
            producto.setStock(rs.getInt("stock"));
            producto.setPrecio(rs.getDouble("precio"));
            producto.setEstado(rs.getBoolean("estado"));

            listita.add(producto);
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al conectar con la tabla producto", "sql", 0);
    }

    return listita;
}
    
    
    
    public List<Producto> buscarProductosPorNombreOLetra(String filtro) {
    String sql = "SELECT * FROM producto WHERE estado = 1 AND nombre LIKE ?";
    
    List<Producto> listaProductos = new ArrayList<>();

    try {
        PreparedStatement ps = conexion.prepareStatement(sql);
        
        ps.setString(1, filtro + "%");

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Producto producto = new Producto();
            producto.setIdProducto(rs.getInt("idProducto"));
            producto.setNombre(rs.getString("nombre"));
            producto.setDescripcion(rs.getString("descripcion"));
            producto.setStock(rs.getInt("stock"));
            producto.setPrecio(rs.getDouble("precio"));
            producto.setEstado(rs.getBoolean("estado"));

            listaProductos.add(producto);
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al conectar con la tabla producto", "sql", 0);
    }

    return listaProductos;
}

    
    
    
    public List<Producto> listarProductoMenor() {
    String sql ="SELECT * FROM producto WHERE estado = 1 ORDER BY precio";
    List<Producto> listita = new ArrayList<>();

    try {
        PreparedStatement ps = conexion.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while(rs.next()){
            Producto producto = new Producto();
            producto.setIdProducto(rs.getInt("idProducto"));
            producto.setNombre(rs.getString("nombre"));
            producto.setDescripcion(rs.getString("descripcion"));
            producto.setStock(rs.getInt("stock"));
            producto.setPrecio(rs.getDouble("precio"));
            producto.setEstado(rs.getBoolean("estado"));

            listita.add(producto);
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al conectar con la tabla producto", "sql", 0);
    }

    return listita;
   }
    
       
    public Producto consultaProductoPorID(int idProducto){
        String sql = " SELECT * FROM producto WHERE idProducto = ? AND estado = 1";
       
        try{
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idProducto);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){                
                producto = new Producto();                
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setStock(rs.getInt("stock"));
                producto.setPrecio(rs.getDouble("precio"));               
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Producto no encontrado");
        }        
        return producto;   
    }
    
    public Producto consultaProductoPorID(String nombre){
        String sql = " SELECT * FROM producto WHERE nombre = ? AND estado = 1";
        
        try{
            PreparedStatement ps = conexion.prepareStatement(sql);            
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){                
                producto = new Producto();                
                
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setStock(rs.getInt("stock"));
                producto.setPrecio(rs.getDouble("precio"));              
                
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Producto no encontrado");
        }        
        return producto;   
    }
    
    public List<Producto> listaProductos(){
        String sql = "SELECT * FROM producto WHERE estado=1";
        List<Producto> lista = new ArrayList<>();
            
        try {           
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                producto = new Producto();
                
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setStock(rs.getInt("stock"));
                producto.setPrecio(rs.getDouble("precio"));               
                producto.setEstado(rs.getBoolean("estado"));
                
                lista.add(producto);
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"No se encontro el Producto"," ",JOptionPane.INFORMATION_MESSAGE);
        }
        return lista;
       
    }
    
    public List<Producto> listaProductosSinDuplicado() {
    String sql = "SELECT DISTINCT nombre FROM producto WHERE estado = 1";
    List<Producto> lista = new ArrayList<>();

    try {
        PreparedStatement ps = conexion.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            producto = new Producto();
            producto.setNombre(rs.getString("nombre"));

            lista.add(producto);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al obtener la lista de productos", "Error", JOptionPane.ERROR_MESSAGE);
    }
    return lista;
}
        
    public List<Producto> listaProductospoID(String nombre){
        String sql = "SELECT * FROM producto WHERE nombre = ? AND estado = 1";
        List<Producto> listado = new ArrayList<>();
            
        try {           
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                producto = new Producto();
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setStock(rs.getInt("stock"));
                producto.setPrecio(rs.getDouble("precio"));                
                producto.setEstado(rs.getBoolean("estado"));
                listado.add(producto);
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"No se encontro el Producto"," ",JOptionPane.INFORMATION_MESSAGE);
        }
        return listado;
       
    }
    
    public List<Producto> listaProductosMasComprado(String nombre){
        String sql = "SELECT count(*) FROM producto WHERE estado=1 AND nombre = ?";
        List<Producto> lista = new ArrayList<>();
            
        try {           
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                producto = new Producto();
                
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setStock(rs.getInt("stock"));
                producto.setPrecio(rs.getDouble("precio"));               
                producto.setEstado(rs.getBoolean("estado"));
                
                lista.add(producto);
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al conectar con la tabla Productos","Error",JOptionPane.INFORMATION_MESSAGE);
        }
        return lista; 
    }
    
    
  
    
    
    
}
    

