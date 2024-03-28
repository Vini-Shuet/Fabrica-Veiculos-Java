package tipoCaminhao;

public class CMS implements TipoCaminhao {

	@Override
	public double cargaMaximo() {
		return 25 * 1000;
	}

	@Override
	public String Nome() {
		return "Cavalo Mecânico Simples";
	}

}
