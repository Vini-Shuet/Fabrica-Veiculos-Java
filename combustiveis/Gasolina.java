package combustiveis;

public class Gasolina implements Combustivel{

	@Override
	public double rendimento(double litros) {
		return litros * 10;
	}

}
