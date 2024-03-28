package tipoCaminhao;

public class CarretaLS implements TipoCaminhao {

	@Override
	public double cargaMaximo() {
		return 32 * 1000;
	}

	@Override
	public String Nome() {
		return "Carreta LS";
	}

}
