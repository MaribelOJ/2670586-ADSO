
package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import util.ConsumoAPI;
import util.Pokemon;


public class Pokedex extends javax.swing.JFrame {
    ConsumoAPI consumo;
    String url;
    JButton [] paginas;
    JsonObject [] lista_pokemones;
    JsonObject [] lista_objects;
    DefaultTableModel modelo;
    int num_foto;
    int indice_object;
    int indice_pokemon;
    int indice;
    
    public Pokedex() {
        this.consumo = new ConsumoAPI();
        this.url = "https://pokeapi.co/api/v2/pokemon";           
        this.paginas = new JButton[7];
        this.num_foto = 0;
        this.indice_object=0;
        this.indice_pokemon=0;
        this.indice=0;
        
        String respuesta = consumo.consumoGET(url);
        JsonObject objeto = JsonParser.parseString(respuesta).getAsJsonObject();
        this.lista_pokemones = new JsonObject[20];
        int cantidad =(int)Math.ceil(objeto.get("count").getAsInt()/20);
        this.lista_objects = new JsonObject[cantidad];
        this.lista_objects[indice_object]=objeto;
        
        initComponents();
        initAlternComponents();
        listarPokemones();
        cargarPaginador();
        mostrarPokemon(0);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont_principal = new javax.swing.JPanel();
        etq_titulo = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        cont_scroll = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        etq_nombre = new javax.swing.JLabel();
        etq_img = new javax.swing.JLabel();
        btn_rewind = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        cont_botones = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cont_principal.setBackground(new java.awt.Color(255, 255, 255));

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(255, 0, 51));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("POKEDEX");

        cont_scroll.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout cont_scrollLayout = new javax.swing.GroupLayout(cont_scroll);
        cont_scroll.setLayout(cont_scrollLayout);
        cont_scrollLayout.setHorizontalGroup(
            cont_scrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
        );
        cont_scrollLayout.setVerticalGroup(
            cont_scrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );

