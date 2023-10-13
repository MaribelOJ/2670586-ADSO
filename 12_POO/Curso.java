public class Curso{
    int Codigo;
    String Nombre;
    String Area;
    int Duracion;
    String [] Temas;

    piblic void Curso(int Code, String name, String field, int term){
        Codigo = code;
        Nombre = name;
        Area = field;
        Duracion = term;
        Temas = new String[15];
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

    public void imprimirDetalleCurso(){
        System.out.println( "|----------------------------------------|");
        System.out.println( "|           INFORMACION CURSO            |");
        System.out.println( "|----------------------------------------|");
        System.out.println( "|       CODIGO: " + Codigo +"            |");
        System.out.println( "|       NOMBRE: " + Nombre +"            |");
        System.out.println( "|       AREA: " + Area +"                |");
        System.out.println( "|       DURACION: " + Duracion +"        |");
        System.out.println( "|       |");
        System.out.println( "|----------------------------------------|");

    }

}