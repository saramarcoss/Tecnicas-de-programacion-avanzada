package Loteria;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class OptionPane {
	private ArrayList<Bola>Bombonumeros=new ArrayList<Bola>(); 
    private ArrayList <Bola> Bombopremios = new ArrayList<Bola>();
public OptionPane() {	
JOptionPane.showMessageDialog(null,"Numero de loteria "+(Bombonumeros),"",JOptionPane.PLAIN_MESSAGE);
JOptionPane.showMessageDialog(null,"Premio de loteria "+(Bombopremios),"",JOptionPane.PLAIN_MESSAGE);

}
}
