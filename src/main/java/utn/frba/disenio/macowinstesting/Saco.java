package utn.frba.disenio.macowinstesting;

public class Saco extends Prenda {
	
	public Saco(Boolean esImportada) {
		this.esImportada = esImportada;
	}
	
	@Override
	protected Double precioBase() {
		return new Double(300);
	}

}
