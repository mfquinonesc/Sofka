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
public class Juego {
    private int ronda;
    private int puntajeAcumulado;
    private int numeroPregPorNivel;
    
    public Juego(){
        this.ronda=1;
    }    
    
    public void siguienteRonda(){
        this.ronda++;
    }
    
    public void sumarAcumulado(){
        this.puntajeAcumulado = this.puntajeAcumulado+(this.ronda*100);
        
    }
    
    
}
