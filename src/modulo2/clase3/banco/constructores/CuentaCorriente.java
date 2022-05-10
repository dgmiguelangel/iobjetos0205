package modulo2.clase3.banco.constructores;

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

	public double getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
	
	

}
