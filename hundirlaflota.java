import java.util.*;
public class hundirlaflota {
    static Scanner sc = new Scanner(System.in);
    public static char[][] crearTablero(int filas, int columnas) {
        char[][] tablero = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = '~'; // agua
            }
        }
        return tablero;
    }

    public static void colocarBarcos(char[][] tablero, int numBarcos, int longitudBarco) {
    
    }
    public static void mostrarTablero(char[][] tablero) {

    }


    public static void hundirLaFlota(char[][] tableroA, char[][] tableroB) {

    }


    public static void main(String[] args) {
    
    }
}
