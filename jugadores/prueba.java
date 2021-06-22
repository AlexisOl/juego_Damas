package juego_Damas.jugadores;

public class prueba {
    public static int contador;
    static jugadores[] jugadoresVector = new jugadores[10];
    static String Seleccion;


    public static String getSeleccion() {
        return Seleccion;
    }

    public static void setSeleccion(String seleccion) {
        Seleccion = seleccion;
    }

    public static jugadores[] getJugadoresVector() {
        return jugadoresVector;
    }

    public static void setJugadoresVector(jugadores[] jugadoresVector) {
        prueba.jugadoresVector = jugadoresVector;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
