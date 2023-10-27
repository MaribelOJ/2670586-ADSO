import javax.swing.*;
import java.awt.*;

public class Principal{
    public static void main(String [] args){
        Dimension tamanio = new Dimension(600, 500);

        JFrame ventana_01 = new JFrame();
        ventana_01.setTitle("Primer Ventana");
        ventana_01.setVisible(true);
        ventana_01.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana_01.setSize(300, 600);
        // ventana_01.setSize(tamanio);
        // ventana_01.setResizable(false);
        ventana_01.setLocation(500, 100);
        ventana_01.setLocationRelativeTo(null);
        
        JPanel contenedor = new JPanel();
        // contenedor.setBackground(new Color(0,0,0));
        contenedor.setBackground(Color.WHITE);
        JLabel etiqueta_titulo = new JLabel();
        etiqueta_titulo.setText("TITULO");
        // Font estiloLetra = new Font("Snap ITC", Font.BOLD, 20);
        // etiqueta_titulo.setFont(estiloLetra);
        etiqueta_titulo.setForeground( Color.BLUE);
        etiqueta_titulo.setOpaque(true);
        etiqueta_titulo.setBackground(Color.GRAY);
        etiqueta_titulo.setFont(new Font("Arial", Font.PLAIN, 50));

        JLabel etiqueta_cedula = new JLabel();
        etiqueta_cedula.setText("Cedula: ");
        etiqueta_cedula.setFont(new Font("Arial", Font.PLAIN, 20));

        JTextField campo_cedula = new JTextField();
        campo_cedula.setColumns(10);

        JLabel etiqueta_nombre = new JLabel();
        etiqueta_nombre.setText("Nombre: ");
        etiqueta_nombre.setFont(new Font("Arial", Font.PLAIN, 20));

        JTextField campo_nombre = new JTextField();
        campo_nombre.setColumns(10);

        JLabel etiqueta_apellido = new JLabel();
        etiqueta_apellido.setText("Apellido: ");
        etiqueta_apellido.setFont(new Font("Arial", Font.PLAIN, 20));

        JTextField campo_apellido = new JTextField();
        campo_apellido.setColumns(10);

        JButton buton = new JButton();
        buton.setText("Enviar");
        buton.setFont(new Font("Arial", Font.PLAIN, 20));


        contenedor.add(etiqueta_titulo);
        contenedor.add(etiqueta_cedula);
        contenedor.add(campo_cedula);
        contenedor.add(etiqueta_nombre);
        contenedor.add(campo_nombre);
        contenedor.add(etiqueta_apellido);
        contenedor.add(campo_apellido);
        contenedor.add(buton);
        ventana_01.add(contenedor);
        ventana_01.revalidate();

        // ventana_01.repaint();
       
        // ventana_01.pack();

        
    }
}