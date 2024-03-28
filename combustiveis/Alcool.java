package combustiveis;

public class Alcool implements Combustivel{

	@Override
	public double rendimento(double litros) {
		
		return litros*7.5;
	}

	
}
