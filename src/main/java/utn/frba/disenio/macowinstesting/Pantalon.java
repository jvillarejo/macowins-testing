package utn.frba.disenio.macowinstesting;

public class Pantalon extends Prenda {
	
	public Pantalon(Boolean esImportada) {
		this.esImportada = esImportada;
	}
	@Override
	protected Double precioBase() {
		return new Double(250);
	}

}
