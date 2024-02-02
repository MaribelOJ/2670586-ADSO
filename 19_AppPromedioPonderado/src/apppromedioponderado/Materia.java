
package apppromedioponderado;


public class Materia {
    String nombre;
    float credito;
    float nota;
    
    public Materia(String name,float credit, float grade){
        this.nombre=name;
        this.credito=credit;
        this.nota=grade;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    
    
}
