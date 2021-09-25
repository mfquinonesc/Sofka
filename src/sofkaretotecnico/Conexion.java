/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofkaretotecnico;

/**
 *
 * @author manue
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    
    private boolean estaConectada;
    private Connection conn;
    private  Statement stmt ;
    
    
    public Conexion(){
        this.estaConectada=false;
        this.conn= null;
        this.stmt = null;
    }
    
    public void setSentenciaSql(String senteciaSql) throws SQLException{
        if(this.estaConectada){
            stmt = conn.createStatement();
            stmt.executeUpdate(senteciaSql);
            stmt.close();
            conn.close();
            System.out.println("Ok");
        }     
         
    }
    
    
     public String consultarSql(String sentenciaSql, int colunma) throws SQLException{           
         String dato = null;
         ResultSet resultado = null;
         if(this.estaConectada){
            stmt = conn.createStatement();
            resultado = stmt.executeQuery(sentenciaSql);            
            while(resultado.next()){
               dato = resultado.getString(colunma);
            }
            stmt.close();
            conn.close();
            resultado.close();
        }    
        return dato;
    }
   
    
    public void crearConexion() throws SQLException{        

        String urlDatabase =  "jdbc:postgresql://localhost:5432/myjuegodb";
        try {
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection(urlDatabase,"postgres", "1234");
                System.out.println("Conexión Exitosa");
                this.estaConectada=true;
            } 
        catch (ClassNotFoundException | SQLException e) {
                this.estaConectada=false;
                System.out.println("Ocurrio un error : "+e.getMessage());
            }            
         
    }
        
}