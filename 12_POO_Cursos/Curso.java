import java.util.Scanner;

public class Curso{
    int Codigo;
    String Nombre;
    String Area;
    int Duracion;
    String [] Temas;

    public Curso(int code, String name, String field, int term){
        this.Codigo = code;
        this.Nombre = name;
        this.Area = field;
        this.Duracion = term;
        this.Temas = new String[15];
    }


    public int getCodigo() {
        return this.Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getArea() {
        return this.Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public int getDuracion() {
        return this.Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public void agregarTema(String tema){
        for(int i = 0; i < 15; i++){
          
            if(Temas[i] == null){
                Temas[i] = tema;
                break;
            }
        }
    }

    public void imprimirDetalleCurso(){
        System.out.println( "|----------------------------------------|");
        System.out.println( "|           INFORMACION CURSO            |");
        System.out.println( "|----------------------------------------|");
        System.out.println( "|       CODIGO: " + Codigo +"            ");
        System.out.println( "|       NOMBRE: " + Nombre +"            ");
        System.out.println( "|       AREA: " + Area +"                ");
        System.out.println( "|       DURACION: " + Duracion +"        ");

        if(Temas[0] != null){
            System.out.print( "|       TEMAS: ");
            for(int i = 0; i <15; i++){
                if(Temas[i] != null){
                    if(i == 0){
                        System.out.print(Temas[i]);
                    }else{
                        System.out.print(", " + Temas[i]);
                    }
                }
            }
        }
        System.out.println("");
        System.out.println( "|----------------------------------------|");

    }

    public void editarInformacionCurso(String nombre, String area, int duracion){
        this.Nombre = nombre;
        this.Area = area;
        this.Duracion = duracion;
    }

}