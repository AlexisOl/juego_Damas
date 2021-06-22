package juego_Damas.modelo;

public abstract class JuegodeMesa {
    protected EstadosTablero [][] tablero;
    protected final int TAMANOTABLERO = 8;
    protected int auxBlancas, auxNegras;
    public static final String ANSI_RESET = "\u001B[0m";
    //Colores de letra
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";

    public void mostrar() {
        char auxChar= 'A';
        for (int a = 0; a < TAMANOTABLERO; a++) {
            if (a==0) System.out.println("  | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 |");
            for (int b = 0; b < TAMANOTABLERO; b++ ) {
                if (b==0) {
                    System.out.print(auxChar + " | ");
                    auxChar++;
                }
                if (tablero[a][b] == EstadosTablero.V) System.out.print(" ");
                else  System.out.print (tablero[a][b]);
                System.out.print(" | ");
            }
            System.out.println(" ");
        }
    }

    public void inicializar(){
        tablero = new EstadosTablero [TAMANOTABLERO][TAMANOTABLERO];
        auxBlancas = 8;
        auxNegras = 8;

        inicializarVacio();
        posicionarBlancas();
        posicionarNegras();


    }

    public void inicializarVacio(){
        for (int a = 0; a < TAMANOTABLERO; a++) {
            for (int b = 0; b < TAMANOTABLERO; b++ ) {
                tablero[a][b] = EstadosTablero.V;
            }
        }
    }

    public void posicionarBlancas(){
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < TAMANOTABLERO; b++) {
                if (a%2 == 0) {
                    if (b % 2 == 0) tablero[a][b] = EstadosTablero.b;
                } else{
                    if (b % 2 != 0) tablero[a][b] = EstadosTablero.b;
                }
            }
        }
    }

    public void posicionarNegras(){
        for (int a = (TAMANOTABLERO-1); a >4 ; a--) {
            for (int b = 0; b < TAMANOTABLERO; b++) {
                if (a%2 != 0) {
                    if (b % 2 != 0) tablero[a][b] = EstadosTablero.n;
                } else{
                    if (b % 2 == 0) tablero[a][b] = EstadosTablero.n;
                }
            }
        }
    }

    public void convertirADama(){
        for (int a = 0; a < TAMANOTABLERO; a++) {
            if (tablero[0][a] == EstadosTablero.n) tablero[0][a] = EstadosTablero.N;
            if (tablero[(TAMANOTABLERO-1)][a] == EstadosTablero.b) tablero[(TAMANOTABLERO-1)][a] = EstadosTablero.B;
        }
    }

}
