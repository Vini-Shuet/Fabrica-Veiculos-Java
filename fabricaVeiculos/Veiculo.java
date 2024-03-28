package fabricaVeiculos;

import java.util.Date;

public abstract class Veiculo {

	protected String marca, cor, placa;
	protected Date anoFabricacao;
	protected double limiteVelocidade;
	protected double velocidade;
	protected boolean estaLigado;
	protected int cambio;
	protected int marcha;

	public Veiculo(String marca, String cor, String placa, double limiteVelocidade) {
		this.marca = marca;
		this.cor = cor;
		this.placa = placa;
		this.limiteVelocidade = limiteVelocidade;
		// ATRIBUTOS NÃO INFORMADOS NA CRIAÇÃO DO OBJETO
		this.anoFabricacao = new Date();
		this.estaLigado = false;
		this.cambio = cambio;
		
		if (this.limiteVelocidade>320){
	        this.cambio = 7;
	    } else if ( this.limiteVelocidade>260){
	        this.cambio = 6;
	    } else if ( this.limiteVelocidade>200){
	        this.cambio = 5;
	    } else if ( this.limiteVelocidade>150){
	        this.cambio = 4;
	        }
	}

	// MÉTODOS

	public void ligar() {
		if (!estaLigado) {
			this.estaLigado = true;
		} else {
			System.out.println("O veiculo já está ligado!");
		}
	}

	public void desligar() {
		if (!estaLigado) {
			System.out.println("O veitculo já está desligado");
		} else {
			this.estaLigado = false;
		}
	}

	public void acelerar(double valor) {
		if ((estaLigado) && (this.velocidade < this.limiteVelocidade)) {
			this.velocidade += valor;

			if (this.velocidade > this.limiteVelocidade)
				this.velocidade = this.limiteVelocidade;
			this.pegaMarcha();
		} else {
			this.ligar();
			this.acelerar(valor);
		
		}
		
	}
	
	public void freiar( double valor) {
		if((estaLigado) && (this.velocidade > 0)) {
			this.velocidade -= valor;
				if(this.velocidade<0) {
					this.velocidade = 0;
				}
				this.pegaMarcha();
		
		}else {
			System.out.println("\nO veiculo está parado");
			System.out.println("------------------------");
		}
	}
	
	
	public void pegaMarcha(){
	       if (this.velocidade>300){
	           this.marcha = 7;
	       }else if (this.velocidade>200){
	    	   this.marcha = 6;
	       }else if (this.velocidade>100){
	    	   this.marcha = 5;
	       }else if (this.velocidade>75){
	    	   this.marcha = 4;
	       }else if (this.velocidade>50){
	    	   this.marcha = 3;
	       }else if (this.velocidade>25){
	    	   this.marcha = 2;
	       }else if (this.velocidade>0){
	    	   this.marcha = 1;
	       }else if (this.velocidade==0){
	    	   this.marcha = 0;
	       }
		}

		public abstract void exibir();
}
