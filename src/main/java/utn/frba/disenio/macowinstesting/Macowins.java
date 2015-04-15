package utn.frba.disenio.macowinstesting;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class Macowins {
	
	public static final int valorFijoDelNegocio = 50;
	
	private List<Venta> ventas;
	
	public void vender(Prenda prenda, Integer cantidad) {
		ventas.add(Venta.conPrenda(prenda,cantidad));
	}
	
	public Double gananciasDelDia(Date fecha) {
		return ventasDeFecha(fecha).mapToDouble(venta -> venta.precio()).sum();
	}
	
	public Stream<Venta> ventasDeFecha(Date fecha) {
		return ventas.stream().filter(venta -> venta.getFecha().equals(fecha));
	}
}
