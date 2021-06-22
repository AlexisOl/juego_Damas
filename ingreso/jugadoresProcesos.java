package juego_Damas.ingreso;

import juego_Damas.jugadores.*;

import java.util.Scanner;

public class jugadoresProcesos {
    Scanner lector = new Scanner(System.in);

//___________________________________________
public  static  jugadores [] jugadorVector = new jugadores[10];

//+____________________________________________
    public void ingresoJ() {
        System.out.println("Ingrese su nombre");
        String nombre = lector.nextLine();
        System.out.println("Ingrese su nickname");
        String nickname = lector.nextLine();
        prueba cantidad = new prueba();
        jugadorVector[cantidad.getContador()]= new jugadores(nombre, nickname);
        System.out.println(jugadorVector[cantidad.getContador()].getNombre());
        incremento();
        moduloPrincipal regreso = new moduloPrincipal();
        regreso.ingreso();

    }
    //________________________________________________________________
    public int incremento(){
        int con=0;
        prueba cantidad = new prueba();
        con = cantidad.getContador();
        int cont = con +1;
        cantidad.setContador(cont);
        System.out.println(cantidad.getContador());
        return cont;

    }
    //________________________________________________________________

    public void  verJ() {
        System.out.println("juego_Damas.jugadores:");
        prueba ss = new prueba();
        int con = ss.getContador();
        System.out.println(con);


    }

    public void pruebas(){
        System.out.println("juego_Damas/jugadores");
        System.out.println("juego_Damas/jugadores");

    }
    public void mostrar(){
        prueba cantidad1 = new prueba();
        int cont = cantidad1.getContador();

        for (int i =0; i < (cont); i++){
            System.out.println("Nombre: "+jugadorVector[i].getNombre()+"\n"+"Nickname"+jugadorVector[i].getNickname());
        }
        moduloPrincipal regreso = new moduloPrincipal();
        regreso.ingreso();
    }
    //________________________________________________________________

    public void mostrarSoloNOmbre(){
        prueba cantidad = new prueba();
        int con = cantidad.getContador();

        for (int i =0; i < (con); i++){
            System.out.println(i +"Nombre:"+jugadorVector[i].getNombre());
        }

    }
    //________________________________________________________________

    public void mostrarEstadisticasPartidas(){
        prueba cantidad = new prueba();
        int con = cantidad.getContador();

        for (int i =-0; i < (con); i++){
            System.out.println("Nombre: "+jugadorVector[i].getNombre()+"\n"+"Derrotas: "+jugadorVector[i].getDerrotas()+"\n"+"Victoiras: "+jugadorVector[i].getVictorias());
        }

    }
    //________________________________________________________________

}
