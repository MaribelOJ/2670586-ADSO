
package principal;

import java.util.HashMap;
import java.util.Map;
import util.ConsumoAPI;

public class Registrar extends javax.swing.JFrame {
    Interfaz panelPrincipal;
    ConsumoAPI consumo;
    
    public Registrar(Interfaz panel) {
         this.panelPrincipal=panel;
         this.consumo = new ConsumoAPI();
        
        initComponents();
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        container_titulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        contenedor_datos = new javax.swing.JPanel();
        etq_nombre = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        etq_apellidos = new javax.swing.JLabel();
        campo_apellidos = new javax.swing.JTextField();
        etq_tele = new javax.swing.JLabel();
        campo_tele = new javax.swing.JTextField();
        etq_correo = new javax.swing.JLabel();
        campo_correo = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        campo_direccion = new javax.swing.JTextField();
        etq_direccion = new javax.swing.JLabel();
        etq_documento = new javax.swing.JLabel();
        campo_documento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        container_titulo.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Persona");

        javax.swing.GroupLayout container_tituloLayout = new javax.swing.GroupLayout(container_titulo);
        container_titulo.setLayout(container_tituloLayout);
        container_tituloLayout.setHorizontalGroup(
            container_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
        );
        container_tituloLayout.setVerticalGroup(
            container_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container_tituloLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );

        contenedor_datos.setBackground(new java.awt.Color(153, 204, 255));

        etq_nombre.setBackground(new java.awt.Color(0, 0, 0));
        etq_nombre.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        etq_nombre.setForeground(new java.awt.Color(0, 0, 0));
        etq_nombre.setText("Nombres:");

        etq_apellidos.setBackground(new java.awt.Color(0, 0, 0));
        etq_apellidos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        etq_apellidos.setForeground(new java.awt.Color(0, 0, 0));
        etq_apellidos.setText("Apellidos:");

        etq_tele.setBackground(new java.awt.Color(0, 0, 0));
        etq_tele.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        etq_tele.setForeground(new java.awt.Color(0, 0, 0));
        etq_tele.setText("Telefono:");

        etq_correo.setBackground(new java.awt.Color(0, 0, 0));
        etq_correo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        etq_correo.setForeground(new java.awt.Color(0, 0, 0));
        etq_correo.setText("Email:");

        btn_guardar.setBackground(new java.awt.Color(0, 153, 255));
        btn_guardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        etq_direccion.setBackground(new java.awt.Color(0, 0, 0));
        etq_direccion.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        etq_direccion.setForeground(new java.awt.Color(0, 0, 0));
        etq_direccion.setText("Dirección:");

        etq_documento.setBackground(new java.awt.Color(0, 0, 0));
        etq_documento.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        etq_documento.setForeground(new java.awt.Color(0, 0, 0));
        etq_documento.setText("Documento");

        javax.swing.GroupLayout contenedor_datosLayout = new javax.swing.GroupLayout(contenedor_datos);
        contenedor_datos.setLayout(contenedor_datosLayout);
        contenedor_datosLayout.setHorizontalGroup(
            contenedor_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_datosLayout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addGroup(contenedor_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedor_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(etq_nombre)
                        .addComponent(etq_apellidos)
                        .addComponent(etq_documento))
                    .addComponent(etq_direccion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etq_tele, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etq_correo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(48, 48, 48)
                .addGroup(contenedor_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_tele, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124))
            .addGroup(contenedor_datosLayout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedor_datosLayout.setVerticalGroup(
            contenedor_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_datosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(contenedor_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contenedor_datosLayout.createSequentialGroup()
                        .addComponent(etq_documento)
                        .addGap(26, 26, 26))
                    .addGroup(contenedor_datosLayout.createSequentialGroup()
                        .addComponent(campo_documento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
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
                .addGap(31, 31, 31)
                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedor_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(container_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contenedor_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void initAlternComponents(){
        
        setVisible(true);
        revalidate();
        repaint();
    }
    
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        String id= campo_documento.getText();
        String name = campo_nombre.getText();
        String lastname = campo_apellidos.getText();
        String address = campo_direccion.getText();
        String phone = campo_tele.getText();
        String email = campo_correo.getText();

        Map<String,String> datosInsertar = new HashMap<>();
        datosInsertar.put("cedula", id);
        datosInsertar.put("nombres",name);
        datosInsertar.put("apellidos",lastname);
        datosInsertar.put("telefono",phone);
        datosInsertar.put("direccion",address);
        datosInsertar.put("email",email);
        String respuesta02 = consumo.consumoPOST("https://codetesthub.com/API/Insertar.php", datosInsertar);

        campo_nombre.setText("");
        campo_apellidos.setText("");
        campo_tele.setText("");
        campo_direccion.setText("");
        campo_correo.setText("");
        
        dispose();
        panelPrincipal.imprimirPersonas();
        panelPrincipal.setVisible(true);

    }//GEN-LAST:event_btn_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JTextField campo_apellidos;
    private javax.swing.JTextField campo_correo;
    private javax.swing.JTextField campo_direccion;
    private javax.swing.JTextField campo_documento;
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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
