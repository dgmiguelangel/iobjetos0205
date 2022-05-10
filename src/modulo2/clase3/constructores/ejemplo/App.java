package modulo2.clase3.constructores.ejemplo;

public class App {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		System.out.println(cliente1.informarDatos());		

		Cliente cliente2 = new Cliente(1, "ClienteIT", new Direccion("Lavalle", 5478));
		System.out.println(cliente2.informarDatos());

	}

}
