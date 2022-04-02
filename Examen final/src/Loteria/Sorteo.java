package Loteria;

import java.util.ArrayList;

public class Sorteo {
	//Bola Bombonumeros=new Bola(100000);
	//Bola Bombopremios=new Bola(1805);
	
	ArrayList<Bola>Bombonumeros=new ArrayList<Bola>();
	ArrayList<Bola>Bombopremios=new ArrayList<Bola>();
	
	public Estados estado;
	public BomboNums bombo;
	

	public void gestion() {
		if(this.estado==Estados.EROGANDO) {
		bombo.sacarBola();
		estado=Estados.MEZCLANDO;
		}else if(this.estado==Estados.MEZCLANDO) {
			bombo.mezclar();
			estado=Estados.EROGANDO;
	}
}
}
