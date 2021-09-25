/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofkaretotecnico;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author manue
 */
public class Pregunta {
    private int idPregunta;
    private String enunciado;
    private int categoria;
    
    public Pregunta(){
        this("",0);
    }
    
    
    public Pregunta (String enun, int catego){
        this.enunciado=enun;
        this.categoria= catego;
    }

    public void guardarPregunta() throws SQLException{
        String sentSql = "INSERT INTO pregunta (enunciado,categoria) VALUES ('"+
                 this.enunciado+"',"+this.categoria+");";
        Conexion conect= new Conexion();
        conect.crearConexion();
        conect.setSentenciaSql(sentSql);
    }
    
    public void buscarPregunta(int categ) throws SQLException{     
        String sqlCon="SELECT * FROM pregunta WHERE id = (SELECT id FROM pregunta WHERE categoria = "+
                categ+" ORDER BY RANDOM() LIMIT 1);";
        Conexion conec = new Conexion();
        conec.crearConexion();
        this.idPregunta= Integer.parseInt(conec.consultarSql(sqlCon, 1)); 
        conec = new Conexion();
        conec.crearConexion();
        this.enunciado=conec.consultarSql("SELECT * FROM pregunta WHERE id = "+
                this.idPregunta +";", 2);
        this.categoria=categ;
        System.out.println(this.idPregunta);
        System.out.println(this.enunciado);
        System.out.println(this.categoria);
        
        
        
    }
    
    
    public int getIdPregunta() {
        return idPregunta;
    }
    
    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }
    
    public String getEnunciado() {
        return enunciado;
    }
   
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    
    public int getCategoria() {
        return categoria;
    }
    
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
}
