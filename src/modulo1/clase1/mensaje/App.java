package modulo1.clase1.mensaje;

class App {

	public static void main(String[] args) {
		
		Receptor receptor1 = new Receptor();
		Receptor receptor2 = new Receptor();
		
		System.out.println( receptor1.mensaje() );
		System.out.println( receptor2.mensaje() );

	}

}
