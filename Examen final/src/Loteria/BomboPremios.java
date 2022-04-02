package Loteria;

public final class BomboPremios extends Bombo{

	private static BomboPremios instance;
	static Bola bola;
    public Estados estado;

public BomboPremios(Bola bola,Estados estado) {
		super(bola, estado);
		this.estado=estado;
	}
public static BomboPremios getInstance(Estados estado) {
    if (instance == null) {
        instance = new BomboPremios(bola,estado);
    }
    return instance;
}
}
