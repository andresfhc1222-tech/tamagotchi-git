import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    private static int saciedad = 6;
    private static int energia = 6;
    private static int diversion = 6;


    public static void main(String[] args) {

        int opcion;

        do {
            opcion = menuPrincipal();

            switch (opcion) {
                case 1:
                    mostrarEstado();
                    break;
            }

        } while (opcion != 0);
    }



    private static int menuPrincipal() {
        int opcion;
        do {
            System.out.println("""
                    1. Estado
                    2. Comer
                    3. Jugar
                    4. Dormir
                    ----------------
                    0. Salir
                    Seleccione una opción del menú:
                    """);
            opcion = sc.nextInt();
        } while (opcion < 0 || opcion > 4);

        return opcion;
    }
    private static void mostrarEstado() {

        if (saciedad == 0 || energia == 0 || diversion == 0) {
            System.out.println("""
                (x_x) :( Game Over ):
                 /|_|\\
                  | |
                """);
        } else if (saciedad <= 4) {
            System.out.println("""
                (•︵•) ¡Tengo hambre! 🍗
                 /|x|\\
                  | |
                """);
        } else if (energia <= 4) {
            System.out.println("""
                (-_-) Zzz
                 /|_|\\
                  | |
                """);
        } else if (diversion <= 4) {
            System.out.println("""
                (-︵-) Estoy aburrido
                 /|_|\\ ¡Juega conmigo!
                  / \\
                """);
        } else {
            System.out.println("""
                (•‿•) ¡Estoy feliz!
                 /|_|\\
                  | |
                """);
        }
    }

}
