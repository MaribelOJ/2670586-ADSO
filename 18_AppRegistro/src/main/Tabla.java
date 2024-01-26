
package main;

public class Tabla extends javax.swing.JFrame {


    public Tabla() {
        initComponents();
        initAlternComponent();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor_titulo = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        contenedor_entradas = new javax.swing.JPanel();
        etq_tabla = new javax.swing.JLabel();
        campo_tabla = new javax.swing.JTextField();
        etq_multiplos = new javax.swing.JLabel();
        campo_multiplos = new javax.swing.JTextField();
        btn_crear = new javax.swing.JButton();
        contenedor_tabla = new javax.swing.JScrollPane();
        etq_multiplicacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedor_titulo.setBackground(new java.awt.Color(0, 102, 102));

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("TABLA DE MULTIPLICAR");

        javax.swing.GroupLayout contenedor_tituloLayout = new javax.swing.GroupLayout(contenedor_titulo);
        contenedor_titulo.setLayout(contenedor_tituloLayout);
        contenedor_tituloLayout.setHorizontalGroup(
            contenedor_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contenedor_tituloLayout.setVerticalGroup(
            contenedor_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        contenedor_entradas.setBackground(new java.awt.Color(51, 255, 204));

        etq_tabla.setBackground(new java.awt.Color(0, 255, 204));
        etq_tabla.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etq_tabla.setForeground(new java.awt.Color(0, 0, 0));
        etq_tabla.setText("Tabla:");

        campo_tabla.setBackground(new java.awt.Color(255, 255, 255));

        etq_multiplos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etq_multiplos.setForeground(new java.awt.Color(0, 0, 0));
        etq_multiplos.setText("Multiplos:");

        campo_multiplos.setBackground(new java.awt.Color(255, 255, 255));

        btn_crear.setBackground(new java.awt.Color(102, 204, 0));
        btn_crear.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_crear.setText("CREAR");
        btn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedor_entradasLayout = new javax.swing.GroupLayout(contenedor_entradas);
        contenedor_entradas.setLayout(contenedor_entradasLayout);
        contenedor_entradasLayout.setHorizontalGroup(
            contenedor_entradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_entradasLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(etq_tabla)
                .addGap(18, 18, 18)
                .addComponent(campo_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(etq_multiplos)
                .addGap(18, 18, 18)
                .addComponent(campo_multiplos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btn_crear)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        contenedor_entradasLayout.setVerticalGroup(
            contenedor_entradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_entradasLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(contenedor_entradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_tabla)
                    .addComponent(campo_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_multiplos)
                    .addComponent(campo_multiplos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        contenedor_tabla.setBackground(new java.awt.Color(204, 255, 204));

        etq_multiplicacion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etq_multiplicacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_multiplicacion.setText("_ _ _ _");
        contenedor_tabla.setViewportView(etq_multiplicacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(contenedor_tabla)
                    .addComponent(contenedor_entradas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contenedor_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenedor_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor_entradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor_tabla, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearActionPerformed
        int tabla = Integer.parseInt(campo_tabla.getText());
        int multiplos = Integer.parseInt(campo_multiplos.getText());
        int resultado= 0;
        String html = "<html>";
        
        for(int i=0; i <= multiplos; i++){
            resultado = tabla * i;
            html += tabla + "*" + i + " = " + resultado + "<br>";            
        }
        
        html += "</html>";
        etq_multiplicacion.setText(html);
    }//GEN-LAST:event_btn_crearActionPerformed

     public void initAlternComponent(){
       setVisible(true);
       setLocationRelativeTo(null);
   }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crear;
    private javax.swing.JTextField campo_multiplos;
    private javax.swing.JTextField campo_tabla;
    private javax.swing.JPanel contenedor_entradas;
    private javax.swing.JScrollPane contenedor_tabla;
    private javax.swing.JPanel contenedor_titulo;
    private javax.swing.JLabel etq_multiplicacion;
    private javax.swing.JLabel etq_multiplos;
    private javax.swing.JLabel etq_tabla;
    private javax.swing.JLabel etq_titulo;
    // End of variables declaration//GEN-END:variables
}
