package juego_Damas.modelo;
import java.util.Scanner;
public class Tablero {
        Scanner sc = new Scanner(System.in);
    public static final String ANSI_RESET = "\u001B[0m";
    //Colores de letra
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String FICHA1 = "  X  ";
    public static final String FICHA2 = "  O  ";
        String[][] tablero = new String[8][8];

    public String[][] getTablero() {
        return tablero;
    }
    public void setTablero(String [][] tablero){
        this.tablero = tablero;

    }
     public Tablero(){
         this.tablero = new String[8][8];
         establecerFichas(FICHA1,FICHA2);
     }
    // TABLERO EN NEGRAS inicial
    public void dibujarTablero(String jugador1, String jugador2) {
        System.out.println("Jugador1:" + jugador1 + "\t\t\t" + "Jugador2:" + jugador2);

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    tablero[i][j] = ANSI_BLACK+"|||||"+ANSI_RESET;
                } else if (i % 2 != 0 && j % 2 != 0) {
                    tablero[i][j] = ANSI_BLACK+"|||||"+ANSI_RESET;
                } else {
                    tablero[i][j] = " c ";
                }

            }
        }
    }
// tablero sin parametros
    public void dibujarTablero() {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    tablero[i][j] = ANSI_BLACK+"|||||"+ANSI_RESET;
                } else if (i % 2 != 0 && j % 2 != 0) {
                    tablero[i][j] = ANSI_BLACK+"|||||"+ANSI_RESET;
                } else {
                    tablero[i][j] = "  c  ";
                }

            }
        }
    }
public void mostrar() {
    // MOSTRAR
    for (int i = 0; i < tablero.length; i++) {
        for (int j = 0; j < tablero[i].length; j++) {
            System.out.printf(tablero[i][j] + "       ");
        }
        System.out.println("");
    }
}

    public void establecerFichas(String ficha1, String ficha2) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (i==0 || i == 1 || i ==2){
                    if (tablero[i][j]==" c "){
                        tablero[i][j]=" "+ ficha1+ " ";
                    }
            } else if (i==5 || i == 6|| i ==7){
                    if (tablero[i][j]==" c "){
                        tablero[i][j]=" "+ ficha2+ " ";
                    }
                }

        }
    }
}









}
