public class Productos{
    int id;
    String Nombre;
    int PrecioUnitario;

    public Productos(int id, String Nombre, int PrecioUnitario){
        this.id = id;
        this.Nombre = Nombre;
        this.PrecioUnitario = PrecioUnitario;
    }

    public int getId(){
        return this.id;
    }

    public String getNombre(){
        return this.Nombre;
    }

    public int getPrecioUnitario(){
        return this.PrecioUnitario;
    }
}