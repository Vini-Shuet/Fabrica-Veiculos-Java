package tipoCaminhao;

public class Bitrem implements TipoCaminhao {

	@Override
	public double cargaMaximo() {
		return 57 * 1000;
	}

	@Override
	public String Nome() {
		return "Bitrem Articulado";
	}

}
