
package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import util.ConsumoAPI;

public class DigimonCard extends javax.swing.JPanel {
    
    ConsumoAPI consumo;
    String data;
    
    
    public DigimonCard(String endpoint) {
        this.consumo = new ConsumoAPI();
        data = this.consumo.consumoGET(endpoint);
        
        initComponents();
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont_principal = new javax.swing.JPanel();
        etq_img = new javax.swing.JLabel();
        etq_nombre = new javax.swing.JLabel();

        cont_principal.setBackground(new java.awt.Color(255, 255, 255));
        cont_principal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cont_principalMouseClicked(evt);
            }
        });

        etq_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etq_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout cont_principalLayout = new javax.swing.GroupLayout(cont_principal);
        cont_principal.setLayout(cont_principalLayout);
        cont_principalLayout.setHorizontalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_img, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(etq_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        cont_principalLayout.setVerticalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_img, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etq_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cont_principalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cont_principalMouseClicked
        Detalles_digimon resumen = new Detalles_digimon(data);
    }//GEN-LAST:event_cont_principalMouseClicked

    public void initAlternComponents(){
        JsonObject dataJson = JsonParser.parseString(data).getAsJsonObject();
        String name = dataJson.get("name").getAsString();
        
        if(name.length() > 14){
            String nombre = name.substring(0, 14);
            etq_nombre.setText(nombre+"...");
        }else{
            etq_nombre.setText(name);
        }
        
        JsonArray results = dataJson.getAsJsonArray("images");

        JsonObject temp = results.get(0).getAsJsonObject();
        String url = temp.get("href").getAsString();
        try {

            URL imgUrl = new URL(url);
            Image imagen = getToolkit().createImage(imgUrl);
            imagen = imagen.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            etq_img.setIcon(new ImageIcon(imagen));
        } catch (MalformedURLException ex) {
            Logger.getLogger(DigimonCard.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        cont_principal.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                cont_principal.setCursor(new Cursor(Cursor.HAND_CURSOR));
                cont_principal.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                cont_principal.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                cont_principal.setBorder(BorderFactory.createEmptyBorder());
            }
        });
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cont_principal;
    private javax.swing.JLabel etq_img;
    private javax.swing.JLabel etq_nombre;
    // End of variables declaration//GEN-END:variables
}
