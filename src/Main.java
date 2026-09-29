public class Main {
    public static void main(String[] args) {
        // En esta rama asignamos la ComisionPersonalizada
        EstrategiaComision estrategia = new ComisionPersonalizada();
        Vendedor vendedor = new Vendedor("Wilmer", 1000.0, estrategia);
        
        vendedor.mostrarDetalle();
    }
}