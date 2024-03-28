package tipoCaminhao;

public class Toco implements TipoCaminhao {

	@Override
	public double cargaMaximo() {
		return 6 * 1000;
	}

	@Override
	public String Nome() {
		return "Toco";
	}

}
