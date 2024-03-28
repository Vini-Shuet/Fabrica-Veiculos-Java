package tipoCaminhao;

public class Bitruck implements TipoCaminhao {

	@Override
	public double cargaMaximo() {
		return 22 * 1000;
	}

	@Override
	public String Nome() {
		return "Bitruck";
	}

}
