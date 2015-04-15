package utn.frba.disenio.macowinstesting;

public class Camisa extends Prenda {
	
	public Camisa(boolean esImportado, Marca marca) {
		this.esImportada = esImportado;
		this.marca = marca;
	}

	@Override
	protected Double precioBase() {
		return new Double(200);
	}

}
