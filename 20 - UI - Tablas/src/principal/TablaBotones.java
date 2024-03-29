package principal;

import utils.Persona;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import utils.ButtonEditor;
import utils.ButtonRenderer;

public class TablaBotones extends javax.swing.JFrame {
    
    //Render estilos = new Render();
    DefaultTableModel modelo; 
    Persona listaPersonas[];
    
    public TablaBotones() {
        listaPersonas = new Persona[6];
        listaPersonas[0] = new Persona("108800", "Oscar", "Loaiza", "3333330", "oscar@mail.com");
        listaPersonas[1] = new Persona("108801", "Daniel", "Garcia", "3333331", "daniel@mail.com");
        listaPersonas[2] = new Persona("108802", "Juan", "Lopez", "3333332", "juan@mail.com");
        listaPersonas[3] = new Persona("108803", "Maria", "Perez", "3333333", "maria@mail.com");
        listaPersonas[4] = new Persona("108804", "Carlos", "Toro", "3333334", "carlos@mail.com");
              
        initComponents();
        initAternComponents();
        imprimirPersonas();
    }
    
    public void initAternComponents(){
        //tablaDatos.setDefaultRenderer(Object.class, estilos);
        
        tablaDatos.getTableHeader().setOpaque(false);
        tablaDatos.getTableHeader().setBackground(Color.BLACK);
        tablaDatos.getTableHeader().setForeground(Color.WHITE);
        tablaDatos.setBackground(new Color(204,204,204));
        tablaDatos.setRowHeight(25);
        
        
        setTitle("Tabla con Botones");
        setLocationRelativeTo(null);
        
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_registro.png") ) );
        
        modelo = (DefaultTableModel) tablaDatos.getModel();  
        tablaDatos.getColumnModel().getColumn(5).setCellEditor(new ButtonEditor(new JCheckBox()));
        tablaDatos.getColumnModel().getColumn(5).setCellRenderer(new ButtonRenderer());
        
        tablaDatos.getColumnModel().getColumn(6).setCellEditor(new ButtonEditor(new JCheckBox()));
        tablaDatos.getColumnModel().getColumn(6).setCellRenderer(new ButtonRenderer());
        
        
        
        tablaDatos.getColumnModel().getColumn(0).setPreferredWidth(50);
        tablaDatos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tablaDatos.getColumnModel().getColumn(2).setPreferredWidth(150);
        tablaDatos.getColumnModel().getColumn(3).setPreferredWidth(50);
        tablaDatos.getColumnModel().getColumn(4).setPreferredWidth(150);
        tablaDatos.getColumnModel().getColumn(5).setPreferredWidth(10);
        tablaDatos.getColumnModel().getColumn(6).setPreferredWidth(10);
        
        
        tablaDatos.getTableHeader().setReorderingAllowed(false);
        tablaDatos.getTableHeader().setResizingAllowed(false);
        
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        tablaDatos.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tablaDatos.getColumnModel().getColumn(3).setCellRenderer(centerRender); 
        
        setVisible(true);
        revalidate();
        repaint();
        
    }
    
