package juego_Damas.Main;
import java.util.Scanner;
import juego_Damas.jugadores.jugadores;
import juego_Damas.jugadores.*;
import juego_Damas.modelo.*;
public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("INgrese su nombre");
        String nombre1 =lector.nextLine();
        System.out.println("INgrese la ficha con que quiere jugar");
        String ficha1 =lector.nextLine();
        System.out.println("INgrese su nombre");
        String nombre2 =lector.nextLine();
        System.out.println("INgrese la ficha con que quiere jugar");
        String ficha2 =lector.nextLine();
        jugadores jugador1 = new jugadores(ficha1, nombre1);
        jugadores jugador2 = new jugadores(ficha2, nombre2);
        Tablero tablero = new Tablero();

        arbitro t = new arbitro(jugador1,jugador2,tablero,"arbitro");
        t.jugar();

    }
}
