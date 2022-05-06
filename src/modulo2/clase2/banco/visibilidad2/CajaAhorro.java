package modulo2.clase2.banco.visibilidad2;

public class CajaAhorro {
	
	public int numCuenta;
	public int cbu;
	public double saldo;
	String moneda;
	
	public void depositar(double importe) {
		saldo += importe;
	}
	
	public void extraer(double importe) {
		saldo -= importe;
	}

}
