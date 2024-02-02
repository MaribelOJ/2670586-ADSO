 package apppromedioponderado;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

public class Vista extends javax.swing.JFrame {
    private Materia [] clases;
    private JLabel labelsList [];
    private float notas;
    private float creditos;
    private int indiceItems;
            
    public Vista() {
        this.clases = new Materia[50];
        this.labelsList = new JLabel[50];
        this.indiceItems=0;
        initComponents();
        initAlternComponent();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor_titulo = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        contenedor_beige = new javax.swing.JPanel();
        contenedor_inputs = new javax.swing.JPanel();
        etq_materia = new javax.swing.JLabel();
        etq_nota = new javax.swing.JLabel();
        etq_creditos = new javax.swing.JLabel();
        campo_materia = new javax.swing.JTextField();
        campo_creditos = new javax.swing.JTextField();
        campo_nota = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        contenedor_resumen = new javax.swing.JPanel();
        etq_resumen = new javax.swing.JLabel();
        contenedor_resgistro = new javax.swing.JScrollPane();
        contenedor_items = new javax.swing.JPanel();
        etq_promedio = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedor_titulo.setBackground(new java.awt.Color(204, 51, 0));

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(255, 255, 255));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("CALCULAR PROMEDIO");

        javax.swing.GroupLayout contenedor_tituloLayout = new javax.swing.GroupLayout(contenedor_titulo);
        contenedor_titulo.setLayout(contenedor_tituloLayout);
        contenedor_tituloLayout.setHorizontalGroup(
            contenedor_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contenedor_tituloLayout.setVerticalGroup(
            contenedor_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_tituloLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(etq_titulo)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        contenedor_beige.setBackground(new java.awt.Color(255, 255, 204));

        contenedor_inputs.setBackground(new java.awt.Color(255, 255, 153));

        etq_materia.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etq_materia.setText("Materia:");

        etq_nota.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etq_nota.setText("Nota:");

        etq_creditos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etq_creditos.setText("Creditos:");

        btn_registrar.setBackground(new java.awt.Color(204, 51, 0));
        btn_registrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("REGISTRAR");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedor_inputsLayout = new javax.swing.GroupLayout(contenedor_inputs);
        contenedor_inputs.setLayout(contenedor_inputsLayout);
        contenedor_inputsLayout.setHorizontalGroup(
            contenedor_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_inputsLayout.createSequentialGroup()
                .addGroup(contenedor_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedor_inputsLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(etq_materia, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_inputsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etq_nota)
                        .addGap(26, 26, 26)))
                .addGroup(contenedor_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campo_materia)
                    .addComponent(campo_nota, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                .addGroup(contenedor_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedor_inputsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(etq_creditos)
                        .addGap(20, 20, 20)
                        .addComponent(campo_creditos, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedor_inputsLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        contenedor_inputsLayout.setVerticalGroup(
            contenedor_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_inputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedor_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(etq_creditos, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(etq_materia))
                    .addComponent(campo_materia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(campo_creditos))
                .addGap(18, 18, 18)
                .addGroup(contenedor_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedor_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(etq_nota)
                        .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(campo_nota, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenedor_beigeLayout = new javax.swing.GroupLayout(contenedor_beige);
        contenedor_beige.setLayout(contenedor_beigeLayout);
        contenedor_beigeLayout.setHorizontalGroup(
            contenedor_beigeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_beigeLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(contenedor_inputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        contenedor_beigeLayout.setVerticalGroup(
            contenedor_beigeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_beigeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(contenedor_inputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        contenedor_resumen.setBackground(new java.awt.Color(255, 255, 204));

        etq_resumen.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etq_resumen.setForeground(new java.awt.Color(153, 51, 0));
        etq_resumen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_resumen.setText("RESUMEN");

        contenedor_items.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout contenedor_itemsLayout = new javax.swing.GroupLayout(contenedor_items);
        contenedor_items.setLayout(contenedor_itemsLayout);
        contenedor_itemsLayout.setHorizontalGroup(
            contenedor_itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        contenedor_itemsLayout.setVerticalGroup(
            contenedor_itemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );

        contenedor_resgistro.setViewportView(contenedor_items);

        etq_promedio.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etq_promedio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_promedio.setText("Promedio: 0.0");

        btn_limpiar.setBackground(new java.awt.Color(255, 204, 0));
        btn_limpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setText("LIMPIAR");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedor_resumenLayout = new javax.swing.GroupLayout(contenedor_resumen);
        contenedor_resumen.setLayout(contenedor_resumenLayout);
        contenedor_resumenLayout.setHorizontalGroup(
            contenedor_resumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_resumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(etq_promedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contenedor_resumenLayout.createSequentialGroup()
                .addGroup(contenedor_resumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedor_resumenLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(contenedor_resgistro, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedor_resumenLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedor_resumenLayout.setVerticalGroup(
            contenedor_resumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_resumenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_resumen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor_resgistro, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(etq_promedio)
                .addGap(18, 18, 18)
                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedor_beige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedor_resumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenedor_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor_beige, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor_resumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void initAlternComponent(){
        contenedor_items.setLayout( new GridLayout(0,1) );
        //contenedor_items.setBackground(Color.WHITE);
       
        Border borderColor = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#D5D5D5"));
        Border borderPadding = new EmptyBorder(3,10,3,10);
        Border borderGris = new CompoundBorder(borderColor, borderPadding);
        
        GridBagConstraints constItems = new GridBagConstraints();
       
       for (int i=0; i<this.labelsList.length; i++) {
            JLabel etq_registro = new JLabel("");
            etq_registro.setHorizontalAlignment( JLabel.CENTER );
            etq_registro.setFont( new Font("Arial", Font.PLAIN, 18) );
            etq_registro.setOpaque(true);
            etq_registro.setBackground( Color.white );
            etq_registro.setBorder( borderGris );
            this.labelsList[i] = etq_registro;
            constItems.gridy = i;
            constItems.gridx = 0;
            constItems.gridheight = 1;
            constItems.gridwidth = 1;
            constItems.weighty = 1;
            constItems.weightx = 1;
            constItems.fill = GridBagConstraints.HORIZONTAL;
            constItems.anchor = GridBagConstraints.NORTH;
            constItems.insets = new Insets(0, 0, 0, 0);
            contenedor_items.add(this.labelsList[i], constItems);
        }
       
       setVisible(true);
       setLocationRelativeTo(null);
       //revalidate();
       //repaint();
    }
    
    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
      
        for (int i=0; i<this.labelsList.length; i++) {
            if(clases[i] != null){
                this.labelsList[i].setText(" ");
                etq_promedio.setText("");

            }     
        }
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        String subject = campo_materia.getText();
        float credit = Float.parseFloat(campo_creditos.getText());
        float grade = Float.parseFloat(campo_nota.getText());
        
             
        
        /*for(int i=0; i < this.clases.length; i++){
            if(clases[i] == null){
                clases[i] = new Materia(subject, credit, grade);
                notas += clases[i].getNota() * clases[i].getCredito();
                creditos += clases[i].getCredito();
                indiceItems++;
                break;
            }
        }
        
        for (int i=0; i<this.labelsList.length; i++) {
            if(clases[i] != null){
                String text = clases[i].getNombre() + " -> Creditos: "+clases[i].getCredito() + " -> Nota: " + clases[i].getNota(); 
                this.labelsList[i].setText(text);

            }     
        }      
        */
        notas=notas + (grade*credit);
        creditos = notas + credit;   
        String promedio = "Promedio: " + notas/creditos;
        
        String text = subject + " -> Creditos: " + credit +" -> Nota: " + grade;
        labelsList[indiceItems].setText(text);
        indiceItems++;
        
        etq_promedio.setText(promedio);
        campo_materia.setText("");
        campo_creditos.setText("");
        campo_nota.setText("");
    }//GEN-LAST:event_btn_registrarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JTextField campo_creditos;
    private javax.swing.JTextField campo_materia;
    private javax.swing.JTextField campo_nota;
    private javax.swing.JPanel contenedor_beige;
    private javax.swing.JPanel contenedor_inputs;
    private javax.swing.JPanel contenedor_items;
    private javax.swing.JScrollPane contenedor_resgistro;
    private javax.swing.JPanel contenedor_resumen;
    private javax.swing.JPanel contenedor_titulo;
    private javax.swing.JLabel etq_creditos;
    private javax.swing.JLabel etq_materia;
    private javax.swing.JLabel etq_nota;
    private javax.swing.JLabel etq_promedio;
    private javax.swing.JLabel etq_resumen;
    private javax.swing.JLabel etq_titulo;
    // End of variables declaration//GEN-END:variables
}