        scroll.setViewportView(cont_scroll);

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "N", "Habilidad", "Url"
            }
        ));
        jScrollPane1.setViewportView(tablaDatos);

        etq_nombre.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        etq_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_nombre.setText("POKEMON");

        etq_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btn_rewind.setBorderPainted(false);
        btn_rewind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rewindActionPerformed(evt);
            }
        });

        btn_next.setBorderPainted(false);
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cont_principalLayout = new javax.swing.GroupLayout(cont_principal);
        cont_principal.setLayout(cont_principalLayout);
        cont_principalLayout.setHorizontalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(cont_principalLayout.createSequentialGroup()
                        .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(cont_principalLayout.createSequentialGroup()
                                .addComponent(btn_rewind, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(cont_principalLayout.createSequentialGroup()
                                        .addComponent(etq_img, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_next))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cont_principalLayout.setVerticalGroup(
            cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cont_principalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(etq_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cont_principalLayout.createSequentialGroup()
                        .addComponent(etq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cont_principalLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(btn_rewind, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cont_principalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(etq_img, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cont_principalLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cont_botones.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout cont_botonesLayout = new javax.swing.GroupLayout(cont_botones);
        cont_botones.setLayout(cont_botonesLayout);
        cont_botonesLayout.setHorizontalGroup(
            cont_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );
        cont_botonesLayout.setVerticalGroup(
            cont_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cont_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cont_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cont_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void initAlternComponents(){
        setTitle("POKEDEX");
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/Pokebola.png")));
        
        btn_next.setBackground(Color.WHITE);
        Image icono_next = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/next.png"));
        icono_next = icono_next.getScaledInstance(65, 65, Image.SCALE_SMOOTH);
        btn_next.setIcon(new ImageIcon(icono_next));

        
        btn_rewind.setBackground(Color.WHITE);
        Image icono_rewind = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/previous.png"));
        icono_rewind = icono_rewind.getScaledInstance(65, 65, Image.SCALE_SMOOTH);
        btn_rewind.setIcon(new ImageIcon(icono_rewind));

        
        modelo = (DefaultTableModel) tablaDatos.getModel();
        tablaDatos.getColumnModel().getColumn(0).setPreferredWidth(5);
        tablaDatos.getColumnModel().getColumn(1).setPreferredWidth(10);
        tablaDatos.getColumnModel().getColumn(2).setPreferredWidth(100);

        
        btn_rewind.setEnabled(false);
        setVisible(true);
        setSize(700, 660);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        revalidate();
        repaint();
        
    }
    
    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        num_foto++;
        btn_rewind.setEnabled(true);
        if(num_foto == 2){
            btn_next.setEnabled(false);
        }
        mostrarPokemon(this.indice);
        revalidate();
        repaint();
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_rewindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rewindActionPerformed
        num_foto--;
        btn_next.setEnabled(true);
        if(num_foto==0){
            btn_rewind.setEnabled(false);
        }
        mostrarPokemon(this.indice);
        revalidate();
        repaint();
    }//GEN-LAST:event_btn_rewindActionPerformed
        
    public void cargarPaginador(){
        
        cont_botones.removeAll();
        cont_botones.setLayout(new GridLayout(1,11));
        
        JButton btn_first= new JButton("<<");
        JButton btn_previous = new JButton("<");

        cont_botones.add(btn_first);
        cont_botones.add(btn_previous);
        
        for(int i=0;i < paginas.length; i++){
            JButton btn_middle = new JButton(""+(indice_object + 1));

            final int new_page = indice_object;
            btn_middle.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    indice_object = new_page;
                    
                    listarPokemones();
                    mostrarPokemon(0);
                    actualizar_paginador(indice_object);
                }
            });
            System.out.println("indice objeto: " + indice_object);
            if(!lista_objects[indice_object].get("next").isJsonNull()){
                url=lista_objects[indice_object].get("next").getAsString();

                String respuesta = consumo.consumoGET(url);
                JsonObject objeto = JsonParser.parseString(respuesta).getAsJsonObject();
                indice_object++;
                lista_objects[indice_object]=objeto;

            }
            
            cont_botones.add(btn_middle);
            
        } 

        JButton btn_last = new JButton(">>");
        JButton btn_following = new JButton(">");
        
        cont_botones.add(btn_following);
        cont_botones.add(btn_last);
        
        repaint();
        revalidate(); 
        
    }
    
    public void actualizar_paginador(int i){
        if(i >3){
            indice_object=i-3;
            
        }else{
            indice_object=0;
        }

        cargarPaginador();
    }
   
    public void listarPokemones(){
                       
        JsonArray pokemones = lista_objects[indice_object].get("results").getAsJsonArray();

        
        cont_scroll.setLayout(new GridLayout(20,1));
        cont_scroll.removeAll();

        for(int i = 0; i < pokemones.size();i++){
            
            JsonObject objeto_respuesta = pokemones.get(i).getAsJsonObject();
            lista_pokemones[indice_pokemon]= objeto_respuesta;
            String name = objeto_respuesta.get("name").getAsString();
            
            
            JButton btnPokemon = new JButton(name);
            btnPokemon.setBackground(Color.white);
            final int num_pokemon =indice_pokemon; 
            
            btnPokemon.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent e) {
                    num_foto = 0;
                    btn_next.setEnabled(true);
                    btn_rewind.setEnabled(false);
                    mostrarPokemon(num_pokemon);
                }
            });
            
            
            cont_scroll.add(btnPokemon);
            indice_pokemon++;
            revalidate();
            repaint();
           
             
        }
        indice_pokemon=0;               
        revalidate();
        repaint();

        
    }
     
    public void mostrarPokemon(int indice){
        
        etq_nombre.setText( lista_pokemones[indice].get("name").getAsString());
        String rutaPokemon = lista_pokemones[indice].get("url").getAsString();

        String respuesta02 = consumo.consumoGET(rutaPokemon);
        JsonObject objetoPokemon = JsonParser.parseString(respuesta02).getAsJsonObject();
            
        
        JsonArray abilities = objetoPokemon.get("abilities").getAsJsonArray();
        modelo.setRowCount(0);
        for(int j=0; j < abilities.size();j++){
            JsonObject ability = abilities.get(j).getAsJsonObject().getAsJsonObject("ability");
            Object[] fila = new Object[]{ 0, ability.get("name").getAsString(), ability.get("url").getAsString()};
            modelo.addRow(fila);
        }


        String [] listaImagenes = new String[3];
        listaImagenes[0] = objetoPokemon.getAsJsonObject("sprites").getAsJsonObject("other").getAsJsonObject("official-artwork").get("front_default").getAsString();
        listaImagenes[1] = objetoPokemon.getAsJsonObject("sprites").getAsJsonObject("other").getAsJsonObject("home").get("front_shiny").getAsString();
        listaImagenes[2] = objetoPokemon.getAsJsonObject("sprites").getAsJsonObject("other").getAsJsonObject("home").get("front_default").getAsString();
        
        try {
            String url = listaImagenes[num_foto];
            URL imgUrl = new URL(url);
            Image imagen = getToolkit().createImage(imgUrl);
            imagen = imagen.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            etq_img.setIcon(new ImageIcon(imagen));
        } catch (MalformedURLException ex) {
            Logger.getLogger(Pokedex.class.getName()).log(Level.SEVERE, null, ex);
        }            
        this.indice=indice;
        revalidate();
        repaint();
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_rewind;
    private javax.swing.JPanel cont_botones;
    private javax.swing.JPanel cont_principal;
    private javax.swing.JPanel cont_scroll;
    private javax.swing.JLabel etq_img;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}
