/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blackjack;

import java.util.Scanner;

/**
 *
 * @author grier
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int puntuacionMaquina;
        int puntuacionJugador;
        boolean otraPartida;
         do {
        puntuacionJugador = cartasJugador();
        puntuacionMaquina = cartasMaquina();
        mostrarGanador(puntuacionJugador, puntuacionMaquina);
        otraPartida = jugarOtraPartida();
        } while (otraPartida);
    }

    public static void mostrarGanador(int puntuacionJugador, int puntuacionMaquina) {
        if (puntuacionJugador == 21) {
            System.out.println("Ganaste!");
        } else if (puntuacionJugador > 21 && puntuacionMaquina > 21) {
            System.out.println("Empate");
        } else if (puntuacionJugador > 21 && puntuacionMaquina <= 21) {
            System.out.println("Perdiste");
        } else if (puntuacionJugador == 21 && puntuacionMaquina < 21) {
            System.out.println("Ganaste!");
        } else if (puntuacionJugador == 21 && puntuacionMaquina == 21) {
            System.out.println("Empate");
        } else if (21 > puntuacionJugador && 21 > puntuacionMaquina) {
            if (puntuacionJugador > puntuacionMaquina) {
                System.out.println("Ganaste!");
            } else {
                System.out.println("Perdiste");
            }
        } else if (puntuacionJugador <= 21 && puntuacionMaquina > 21){
            System.out.println("Ganaste!");
        }
    }

    public static int cartasMaquina() {
        int numeroAleatorio;
        int sumaTotal = 0;
        do {
            numeroAleatorio = (int) (Math.random() * 13 + 1);
            sumaTotal += numeroAleatorio;
        } while (sumaTotal < 16);
        System.out.println("Total de puntos de la maquina: " + sumaTotal);
        return sumaTotal;

    }

    public static int cartasJugador() {
        int respuestaUsuario;
        int sumaTotal = 0;
        int numeroAleatorio = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("[1] Coger otra carta?");
            System.out.println("[2] Terminar?");
            do {
                System.out.print("Su opcion: ");
                respuestaUsuario = sc.nextInt();
                switch (respuestaUsuario) {
                    case 1:
                        numeroAleatorio = (int) (Math.random() * 13 + 1);
                        System.out.println("Su carta es: " + numeroAleatorio);
                        sumaTotal += numeroAleatorio;
                        if (sumaTotal >= 18 && sumaTotal < 21) {
                            System.out.println("Tienes " + sumaTotal + ", seguro que quieres coger otra carta?");
                        } else if (sumaTotal == 21) {
                            respuestaUsuario = 2;
                        } else if (sumaTotal > 21) {
                            System.out.println("Te pasaste");
                            respuestaUsuario = 2;
                        }
                    case 2:
                        System.out.println("Total de puntos: " + sumaTotal);
                }
            } while (respuestaUsuario != 2);
        } while (respuestaUsuario != 2);
        return sumaTotal;
    }
    
    public static boolean jugarOtraPartida(){
        int respuestaUsuario;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quieres jugar otra partida?");
        System.out.println("[1] Si   [2] No");
        System.out.print("Opcion: ");
        respuestaUsuario = sc.nextInt();
        return respuestaUsuario == 1;
    }
}
