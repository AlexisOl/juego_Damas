package juego_Damas.modelo;

public interface Movimiento {
    void mover(int x, int y, String orientacion) throws SinMovimiento;
}