
package principal;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
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
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import util.ConsumoAPI;


public class Digimon extends javax.swing.JFrame {
    ConsumoAPI consumo;
    int num_pag;
    int [] lista_paginas;
    int total_pag;
  
    public Digimon() {
        this.consumo = new ConsumoAPI();
        num_pag = 1;
        this.lista_paginas = new int[]{1,2,3,4,5,6,7};
        String respuesta = consumo.consumoGET("https://digi-api.com/api/v1/digimon?page=0");
        JsonObject objeto = JsonParser.parseString(respuesta).getAsJsonObject();
        JsonObject paginas = objeto.get("pageable").getAsJsonObject();
        this.total_pag = (paginas.get("totalPages").getAsInt())+1;
        initComponents();
        initAlternComponents();
        cargarDigimones();
        cargarPaginador();
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
            .addGap(0, 0, Short.MAX_VALUE)
        );
        cont_digimonesLayout.setVerticalGroup(
            cont_digimonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
        );

        cont_paginador.setLayout(new javax.swing.BoxLayout(cont_paginador, javax.swing.BoxLayout.X_AXIS));

        javax.swing.GroupLayout cont_principalLayout = new javax.swing.GroupLayout(cont_principal);
        cont_principal.setLayout(cont_principalLayout);
        cont_principalLayout.setHorizontalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cont_paginador, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                    .addComponent(cont_digimones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
            .addComponent(etq_titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cont_principalLayout.setVerticalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cont_digimones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cont_paginador, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cont_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        int num_digimon = (num_pag * 5)- 5;
        for(int i=0; i<5;i++){
            num_digimon++;
            String endpoint = "https://digi-api.com/api/v1/digimon/"+num_digimon;
            DigimonCard card = new DigimonCard(endpoint);
            card.setBorder(BorderFactory.createEmptyBorder(3,3,3,3));

            cont_digimones.add(card);             
        }
        repaint();
        revalidate();
    }
    
    public void cargarPaginador(){
        cont_paginador.removeAll();
        cont_paginador.add(Box.createHorizontalGlue());
        
        JButton btn_first = new JButton("<<");
        JButton btn_previous = new JButton("<");
        
        if(num_pag == 1){
            btn_previous.setEnabled(false);
        }       
        
        btn_first.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_pag = 1;
                updateArray();
            }
        });
        
        btn_previous.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_pag--;
                updateArray();
            }
            
        });
        
        cont_paginador.add(btn_first);
        cont_paginador.add(btn_previous);
        
        for(int i=0;i < lista_paginas.length; i++){
            JButton btn_middle = new JButton(""+lista_paginas[i]);
            if(lista_paginas[i] == num_pag){
               btn_middle.setBackground(Color.blue);
               btn_middle.setForeground(Color.white);
            }else{
                btn_middle.setBackground(Color.white);
            }
            
            final int new_page = lista_paginas[i];
            
            btn_middle.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    num_pag = new_page;
                    
                    updateArray();
                    
                }
            });
            cont_paginador.add(btn_middle);
        }
        
        JButton btn_last = new JButton(">>");
        JButton btn_next = new JButton(">");
        
        if(num_pag == 292){
          btn_next.setEnabled(false);
        }
        
        btn_last.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_pag = total_pag;
                updateArray();
            }
        });
        
        btn_next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num_pag++;
                updateArray();
            }
        });

        cont_paginador.add(btn_next);
        cont_paginador.add(btn_last);
        
        cont_paginador.add(Box.createHorizontalGlue());
        repaint();
        revalidate();
    }
    
    public void updateArray(){
        int firstPage=1;
        if(num_pag <= 4){
            switch (num_pag) {
                case 2 -> firstPage = num_pag-1;
                case 3 -> firstPage = num_pag-2;
                case 4 -> firstPage = num_pag-3;
            }
            
        }else if(num_pag > 289){
            switch (num_pag) {
                case 290 -> firstPage = num_pag-4;
                case 291 -> firstPage = num_pag-5;
                case 292 -> firstPage = num_pag-6;
            }
        }else{
            firstPage = num_pag-3;
        }
        
        for(int i=0; i < lista_paginas.length;i++){
            lista_paginas[i]=firstPage;
            firstPage++;
        }
        cargarDigimones();
        cargarPaginador();
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
