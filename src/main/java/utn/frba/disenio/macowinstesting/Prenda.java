package utn.frba.disenio.macowinstesting;

public abstract class Prenda {

	protected boolean esImportada;
	protected Marca marca;

	public Double precioFinal() {
		return precioInicial() * this.tasaDeImportacion() * this.marca.coeficiente(precioInicial()); 
	}

	private double precioInicial() {
		return Macowins.valorFijoDelNegocio + this.precioBase();
	}

	public Double tasaDeImportacion() {
		return this.esImportada ? 1.3 : 1; 
	}

	protected abstract Double precioBase();
}
