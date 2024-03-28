package fabricaVeiculos;

import javax.swing.JOptionPane;

import combustiveis.Combustivel;

public class Carros extends Veiculo {

	private double rendimento, litrosTanque, limiteTanque;

	public Carros(String marca, String cor, String placa, double limiteVelocidade, double litrosTanque) {
		super(marca, cor, placa, limiteVelocidade);
		this.litrosTanque = litrosTanque;
		this.limiteTanque = 50;
	}

	public void abastecer(double litros, Combustivel combustivel) {
		this.litrosTanque += litros;

		if (litrosTanque <= limiteTanque) {
			rendimento = combustivel.rendimento(litros);
		} else {
			this.litrosTanque -= litros;
			JOptionPane.showMessageDialog(null, "O valor supera o tanque");
			abastecer(Double.parseDouble(JOptionPane.showInputDialog("informe uma quantidade de" + " litros valida")),
					combustivel);
		}
	}

	@Override
	public void exibir() {
		System.out.println("\nMarca: " + this.marca + "; Placa" + this.placa + "; Cor: " + this.cor
				+ "; Marcha maxima: " + this.cambio);
		System.out.println("Velocidade(Km/h): " + this.velocidade + "; Marcha Atual: " + this.marcha);
		System.out.println("Litros tanque(L): " + this.litrosTanque + "; Rendimento(KM): " + this.rendimento);
		System.out.println("-------------------------------------------------------");

		/*
		 * JOptionPane.showMessageDialog(null, "marca" + this.marca + "; placa" +
		 * this.placa + "; cor: " + this.cor + "Velocidade(Km/h): " + this.velocidade +
		 * "Litros tanque(L): " + this.litrosTanque + "; Rendimento(KM): " +
		 * this.rendimento);
		 */

	}
}
