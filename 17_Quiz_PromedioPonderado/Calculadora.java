import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.border.*;

public class Calculadora extends JFrame{
    double notas = 0;
    double creditos = 0;
    private Materia [] materias;
    private JPanel contenedorItems;
    private JLabel listaJLabels [];
    private int indiceItems;
    private int totalFactura;
	private JLabel etq_calcular_promedio;
	private JLabel etq_materia;
	private JLabel etq_credito_estudiante;
	private JLabel etq_nota_estudiante;
	private JLabel etq_datos_vendedor;
    private JLabel etq_resumen;
    private JLabel etq_total;
	private JTextField input_materia_campo;
	private JTextField input_credito_campo;
	private JTextField input_nota_campo;
    private JButton btn_registrar_notaMateria;
	private JButton btn_limpiar;

    public Calculadora(){

        materias = new Materia[50];
        this.listaJLabels = new JLabel[50];
        indiceItems = 0;

        initComponent();
    }

    public void initComponent(){
		

		Toolkit sistema = Toolkit.getDefaultToolkit();
		Dimension tamanio = sistema.getScreenSize();

		setTitle("Promedio Ponderado");
		setSize( 600, 600);
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		setLocationRelativeTo(null);
		
		setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_promedio.png") ) );

		JPanel contPrincipal = new JPanel();
		contPrincipal.setLayout(new GridBagLayout());
		contPrincipal.setBorder( BorderFactory.createEmptyBorder(20, 20, 20, 20) );
        contPrincipal.setBackground(Color.WHITE);

		GridBagConstraints mainLayout = new GridBagConstraints();

		etq_calcular_promedio = new JLabel("CALCULAR PROMEDIO");
		etq_calcular_promedio.setFont( new Font("Arial", Font.BOLD, 35) );
		etq_calcular_promedio.setBorder( BorderFactory.createEmptyBorder(0, 0, 10, 0) );
		mainLayout.gridy = 0;
		mainLayout.gridx = 0;
		mainLayout.gridheight = 1;
		mainLayout.gridwidth = 4;
		mainLayout.weighty = 2;
		mainLayout.weightx = 100;
		mainLayout.fill = GridBagConstraints.CENTER;
		contPrincipal.add( etq_calcular_promedio, mainLayout );

        JPanel contDatosMateria = new JPanel();
		contDatosMateria.setLayout(new GridBagLayout());
		contDatosMateria.setBorder( BorderFactory.createEmptyBorder(10, 10, 10, 10) );
        contDatosMateria.setBackground(Color.decode("#e6e6e6"));
        mainLayout.gridx=0;
        mainLayout.gridy=1;
        mainLayout.gridheight=1;
        mainLayout.gridwidth=1;
        mainLayout.weighty=12;
        mainLayout.weightx=100;
        mainLayout.fill=GridBagConstraints.BOTH;
        contPrincipal.add(contDatosMateria,mainLayout);

		GridBagConstraints secondPanel = new GridBagConstraints();


		etq_materia = new JLabel("Materia:");
        etq_materia.setFont( new Font("Arial", Font.PLAIN, 20) );
		secondPanel.gridy = 0;
		secondPanel.gridx = 0;
		secondPanel.gridheight = 1;
		secondPanel.gridwidth = 1;
		secondPanel.weighty = 50;
		secondPanel.weightx = 15;
		secondPanel.fill = GridBagConstraints.CENTER;
		contDatosMateria.add( etq_materia, secondPanel );

		input_materia_campo = new JTextField();
		input_materia_campo.setHorizontalAlignment(JTextField.CENTER);
		secondPanel.gridy = 0;
		secondPanel.gridx = 1;
		secondPanel.gridheight = 1;
		secondPanel.gridwidth = 1;
		secondPanel.weighty = 50;
		secondPanel.weightx = 35;
		secondPanel.insets= new Insets(5,0,5,0);
		secondPanel.fill = GridBagConstraints.BOTH;
		contDatosMateria.add( input_materia_campo, secondPanel );
        

		etq_credito_estudiante = new JLabel("Creditos:");
        etq_credito_estudiante.setFont( new Font("Arial", Font.PLAIN, 20) );
        secondPanel.gridy = 0;
		secondPanel.gridx = 2;
		secondPanel.gridheight = 1;
		secondPanel.gridwidth = 1;
		secondPanel.weighty = 50;
		secondPanel.weightx = 15;
		secondPanel.fill = GridBagConstraints.CENTER;
		contDatosMateria.add( etq_credito_estudiante, secondPanel );

		input_credito_campo = new JTextField();
		input_credito_campo.setHorizontalAlignment(JTextField.CENTER);
		secondPanel.gridy = 0;
		secondPanel.gridx = 3;
		secondPanel.gridheight = 1;
		secondPanel.gridwidth = 1;
		secondPanel.weighty = 1;
		secondPanel.weightx = 35;
		secondPanel.insets= new Insets(5,0,5,10);
		secondPanel.fill = GridBagConstraints.BOTH;
		contDatosMateria.add( input_credito_campo, secondPanel );
		

		etq_nota_estudiante = new JLabel("Nota:");
        etq_nota_estudiante.setFont( new Font("Arial", Font.PLAIN, 20) );
		secondPanel.gridy = 1;
		secondPanel.gridx = 0;
		secondPanel.gridheight = 1;
		secondPanel.gridwidth = 1;
		secondPanel.weighty = 50;
		secondPanel.weightx = 15;
		secondPanel.fill = GridBagConstraints.CENTER;
		contDatosMateria.add( etq_nota_estudiante, secondPanel );


		input_nota_campo = new JTextField();
		input_nota_campo.setHorizontalAlignment(JTextField.CENTER);
		secondPanel.gridy = 1;
		secondPanel.gridx = 1;
		secondPanel.gridheight = 1;
		secondPanel.gridwidth = 1;
		secondPanel.weighty = 50;
		secondPanel.weightx = 35;
		secondPanel.insets= new Insets(5,0,5,0);
		secondPanel.fill = GridBagConstraints.BOTH;
		contDatosMateria.add( input_nota_campo, secondPanel );

	
		btn_registrar_notaMateria = new JButton("REGISTRAR");
        btn_registrar_notaMateria.setBackground(new Color(0,0,245));
        btn_registrar_notaMateria.setForeground(Color.WHITE);
		btn_registrar_notaMateria.setFocusable(false);
		btn_registrar_notaMateria.setBorder(BorderFactory.createEmptyBorder(0,30,0,30));
		secondPanel.gridy = 1;
		secondPanel.gridx = 2;
		secondPanel.gridheight = 1;
		secondPanel.gridwidth = 2;
		secondPanel.weighty = 50;
		secondPanel.weightx = 35; 
		secondPanel.fill = GridBagConstraints.VERTICAL;
		contDatosMateria.add( btn_registrar_notaMateria, secondPanel );

		etq_resumen = new JLabel("RESUMEN");
        etq_resumen.setFont( new Font("Arial", Font.BOLD, 20) );
		mainLayout.gridy = 3;
		mainLayout.gridx = 0;
		mainLayout.gridheight = 2;
		mainLayout.gridwidth = 4;
		mainLayout.weighty = 2;
		mainLayout.weightx = 100;
		mainLayout.insets = new Insets(10, 0, 10, 0);
		mainLayout.fill = GridBagConstraints.CENTER;
		contPrincipal.add( etq_resumen, mainLayout );

        Border borderGray = BorderFactory.createMatteBorder(2, 2, 1, 1, Color.decode("#D5D5D5"));

		contenedorItems = new JPanel();
        contenedorItems.setLayout( new GridBagLayout() );
        contenedorItems.setBackground(Color.WHITE);
        JScrollPane scrollPane = new JScrollPane(contenedorItems);
        scrollPane.setBorder(borderGray);
        
        mainLayout.gridy = 5;
        mainLayout.gridx = 0;
        mainLayout.gridheight = 1;
        mainLayout.gridwidth = 4;
        mainLayout.weighty = 80;
        mainLayout.weightx = 100;
        mainLayout.fill = GridBagConstraints.BOTH;
        mainLayout.insets = new Insets(10, 0, 0, 10);
        contPrincipal.add( scrollPane, mainLayout );
                
        Border borderColor = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.decode("#D5D5D5"));
        Border borderPadding = new EmptyBorder(3,10,3,10);
        Border borderGris = new CompoundBorder(borderColor, borderPadding);

    

