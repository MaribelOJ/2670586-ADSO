public class Principal{
    public static void main(String [] args){

        Productos [] products = new Productos[5];

        products [0] = new Productos(123, "jugoHit", 2000);
        products [1] = new Productos(456, "coca-cola", 5000);

        Factura bill1 = new Factura();
        bill1.makeProductsList(products);
        

    }
}