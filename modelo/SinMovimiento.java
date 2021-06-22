package juego_Damas.modelo;

public class SinMovimiento extends Exception {
    public SinMovimiento(){

        super();
    }
    public SinMovimiento(String mensaje) {
        super(mensaje);

    }
}