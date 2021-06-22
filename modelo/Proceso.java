package juego_Damas.modelo;

public abstract class Proceso {


    protected EstadosTablero [][] tablero;
    protected final int TAMANOTABLERO = 8;

    public abstract void mostrar();

    public abstract void inicializar();
}
