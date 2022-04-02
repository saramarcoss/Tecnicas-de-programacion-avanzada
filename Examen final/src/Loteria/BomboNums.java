package Loteria;

public final class BomboNums extends Bombo{
	private static BomboNums instance;
	public static Bola bola;
    public Estados estado;

public BomboNums(Bola bola,Estados estado) {
		super(bola, estado);
		this.estado=estado;
	}
public static BomboNums getInstance(Estados estado) {
    if (instance == null) {
        instance = new BomboNums(bola,estado);
    }
    return instance;
}
}