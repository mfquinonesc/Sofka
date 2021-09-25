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
public class SofkaRetoTecnico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
//      Conexion con = new Conexion();
//      con.createConnection();
//      con.consultarSql("SELECT * FROM jugador WHERE id=2");
        Pregunta pregun= new Pregunta();        
        pregun.buscarPregunta(1);
    }
    
}
