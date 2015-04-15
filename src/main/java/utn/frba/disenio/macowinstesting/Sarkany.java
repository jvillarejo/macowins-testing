package utn.frba.disenio.macowinstesting;

public class Sarkany implements Marca {

	@Override
	public Double coeficiente(Double precio) {
		return precio > 500 ? 1.35 : 1.1;
	}

}
