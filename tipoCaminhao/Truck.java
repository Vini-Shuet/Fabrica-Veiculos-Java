package tipoCaminhao;

public class Truck implements TipoCaminhao {

	@Override
	public double cargaMaximo() {
		return 12 * 1000;
	}

	@Override
	public String Nome() {
		return "Truck";
	}

}