    	GridBagConstraints constItems = new GridBagConstraints();
        
        for (int i=0; i<this.listaJLabels.length; i++) {
            JLabel etq_temporal = new JLabel(" ");
            etq_temporal.setHorizontalAlignment( JLabel.CENTER );
            etq_temporal.setFont( new Font("Arial", Font.PLAIN, 18) );
            etq_temporal.setOpaque(true);
            etq_temporal.setBackground( Color.white );
            etq_temporal.setBorder( borderGris );
            this.listaJLabels[i] = etq_temporal;
            constItems.gridy = i;
            constItems.gridx = 0;
            constItems.gridheight = 1;
            constItems.gridwidth = 1;
            constItems.weighty = 1;
            constItems.weightx = 1;
            constItems.fill = GridBagConstraints.HORIZONTAL;
            constItems.anchor = GridBagConstraints.NORTH;
            constItems.insets = new Insets(0, 0, 0, 0);
            contenedorItems.add(this.listaJLabels[i], constItems);
        }

        etq_total = new JLabel("Promedio: 0.0");
        etq_total.setHorizontalAlignment( JLabel.CENTER );
        etq_total.setFont( new Font("Arial", Font.BOLD, 25) );
        etq_total.setOpaque(true);
        etq_total.setBackground( Color.white );
        etq_total.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
        mainLayout.gridy = 6;
        mainLayout.gridx = 0;
        mainLayout.gridheight = 1;
        mainLayout.gridwidth = 4;
        mainLayout.weighty = 2;
        mainLayout.weightx = 100;
        mainLayout.fill = GridBagConstraints.BOTH;
        mainLayout.insets = new Insets(0, 0, 0, 10);
        contPrincipal.add( etq_total, mainLayout );

