
package ventana;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class VentanaComponentes2 {
        
    //Declarar todos los componentes:
    
    JFrame marco;
    JPanel panel;
    JLabel etUsuario,etContrasinal;
    JButton boton1,blimpiar;
    JTextField jtUsuario;
    JPasswordField jpContrasinal;
    
    public VentanaComponentes2(){
        
        //Instanciar todos los componentes.
        marco=new JFrame("Ventana componentes Login");
        panel=new JPanel();
        etUsuario=new JLabel("Usuario:");
        etContrasinal=new JLabel("Contrasinal:");
        jtUsuario=new JTextField(7);
        jpContrasinal=new JPasswordField(4);
        boton1=new JButton("Inxirir");
        blimpiar=new JButton("Limpar");
        
        
        //Tamaño del marco y mas componentes.
        
        marco.setSize(600, 300);
        panel.setBounds(0, 0, 600, 300);
        //Metemos los componentes en el panel. 
        
        panel.add(etUsuario);
        panel.add(jtUsuario);
        panel.add(etContrasinal);
        panel.add(jpContrasinal);
        panel.add(boton1);
        panel.add(blimpiar);
        
        //Metemos el panel en el marco.
        //Colocamos nostros donde queremos cada cosa
        etUsuario.setBounds(50, 50, 50, 50);
        etContrasinal.setBounds(50, 90, 70, 50);
        jtUsuario.setBounds(120,60,70,25);
        jpContrasinal.setBounds(120,100,70,25);
        boton1.setBounds(160, 180, 90, 20);
        blimpiar.setBounds(300,180,90,20);
        marco.add(panel);
        
        //Centramos el marco y lo hacemos visible.
        
        //marco.pack();
        panel.setLayout(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);
        
    }
}
