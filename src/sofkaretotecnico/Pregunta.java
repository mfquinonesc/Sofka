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
public class Pregunta {
    private int idPregunta;
    private String enunciado;
    private int categoria;

    
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
