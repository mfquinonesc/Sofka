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
        for (int j=0;j<100;j++){
            Opciones op = new Opciones();

            for (int i =0; i<4;i++){
                 op.setRespuesta("###"+i*i+"===");
            }
            for (int i =0; i<4;i++){
                 op.setAtributo((j+i)%4);
            }
            op.setIdPregunta(j+1);
            op.guardarRespuestas();
        }
        
        Opciones op =new Opciones();
        op.consultarRespuestas(9);
        for (int i =0; i<4;i++){
            System.out.println(op.getRespuesta(i));
            System.out.println(op.getAtributo(i));
        }
          System.out.println(op.getIdOpciones());
          System.out.println(op.getIdPregunta());
    }
    
}
