package juego_Damas.jugadores;

public class jugadores extends persona {


    private String simbolo;
    private int fichas[][];

    public jugadores(String simbolo, String nombre) {
        super(nombre);
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public int[][] getFichas() {
        return fichas;
    }

    public void setFichas(int[][] fichas) {
        this.fichas = fichas;
    }



}
