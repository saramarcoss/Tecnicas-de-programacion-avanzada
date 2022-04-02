package Loteria;

import java.util.concurrent.ThreadLocalRandom;

public class Bombo {
	public Estados estado;
	Bola bola;
	public int time;

	public Bombo(Bola bola,Estados estado) {
	this.bola=bola;
	this.estado=estado;
	}


	public Bola sacarBola() {
		int min=0;
		int max=0;
		int num_sacar= ThreadLocalRandom.current().nextInt(min, max + 1);
		return bola(8);
		}

	private Bola bola(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	public void mezclar() {
		System.out.println("Mezclando bolas");
	}
	}
