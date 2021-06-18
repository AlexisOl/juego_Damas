package juego_Damas.jugadores;

public class jugadores extends persona {


    private String simbolo;
    private int fichas[][];
    private int cantidadVictorias;
    private int cantidadDerrotas;

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

    public int getCantidadVictorias() {
        return cantidadVictorias;
    }

    public void setCantidadVictorias(int cantidadVictorias) {
        this.cantidadVictorias = cantidadVictorias;
    }

    public int getCantidadDerrotas() {
        return cantidadDerrotas;
    }

    public void setCantidadDerrotas(int cantidadDerrotas) {
        this.cantidadDerrotas = cantidadDerrotas;
    }
}
