package principal;

import utils.BaseDatos;
import utils.Persona;


public class EditarPersona extends javax.swing.JFrame {
    
    BaseDatos registro;
    Menu ventana;
    
    public EditarPersona(Menu ventana) {
        this.ventana = ventana;
        registro = new BaseDatos();
        initComponents();
        initAlternComponents();
        
    }

    public void initAlternComponents(){
        setTitle("Edición de datos");
        setVisible(true);
        setLocationRelativeTo(null);
        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_editar.png") ) );
        
        

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor_datos = new javax.swing.JPanel();
        etq_documento = new javax.swing.JLabel();
        campo_doc = new javax.swing.JTextField();
        etq_nombre = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        etq_apellidos = new javax.swing.JLabel();
        campo_apellidos = new javax.swing.JTextField();
        etq_tele = new javax.swing.JLabel();
        campo_tele = new javax.swing.JTextField();
        etq_correo = new javax.swing.JLabel();
        campo_correo = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        campo_direccion = new javax.swing.JTextField();
        etq_direccion = new javax.swing.JLabel();
        container_titulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedor_datos.setBackground(new java.awt.Color(255, 255, 204));

        etq_documento.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        etq_documento.setText("Documento:");

        etq_nombre.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        etq_nombre.setText("Nombres:");

        etq_apellidos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        etq_apellidos.setText("Apellidos:");

        etq_tele.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        etq_tele.setText("Telefono:");

        etq_correo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        etq_correo.setText("Correo:");

        btn_buscar.setBackground(new java.awt.Color(204, 204, 0));
        btn_buscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_guardar.setBackground(new java.awt.Color(255, 255, 102));
        btn_guardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        etq_direccion.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        etq_direccion.setText("Dirección:");

        javax.swing.GroupLayout contenedor_datosLayout = new javax.swing.GroupLayout(contenedor_datos);
        contenedor_datos.setLayout(contenedor_datosLayout);
        contenedor_datosLayout.setHorizontalGroup(
            contenedor_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_datosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(etq_documento)
                .addGap(46, 46, 46)
                .addComponent(campo_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(contenedor_datosLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(contenedor_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_tele)
                    .addComponent(etq_correo)
                    .addGroup(contenedor_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(etq_nombre)
                        .addComponent(etq_apellidos))
                    .addComponent(etq_direccion, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(48, 48, 48)
                .addGroup(contenedor_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_tele, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contenedor_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_datosLayout.createSequentialGroup()
                    .addContainerGap(223, Short.MAX_VALUE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(197, 197, 197)))
        );
        contenedor_datosLayout.setVerticalGroup(
            contenedor_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_datosLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(contenedor_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_documento)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(contenedor_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(etq_nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedor_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_apellidos)
                    .addComponent(campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(contenedor_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_direccion))
                .addGap(18, 18, 18)
                .addGroup(contenedor_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_tele, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_tele))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedor_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_correo))
                .addGap(68, 68, 68))
            .addGroup(contenedor_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_datosLayout.createSequentialGroup()
                    .addContainerGap(348, Short.MAX_VALUE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(11, 11, 11)))
        );

        container_titulo.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar Datos");

        javax.swing.GroupLayout container_tituloLayout = new javax.swing.GroupLayout(container_titulo);
        container_titulo.setLayout(container_tituloLayout);
        container_tituloLayout.setHorizontalGroup(
            container_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        container_tituloLayout.setVerticalGroup(
            container_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container_tituloLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(container_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

        String doc = campo_doc.getText();
        Persona[] registroPersonas = registro.extraerPersonas();
        
        for(int i=0; i < registroPersonas.length && registroPersonas[i]!= null; i++){
            if(registroPersonas[i].getDocumento().equals((doc))){
                campo_nombre.setText(registroPersonas[i].getNombres());
                campo_apellidos.setText(registroPersonas[i].getApellidos());
                campo_direccion.setText(registroPersonas[i].getDireccion());
                campo_tele.setText(registroPersonas[i].getTelefono());
                campo_correo.setText(registroPersonas[i].getCorreo());
                
                break;
            }
        }
        
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        String cedula = campo_doc.getText();
        String nombres = campo_nombre.getText();
        String apellidos = campo_apellidos.getText();
        String direccion = campo_direccion.getText();
        String telefono = campo_tele.getText();
        String email = campo_correo.getText();
        
        registro.actualizarPersona(cedula, nombres, apellidos, direccion, telefono, email);
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_guardarActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JTextField campo_apellidos;
    private javax.swing.JTextField campo_correo;
    private javax.swing.JTextField campo_direccion;
    private javax.swing.JTextField campo_doc;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_tele;
    private javax.swing.JPanel container_titulo;
    private javax.swing.JPanel contenedor_datos;
    private javax.swing.JLabel etq_apellidos;
    private javax.swing.JLabel etq_correo;
    private javax.swing.JLabel etq_direccion;
    private javax.swing.JLabel etq_documento;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_tele;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private Object getToolKit() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
