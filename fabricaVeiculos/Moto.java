package fabricaVeiculos;

import combustiveis.Combustivel;
import tipoMoto.TipoMoto;

public class Moto extends Veiculo implements TipoMoto {

	private TipoMoto TipoMoto;
	private double volumeBagageiro;
	private boolean isEletrica;
	private boolean isCarregada;
	private int numeroMarchas;
	private Combustivel combustivel;

	public Moto(String marca, String cor, String placa, double limiteVelocidade, boolean isEletrica, int numeroMarchas,
			TipoMoto tipoMoto) {
		super(marca, cor, placa, limiteVelocidade);
		this.volumeBagageiro = volumeBagageiro;
		this.isEletrica = isEletrica;
		if (isEletrica) {
			isCarregada = true;
		}
		this.numeroMarchas = numeroMarchas;
		this.TipoMoto = tipoMoto; // Definindo o tipo de moto
	}

	public void setvolumeBagageiro(double volumeBagageiro) {
		this.volumeBagageiro = volumeBagageiro;
	}

	public void carregar() {
		if (isEletrica) {
			isCarregada = true;
			System.out.println("A moto elétrica está carregada.");
		} else {
			System.out.println("Esta moto não é elétrica. Não pode ser carregada.");
		}
	}

	public boolean isCarregada() {
		return isEletrica && isCarregada;
	}

	@Override
	public double getLimiteBagageiro() {
		return TipoMoto.getLimiteBagageiro();
	}

	@Override
	public void exibir() {
		System.out.println("\n marca: " + this.marca + "; placa: " + this.placa + "; cor: " + this.cor);
		System.out.println("Velocidade(Km/h): " + this.velocidade);
		System.out.println("Tipo da moto: " + TipoMoto.getClass().getSimpleName());
		System.out.println("Moto elétrica?: " + this.isEletrica);
		System.out.println("Moto carregada?: " + this.isCarregada);
		System.out.println("Volume máximo do bagageiro(litro): " + TipoMoto.getLimiteBagageiro());
		System.out.println("-------------------------------------------------------");

	}

}
