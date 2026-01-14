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
                case 2:
                    if (saciedad < 10) {
                        saciedad = Math.min(10, saciedad + 3);
                        diversion--;
                        mostrarEstado();

                    } else {
                        System.out.println("No tengo hambre");
                    }
                    break;

                case 3:
                    if (diversion < 10) {
                        diversion = Math.min(10, diversion + 3);
                        saciedad--;
                        energia--;
                        mostrarEstado();
                    } else {
                        System.out.println("Ahora no me apetece jugar");
                    }
                    break;

                case 4:
                    if (energia < 10) {
                        energia = Math.min(10, energia + 3);
                        saciedad -= 3;
                        diversion -= 2;
                        mostrarEstado();
                    } else {
                        System.out.println("No tengo sueño");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo...");
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
