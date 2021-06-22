package juego_Damas.jugadores;

import juego_Damas.modelo.Tablero;

import java.util.Scanner;

public class arbitro extends persona {
    private jugadores jugador1;
    private jugadores jugador2;
    private Tablero tablero;

    private Scanner entrada;

    public arbitro( jugadores jugador1, jugadores jugador2, Tablero tablero, String nombre) {
        super(nombre);
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.tablero = tablero;
    }

    public jugadores getJugador1() {
        return jugador1;
    }

    public void setJugador1(jugadores jugador1) {
        this.jugador1 = jugador1;
    }

    public jugadores getJugador2() {
        return jugador2;
    }

    public void setJugador2(jugadores jugador2) {
        this.jugador2 = jugador2;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }


    }

