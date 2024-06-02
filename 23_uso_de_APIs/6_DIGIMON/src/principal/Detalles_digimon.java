
package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import util.ConsumoAPI;

public class Detalles_digimon extends javax.swing.JFrame {
    
    ConsumoAPI consumo;
    String data;

    public Detalles_digimon(String endpoint) {
        this.consumo = new ConsumoAPI();
        //data = this.consumo.consumoGET(endpoint);
        this.data = endpoint;
        initComponents();
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etq_name = new javax.swing.JLabel();
        etq_img = new javax.swing.JLabel();
        etq_level = new javax.swing.JLabel();
        etq_attibute = new javax.swing.JLabel();
        etq_type = new javax.swing.JLabel();
        cont_levels = new javax.swing.JPanel();
        cont_attributes = new javax.swing.JPanel();
        cont_types = new javax.swing.JPanel();
        etq_fields = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cont_fields = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        etq_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etq_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etq_level.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etq_level.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_level.setText("level");

        etq_attibute.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etq_attibute.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_attibute.setText("Attribute");

        etq_type.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etq_type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_type.setText("Type");

        cont_levels.setLayout(new javax.swing.BoxLayout(cont_levels, javax.swing.BoxLayout.Y_AXIS));

        cont_attributes.setLayout(new javax.swing.BoxLayout(cont_attributes, javax.swing.BoxLayout.Y_AXIS));

        cont_types.setLayout(new javax.swing.BoxLayout(cont_types, javax.swing.BoxLayout.Y_AXIS));

        etq_fields.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etq_fields.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_fields.setText("Fields");

        cont_fields.setLayout(new javax.swing.BoxLayout(cont_fields, javax.swing.BoxLayout.X_AXIS));
        jScrollPane1.setViewportView(cont_fields);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etq_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cont_levels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etq_level, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etq_attibute, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(cont_attributes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etq_type, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cont_types, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(7, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etq_fields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(etq_img, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(etq_name, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_img, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_level, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_type, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_attibute, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cont_levels, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cont_attributes, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cont_types, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_fields)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void initAlternComponents(){
        
        
        JsonObject dataJson = JsonParser.parseString(data).getAsJsonObject();
        String name = dataJson.get("name").getAsString();
        etq_name.setText(name);
        JsonArray img = dataJson.getAsJsonArray("images");
        
        JsonObject temp = img.get(0).getAsJsonObject();
        String url = temp.get("href").getAsString();
        try {

            URL imgUrl = new URL(url);
            Image imagen = getToolkit().createImage(imgUrl);
            imagen = imagen.getScaledInstance(160, 160, Image.SCALE_SMOOTH);
            etq_img.setIcon(new ImageIcon(imagen));
        } catch (MalformedURLException ex) {
            Logger.getLogger(Detalles_digimon.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JsonArray nivel = dataJson.getAsJsonArray("levels");
        Dimension size = new Dimension(cont_levels.getSize().width, 20);
        for(int i = 0; i<nivel.size();i++){
            JsonObject result = nivel.get(i).getAsJsonObject();
            String level = result.get("level").getAsString();
            JLabel etq = new JLabel(level);
            etq.setHorizontalAlignment( JLabel.CENTER );
            etq.setFont( new Font("Segoe UI", Font.PLAIN, 12) );
            etq.setOpaque(true);
            etq.setBackground( Color.decode("#CCCCFF"));
            etq.setMaximumSize(size); 
            etq.setMinimumSize(size);
            cont_levels.add(etq);
        }
        
        JsonArray atributo = dataJson.getAsJsonArray("attributes");
        for(int i = 0; i<atributo.size();i++){
            JsonObject result = atributo.get(i).getAsJsonObject();
            String attribute = result.get("attribute").getAsString();
            JLabel etq = new JLabel(attribute);
            etq.setHorizontalAlignment( JLabel.CENTER );
            etq.setFont( new Font("Segoe UI", Font.PLAIN, 12) );
            etq.setOpaque(true);
            etq.setBackground( Color.decode("#CCCCFF"));
            etq.setMaximumSize(size); 
            etq.setMinimumSize(size);
            cont_attributes.add(etq);
        }
        
        JsonArray tipo = dataJson.getAsJsonArray("types");
        for(int i = 0; i<tipo.size();i++){
            JsonObject result = tipo.get(i).getAsJsonObject();
            String type = result.get("type").getAsString();
            JLabel etq = new JLabel(type);
            etq.setHorizontalAlignment( JLabel.CENTER );
            etq.setFont( new Font("Segoe UI", Font.PLAIN, 12) );
            etq.setOpaque(true);
            etq.setBackground( Color.decode("#CCCCFF"));
            etq.setMaximumSize(size); 
            etq.setMinimumSize(size);
            cont_types.add(etq);
        }
        
        JsonArray campos = dataJson.getAsJsonArray("fields");
        for(int i = 0; i<campos.size();i++){
            JsonObject result = campos.get(i).getAsJsonObject();
            String ruta = result.get("image").getAsString();
            try {

                URL imgUrl = new URL(ruta);
                Image imagen = getToolkit().createImage(imgUrl);
                imagen = imagen.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
                JLabel etq = new JLabel();
                etq.setIcon(new ImageIcon(imagen));
                etq.setBorder(BorderFactory.createEmptyBorder(3,35,3,35));
                cont_fields.add(etq);
                
            } catch (MalformedURLException ex) {
                Logger.getLogger(Detalles_digimon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        setTitle(name);
        setIconImage( getToolkit().createImage(ClassLoader.getSystemResource("imagenes/digivice.png")) );
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cont_attributes;
    private javax.swing.JPanel cont_fields;
    private javax.swing.JPanel cont_levels;
    private javax.swing.JPanel cont_types;
    private javax.swing.JLabel etq_attibute;
    private javax.swing.JLabel etq_fields;
    private javax.swing.JLabel etq_img;
    private javax.swing.JLabel etq_level;
    private javax.swing.JLabel etq_name;
    private javax.swing.JLabel etq_type;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
