
package ventana;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Ventana {
    
    //Hacemos aqui la declaracion del marco para que sirva para todo el programa.
    
     JFrame marco;
     
     //Declaramos dos paneles.
     
     JPanel panel1, panel2;
        public Ventana(){
            
        //Crear ventana
        
        marco = new JFrame("Ejemplo Intefaz");
        
        //Dar tamaño a la ventana con setSize, aunque tambien existe setBounds con cordenadas
        
        marco.setSize(800, 400);
        
        //Editamos los JPanel que se van a mostrar ya declarados anteriormente.
        
        panel1 = new JPanel();
        panel2 = new JPanel();
        
        //Al marco le añadimos los dos paneles.
        
        marco.add(panel1);
        marco.add(panel2);
        
        //Anular el gestor de Layout para hacerme caso en lo que le madne
        
        marco.setLayout(null);
        
        //Dar caracteristicas a los paneles(Tamaño y color para diferenciar).
        
        panel1.setBounds(0, 0, 800, 150);
        panel1.setBackground(Color.yellow);
        
        panel2.setBounds(0, 200, 800, 150);
        panel2.setBackground(Color.CYAN);
        
        //Para colocar la creacion de la ventana en el medio.
        
        //***marco.setLocationRelativeTo(marco);***//
        
        //Para axustala ao tamaño que precises automaticamente segundo os compoñentes que teñas.
        
        //***marco.pack();***//
        
        //Para que se cierre el proyecto al cerrar la ventana usamos el DefaultClose
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
          //Hacer el marco visible.
        
        marco.setVisible(true);
        
    }
        
}
