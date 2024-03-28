import java.util.Scanner;

import combustiveis.Alcool;
import combustiveis.Gasolina;
import fabricaVeiculos.Caminhao;
import fabricaVeiculos.Carros;
import fabricaVeiculos.Moto;
import tipoCaminhao.Vuc;
import tipoMoto.OffRoad;
import tipoMoto.OnRoad;
import tipoMoto.TipoMoto;

public class Simulacao {

	public static void main(String[] args) {
		// combustiveis
		Gasolina gasolina = new Gasolina();
		Alcool alcool = new Alcool();

		// tipos caminhão
		Vuc VUC = new Vuc();

		Carros carro = new Carros("bmw", "vermelho", "XXX1999", 300, 10);
		Caminhao caminhao = new Caminhao("mercedes", "branco", "yyy9999", 200, VUC, "normal");

		carro.abastecer(20, alcool);
		carro.acelerar(180);

		caminhao.carregarCaminhao(350);
		caminhao.descarregarCaminhao(250);

		carro.exibir();
		caminhao.exibir();

		carro.freiar(100);
		carro.exibir();

		OffRoad offroad = new OffRoad();
		OnRoad onroad = new OnRoad();

		Moto moto = new Moto("Yamaha", "preto", "ZZZ1122", 100, true, 5, new OnRoad());

		moto.acelerar(120);
		moto.freiar(20);
		moto.carregar();

		moto.exibir();

		Moto moto2 = new Moto("Yamaha", "branco", "AB3CG5", 120, true, 5, new OffRoad());

		moto2.acelerar(200);
		moto2.freiar(60);
		moto2.carregar();

		moto2.exibir();

	}

}
