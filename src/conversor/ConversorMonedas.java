package conversor;

public class ConversorMonedas {
    private final ApiConnector api;

    public ConversorMonedas() {
        this.api = new ApiConnector();
    }

    public void convertir(String from, String to, double cantidad) {
        double tasa = api.obtenerTasa(from, to);

        if (tasa != -1) {
            double resultado = cantidad * tasa;
            System.out.printf("%.2f %s = %.2f %s%n", cantidad, from, resultado, to);
        } else {
            System.out.println("Error al obtener la tasa de conversión.");
        }
    }
}
