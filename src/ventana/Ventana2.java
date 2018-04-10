
package ventana;

import javax.swing.JFrame;

public class Ventana2 extends JFrame {
    
    public Ventana2(){
        
        //Crear ventana sin necesidad de declarar un marco.
        this.setSize(800, 400);
        setTitle("***Interfaz sin declarar***");
        setLocationRelativeTo(this);
        //pack();       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
}
