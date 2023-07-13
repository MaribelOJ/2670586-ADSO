public class Ejercicio02{
    public static void main(String[] args){
        
        String wholenum = "";
        int dia, mes, year, fecha;
        int cont = 0;

        while (cont < 1){

            for(int i = 1; i <= 8; i++){

                int numeros = (int) ( Math.random() * 9);
                fecha = numeros;
                wholenum = wholenum + fecha;
            }
            
            dia = Integer.parseInt(wholenum.substring(0,2));
            mes = Integer.parseInt(wholenum.substring(2,4));
            year = Integer.parseInt(wholenum.substring(4,8));

            if(dia > 31 || dia <= 00){
                cont=0;
                wholenum = "";
            }else if (dia <=31 && mes <= 00){
                cont = 0;
                wholenum = "";
            }else if(dia <= 31 && mes > 12){
                cont = 0;
                wholenum = "";
            }else if(dia == 31 && mes <= 12){
                if(mes == 01 | mes == 03 | mes == 05 | mes == 07 | mes == 8 | mes == 10 | mes == 12){
                    cont = 1;
                }else{
                    cont = 0;
                    wholenum = "";
                }
            }else if (dia <= 28 && mes <= 12){
                cont = 1;
            }else if (dia > 28 && mes <= 12 && mes != 02){
                cont = 1;
            }else if (dia == 29 && mes == 02){

                if (year % 4 == 0 || year % 100 == 0 && year % 400 == 0){
                    cont = 1;
                }else{
                    cont = 0;
                    wholenum = "";
                }
            }else{
                cont = 1;
            }       
        }        

        System.out.println("La fecha generada es: " + wholenum);
    }
}