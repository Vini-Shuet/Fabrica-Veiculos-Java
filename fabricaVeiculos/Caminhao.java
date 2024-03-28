package fabricaVeiculos;

import tipoCaminhao.TipoCaminhao;

public class Caminhao extends Veiculo {

	private TipoCaminhao tipoCaminhao;
	private String caminhaoNome;
	private String tipoCarga;
	private double limiteCarga;
	private double pesoAtual;

	public Caminhao(String marca, String cor, String placa, double limiteVelocidade, TipoCaminhao tipoCaminhao,
			String tipoCarga) {
		super(marca, cor, placa, limiteVelocidade);
		this.tipoCaminhao = tipoCaminhao;
		this.tipoCarga = tipoCarga.toUpperCase();
		this.limiteCarga = tipoCaminhao.cargaMaximo();
		this.caminhaoNome = tipoCaminhao.Nome();
	}

	public void carregarCaminhao(double peso) {

		if (this.pesoAtual < this.limiteCarga) {
			this.pesoAtual += peso;

			if (this.pesoAtual > this.limiteCarga) {
				this.pesoAtual -= peso;
				// SE A SOMA DO PESO, COM O PESO QUE JA ESTÁ NO CAMINHÃO FOR MAIOR DO QUE O
				// LIMITE, O ULTIMO PESO É RETIRADO
				System.out.println("O ultimo peso de: " + peso + "excede a carga máxima, portanto foi retirada");
			} else {
				System.out.println("Carga adicionada com sucesso");
			}
		} else
			System.out.println("o caminhão está com a carga cheia ");

	}

	public void descarregarCaminhao(double peso) {
		if (this.pesoAtual > 0) {
			this.pesoAtual -= peso;
			if (this.pesoAtual <= 0)
				this.pesoAtual = 0;

		} else {
			System.out.println("O caminhão já está completamente descarregado");
		}
	}

	@Override
	public void exibir() {
		System.out.println("\nMarca: " + this.marca + "; placa: " + this.placa + "; cor: " + this.cor);
		System.out.println("Velocidade(Km/h): " + this.velocidade);
		System.out.println("tipo do caminhão: " + this.caminhaoNome);
		System.out.println("Carga atual do caminhao (kg): " + this.pesoAtual);
		System.out.println("-------------------------------------------------------");

		/*
		 * JOptionPane.showMessageDialog(null, "marca" + this.marca + "; placa" +
		 * this.placa + "; cor: " + this.cor + "Velocidade(Km/h): " + this.velocidade +
		 * "Carga atual do caminhao (kg): " + this.pesoAtual);
		 */
	}
}