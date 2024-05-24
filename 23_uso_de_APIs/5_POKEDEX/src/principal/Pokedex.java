
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
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import util.ConsumoAPI;
import util.Pokemon;


public class Pokedex extends javax.swing.JFrame {
    ConsumoAPI consumo;
    String first_url;
    String url;
    JButton [] lista_botones;
    JButton [] paginas;
    Pokemon [] lista_pokemones;
    JsonObject [] lista_objects;
    DefaultTableModel modelo;
    JsonArray pokemones;
    int posicion;
    int num_foto;
    int boton;
    int start;
    int end;
    int indice_boton;
    int indice_object;
    int indice_pokemon;
    
    public Pokedex() {
        this.consumo = new ConsumoAPI();
        this.first_url = "https://pokeapi.co/api/v2/pokemon";
        this.url=first_url;
        this.lista_botones = new JButton[20];
        this.paginas = new JButton[11];
        this.lista_objects = new JsonObject[65];
        this.boton=2;
        this.start = 1;
        this.end = 7;
        this.pokemones=new JsonArray();
        this.posicion = -1;
        this.indice_boton=-1;
        this.num_foto = 0;
        this.lista_pokemones = new Pokemon[1302];
        this.indice_object=0;
        this.indice_pokemon=0;
        
        initComponents();
        initAlternComponents();
        listarPokemones();
        cargarPaginador();
        mostrarPokemon(0,0,0);
        
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

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        num_foto++;
        btn_rewind.setEnabled(true);
        if(num_foto == 4){
            btn_next.setEnabled(false);
        }
        mostrarPokemon(posicion, num_foto,indice_boton);
        revalidate();
        repaint();
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_rewindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rewindActionPerformed
        num_foto--;
        btn_next.setEnabled(true);
        if(num_foto==0){
            btn_rewind.setEnabled(false);
        }
        mostrarPokemon(posicion, num_foto, indice_boton);
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
    
    public void cargarPaginador(){
        
        lista_botones[0].setBackground(Color.blue);
        JButton btn_first= new JButton("<<");
        JButton btn_previous = new JButton("<");

                  
        paginas[0]=btn_first;
        paginas[1]=btn_previous;
//        if(url_previous == null){
//            paginas[1].setEnabled(false);
//        }
//        if(url_next== null){
//            paginas[9].setEnabled(false);
//        }

        
        int num=1;
        for(int i=start;i<=end;i++){
            JButton paginador = new JButton();
            if(i < 10){
                paginador.setText("0"+i);
            }else{
                paginador.setText(""+i);
            }
            num++;
            paginas[num]=paginador;
        }
        
        JButton btn_last= new JButton(">>");
        JButton btn_after = new JButton(">");
        
        paginas[9]=btn_after;
        paginas[10]=btn_last;
        
        cont_botones.removeAll();
        cont_botones.setLayout(new GridLayout(1,11));
        
        for(int j=0; j < paginas.length;j++){
            paginas[j].setBackground(Color.white);
            final int num_boton = j;
            paginas[j].addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                   pagesHandler(num_boton);
                }
            });

            cont_botones.add(paginas[j]);
   
        }
        
        paginas[boton].setBackground(Color.blue);
        revalidate();
        repaint();    
        
    }
    
    public void pagesHandler(int num_boton){
        System.out.println(num_boton);
        int num =start;
        
        for(int i=0;i<paginas.length;i++){
            if(i!= num_boton){
                paginas[i].setBackground(Color.white);
            }
        }
        if(num_boton == 0){
            indice_object=0;
            start=1;
            end=7;
        }
            
        if(num_boton == 10){
            indice_object=1280;
            start=59;
            end=65;
        }
        
        if(num_boton == 9){
            paginas[1].setEnabled(true);
            boton++;
            indice_object+=1;
            
            if(boton>5){
                start++;
                end++;
                boton--;
            }  
        }
        
        if(num_boton == 1){
            paginas[9].setEnabled(true);
            indice_object-=1;            
            if(boton==5){
                start--;
                end--;
                boton--;
            }
   
        }else{
            
            if(num_boton > 5){
                boton=5;
                switch (num_boton) {
                    case 6:
                        start++;
                        end++;
                        break;
                    case 7:
                        start+=2;
                        end+=2;
                        break;
                    default:
                        start+=3;
                        end+=3;
                        break;
                }
            }else{
                boton=num_boton;
            }
            
            for(int i=2; i<num_boton;i++){
                num++;
            }
            indice_object=num-1;
            System.out.println(indice_object);
  
        }
        listarPokemones();
        cargarPaginador();
        revalidate();
        repaint(); 
    }
    
    public void listarPokemones(){
        String respuesta = consumo.consumoGET(url);
        JsonObject objeto = JsonParser.parseString(respuesta).getAsJsonObject();
         if(url != null){
            lista_objects[indice_object]=objeto;
        }
        if(!objeto.get("next").isJsonNull()){
            url=objeto.get("next").getAsString();
        }else{
            url=null;
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

              // Escalar las imágenes
                Image scaledImage = image.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
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
                        break;
                    }

                }   

            }catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error al descargar la imagen.");
            } 
        }
        
        llenarContLateral();
        
    }
    
    public void llenarContLateral(){
        
        for(int i=0;i<20;i++){
            JButton btnPokemon = new JButton(lista_pokemones[indice_pokemon].getNombre());
            btnPokemon.setBackground(Color.white);
            final int p=indice_pokemon;
            final int num_boton =i; 
            
            btnPokemon.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent e) {
                    mostrarPokemon(p,0,num_boton);
                }
            });
            
            lista_botones[i]=btnPokemon;
            indice_pokemon++;    
        }
 
        cont_scroll.removeAll();
        cont_scroll.setLayout(new GridLayout(20,1));
        for (JButton lista_boton : lista_botones) {
            
            cont_scroll.add(lista_boton);
        }
        
        revalidate();
        repaint();
    }
             
    public void mostrarPokemon(int indice, int num, int boton){
        
        for(int i=0;i<lista_botones.length;i++){
            if(i != boton){
                lista_botones[i].setBackground(Color.white);
            }
        }
        
        lista_botones[boton].setBackground(Color.blue);
        
        
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
        indice_boton=boton;
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
