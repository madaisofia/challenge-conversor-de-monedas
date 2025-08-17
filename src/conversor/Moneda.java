package conversor;

public class Moneda {
    private final String codigo;
    private final double cantidad;

    public Moneda(String codigo, double cantidad) {
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getCantidad() {
        return cantidad;
    }
}
