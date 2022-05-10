package modulo2.clase3.laboratorio.pedidos;

import java.time.LocalDate;
import java.util.List;

public class Pedido {
	
	private int id;
	private int numero;
	private LocalDate fecha;
	private Cliente cliente;
	
	private List<LineaDetalle> lineaDetalles;

}
