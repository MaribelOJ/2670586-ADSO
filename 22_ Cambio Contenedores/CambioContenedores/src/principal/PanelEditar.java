
package principal;

import utils.BaseDatos;
import utils.Persona;


public class PanelEditar extends javax.swing.JPanel {

    BaseDatos bd;
    
    public PanelEditar(BaseDatos bd) {
        this.bd = bd;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container_titulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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

        setBackground(new java.awt.Color(255, 255, 102));

        container_titulo.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar Datos");

        javax.swing.GroupLayout container_tituloLayout = new javax.swing.GroupLayout(container_titulo);
        container_titulo.setLayout(container_tituloLayout);
        container_tituloLayout.setHorizontalGroup(
            container_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );
        container_tituloLayout.setVerticalGroup(
            container_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container_tituloLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addContainerGap(370, Short.MAX_VALUE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(11, 11, 11)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedor_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(container_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contenedor_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

        String doc = campo_doc.getText();
        Persona consulta = bd.buscarPersonas(doc);
        
        if(consulta == null){
            Alerta ventana = new Alerta("El registro no existe");
            
        }else{
            campo_nombre.setText(consulta.getNombres());
            campo_apellidos.setText(consulta.getApellidos());
            campo_tele.setText(consulta.getTelefono());
            campo_direccion.setText(consulta.getDireccion());
            campo_correo.setText(consulta.getCorreo());
        }               

    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        String cedula = campo_doc.getText();
        String nombres = campo_nombre.getText();
        String apellidos = campo_apellidos.getText();
        String direccion = campo_direccion.getText();
        String telefono = campo_tele.getText();
        String email = campo_correo.getText();

        bd.actualizarPersona(cedula, nombres, apellidos, direccion, telefono, email);
        campo_doc.setText("");
        campo_nombre.setText("");
        campo_apellidos.setText("");
        campo_tele.setText("");
        campo_direccion.setText("");
        campo_correo.setText("");
        

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
}
