package juego_Damas.ingreso;

import java.util.Scanner;

public class moduloPrincipal {
Scanner lector = new Scanner(System.in);


public void ingreso() {
int inicioMenu=0;

    while (inicioMenu == 0) {
        System.out.print("Bievenido a damas chinas, escoga una opcion:\n");
        System.out.println("_____________________________");
        System.out.println("|1 - Jugar                |");
        System.out.println("|2 - Ingreso de jugadores |");
        System.out.println("|3 - Jugadores            |");
        System.out.println("|4 - Partidas ganadas     |");
        System.out.println("|5 - Salir                |");
        System.out.println("_____________________________");

        int seleccion = Integer.valueOf(lector.nextLine());
        if (seleccion > 5 || seleccion < 1) {
            System.out.println("No existe esa opcion, intente de nuevo");
            inicioMenu = 0;
        } else {
            inicioMenu = 1;
            switch (seleccion) {
                case 1 : juego jugar = new juego();
                    jugar.jugar();
                    break;
                case 2:jugadoresProcesos muestra = new jugadoresProcesos();
                    muestra.ingresoJ();
                    break;
                case 3: jugadoresProcesos aa = new jugadoresProcesos();
                    aa.mostrar();
                    break;
                case 4:
                    jugadoresProcesos muestra1 = new jugadoresProcesos();

                    muestra1.mostrarEstadisticasPartidas();
                    inicioMenu=0;
                    break;
                case 5:
                    System.out.println("Adios, regresa pronto!!");
                    break;
            }

        }

    }

}

public void solicitudInfo(){

}
}
