package tipoCaminhao;

public class Vuc implements TipoCaminhao {

	@Override
	public double cargaMaximo() {
		return 3 * 1000;
	}

	@Override
	public String Nome() {
		return "VUC - Veiculo Urbano de Carga";
	}

}
