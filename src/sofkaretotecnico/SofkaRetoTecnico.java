/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofkaretotecnico;

import java.sql.SQLException;
import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author manue
 */
public class SofkaRetoTecnico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {        
        
        SetupFrame form=new SetupFrame();
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setVisible(true); 
    }
}
