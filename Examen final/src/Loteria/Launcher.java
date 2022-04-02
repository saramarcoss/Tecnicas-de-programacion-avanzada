package Loteria;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;


public class Launcher {
    private ArrayList<Bola>Bombonumeros=new ArrayList<Bola>(); 
    private ArrayList <Bola> Bombopremios = new ArrayList<Bola>();
	
	public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        Sorteo miSorteo = new Sorteo();
  
        OptionPane pane1=new OptionPane();
    	JFrame frame=new JFrame();

    	frame.setTitle("Loteria");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setBounds(100,100,500,500);
    	
    	Panel myPanel=new Panel();
    	frame.setContentPane(myPanel);
    	frame.setVisible(true);

	}
	private void guardarArchivo() {
		ArrayList<Bola>Bombonumeros=new ArrayList<Bola>();  
		FileWriter fichero = null;
		PrintWriter pw = null;

		try {
			fichero = new FileWriter("Loteria.txt");
			pw = new PrintWriter(fichero);

			for (int i=0; i<Bombonumeros.size(); i++) {
				pw.println(Bombonumeros.get(i));
				pw.println(Bombopremios.get(i));

			}
		}catch(Exception e){ 
			e.printStackTrace(); 
		}finally {
			try {
				if(null != fichero)
					fichero.close();

			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
