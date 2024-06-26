package principal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import utils.ConsumoAPI;

public class Pokedex extends javax.swing.JFrame {

    ConsumoAPI consumo;
    int pagina;
    int [] listaNumeros;
    int first_num;
    int step;
    String pokemon_name;
    
    public Pokedex() {
        this.consumo = new ConsumoAPI();
        this.pagina = 1;
        this.listaNumeros = new int[]{1,2,3,4,5,6,7};
        this.first_num=0;
        this.step = -1;
        this.pokemon_name ="";
        
        initComponents();
        initAlternComponents();
        cargarPokemones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPrincipal = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelBotones = new javax.swing.JPanel();
        panelDetalle = new javax.swing.JPanel();
        panelPaginador = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        contentPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etqTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(204, 0, 0));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("POKEMON");

        panelBotones.setLayout(new javax.swing.BoxLayout(panelBotones, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(panelBotones);

        javax.swing.GroupLayout panelDetalleLayout = new javax.swing.GroupLayout(panelDetalle);
        panelDetalle.setLayout(panelDetalleLayout);
        panelDetalleLayout.setHorizontalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );
        panelDetalleLayout.setVerticalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelPaginador.setLayout(new javax.swing.BoxLayout(panelPaginador, javax.swing.BoxLayout.X_AXIS));

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelPaginador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                    .addComponent(panelDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPaginador, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void initAlternComponents(){
        setTitle("POKEDEX");
        setIconImage( getToolkit().createImage(ClassLoader.getSystemResource("imagenes/pokeball.png")) );
        setLocationRelativeTo(null);
        setVisible(true);  
        
    }
    
    public void cargarPokemones(){
        int offset = (this.pagina*20)-20;
        String endpoint = "https://pokeapi.co/api/v2/pokemon?offset="+offset+"&limit=20";
        String data = this.consumo.consumoGET(endpoint);
        
        JsonObject dataJson = JsonParser.parseString(data).getAsJsonObject();
        JsonArray results = dataJson.getAsJsonArray("results");
        panelBotones.removeAll();
        Dimension size = new Dimension(panelBotones.getSize().width, 30);
        for (int i=0; i<results.size(); i++) {
            
            JsonObject temp = results.get(i).getAsJsonObject();
            JButton btn = new JButton( temp.get("name").getAsString() );
            btn.setPreferredSize(size);
            btn.setMaximumSize(size); 
            btn.setMinimumSize(size);
            panelBotones.add(btn);
            
            if(i==0){
                if(temp.get("name").getAsString().equalsIgnoreCase(pokemon_name) || pokemon_name.equals("")){
                    btn.setBackground(Color.blue);
                    btn.setForeground(Color.WHITE);
                }else{
                    btn.setBackground(Color.white);
                }   
            }else if(!btn.getText().equalsIgnoreCase(pokemon_name)){
                btn.setBackground(Color.white);
            }else{
               btn.setBackground(Color.blue);
               btn.setForeground(Color.WHITE);
            }
                    
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Nombre: "+ temp.get("name").getAsString());
                    System.out.println("Url: "+temp.get("url").getAsString());
                    
                    pokemon_name=temp.get("name").getAsString();
                    if(btn.getText().equalsIgnoreCase(pokemon_name)){
                        btn.setBackground(Color.blue);
                        btn.setForeground(Color.WHITE);
                        cargarPokemones();
                    }
                    
                    panelDetalle.removeAll();
                    DetallePokemon detalle = new DetallePokemon( temp );
                    detalle.setSize( panelDetalle.getSize() );
                    detalle.setPreferredSize( panelDetalle.getPreferredSize() );
                    panelDetalle.add(detalle);
                    
                    revalidate();
                    repaint();
                }
            });
        }
        
        panelDetalle.removeAll();
        DetallePokemon detalle = new DetallePokemon( results.get(0).getAsJsonObject() );
        detalle.setSize( panelDetalle.getSize() );
        detalle.setPreferredSize( panelDetalle.getPreferredSize() );
        panelDetalle.add(detalle);
        
        cargarPaginador();
        revalidate();
        repaint();
        
    }
    
    public void cargarPaginador(){
        // actualizar lo num del arreglo

        panelPaginador.removeAll();
        panelPaginador.add(Box.createHorizontalGlue());
        
        JButton btn_first = new JButton("<<");
        JButton btn_previous = new JButton("<");
        
        btn_first.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pagina = 1;
                pokemon_name="";
                cargarPokemones();
            }
        });
        
        btn_previous.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pagina != listaNumeros[0]){
                    pagina = pagina-1;
                    actualizarArray();
                }
                pokemon_name="";
                cargarPokemones();
            }
        });
        
        panelPaginador.add(btn_first);
        panelPaginador.add(btn_previous);
        
        for(int i=0;i < listaNumeros.length; i++){
            JButton btn_medios = new JButton(""+listaNumeros[i]);
            
            if(listaNumeros[i] == pagina){
               btn_medios.setBackground(Color.blue);
               btn_medios.setForeground(Color.white);
            }else{
                btn_medios.setBackground(Color.white);
            }
            
            final int new_page = listaNumeros[i];
            btn_medios.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    pagina = new_page;
                    pokemon_name="";
                    cargarPokemones();
                    actualizarArray();
                    
                }
            });
            panelPaginador.add(btn_medios);
        }
        
        JButton btn_last = new JButton(">>");
        JButton btn_next = new JButton(">");
        
        btn_last.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pagina = 66;
                pokemon_name="";
                cargarPokemones();
            }
        });
        
        btn_next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pagina != 66){
                    pagina = pagina+1;
                    actualizarArray();

                }
                pokemon_name="";
                cargarPokemones();
            }
        });
        
        
        panelPaginador.add(btn_next);
        panelPaginador.add(btn_last);
        
        panelPaginador.add(Box.createHorizontalGlue());
        repaint();
        revalidate();

    }
    
    public void actualizarArray(){
        
        if(pagina == listaNumeros[4] || pagina == listaNumeros[2]){
            if(pagina == listaNumeros[2] && listaNumeros[2] == 3){
                step = -1;
            }else{
                step=0;
            }
        }else if(pagina == listaNumeros[5] || pagina == listaNumeros[1]){
            if(pagina == listaNumeros[1] && listaNumeros[1] == 2){
                step = -1;
            }else{
                step=1;
            }
    
        }else if(pagina == listaNumeros[6] || pagina == listaNumeros[0]){                           
            if(pagina == listaNumeros[0] && listaNumeros[0] == 1){
                step = -1;
            }else if(pagina == listaNumeros[0] && listaNumeros[0] == 2){
                step=0;
            }else{
                step=2;
            }   
        }
        
        
        if(pagina < listaNumeros[4] && step >= 0){
            first_num = listaNumeros[0]-step;
            
            for(int i=0; i< listaNumeros.length;i++ ){      
                listaNumeros[i] = first_num - 1;
                first_num++;
            }    
        }else{
            
            first_num = listaNumeros[0]+step;
        
            for(int i=0; i< listaNumeros.length;i++ ){      
                listaNumeros[i] = first_num + 1;
                first_num++;
            }
        
        }
        
        cargarPaginador();
        revalidate();
        repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDetalle;
    private javax.swing.JPanel panelPaginador;
    // End of variables declaration//GEN-END:variables
}
