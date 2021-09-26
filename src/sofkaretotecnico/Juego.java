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

    public int getRonda() {
        return ronda;
    }

    public void setRonda(int ronda) {
        this.ronda = ronda;
    }

    public int getPuntajeAcumulado() {
        return puntajeAcumulado;
    }

    public void setPuntajeAcumulado(int puntajeAcumulado) {
        this.puntajeAcumulado = puntajeAcumulado;
    }
    private int ronda;
    private int puntajeAcumulado;
    
    
    public Juego(){
        this.ronda=1;
    }    
    
    public void siguienteRonda(){
        this.setRonda(this.getRonda() + 1);
    }
    
    public void sumarAcumulado(){
        this.setPuntajeAcumulado(this.getPuntajeAcumulado() + (this.getRonda() * 100));
        
    }
    
    
}
