
package principal;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import util.ConsumoAPI;


public class Digimon extends javax.swing.JFrame {
    
    int num_pokemon;
  
    public Digimon() {

        num_pokemon = 0;
        initComponents();
        initAlternComponents();
        cargarDigimones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont_principal = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        cont_digimones = new javax.swing.JPanel();
        cont_paginador = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cont_principal.setBackground(new java.awt.Color(255, 255, 255));

        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout cont_digimonesLayout = new javax.swing.GroupLayout(cont_digimones);
        cont_digimones.setLayout(cont_digimonesLayout);
        cont_digimonesLayout.setHorizontalGroup(
            cont_digimonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        cont_digimonesLayout.setVerticalGroup(
            cont_digimonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cont_paginadorLayout = new javax.swing.GroupLayout(cont_paginador);
        cont_paginador.setLayout(cont_paginadorLayout);
        cont_paginadorLayout.setHorizontalGroup(
            cont_paginadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        cont_paginadorLayout.setVerticalGroup(
            cont_paginadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cont_principalLayout = new javax.swing.GroupLayout(cont_principal);
        cont_principal.setLayout(cont_principalLayout);
        cont_principalLayout.setHorizontalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cont_digimones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cont_paginador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
            .addComponent(etq_titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cont_principalLayout.setVerticalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cont_digimones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cont_paginador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void initAlternComponents(){
        setTitle("DIGIMON");
        setIconImage( getToolkit().createImage(ClassLoader.getSystemResource("imagenes/digivice.png")) );
        setLocationRelativeTo(null);
        setVisible(true);
        
        cont_digimones.setLayout(new GridLayout(2,3));
        
        Image iconoTitulo = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/digimonLogo.png"));
        iconoTitulo = iconoTitulo.getScaledInstance(90, 50, Image.SCALE_SMOOTH);
        etq_titulo.setIcon(new ImageIcon(iconoTitulo));    
    }
    
    public void cargarDigimones(){
        cont_digimones.removeAll();
        for(int i=0; i<5;i++){
            num_pokemon++;
            String endpoint = "https://digi-api.com/api/v1/digimon/"+num_pokemon;
            DigimonCard card = new DigimonCard(endpoint);
            card.setBorder(BorderFactory.createEmptyBorder(3,3,3,3));

            cont_digimones.add(card);             
        }
        repaint();
        revalidate();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cont_digimones;
    private javax.swing.JPanel cont_paginador;
    private javax.swing.JPanel cont_principal;
    private javax.swing.JLabel etq_titulo;
    // End of variables declaration//GEN-END:variables
}
