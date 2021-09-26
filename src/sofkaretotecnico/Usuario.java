/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofkaretotecnico;

import java.sql.SQLException;

/**
 *
 * @author manue
 */
public class Usuario {

    private int id;
    private String nombre;
    private int puntajeAcumulado;
    private int ronda;
  
    public Usuario (){
        this("",0,0);
    }
    
    
    public Usuario(String nomb, int puntaje, int rond){
        this.nombre= nomb;
        this.puntajeAcumulado = puntaje;
        this.ronda=rond;
    }
 
    public void guardar() throws SQLException{
        String sentSql = "INSERT INTO jugador (nombre, puntaje, ronda) VALUES('" +
                this.nombre+"',"+ this.puntajeAcumulado+","+this.ronda+");";
        Conexion conect= new Conexion();
        conect.crearConexion();
        conect.setSentenciaSql(sentSql);
    }
        
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntajeAcumulado() {
        return puntajeAcumulado;
    }

    public void setPuntajeAcumulado(int puntajeAcumulado) {
        this.puntajeAcumulado = puntajeAcumulado;
    }

    public int getRonda() {
        return ronda;
    }

    public void setRonda(int ronda) {
        this.ronda = ronda;
    }
   
    
    
    
    
    
}
