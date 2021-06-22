package juego_Damas.ingreso;

import juego_Damas.jugadores.*;
import juego_Damas.modelo.damas;

import java.util.Scanner;

public class juego {
    public static int opcion=0;
public static int opcion2=0;

public static int [] color = new int [30000];
public static int [] id = new int[30000];
public static int [] ganador= new int[30000];
public static int[] perdedor = new int[30000];
public static int contadorPartidas = 0;


    Scanner lector = new Scanner(System.in);
    public void mostrarDatos(){
        System.out.println("Jugador 1:"+jugadoresProcesos.jugadorVector[opcion].getNombre()+"\t\t\t"+"jugador 2: "+ jugadoresProcesos.jugadorVector[opcion2].getNombre());
    }
    public void jugar(){
        System.out.println("Aeleccione el jugador con quien quiere jugar");
        jugadoresProcesos miostrar = new jugadoresProcesos();
        miostrar.mostrarSoloNOmbre();
         opcion = Integer.valueOf(lector.nextLine());
        if (opcion>9|| opcion<0){
            System.out.println("NO existe ese personaje");

        } else {
            prueba random = new prueba();
             opcion2=(int) Math.random() * ((random.getContador() - 1));
            if (opcion2== opcion) {


                do {
                   System.out.println("Probando");
                    opcion2 = (int) Math.random() * ((random.getContador()-1));
                } while (opcion2 == opcion);
            } else {
                System.out.println("Su rival sera:"+jugadoresProcesos.jugadorVector[opcion2].getNombre());
                seleccionIngreso seleccion = new seleccionIngreso();
                seleccion.decicion(seleccion.Piedra_Papel_tijera());
                if (seleccion.decicion(seleccion.Piedra_Papel_tijera())==1) {
                    System.out.println("Elige color el primer jugador");
                    System.out.println("EScoga un color");
                    System.out.println("1-blanco");
                    System.out.println("2-negro");
                    int opcionColor = Integer.valueOf(lector.nextLine());
                    color[contadorPartidas]= opcionColor;
                    id[contadorPartidas]= opcion;
                    contadorPartidas++;

                } else {
                    System.out.println("Elige color el segundo jugador");
                    System.out.println("1-blanco");
                    System.out.println("2-negro");


                    int opcionColor = Integer.valueOf(lector.nextLine());
                    color[contadorPartidas]= opcionColor;
                    id[contadorPartidas]= opcion;
                    contadorPartidas++;
                    if  (opcionColor==1){
                        jugadores color = new jugadores();
                        color.setFicha(1);

                    } else {
                        jugadores color1 = new jugadores();
                        color1.setFicha(2);
                    }


                }
                damas inicio = new damas();
                inicio.jugar();


            }


            }
        }


    }




