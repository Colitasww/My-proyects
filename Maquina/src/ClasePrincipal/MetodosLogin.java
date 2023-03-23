/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasePrincipal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author samyr
 */
public class MetodosLogin {
    Funcionalidades fun = new Funcionalidades();
    Connection con;
    String url = "jdbc:sqlserver://localhost:1433;databaseName=MaquinaTragamonedas;User=samuel;Password=123";
    
    public Connection conectar(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en la conecion");
        }
        return con;
    }
    
    public boolean validarUsuario(String user, String contra){

    con = conectar();
    String usu , contrasena;
    String consulta = "select USU_NOMBRE,USU_CONTRA from USUARIOS where "
            + "USU_NOMBRE = '"+user+"' and USU_CONTRA = '"+contra+"'";

    try{
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery(consulta);
      while(rs.next()){
        usu = rs.getString(1);
        contrasena = rs.getString(2); 
        if(usu.equals(user) && contrasena.equals(contra)){
          return true;
        }
      }

    } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error" );    
    }
    return false;     
} 
public void RegistrarCliente(String ape, String mail, String nombre, String dinero, String tel,String tipo, String contra){
    con = conectar();
    String qy = "insert into USUARIOS values ('"+ape+"','"+mail+"','"+nombre+"',"
            + "'"+dinero+"','"+tel+"','"+tipo+"', '"+contra+"')";

        try {
            PreparedStatement ps;
            ps = con.prepareStatement(qy);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Guardado con exito"); 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar usuario" ); 
        }

    }
   public void eliminarUsuario(String id){
        
        con = conectar();
        String qy = "DELETE FROM CLIENTES WHERE CLI_ID = '"+id+"'";

            try {
                PreparedStatement ps;
                ps = con.prepareStatement(qy);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Gborrado con exito"); 
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al borrar" ); 
            }
    }
   public void llenarConIds(JComboBox categorias){
        con = conectar();
        String qy = "select CLI_ID, CLI_NOMBRE, CLI_APELLIDO FROM CLIENTES";
            try {
                Statement st = con.createStatement();
                ResultSet rt = st.executeQuery(qy);
                while(rt.next()){
                    categorias.addItem(rt.getString(1)+" "+rt.getString(2)+" "+rt.getString(3));
                }

            } catch (Exception e) {
                System.out.println("Error al extraer ides de usuario");
            }     
    }
        public boolean obtenerDinero(String user, String contra){

    con = conectar();
    
    String consulta = "select USU_DINERO from USUARIOS where "
            + "USU_NOMBRE = '"+user+"' and USU_CONTRA = '"+contra+"'";

    try{
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery(consulta);
      while(rs.next()){
        fun.setMoney(rs.getInt(1));
      }

    } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error" );    
    }
    return false;     
} 
   
    
}
