public class Principal{
    public static void main(String [] args){

        //clases:Define nuevos tipos de datos.Una clase es una plantilla que se usará para crear objetos/variables.

        //Atributos:variables globales que almacenan propiedades de la clase definida o una caracteristica.Datos propios.


        //Metodos: Acciones que puede realizar un objeto perteneciente a la clase.Se representan como Funciones.

        Perro perro1 = new Perro("Dobby", "Maribel", 108, "pomeranio", 2.50, 60);
        perro1.comer(800);
        // perro1.jugar(30, "activo");
        perro1.imprimirDetalle();
        
        
   
    }
}