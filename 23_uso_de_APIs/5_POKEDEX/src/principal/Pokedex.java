
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
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import util.ConsumoAPI;
import util.Pokemon;


public class Pokedex extends javax.swing.JFrame {
    ConsumoAPI consumo;
    String first_url;
    String url_next;
    String url_previous;
    JButton [] lista_botones;
    Pokemon [] lista_pokemones;
    DefaultTableModel modelo;
    JsonArray pokemones;
    int posicion;
    int num_foto;
    
    public Pokedex() {
        this.consumo = new ConsumoAPI();
        this.first_url = "https://pokeapi.co/api/v2/pokemon";
        this.url_next="";
        this.url_previous="";
        this.lista_botones = new JButton[20];
        this.pokemones=new JsonArray();
        this.posicion = -1;
        this.num_foto = 0;
        this.lista_pokemones = new Pokemon[1302];
        initComponents();
        listarPokemones(first_url);
        initAlternComponents();
        
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
        cont_botones = new javax.swing.JPanel();
        etq_nombre = new javax.swing.JLabel();
        etq_img = new javax.swing.JLabel();
        btn_rewind = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cont_principal.setBackground(new java.awt.Color(255, 255, 255));

        etq_titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etq_titulo.setForeground(new java.awt.Color(255, 0, 51));
        etq_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etq_titulo.setText("POKEDEX");

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

        javax.swing.GroupLayout cont_botonesLayout = new javax.swing.GroupLayout(cont_botones);
        cont_botones.setLayout(cont_botonesLayout);
        cont_botonesLayout.setHorizontalGroup(
            cont_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        cont_botonesLayout.setVerticalGroup(
            cont_botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

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
                    .addComponent(etq_titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(cont_principalLayout.createSequentialGroup()
                        .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cont_botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(cont_principalLayout.createSequentialGroup()
                                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(cont_principalLayout.createSequentialGroup()
                                        .addGap(112, 112, 112)
                                        .addComponent(etq_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(cont_principalLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                        .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(cont_principalLayout.createSequentialGroup()
                                                .addComponent(btn_rewind, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(etq_img, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 18, Short.MAX_VALUE)))
                        .addContainerGap())))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(cont_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_rewind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_next, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(106, 106, 106))
                            .addGroup(cont_principalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etq_img, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(cont_principalLayout.createSequentialGroup()
                        .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(cont_botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        num_foto++;
        btn_rewind.setEnabled(true);
        if(num_foto == 4){
            btn_next.setEnabled(false);
        }
        mostrarPokemon(posicion, num_foto);
        revalidate();
        repaint();
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_rewindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rewindActionPerformed
        num_foto--;
        btn_next.setEnabled(true);
        if(num_foto==0){
            btn_rewind.setEnabled(false);
        }
        mostrarPokemon(posicion, num_foto);
        revalidate();
        repaint();
    }//GEN-LAST:event_btn_rewindActionPerformed
    
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
        tablaDatos.getColumnModel().getColumn(0).setPreferredWidth(10);
        tablaDatos.getColumnModel().getColumn(1).setPreferredWidth(60);
        tablaDatos.getColumnModel().getColumn(2).setPreferredWidth(200);
        
        btn_rewind.setEnabled(false);
        

        etq_nombre.setText(lista_pokemones[0].getNombre());
        
        mostrarPokemon(0,0);
        
        setVisible(true);
        revalidate();
        repaint();
        
    }
    
    public void listarPokemones(String url){
        String respuesta01 = consumo.consumoGET(url);
        JsonObject objeto = JsonParser.parseString(respuesta01).getAsJsonObject();
        
        if(!objeto.get("next").isJsonNull()){
            url_next = objeto.get("next").getAsString();
        }
        
        if(!objeto.get("previous").isJsonNull()){
            url_previous = objeto.get("previous").getAsString();
        }
       
        pokemones = objeto.get("results").getAsJsonArray();
        System.out.println("Respuesta pokemones: "+ pokemones);
        
        
        
        for(int i = 0; i < pokemones.size();i++){
            
            JsonObject objeto_respuesta = pokemones.get(i).getAsJsonObject();
            String name = objeto_respuesta.get("name").getAsString();
            String rutaPokemon = objeto_respuesta.get("url").getAsString();
            
            //Se obtiene la imagen del pokemon
            String respuesta02 = consumo.consumoGET(rutaPokemon);
            JsonObject objetoPokemon = JsonParser.parseString(respuesta02).getAsJsonObject();
            
            JsonArray abilities = objetoPokemon.get("abilities").getAsJsonArray();
            
            String [] habilidades = new String[abilities.size()];
            String [] links = new String[abilities.size()];
            
            for(int j=0; j < abilities.size();j++){
                JsonObject ability1 = abilities.get(j).getAsJsonObject();
                JsonObject datos = ability1.get("ability").getAsJsonObject();
                String nombre = datos.get("name").getAsString();
                String link = datos.get("url").getAsString();
                habilidades[j] = nombre;
                links[j]= link;
            }
         
            
            JsonObject sprites = objetoPokemon.get("sprites").getAsJsonObject();
            String url_backDefault = sprites.get("back_default").getAsString();
            String url_backShiny = sprites.get("back_shiny").getAsString();
            String url_frontDefault = sprites.get("front_default").getAsString();
            String url_frontShiny = sprites.get("front_shiny").getAsString();
            JsonObject other = sprites.get("other").getAsJsonObject();
            JsonObject home = other.get("home").getAsJsonObject();
            String url_img = home.get("front_default").getAsString();
            
            JButton btnPokemon = new JButton(name);
            //btnPokemon.setBackground(Color.decode("#663300"));
            
            
            try {
                // Crear un objeto URL
                URL ruta_img = new URL(url_img);
                URL ruta_bkD = new URL(url_backDefault);
                URL ruta_bkS = new URL(url_backShiny);
                URL ruta_ftD = new URL(url_frontDefault);
                URL ruta_ftS = new URL(url_frontShiny);

                // Leer la imagen de la URL
                BufferedImage image = ImageIO.read(ruta_img);
                BufferedImage image2 = ImageIO.read(ruta_bkD);
                BufferedImage image3 = ImageIO.read(ruta_ftD);
                BufferedImage image4 = ImageIO.read(ruta_bkS);                
                BufferedImage image5 = ImageIO.read(ruta_ftS);

//              // Escalar las imágenes
                Image scaledImage = image.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
                Image scaledImage2 = image2.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
                Image scaledImage3 = image3.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
                Image scaledImage4 = image4.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
                Image scaledImage5 = image5.getScaledInstance(400, 400, Image.SCALE_SMOOTH);

                // Crear los ImageIcon a partir de las imágenes escaladas
                ImageIcon imagenTemporal = new ImageIcon(scaledImage);
                ImageIcon imagenTemporal2 = new ImageIcon(scaledImage2);
                ImageIcon imagenTemporal3 = new ImageIcon(scaledImage3);
                ImageIcon imagenTemporal4 = new ImageIcon(scaledImage4);
                ImageIcon imagenTemporal5 = new ImageIcon(scaledImage5);

                // Almacenar los Image en un array
                Image[] imagenes = new Image[]{
                    imagenTemporal.getImage(),
                    imagenTemporal2.getImage(),
                    imagenTemporal3.getImage(),
                    imagenTemporal4.getImage(),
                    imagenTemporal5.getImage()
                };

                
                for(int a=0;a < lista_pokemones.length; a++){
                
                    if(lista_pokemones[a] == null){
                        lista_pokemones[a]= new Pokemon(name, imagenes, habilidades, links) ;
                        final int indice = a;
                        
                        btnPokemon.addActionListener(new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {
                            mostrarPokemon(indice,0);
                            }
                        });
                        break;
                    }
                
                }
                lista_botones[i]=btnPokemon;
                      
            }catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error al descargar la imagen.");
            } 
                
        }

        cont_scroll.setLayout(new GridLayout(20,1));
        //cont_scroll.setBackground(Color.WHITE);
        for (JButton lista_boton : lista_botones) {
            cont_scroll.add(lista_boton);
        }
        
                                  
        revalidate();
        repaint();
        
    }
   
    public void mostrarPokemon(int indice, int num){
        Image [] fotos = lista_pokemones[indice].getImagenes();
        Image foto = fotos[num];  
        etq_nombre.setText(lista_pokemones[indice].getNombre().toUpperCase());
        etq_img.setIcon(new ImageIcon(foto));
        
        
        modelo.setRowCount(0);
        String [] abilities = lista_pokemones[indice].getHabilidades();
        String [] rutas = lista_pokemones[indice].getUrl_habilidad();
        
        for(int i=1; i<=abilities.length;i++){
            Object dato[] = new Object[]{i,abilities[i-1],rutas[i-1]};
            modelo.addRow(dato);
        }
                
        posicion=indice;
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
