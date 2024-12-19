

public class Main {
    private static int puntuacionJugador;

    public static void main(String[] args) {
    int puntuacionMaquina;
    int puntuacionJugador;
    boolean otraPartida;
    do {
        puntuacionJugador = cartasJugador();
        puntuacionMaquina = cartasMaquina();
        mostrarGanador (puntuacionJugador, puntuacionMaquina);
        otraPartida = jugarOtraPartida();
    } while(otraPartida);
        System.out.println("Hasta luego!");
    }

    private static void mostrarGanador(int puntuacionJugador, int puntuacionMaquina) {
        Main.puntuacionJugador = puntuacionJugador;
    }

    public static int cartasJugador() {
        System.out.println("Hola");
        return 0;
    }
    public static int cartasMaquina() {
        return 0;
    }
    public static boolean jugarOtraPartida() {
        return false;
    }
}