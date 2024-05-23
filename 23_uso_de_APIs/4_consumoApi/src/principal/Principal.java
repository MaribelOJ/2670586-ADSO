package principal;

import util.ConsumoAPI;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.HashMap;
import java.util.Map;

public class Principal {

    
    public static void main(String[] args) {
        //INSTANCIA PARA REALIZAR CONSUMOS
        ConsumoAPI  consumo = new ConsumoAPI();
        
        // Endpoint Obtener
//        String respuesta01 = consumo.consumoGET("https://codetesthub.com/API/Obtener.php");
//        System.out.println("Respuesta Obtener: "+ respuesta01);
//        
//        //Endpoint Insertar
//        Map<String, String> datosInsertar = new HashMap<>();
//        datosInsertar.put("cedula", "1112398");
//        datosInsertar.put("nombres","Maribel");
//        datosInsertar.put("apellidos","Obando");
//        datosInsertar.put("telefono","31423645");
//        datosInsertar.put("direccion","ave sur");
//        datosInsertar.put("email","maribel11@gmail.com");
//        
//        String respuesta02 = consumo.consumoPOST("https://codetesthub.com/API/Insertar.php", datosInsertar);
//        System.out.println("Respuesta Insertar:" + respuesta02);
//        
//        //ENDPOINT ACTUALIZAR
//        
//        Map<String,String> datosActualizar = new HashMap<>();
//        datosActualizar.put("cedula", "1112398");
//        datosActualizar.put("nombres","Mari");
//        datosActualizar.put("apellidos","Obando Joven");
//        datosActualizar.put("telefono","31423645");
//        datosActualizar.put("direccion","ave sur");
//        datosActualizar.put("email","maribel11@gmail.com");
//        String respuesta03 = consumo.consumoPOST("https://codetesthub.com/API/Actualizar.php", datosActualizar);
//        System.out.println("Respuesta Actualizar:" + respuesta03);
//        
//        //ENPOINT ELIMINAR
////        Map<String,String> datosEliminar = new HashMap<>();
////        datosEliminar.put("cedula", "1112398");
////        String respuesta04 = consumo.consumoPOST("https://codetesthub.com/API/Eliminar.php", datosEliminar);
////        System.out.println("Respuesta Eliminar:" + respuesta04);
//        
//        //SI QUEREMOS TRAER UN OBJECT SERÍA GETASJSONOBJECT()
//        JsonArray registros = JsonParser.parseString(respuesta01).getAsJsonArray();
//        for(int i = 0; i < registros.size();i++){
//            JsonObject temp = registros.get(i).getAsJsonObject();
//            String name = temp.get("nombres").getAsString();
//            System.out.println(name);
//        }
        
        Interfaz display = new Interfaz();
    }
    
}
