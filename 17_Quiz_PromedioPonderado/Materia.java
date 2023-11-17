public class Materia{
    String nombre;
    double creditos;
    double nota;

    public Materia(String nombre, double creditos, double nota){
        this.nombre = nombre;
        this.creditos = creditos;
        this.nota = nota;
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getCreditos(){
        return this.creditos;
    }

    public double getNota(){
        return this.nota;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCreditos(double creditos){
        this.creditos = creditos;
    }
    public void setNota(double nota){
        this.nota = nota;
    }

}