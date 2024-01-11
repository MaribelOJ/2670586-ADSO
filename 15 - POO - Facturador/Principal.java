public class Principal{
	public static void main(String[] args) {

		Usuario ListaUsuarios [] = new Usuario[100];			
		Producto ListaProductos [] = new Producto [100];

		ListaUsuarios[0] = new Usuario("108800", "Oscar Loaiza", "Calle 20", "CLIENTE");
		ListaUsuarios[1] = new Usuario("108801", "Daniel Garcia", "Calle 19", "CLIENTE");
		ListaUsuarios[2] = new Usuario("108802", "Juan Lopez", "Calle 18", "CLIENTE");
		ListaUsuarios[3] = new Usuario("108803", "Catalina Mendez", "Calle 17", "CLIENTE");
		ListaUsuarios[4] = new Usuario("108804", "Andres Lopez", "Calle 16", "CLIENTE");
		ListaUsuarios[5] = new Usuario("109900", "Juan Castillo", "Calle 20", "VENDEDOR");
		ListaUsuarios[6] = new Usuario("109901", "Ana Segura", "Calle 19", "VENDEDOR");
		ListaUsuarios[7] = new Usuario("109902", "Julian Perez", "Calle 18", "VENDEDOR");
		ListaUsuarios[8] = new Usuario("109903", "Carolina Tobon", "Calle 17", "VENDEDOR");
		ListaUsuarios[9] = new Usuario("109904", "Carlos Perez", "Calle 16", "VENDEDOR");
		ListaUsuarios[10] = new Usuario("1088340376", "Maribel Obando", "Calle 20", "CLIENTE");
		ListaUsuarios[11] = new Usuario("26441375", "Ines Joven", "Calle 20", "VENDEDOR");

		ListaProductos[0] = new Producto("1010", "Leche", 3800);
		ListaProductos[1] = new Producto("1011", "Carne 1Kg", 25600);
		ListaProductos[2] = new Producto("1012", "Carne 1Lb", 12800);
		ListaProductos[3] = new Producto("1013", "Jabon Barra", 2500);
		ListaProductos[4] = new Producto("1014", "Detergente 1Kg", 15000);

		Facturador ventana = new Facturador(ListaUsuarios, ListaProductos);
	}
}