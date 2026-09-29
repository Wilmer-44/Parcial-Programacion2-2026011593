public class Main {
    public static void main(String[] args) {
        // En la rama main se usa ComisionEstandar por defecto
        EstrategiaComision estrategiaInicial = new ComisionEstandar();
        Vendedor vendedor = new Vendedor("Wilmer", 1000.0, estrategiaInicial);
        
        vendedor.mostrarDetalle();
    }
}