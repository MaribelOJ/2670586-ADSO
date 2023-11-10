import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
public class Factura extends JFrame{

    int [] cedulaClientes;
    String [] nombresClientes;
    String [] direccionClientes;
    int [] cedulaVendedores;
    String [] nombresVendedores;
    Productos [] listaProductos;

    public Factura(){
        this.cedulaClientes = new int[10];
        this.nombresClientes = new String[10];
        this.direccionClientes = new String[10];
        this.cedulaVendedores = new int[5];
        this.nombresVendedores= new String[5];
        listaProductos = new Productos[20];
        initComponents();
    }

    public void initComponents(){
        setTitle("FACTURA");
        setSize(500,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel container = new JPanel();
        container.setBackground(Color.WHITE);
        container.setLayout(new GridBagLayout());
        container.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        GridBagConstraints restricciones = new GridBagConstraints();

        JLabel title_section1 = new JLabel();
        title_section1.setText("DATOS CLIENTE: ");
        title_section1.setFont(new Font ("Arial", Font.BOLD ,18));
        title_section1.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;

        container.add(title_section1,restricciones);

        JLabel cedula = new JLabel();
        cedula.setText("CEDULA: ");
        cedula.setFont(new Font("Arial", Font.BOLD, 12));
        cedula.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx=0;
        restricciones.gridy=1;
        restricciones.gridwidth=1;
        restricciones.gridheight=1;
        restricciones.weightx=10;
        restricciones.weighty=1;
        restricciones.fill = GridBagConstraints.BOTH;

        container.add(cedula,restricciones);

        JTextField campo_cedula = new JTextField();
        campo_cedula.setColumns(9);
        restricciones.gridx=1;
        restricciones.gridy=1;
        restricciones.gridwidth=1;
        restricciones.gridheight=1;
        restricciones.weightx=70;
        restricciones.weighty=1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(3,5, 0, 5);
        container.add(campo_cedula, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JButton btn_cliente = new JButton();
        btn_cliente.setText("BUSCAR");
        btn_cliente.setBackground(new Color(119, 136, 153));
        btn_cliente.setForeground(Color.BLACK);
        restricciones.gridx=2;
        restricciones.gridy=1;
        restricciones.gridwidth=1;
        restricciones.gridheight=1;
        restricciones.weightx=20;
        restricciones.weighty=1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(3,5,0,0);
        container.add(btn_cliente, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JLabel nombres = new JLabel();
        nombres.setText("NOMBRES: ");
        nombres.setFont(new Font("Arial", Font.BOLD, 12));
        nombres.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx=0;
        restricciones.gridy=2;
        restricciones.gridwidth=1;
        restricciones.gridheight=1;
        restricciones.weightx=10;
        restricciones.weighty=1;
        restricciones.fill = GridBagConstraints.BOTH;

        container.add(nombres,restricciones);

        JLabel direccion = new JLabel();
        direccion.setText("DIRECCION: ");
        direccion.setFont(new Font("Arial", Font.BOLD, 12));
        direccion.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx=0;
        restricciones.gridy=3;
        restricciones.gridwidth=1;
        restricciones.gridheight=1;
        restricciones.weightx=10;
        restricciones.weighty=1;
        restricciones.fill = GridBagConstraints.BOTH;

        container.add(direccion,restricciones);

        JLabel title_section2 = new JLabel();
        title_section2.setText("DATOS VENDEDOR: ");
        title_section2.setFont(new Font ("Arial", Font.BOLD ,18));
        title_section2.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 4;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;

        container.add(title_section2,restricciones);

        JLabel id_vendedor = new JLabel();
        id_vendedor.setText("CEDULA: ");
        id_vendedor.setFont(new Font("Arial", Font.BOLD, 12));
        id_vendedor.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx=0;
        restricciones.gridy=5;
        restricciones.gridwidth=1;
        restricciones.gridheight=1;
        restricciones.weightx=10;
        restricciones.weighty=1;
        restricciones.fill = GridBagConstraints.BOTH;

        container.add(id_vendedor,restricciones);

        JTextField campo_id = new JTextField();
        campo_id.setColumns(5);
        restricciones.gridx=1;
        restricciones.gridy=5;
        restricciones.gridwidth=1;
        restricciones.gridheight=1;
        restricciones.weightx=70;
        restricciones.weighty=1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(3,5, 0, 5);
        container.add(campo_id, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JButton btn_vendedor = new JButton();
        btn_vendedor.setText("BUSCAR");
        btn_vendedor.setBackground(new Color(119, 136, 153));
        btn_vendedor.setForeground(Color.BLACK);
        restricciones.gridx=2;
        restricciones.gridy=5;
        restricciones.gridwidth=1;
        restricciones.gridheight=1;
        restricciones.weightx=20;
        restricciones.weighty=1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(3,5,0,0);
        container.add(btn_vendedor, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JLabel names = new JLabel();
        names.setText("NOMBRES: ");
        names.setFont(new Font("Arial", Font.BOLD, 12));
        names.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx=0;
        restricciones.gridy=6;
        restricciones.gridwidth=1;
        restricciones.gridheight=1;
        restricciones.weightx=10;
        restricciones.weighty=1;
        restricciones.fill = GridBagConstraints.BOTH;

        container.add(names,restricciones);

        JLabel title_section3 = new JLabel();
        title_section3.setText("LISTA PRODUCTOS FACTURADOS: ");
        title_section3.setFont(new Font ("Arial", Font.BOLD ,18));
        title_section3.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 7;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.HORIZONTAL;

        container.add(title_section3,restricciones);

        JLabel ID = new JLabel();
        ID.setText("ID");
        ID.setFont(new Font("Arial", Font.BOLD, 12));
        ID.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx=0;
        restricciones.gridy=8;
        restricciones.gridwidth=1;
        restricciones.gridheight=1;
        restricciones.weightx=10;
        restricciones.weighty=1;
        restricciones.fill = GridBagConstraints.BOTH;

        container.add(ID,restricciones);

        JPanel dosLabels = new JPanel();
        dosLabels.setLayout(new GridLayout(1, 2));
        dosLabels.setBackground(Color.WHITE);

        JLabel product_name = new JLabel();
        product_name.setText("NOMBRE");
        product_name.setFont(new Font("Arial", Font.BOLD, 12));
        product_name.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx=0;
        restricciones.gridy=0;
        restricciones.gridwidth=1;
        restricciones.gridheight=1;
        restricciones.weightx=80;
        restricciones.weighty=1;
        restricciones.fill = GridBagConstraints.BOTH;

        dosLabels.add(product_name,restricciones);

        JLabel cantidad = new JLabel();
        cantidad.setText("CANT.");
        cantidad.setFont(new Font("Arial", Font.BOLD, 12));
        cantidad.setHorizontalAlignment(JLabel.CENTER);
        restricciones.gridx=1;
        restricciones.gridy=0;
        restricciones.gridwidth=1;
        restricciones.gridheight=1;
        restricciones.weightx=20;
        restricciones.weighty=1;
        restricciones.fill = GridBagConstraints.BOTH;

        dosLabels.add(cantidad,restricciones);

        restricciones.gridx = 1;
        restricciones.gridy = 8;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        // restricciones.insets = new Insets(0,0,180,0);
        container.add(dosLabels,restricciones);  

        JTextField campo_idProducto = new JTextField();
        campo_idProducto.setColumns(2);
        restricciones.gridx=0;
        restricciones.gridy=9;
        restricciones.gridwidth=1;
        restricciones.gridheight=1;
        restricciones.weightx=10;
        restricciones.weighty=1;
        restricciones.fill = GridBagConstraints.BOTH;
       
        container.add(campo_idProducto, restricciones);

        JPanel dosTextFields = new JPanel();
        dosTextFields.setLayout(new GridLayout(1, 2));
        dosTextFields.setBackground(Color.WHITE);
        
        JTextField campo_productName = new JTextField();
        campo_productName.setColumns(18);
        restricciones.gridwidth=1;
        restricciones.gridheight=1;
        restricciones.weightx=50;
        restricciones.weighty=1;
        // restricciones.fill = GridBagConstraints.BOTH;    
        dosTextFields.add(campo_productName, restricciones);

        JTextField campo_cantidad = new JTextField();
        campo_cantidad.setColumns(3);
        restricciones.gridwidth=1;
        restricciones.gridheight=1;
        restricciones.weightx=20;
        restricciones.weighty=1;
        // restricciones.fill = GridBagConstraints.BOTH; 
        restricciones.insets = new Insets(0,0, 0, 5);       
        dosTextFields.add(campo_cantidad, restricciones); 

        restricciones.gridx = 1;
        restricciones.gridy = 9;
        restricciones.weighty = 70;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        // restricciones.insets = new Insets(0,0,180,0);
        container.add(dosTextFields,restricciones);   

        JButton btn_producto = new JButton();
        btn_producto.setText("ADD");
        btn_producto.setBackground(new Color(119, 136, 153));
        btn_producto.setForeground(Color.BLACK);
        restricciones.gridx=2;
        restricciones.gridy=9;
        restricciones.gridwidth=1;
        restricciones.gridheight=1;
        restricciones.weightx=20;
        restricciones.weighty=1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0,6,1,0);
        container.add(btn_producto, restricciones);
        restricciones.insets = new Insets(0,0,0,0);

        JLabel carrito = new JLabel();
        carrito.setFont(new Font("Arial", Font.BOLD, 20));
        carrito.setHorizontalAlignment(JLabel.CENTER);
        JScrollPane scroll = new JScrollPane(carrito);
        restricciones.gridx=0;
        restricciones.gridy=10;
        restricciones.gridwidth=3;
        restricciones.gridheight=1;
        restricciones.weightx=100;
        restricciones.weighty=35;
        restricciones.fill = GridBagConstraints.BOTH;
        container.add(scroll, restricciones);

        JLabel total = new JLabel();
        total.setText("Total: $ 0");
        total.setFont(new Font("Arial", Font.BOLD, 18));
        total.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 2;
        restricciones.gridy = 11;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 20;
        restricciones.weighty= 1;
        restricciones.fill = GridBagConstraints.CENTER;
        container.add(total, restricciones);

        ActionListener evento_add = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("click en ADD");

                int productId = Integer.parseInt(campo_idProducto.getText());
                String product = campo_productName.getText();
                int amount = Integer.parseInt(campo_cantidad.getText());
                int precio = 0;

                for(int i = 0; i < listaProductos.length; i++){
                    if(listaProductos[i] != null){
                        if(listaProductos[i].getId() == productId){
                            precio = listaProductos[i].getPrecioUnitario();
                        }
                    }
                }
                int suma = precio * amount;

                String texto = "<html> "+ productId + " - " + product + " - " + amount + " </html";

                carrito.setText(texto);
                total.setText("Total: $ "+ suma);

                
            }
        };

        btn_producto.addActionListener(evento_add);    

        add(container);
        setVisible(true);
        revalidate();

        
    }

    public void registerClient(){
        Scanner entradaInt = new Scanner(System.in);
        Scanner entradaText = new Scanner(System.in);
        boolean existingId = false;
        int indice = -1;

        System.out.println("Cedula Cliente: ");
        int idClient = entradaInt.nextInt();

        for(int i = 0; i < cedulaClientes.length; i++){
            if(cedulaClientes[i] == 0){       
                indice = i;
                break;
            }else{
                for(int j=0; j < cedulaClientes.length;j++){
                    if(cedulaClientes[j] != 0){
                        if(idClient == cedulaClientes[j]){
                            existingId = true;
                            i=9;
                            break;
                        }
                    } 
                }
            }
        }

        if(existingId == false){
            System.out.println("Nombre Cliente: ");
            String customer = entradaText.nextLine();

            System.out.println("Direccion Cliente: ");
            String address = entradaText.nextLine();

            cedulaClientes[indice] = idClient;
            nombresClientes[indice] = customer;
            direccionClientes[indice] = address;    
        }else{
            existingId = false;
        }
    }

    public void registerSeller(){
        Scanner entradaInt = new Scanner(System.in);
        Scanner entradaText = new Scanner(System.in);
        boolean existingId = false;
        int indice = -1;

        System.out.println("Cedula Vendedor: ");
        int idSeller = entradaInt.nextInt();

        for(int i = 0; i < cedulaVendedores.length; i++){
            if(cedulaVendedores[i] == 0){
                indice = i;
                break;
            }else{
                for(int j=0; j < cedulaVendedores.length;j++){
                    if(cedulaVendedores[j] != 0){                    
                        if(cedulaVendedores[j] == idSeller){
                            existingId = true;
                            i=4;
                            break;
                        }
                    }                     
                }

            }
        }

        if(existingId == false){
            System.out.println("Nombre Vendedor: ");
            String seller = entradaText.nextLine();

            System.out.println("Direccion Vendedor: ");
            String address = entradaText.nextLine();

            cedulaVendedores[indice] = idSeller;
            nombresVendedores[indice] = seller;   
        }else{
            System.out.println("La cedula ingresada ya se encuentra registrada");
        }
    }

    public void makeProductsList(Productos [] products){
        for(int i = 0; i < products.length; i++){
            if(products[i] != null){
                listaProductos[i] = products[i];
            }
        }
    }

}