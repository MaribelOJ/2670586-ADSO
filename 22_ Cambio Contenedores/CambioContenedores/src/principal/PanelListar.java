
package principal;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import utils.BaseDatos;
import utils.Persona;


public class PanelListar extends javax.swing.JPanel {
    DefaultTableModel modelo;
    Persona [] listaPersonas;
    BaseDatos bd;
    public PanelListar(BaseDatos bd) {
        this.bd = bd;
        this.listaPersonas = bd.extraerPersonas();
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
        
        
                
        modelo = (DefaultTableModel) tablaDatos.getModel();  
        tablaDatos.getColumnModel().getColumn(0).setPreferredWidth(50);
        tablaDatos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tablaDatos.getColumnModel().getColumn(2).setPreferredWidth(150);
        tablaDatos.getColumnModel().getColumn(3).setPreferredWidth(150);
        tablaDatos.getColumnModel().getColumn(4).setPreferredWidth(50);
        tablaDatos.getColumnModel().getColumn(5).setPreferredWidth(150);
        
        
        tablaDatos.getTableHeader().setReorderingAllowed(false);
        tablaDatos.getTableHeader().setResizingAllowed(false);
        
        DefaultTableCellRenderer centerRender = new DefaultTableCellRenderer();
        centerRender.setHorizontalAlignment(SwingConstants.CENTER);
        tablaDatos.getColumnModel().getColumn(0).setCellRenderer(centerRender);
        tablaDatos.getColumnModel().getColumn(3).setCellRenderer(centerRender);
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorTitulo = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        contenedorFormulario = new javax.swing.JPanel();
        etqDocumento = new javax.swing.JLabel();
        campoDocumento = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        contenedorDatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 153, 153));

        contenedorTitulo.setBackground(new java.awt.Color(153, 153, 255));

        etqTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("Lista Personas");

        javax.swing.GroupLayout contenedorTituloLayout = new javax.swing.GroupLayout(contenedorTitulo);
        contenedorTitulo.setLayout(contenedorTituloLayout);
        contenedorTituloLayout.setHorizontalGroup(
            contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );
        contenedorTituloLayout.setVerticalGroup(
            contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorTituloLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        contenedorFormulario.setBackground(new java.awt.Color(204, 204, 255));

        etqDocumento.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        etqDocumento.setText("Documento:");

        btnBuscar.setBackground(new java.awt.Color(51, 51, 255));
        btnBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorFormularioLayout = new javax.swing.GroupLayout(contenedorFormulario);
        contenedorFormulario.setLayout(contenedorFormularioLayout);
        contenedorFormularioLayout.setHorizontalGroup(
            contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(etqDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        contenedorFormularioLayout.setVerticalGroup(
            contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFormularioLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(contenedorFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        contenedorDatos.setBackground(new java.awt.Color(153, 153, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 0, 0));

        tablaDatos.setBackground(new java.awt.Color(204, 204, 204));
        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Nombres", "Apellidos", "Dirección", "Telefono", "Correo Elec."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaDatos.setGridColor(new java.awt.Color(0, 0, 0));
        tablaDatos.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tablaDatos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaDatos);

        javax.swing.GroupLayout contenedorDatosLayout = new javax.swing.GroupLayout(contenedorDatos);
        contenedorDatos.setLayout(contenedorDatosLayout);
        contenedorDatosLayout.setHorizontalGroup(
            contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                .addContainerGap())
        );
        contenedorDatosLayout.setVerticalGroup(
            contenedorDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
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
    }// </editor-fold>//GEN-END:initComponents
    
    public void imprimirPersonas(){
        modelo.setRowCount(0);
        
        for(int i=0; i < listaPersonas.length && listaPersonas[i] != null; i++){
            String doc = listaPersonas[i].getDocumento();
            String names = listaPersonas[i].getNombres();
            String lastNames = listaPersonas[i].getApellidos();
            String address = listaPersonas[i].getDireccion();
            String phone = listaPersonas[i].getTelefono();
            String email = listaPersonas[i].getCorreo();
            
            Object dato[] = new Object[]{ doc, names, lastNames, address, phone, email };
            modelo.addRow(dato);
        }   
    }
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String documento = campoDocumento.getText();
        
        Persona persona = bd.buscarPersonas(documento);
        
        if(persona == null){
            Alerta alertaBusqueda = new Alerta("Persona no encontrado");
        }else{
            modelo.setRowCount(0);
            
            String doc = persona.getDocumento();
            String names = persona.getNombres();
            String lastNames = persona.getApellidos();
            String address = persona.getDireccion();
            String phone = persona.getTelefono();
            String email = persona.getCorreo();
            
            Object dato[] = new Object[]{ doc, names, lastNames, address, phone, email };
            modelo.addRow(dato);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JTextField campoDocumento;
    private javax.swing.JPanel contenedorDatos;
    private javax.swing.JPanel contenedorFormulario;
    private javax.swing.JPanel contenedorTitulo;
    private javax.swing.JLabel etqDocumento;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}
