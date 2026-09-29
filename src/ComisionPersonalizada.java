public class ComisionPersonalizada implements EstrategiaComision {
    @Override
    public double calcularComision(double montoVenta) {
        // Reemplaza "Wilmer" por tu primer nombre exacto
        String primerNombre = "Wilmer"; 
        int n = primerNombre.length();
        double porcentaje = (5 + n) / 100.0;
        
        return montoVenta * porcentaje;
    }
}