        btn_limpiar = new JButton("LIMPIAR");
        btn_limpiar.setBackground(Color.RED);
        btn_limpiar.setForeground(Color.WHITE);
		btn_limpiar.setFocusable(false);
		btn_limpiar.setBorder(BorderFactory.createEmptyBorder(10,30,10,30));
		mainLayout.gridy =7;
		mainLayout.gridx = 0;
		mainLayout.gridheight = 1;
		mainLayout.gridwidth = 4;
		mainLayout.weighty = 2;
		mainLayout.weightx = 25;
		mainLayout.fill = GridBagConstraints.VERTICAL;
		contPrincipal.add( btn_limpiar, mainLayout );


		add( contPrincipal );
		setResizable(false);
		setVisible(true);
		revalidate();
		repaint();

        ActionListener evento_click_registrar = new ActionListener(){
			public void actionPerformed(ActionEvent event){
                String materia = input_materia_campo.getText();
                double creditos = Double.parseDouble(input_credito_campo.getText());
                double notas = Double.parseDouble(input_nota_campo.getText());

				registrarMateria(materia, creditos, notas);
			}
		};

		btn_registrar_notaMateria.addActionListener(evento_click_registrar);

		ActionListener evento_click_limpiar = new ActionListener(){
			public void actionPerformed(ActionEvent event){
				limpiar();
			}
		};

		btn_limpiar.addActionListener(evento_click_limpiar);

		KeyListener evento_key_inputs = new KeyListener(){
			public void keyPressed(KeyEvent e){

			}

			public void keyReleased(KeyEvent e){
			
				if(e.getKeyCode() == 10){
					pasarCampo();
				}
			}

			public void keyTyped(KeyEvent e){

			}
		};

		input_materia_campo.addKeyListener(evento_key_inputs);
		input_credito_campo.addKeyListener(evento_key_inputs);
		input_nota_campo.addKeyListener(evento_key_inputs);	
	}

	public void pasarCampo(){
		if(input_credito_campo.getText().equals("")){
			input_credito_campo.requestFocus();
			
		}else if(input_nota_campo.getText().equals("")){
			input_nota_campo.requestFocus();
		}else{
			String materia = input_materia_campo.getText();
               double creditos = Double.parseDouble(input_credito_campo.getText());
            double notas = Double.parseDouble(input_nota_campo.getText());

			registrarMateria(materia, creditos, notas);

		}
	}


    public void registrarMateria(String subject,double credits,double grade){

        input_materia_campo.setText("");
        input_credito_campo.setText("");
        input_nota_campo.setText("");

        
        for(int i=0; i < materias.length; i++){
            if(materias[i] == null){
                materias[i] = new Materia(subject, credits, grade);
                notas += materias[i].getNota() * materias[i].getCreditos();
                creditos += materias[i].getCreditos();
                indiceItems++;
                break;
            }
        }

        for (int i=0; i<this.listaJLabels.length; i++) {
            if(materias[i] != null){
                String text = materias[i].getNombre() + " -> Creditos: "+materias[i].getCreditos() + " -> Nota: " + materias[i].getNota(); 
                this.listaJLabels[i].setText(text);

            }     
        }

        double promedio = notas / creditos;
        etq_total.setText("Promedio: " + promedio);
		input_materia_campo.requestFocus();
    }

    public void limpiar(){

        for (int i=0; i<this.listaJLabels.length; i++) {
            if(materias[i] != null){
                this.listaJLabels[i].setText(" ");
                etq_total.setText("");
            }     
        }

    }


}