    public void imprimirPersonas(){
        modelo.setRowCount(0);
        for (int i=0; i< listaPersonas.length && listaPersonas[i]!=null; i++) {
            System.out.println("Posicion i = "+i);
            String documento = listaPersonas[i].getDocumento();
            String nombres = listaPersonas[i].getNombres();
            String apellidos = listaPersonas[i].getApellidos();
            String telefono = listaPersonas[i].getTelefono();
            String correo = listaPersonas[i].getCorreo();
            
            JButton btnEditar = new JButton();
            btnEditar.setBackground(Color.white);
            Image icono_editar = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_editar.png"));
            icono_editar = icono_editar.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            btnEditar.setIcon(new ImageIcon(icono_editar));
            
            JButton btnEliminar = new JButton();
            btnEditar.setBackground(Color.white);
            Image icono_eliminar = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_eliminar.png"));
            icono_eliminar = icono_eliminar.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            btnEliminar.setIcon(new ImageIcon(icono_eliminar));
            
            Object dato[] = new Object[]{ documento, nombres, apellidos, telefono, correo, btnEditar, btnEliminar };
            modelo.addRow(dato);
            
            Persona temporal = listaPersonas[i];
            TablaBotones ventanaActual= this;
            
            btnEditar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ventanaActual.setVisible(false);
                    FormularioEdicion ventana = new FormularioEdicion(temporal, ventanaActual);
                }
            });
            final int posicion=i;
                        
            btnEliminar.addActionListener(new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent e) {
                    EliminarPersona ventana = new EliminarPersona(ventanaActual,listaPersonas,posicion);
                }
            });
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorTitulo = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        contenedorFormulario = new javax.swing.JPanel();
        etqDocumento = new javax.swing.JLabel();
        campoDocumento = new javax.swing.JTextField();
        etqNombres = new javax.swing.JLabel();
        campoNombres = new javax.swing.JTextField();
        etqApellidos = new javax.swing.JLabel();
        campoApellidos = new javax.swing.JTextField();
        etqTelefono = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        etqCorreo = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        contenedorDatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedorTitulo.setBackground(new java.awt.Color(0, 51, 153));

        etqTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("Tabla con Botones");

        javax.swing.GroupLayout contenedorTituloLayout = new javax.swing.GroupLayout(contenedorTitulo);
        contenedorTitulo.setLayout(contenedorTituloLayout);
        contenedorTituloLayout.setHorizontalGroup(
            contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        contenedorTituloLayout.setVerticalGroup(
            contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap())
        );

        contenedorFormulario.setBackground(new java.awt.Color(51, 204, 255));

        etqDocumento.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etqDocumento.setText("Documento:");

        etqNombres.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etqNombres.setText("Nombres:");

        etqApellidos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etqApellidos.setText("Apellidos:");

        etqTelefono.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etqTelefono.setText("Telefono:");

        etqCorreo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etqCorreo.setText("Correo Elec.:");

        btnAgregar.setBackground(new java.awt.Color(0, 153, 0));
        btnAgregar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorFormularioLayout = new javax.swing.GroupLayout(contenedorFormulario);
        contenedorFormulario.setLayout(contenedorFormularioLayout);
        contenedorFormularioLayout.setHorizontalGroup(
            contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etqTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etqCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etqNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etqApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(70, 70, 70))
        );
        contenedorFormularioLayout.setVerticalGroup(
            contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addComponent(etqApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addComponent(etqNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addComponent(etqDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorFormularioLayout.createSequentialGroup()
                        .addComponent(etqCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );

        contenedorDatos.setBackground(new java.awt.Color(153, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 0, 0));

        tablaDatos.setBackground(new java.awt.Color(204, 204, 204));
        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Nombres", "Apellidos", "Telefono", "Correo Elec.", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaDatos.setGridColor(new java.awt.Color(0, 0, 0));
        tablaDatos.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tablaDatos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaDatos);
        if (tablaDatos.getColumnModel().getColumnCount() > 0) {
            tablaDatos.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaDatos.getColumnModel().getColumn(1).setMinWidth(50);
            tablaDatos.getColumnModel().getColumn(1).setPreferredWidth(150);
            tablaDatos.getColumnModel().getColumn(2).setMinWidth(50);
            tablaDatos.getColumnModel().getColumn(2).setPreferredWidth(150);
            tablaDatos.getColumnModel().getColumn(3).setPreferredWidth(50);
            tablaDatos.getColumnModel().getColumn(4).setMinWidth(50);
            tablaDatos.getColumnModel().getColumn(4).setPreferredWidth(150);
            tablaDatos.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout contenedorDatosLayout = new javax.swing.GroupLayout(contenedorDatos);
        contenedorDatos.setLayout(contenedorDatosLayout);
        contenedorDatosLayout.setHorizontalGroup(
            contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        contenedorDatosLayout.setVerticalGroup(
            contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedorFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedorDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenedorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String documento = campoDocumento.getText();
        String nombres = campoNombres.getText();
        String apellidos = campoApellidos.getText();
        String telefono = campoTelefono.getText();
        String correo = campoCorreo.getText();
        int vacio= -1;
        boolean duplicados=false;
        Object data[] = new Object[]{ documento, nombres, apellidos, telefono, correo };
        
        for(int i=0;i<data.length;i++){
            if(data[i].equals("")){
                vacio=i;
            }
        }
        
        if(vacio == -1){
            
            for(int j=0;j < listaPersonas.length && listaPersonas[j]!=null; j++){
                String doc = listaPersonas[j].getDocumento();
                String email = listaPersonas[j].getCorreo();
                
                if(doc.equals(documento) || email.equals(correo)){
                    duplicados=true;
                    break;
                }                
            }
            
            if(duplicados==true){
                Alerta ventana2= new Alerta("El documento o el email ya existe");
            }else{
                                 
                for(int i=0;listaPersonas[i]==null;i++){

                    vacio=i;
                }
                vacio++;
                System.out.println(vacio);
                listaPersonas[vacio]= new Persona(documento,nombres, apellidos, telefono, correo);
                modelo.addRow(data);

                campoDocumento.setText("");
                campoNombres.setText("");
                campoApellidos.setText("");
                campoTelefono.setText("");
                campoCorreo.setText("");
                campoDocumento.requestFocus();
            }
        }else{
            Alerta ventana = new Alerta("Todos los campos son Obligatorios.");
        }
        
//        if( documento.equals("") || nombres.equals("") || apellidos.equals("") || telefono.equals("") || correo.equals("") ){
//            Alerta ventana = new Alerta("Todos los campos son Obligatorios.");  
//        }else{
//            
//            // Buscar posicon vacia
//            int posicion = -1;
//            for (int i=0;i<listaPersonas.length;i++) {
//                if (listaPersonas[i]==null) {
//                    posicion = i;
//                    break;
//                }
//            }
//            
//            // Crear objeto en posicion vacia
//            if (posicion!=-1) {
//                listaPersonas[posicion] = new Persona(documento, nombres, apellidos, telefono, correo);
//                
//                Object data[] = new Object[]{ documento, nombres, apellidos, telefono, correo };
//                modelo.addRow(data);
//
//                campoDocumento.setText("");
//                campoNombres.setText("");
//                campoApellidos.setText("");
//                campoTelefono.setText("");
//                campoCorreo.setText("");
//                campoDocumento.requestFocus();
//            }
//        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoDocumento;
    private javax.swing.JTextField campoNombres;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JPanel contenedorDatos;
    private javax.swing.JPanel contenedorFormulario;
    private javax.swing.JPanel contenedorTitulo;
    private javax.swing.JLabel etqApellidos;
    private javax.swing.JLabel etqCorreo;
    private javax.swing.JLabel etqDocumento;
    private javax.swing.JLabel etqNombres;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}
