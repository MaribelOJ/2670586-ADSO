public class Ejemplo01{


    public static void main(String [] args){

        int listado [] = new int [10];

        imprimirArreglo( listado );

        listado = llenarArreglo( listado);

        imprimirArreglo( listado );


        // imprimirTabla(5, 10);

        // System.out.println("------PROBANDO FUNCIONES------");
        // System.out.println("Suma = " + sumar(5, 3));
        // System.out.println( "Suma = " + sumar(-8, 10));
        // System.out.println( "Suma = " + sumar(6, -3));


        // System.out.println("------PROBANDO FUNCIONES------");
        // System.out.println("Dividir = " + dividir(5, 3));
        // System.out.println( "Dividir = " + dividir(-8, 10));
        // System.out.println( "Dividir = " + dividir(6, -3));

        // saludar();
        // saludarEnBucle(4);
        

        // int juanito = sumar(4, 4);
        // System.out.println( "Juanito = " + juanito);

        // if(sumar(-5, 12) >= 0){
        //     System.out.println( "El resultado es positivo");    
        // }else{
        //     System.out.println( "El resultado es negativo");
        // }



    }
    
    public static int sumar (int a, int b){
        int resultado = (a + b);

        if (a != 0){

            return resultado;
        }else{

            return 0;    
        }               
    }

    public static float dividir (float a, float b){
        float resultado = (float) (a / b);
        if (a > b){
            return resultado;
        }else{
            return 0;    
        }   
    }

    public static void saludar(){
        System.out.println("+--------------------------+");
        System.out.println("+        HOLA MUNDO        +");
        System.out.println("+--------------------------+");
    }


    public static void saludarEnBucle(int cantidad){
        for(int i = 0; i < cantidad; i++){
            System.out.println("+--------------------------+");
            System.out.println("       HOLA MUNDO  "+i+"    ");
            System.out.println("+--------------------------+");
        }
        
    }

    public static void imprimirTabla(int tabla, int multiplo){
        for(int i=0; i <= multiplo; i++){
            int resultado = tabla * i;
            System.out.println(tabla + "x" + i + " = " + resultado);
        }
    }

    public static void imprimirArreglo(int [] arreglo){

        for(int i = 0; i < arreglo.length; i++){

            System.out.println("[" + arreglo [i] + "]");

        }

        System.out.println("");
    }

    public static int [] llenarArreglo( int [] arreglo){

        for(int i = 0; i < arreglo.length; i++){

            int aleatorio = (int) (Math.random() * 100);
            arreglo[i] = aleatorio;
        }

        return arreglo;
    }

    public static String [] restablecerArreglo( String[] arreglo){

        for(int i = 0; i < arreglo.length; i++){

            int aleatorio = (int) (Math.random() * 100);
            arreglo[i] = "Ninguno";
        }

        return arreglo;
    }

    public static void imprimirArregloTexto(String [] arreglo){

        for(int i = 0; i < arreglo.length; i++){

            System.out.println("[" + arreglo [i] + "]");

        }

        System.out.println("");
    }






}