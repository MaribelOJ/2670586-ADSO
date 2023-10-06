public class Perro{

    //Atributos
    private String nombre;
    private String propietario;
    private int edad;
    private String raza;
    private double peso;
    private int energia;

    //Metodos

    //1.METODO CONSTRUCTOR: es usado para crear objetos de esa clase(Instanciacion); es decir, da valor inicial a los atributos 
    public Perro(String name, String owner, int age, String breed, double weight, int energy){
        nombre = name;
        propietario = owner;
        edad = age;
        raza = breed;
        peso = weight;
        energia = energy;
    }

    public void imprimirDetalle(){
        System.out.println("|---------------------------------|");
        System.out.println("|         DETALLES PERRO          |");
        System.out.println("|---------------------------------|");
        System.out.println("|  NOMBRE:    " + nombre);
        System.out.println("|  PROPIETARIO:    " + propietario);
        System.out.println("|  EDAD:    " + edad+ " meses (" + ((double) edad/12) + " anios)" );
        System.out.println("|  RAZA:    " + raza);
        System.out.println("|  PESO:    " + peso + "kg");
        System.out.println("|  ENERGIA:    " + energia + " %");
        System.out.println("|---------------------------------|");

    }

    public String getNombre(){
        return nombre;
    }

    public String getPropietario(){
        return propietario;
    }

    public int getEdad(){
        return edad;
    }

    public String getRaza(){
        return raza;
    }

    public double getPeso(){
        return peso;
    }

    public int getEnergia(){
        return energia;
    }

    public void setNombre(String name){
        nombre = name;
    }

    public void setPropietario(String owner){
        propietario = owner;
    }

    public void setEdad(int age){
        edad = age;
    }

    public void setRaza(String breed){
        raza = breed;
    }

    public void setPeso(double weight){
        peso = weight;
    }

    public void setEnergia(int energy){
        energia = energy;
    }

    public void comer(int gramos){
        //peso
        peso = peso + ((double)gramos / 1000);

        //Energia
        energia = energia + (gramos/100);
    }
}