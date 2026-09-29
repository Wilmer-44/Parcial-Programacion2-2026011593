public class Main {
    public static void main(String[] args) {
        // Modificacion directa en main para generar conflicto
        EstrategiaComision estrategiaInicial = new ComisionEstandar();
        Vendedor vendedor = new Vendedor("Wilmer - Main", 1000.0, estrategiaInicial);

        vendedor.mostrarDetalle();
    }
}