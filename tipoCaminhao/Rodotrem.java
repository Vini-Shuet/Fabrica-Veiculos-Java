package tipoCaminhao;

public class Rodotrem implements TipoCaminhao {

	@Override
	public double cargaMaximo() {
		return 74 * 1000;
	}

	@Override
	public String Nome() {
		return "RodoTrem";
	}

}
