package conversor;

import java.util.Scanner;

public class Menu {
    private final ConversorMonedas conversor;
    private final Scanner scanner;

    public Menu() {
        this.conversor = new ConversorMonedas();
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;

        do {
            System.out.println("\n=== CONVERSOR DE MONEDAS ===");
            System.out.println("1. Dólar (USD) a Peso Mexicano (MXN)");
            System.out.println("2. Peso Mexicano (MXN) a Dólar (USD)");
            System.out.println("3. Dólar (USD) a Euro (EUR)");
            System.out.println("4. Euro (EUR) a Dólar (USD)");
            System.out.println("5. Dólar (USD) a Libra Esterlina (GBP)");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 5) {
                System.out.print("Ingresa la cantidad: ");
                double cantidad = scanner.nextDouble();

                switch (opcion) {
                    case 1 -> conversor.convertir("USD", "MXN", cantidad);
                    case 2 -> conversor.convertir("MXN", "USD", cantidad);
                    case 3 -> conversor.convertir("USD", "EUR", cantidad);
                    case 4 -> conversor.convertir("EUR", "USD", cantidad);
                    case 5 -> conversor.convertir("USD", "GBP", cantidad);
                }
            } else if (opcion != 6) {
                System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 6);

        System.out.println("¡Gracias por usar el conversor!");
    }
}
