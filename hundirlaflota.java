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
        int filaInicio, colInicio, filaFin, colFin;


        for (int b = 1; b <= numBarcos; b++) {
            System.out.println("Colocando barco " + b);
            System.out.print("Fila inicio: ");
            filaInicio = sc.nextInt();
            System.out.print("Columna inicio: ");
            colInicio = sc.nextInt();
            System.out.print("Fila final: ");
            filaFin = sc.nextInt();
            System.out.print("Columna final: ");
            colFin = sc.nextInt();


            // EJE X
            if (filaInicio == filaFin) {
                for (int j = colInicio; j <= colFin; j++) {
                    tablero[filaInicio][j] = 'O';
                }
            }
            // EJE Y
            else if (colInicio == colFin) {
                for (int i = filaInicio; i <= filaFin; i++) {
                    tablero[i][colInicio] = 'O';
                }
            }
        }
    }

    public static void mostrarTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }

    }


    public static void hundirLaFlota(char[][] tableroA, char[][] tableroB) {
        int fila, columna;
        boolean turnoJugadorA = true;


        while (true) {
            if (turnoJugadorA) {
                System.out.println("\nTurno Jugador A");
                System.out.println("Tablero enemigo:");
                mostrarTablero(tableroB);


                System.out.print("Fila ataque: ");
                fila = sc.nextInt();
                System.out.print("Columna ataque: ");
                columna = sc.nextInt();


                if (tableroB[fila][columna] == 'O') {
                    System.out.println("¡TOCADO!");
                    tableroB[fila][columna] = 'X';
                } else if (tableroB[fila][columna] == '~') {
                    System.out.println("Agua...");
                    tableroB[fila][columna] = '*';
                }


            } else {
                System.out.println("\nTurno Jugador B");
                System.out.println("Tablero enemigo:");
                mostrarTablero(tableroA);


                System.out.print("Fila ataque: ");
                fila = sc.nextInt();
                System.out.print("Columna ataque: ");
                columna = sc.nextInt();


                if (tableroA[fila][columna] == 'O') {
                    System.out.println("¡TOCADO!");
                    tableroA[fila][columna] = 'X';
                } else if (tableroA[fila][columna] == '~') {
                    System.out.println("Agua...");
                    tableroA[fila][columna] = '*';
                }
            }


            turnoJugadorA = !turnoJugadorA;
        }
    }


    public static void main(String[] args) {
    
    }
}
