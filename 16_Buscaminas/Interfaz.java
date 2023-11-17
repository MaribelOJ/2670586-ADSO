import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.text.NumberFormat;
import java.util.Locale;
// import javax.swing.ImageIcon;
// import java.awt.Image;

public class Interfaz extends JFrame{

    public Interfaz(){
        initComponent();
    }

    public void initComponent(){
        Toolkit sistema = Toolkit.getDefaultToolkit();

        setTitle("BUSCAMINAS");
        setSize(400,550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_bomba.png")));
        getContentPane().setBackground(Color.BLUE);

        
        Border borderWhite1 = BorderFactory.createMatteBorder(6, 5, 0, 0, Color.WHITE);
        
        JPanel mainContainer = new JPanel();
        mainContainer.setLayout(new GridBagLayout());
        mainContainer.setOpaque(true);
        mainContainer.setBackground(Color.decode("#c0c0c0"));
        mainContainer.setBorder(borderWhite1);
        
        GridBagConstraints adjustments = new GridBagConstraints();

        Border borderColor = BorderFactory.createMatteBorder(3, 3, 0, 0, Color.decode("#808080"));
        Border border2 = BorderFactory.createLineBorder(Color.decode("#c0c0c0"), 10);        
        Border borderGray = new CompoundBorder(border2, borderColor);

        Border borderWhite2 = BorderFactory.createMatteBorder(0, 0, 3, 3, Color.WHITE);
        Border borderPadding = new EmptyBorder(5,5,5,5);  
             
        Border contenedores_hijos = new CompoundBorder(borderGray,borderWhite2);

        JPanel container_child1 = new JPanel();
        container_child1.setLayout(new GridBagLayout());
        container_child1.setOpaque(true);
        container_child1.setBackground(Color.decode("#c0c0c0"));
        container_child1.setBorder(contenedores_hijos);
        adjustments.gridx=0;
        adjustments.gridy=0;
        adjustments.gridheight=1;
        adjustments.gridwidth=1;
        adjustments.weighty=1;
        adjustments.weightx=1;
        adjustments.fill=GridBagConstraints.BOTH;
        mainContainer.add(container_child1,adjustments);
        

       
        JPanel container_child2 = new JPanel();
        container_child2.setLayout(new GridLayout(9,9));
        container_child2.setOpaque(true);
        container_child2.setBackground(Color.decode("#c0c0c0"));
        container_child2.setBorder(contenedores_hijos);
        adjustments.gridx=0;
        adjustments.gridy=1;
        adjustments.gridheight=1;
        adjustments.gridwidth=1;
        adjustments.weighty=9;
        adjustments.weightx=1;
        adjustments.fill=GridBagConstraints.BOTH;
        mainContainer.add(container_child2,adjustments);


        JLabel contMinas = new JLabel("000");
        contMinas.setFont(new Font("Arial", Font.BOLD, 50));
        contMinas.setOpaque(true);
        contMinas.setBackground(Color.BLACK);
        contMinas.setForeground(Color.RED);
        contMinas.setHorizontalAlignment(JLabel.CENTER);
        adjustments.gridx=0;
        adjustments.gridy=0;
        adjustments.gridheight=1;
        adjustments.gridwidth=1;
        adjustments.weighty=1;
        adjustments.weightx=33;
        adjustments.fill=GridBagConstraints.NONE;
        container_child1.add(contMinas,adjustments);

        Border borderWhite = BorderFactory.createMatteBorder(2, 2, 0, 0, Color.WHITE);
        Border borderGris = BorderFactory.createMatteBorder(0, 0, 2, 2, Color.decode("#808080"));       
        Border ButtonOutline = new CompoundBorder(borderWhite,borderGris);


        JButton mainButton = new JButton();
        mainButton.setBackground(Color.decode("#c0c0c0"));
        mainButton.setBorder(ButtonOutline);
        adjustments.gridx=1;
        adjustments.gridy=0;
        adjustments.gridheight=1;
        adjustments.gridwidth=1;
        adjustments.weighty=1;
        adjustments.weightx=33;
        adjustments.fill= GridBagConstraints.NONE;


        ImageIcon happyIcon = new ImageIcon("imagenes/icono_happy.png");
        Image imageURL = happyIcon.getImage();
        Image imageWithMesures = imageURL.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        happyIcon = new ImageIcon(imageWithMesures);
        mainButton.setIcon(happyIcon);

        container_child1.add(mainButton,adjustments);

        JLabel timer = new JLabel("000");
        timer.setFont(new Font("Arial", Font.BOLD, 50));
        timer.setOpaque(true);
        timer.setBackground(Color.BLACK);
        timer.setForeground(Color.RED);
        timer.setHorizontalAlignment(JLabel.CENTER);
        adjustments.gridx=2;
        adjustments.gridy=0;
        adjustments.gridheight=1;
        adjustments.gridwidth=1;
        adjustments.weighty=1;
        adjustments.weightx=33;
        adjustments.fill=GridBagConstraints.NONE;
        container_child1.add(timer,adjustments);

        borderWhite = BorderFactory.createMatteBorder(2, 2, 0, 0, Color.WHITE);
        borderGris = BorderFactory.createMatteBorder(0, 0, 2, 2, Color.decode("#808080"));
        ButtonOutline = new CompoundBorder(borderWhite,borderGris);

        JButton[] cadritos = new JButton[81];

        for(int i = 0; i < 81 ; i++){
            cadritos[i] = new JButton();
            cadritos[i].setBackground(Color.decode("#c0c0c0"));
            cadritos[i].setBorder(ButtonOutline);
            container_child2.add(cadritos[i]);
        }      
        
        add(mainContainer);
        setResizable(false);
        setVisible(true);
        revalidate();
        repaint();
    }
}