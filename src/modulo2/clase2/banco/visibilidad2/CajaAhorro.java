package modulo2.clase2.banco.visibilidad2;

public class CajaAhorro {
	
	private int numCuenta;
	private int cbu;
	private double saldo;
	private String moneda;	
	
	
	public CajaAhorro(int numCuenta, double saldo) {
		super();
		this.numCuenta = numCuenta;
		this.saldo = saldo;
	}
	

	public CajaAhorro(int numCuenta, int cbu, double saldo, String moneda) {
		super();
		this.numCuenta = numCuenta;
		this.cbu = cbu;
		this.saldo = saldo;
		this.moneda = moneda;
	}

	public void depositar(double importe) {
		saldo += importe;
	}
	
	public void extraer(double importe) {
		saldo -= importe;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public int getCbu() {
		return cbu;
	}

	public void setCbu(int cbu) {
		this.cbu = cbu;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	
	

}
