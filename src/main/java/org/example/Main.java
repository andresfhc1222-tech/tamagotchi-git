import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = menuPrincipal();
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
}
