package utn.frba.disenio.macowinstesting;

import java.util.Date;

public class Venta {

	private Date fecha;
	private Prenda prenda;
	private Integer cantidad;

	public Venta(Prenda prenda, Integer cantidad) {
		this.prenda = prenda;
		this.cantidad = cantidad;
		this.fecha = new Date();
	}
	
	public Prenda getPrenda() {
		return this.prenda;
	}
	
	public Integer getCantidad() {
		return this.cantidad;
	}
	
	public Date getFecha() {
		return this.fecha;
	}
	
	public Double precio() {
		return prenda.precioFinal() * getCantidad();
	}

	public static Venta conPrenda(Prenda prenda, Integer cantidad) {
		return new Venta(prenda,cantidad);
	}
	
	

}
