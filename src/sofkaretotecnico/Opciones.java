/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofkaretotecnico;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author manue
 */
public class Opciones {
    
    private int idOpciones;
    private int idPregunta;
    private ArrayList<String> respuestas;
    private ArrayList<Integer> atributo;

    public Opciones(){
        this.respuestas = new ArrayList<String>();
        this.atributo= new ArrayList<Integer>();
    }
    
    public void consultarRespuestas(int id_pregunta) throws SQLException{
       
        String sentSql = "SELECT * FROM opciones WHERE id_pregunta = "+ id_pregunta+ ";";
        Conexion conec = new Conexion();
        conec.crearConexion();
        this.idOpciones = Integer.parseInt(conec.consultarSql(sentSql,1));
        this.respuestas.clear();
        for (int i =0; i<4;i++){
            conec = new Conexion();
            conec.crearConexion();
            this.respuestas.add(conec.consultarSql(sentSql,i+3));     
        }
        this.atributo.clear();
        for (int i =0; i<4;i++){
            conec = new Conexion();
            conec.crearConexion();  
            if(Integer.parseInt(conec.consultarSql(sentSql,i+7))>0){               
                this.atributo.add(1);
            }     
            else{
                this.atributo.add(0);
            }
        }
        this.idPregunta= id_pregunta;
    }
    
    
    public void guardarRespuestas() throws SQLException{
        String sentSql = "INSERT INTO opciones (id_pregunta, respuesta1, respuesta2, respuesta3,respuesta4,atributo1 , atributo2, atributo3, atributo4) VALUES ("+
                +this.getIdPregunta();
        for(int i =0; i< 4;i++){
            sentSql= sentSql +",'"+ this.getRespuesta(i)+"'";
        }
        for(int i =0; i< 4;i++){
            sentSql= sentSql +","+ this.getAtributo(i);
        }
        sentSql= sentSql+");";        
              
        Conexion conect= new Conexion();
        conect.crearConexion();
        conect.setSentenciaSql(sentSql);
    }
    
   
    public String getRespuesta(int indice) {
        String resp = "";
        if (indice <this.respuestas.size()){
            resp= this.respuestas.get(indice);
        }        
        return resp;
    }

    public void setRespuesta(String texto) {
       this.respuestas.add(texto);
    }

    
    public int getAtributo(int indice) {
        int sol=0;
        if(indice < this.atributo.size()){
            sol =  this.atributo.get(indice);
        }
        return sol;
    }

    
    public void setAtributo(int correcto) {
      if(correcto>0){
           this.atributo.add(1);
      }
      else{
          this.atributo.add(0);
      }       
    }
    
    public void setAtributo(boolean correcto) {
      if(correcto){
           this.atributo.add(1);
      }
      else{
          this.atributo.add(0);
      }       
    }

    public int getIdOpciones() {
        return idOpciones;
    }

    public void setIdOpciones(int idOpciones) {
        this.idOpciones = idOpciones;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    
    
}
