package modulo2.clase2.banco.visibilidad;

import java.time.LocalDate;
import java.time.Period;

public class Administrativo {

	private int dni;
	private int legajo;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private LocalDate fechaNacimiento;
	private LocalDate fechaIngreso;
	private double sueldo;
	private Area area;
	
	public int calcularEdad() {
		return Period.between(fechaNacimiento, LocalDate.now()).getYears();
	}
	
	public int calcularAntiguedad() {
		return Period.between(fechaIngreso, LocalDate.now()).getYears();
	}

	
	
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
	
	
}
