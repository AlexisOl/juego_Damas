package juego_Damas.ingreso;

public class seleccionIngreso {

    public int Piedra_Papel_tijera(){
        /**
         *  1 - piedra
         *  2- tijera
         *  3 - papel
         *  _______________________
         *  Para ganar
         *  1 - primer jugador
         *  2- segundo jugador
         *  3 - empate
         */

        int resultado=0;
        int opcion1 = (int)(Math.random()*(3));
        int opcion2 =  (int)(Math.random()*(3));
        if (opcion1 == 1 && opcion2 == 2 || opcion1 == 2 && opcion2 == 3 || opcion1 == 3 && opcion2 == 1){
            resultado = 1;
        } else if (opcion2 == 1 && opcion1 == 2 || opcion2 == 2 && opcion1 == 3 || opcion2 == 3 && opcion1 == 1) {
            resultado = 2;
        } else {
            resultado=3;
        }
        return resultado;
    }
    public int decicion(int numero){
        int opcion=0;
        switch (numero){
            case 1:

                opcion=1;
                break;
            case 2:

                opcion=2;
                break;
            case 3:   System.out.println("Empate");

                this.decicion( Piedra_Papel_tijera());

                break;
        }
return opcion;
    }
}
