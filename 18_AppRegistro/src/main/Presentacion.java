
package main;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Presentacion extends JFrame{
    
    private JTextField campo_nombre;
    private JLabel etq_respuesta;
    
    public Presentacion(){
        initComponents();
    }
    
    public void initComponents(){
        setTitle("Presentacion");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        JPanel contenedor = new JPanel();
        
        contenedor.setLayout(new BoxLayout(contenedor,BoxLayout.Y_AXIS));
        
        JLabel titulo = new JLabel();
        titulo.setText("FORMULARIO");
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setHorizontalAlignment(JLabel.CENTER);
        contenedor.add(titulo);
        
        campo_nombre = new JTextField();
        contenedor.add(campo_nombre);
        
        JButton btn_iniciar = new JButton();
        btn_iniciar.setText("INICIAR");
        contenedor.add(btn_iniciar);
        
        etq_respuesta = new JLabel("XXXX");
        contenedor.add(etq_respuesta);
        
        add(contenedor);        
        setVisible(true);
        revalidate();
        
        
        //ActionListener evento_click_iniciar = new ActionListener() {
            //@Override
            //public void actionPerformed(ActionEvent e) {
                //mostrarRespuesta();
            //}
        //};
        
        //btn_iniciar.addActionListener(evento_click_iniciar);
        
        btn_iniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String entrada = campo_nombre.getText();
                etq_respuesta.setText(entrada);
                campo_nombre.setText("");
            }
        } );
        
    }
    
//    public void mostrarRespuesta(){
//        String entrada=campo_nombre.getText();
//        etq_respuesta.setText(entrada);
//        campo_nombre.setText("");
//        
//    }
    
}
