package modulo2.clase2.banco.visibilidad;

public class CuentaCorriente {
	
	private int numCuenta;
	private int cbu;
	private double saldo;
	private String moneda;
	private double descubierto;
	
	public void depositar(double importe) {
		saldo += importe;
	}
	
	public void extraer(double importe) {
		saldo -= importe;
	}

}
