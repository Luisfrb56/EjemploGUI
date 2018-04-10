
package ventana;

import javax.swing.*;


public class VentanaComponentes {
    
    //Declarar todos los componentes:
    
    JFrame marco;
    JPanel panel;
    JLabel etUsuario,etContrasinal;
    JButton boton1,blimpiar;
    JTextField jtUsuario;
    JPasswordField jpContrasinal;
    
    public VentanaComponentes(){
        
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
        
        //Metemos los componentes en el panel. 
        
        panel.add(etUsuario);
        panel.add(jtUsuario);
        panel.add(etContrasinal);
        panel.add(jpContrasinal);
        panel.add(boton1);
        panel.add(blimpiar);
        
        //Metemos el panel en el marco.
        
        marco.add(panel);
        
        //Centramos el marco y lo hacemos visible.
        //marco.pack();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);
        
    }
}
