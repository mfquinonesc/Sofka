/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofkaretotecnico;

import java.util.ArrayList;

/**
 *
 * @author manue
 */
public class Opciones {
    
    private int idOpciones;
    private int idPregunta;
    private ArrayList<String> respuestas;
    private ArrayList<Boolean> atributo;

   
    public String getRespuestas(int indice) {
        String resp = "";
        if (indice <this.respuestas.size()){
            resp= this.respuestas.get(indice);
        }        
        return resp;
    }

    public void setRespuestas(String texto) {
       this.respuestas.add(texto);
    }

    
    public boolean getAtributo(int indice) {
        boolean sol=false;
        if(indice < this.atributo.size()){
            sol =  this.atributo.get(indice);
        }
        return sol;
    }

    
    public void setAtributo(boolean correcto) {
      this.atributo.add(correcto);
    }

    
    
}
