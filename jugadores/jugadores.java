package juego_Damas.jugadores;

public class jugadores extends persona {


    private String nickname;
    private int ficha;
    private int victorias;
    private int derrotas;
    // Para ficha establezco true == blanca
    // False == negra


// Constructor con nombre y nickname
    public jugadores(String nombre, String nickname) {
        super(nombre);
        this.nickname=nickname;

    }

// constructor con nombre, nickname y ficha


    public int getFicha() {
        return ficha;
    }

    public void setFicha(int ficha) {
        this.ficha = ficha;
    }

    public jugadores() {

    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
}
