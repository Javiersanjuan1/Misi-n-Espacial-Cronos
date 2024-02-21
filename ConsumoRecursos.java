import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Recurso {
    private double cantidad;

    public Recurso(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }
}

public class ConsumoRecursos {
    private List<Recurso> historialRecursos;

    public ConsumoRecursos() {
        historialRecursos = new ArrayList<>();
    }

    public void agregarConsumo(double cantidad) {
        Recurso recurso = new Recurso(cantidad);
        historialRecursos.add(recurso);
    }

    public double calcularMedia() {
        double suma = 0;
        for (Recurso recurso : historialRecursos) {
            suma += recurso.getCantidad();
        }
        return suma / historialRecursos.size();
    }

    public double calcularMinimo() {
        return Collections.min(historialRecursos, (r1, r2) -> Double.compare(r1.getCantidad(), r2.getCantidad())).getCantidad();
    }

    public double calcularMaximo() {
        return Collections.max(historialRecursos, (r1, r2) -> Double.compare(r1.getCantidad(), r2.getCantidad())).getCantidad();
    }

    public static void main(String[] args) {
        ConsumoRecursos consumoRecursos = new ConsumoRecursos();

        // Simulación de consumo de recursos
        consumoRecursos.agregarConsumo(10.5);
        consumoRecursos.agregarConsumo(8.2);
        consumoRecursos.agregarConsumo(12.3);
        consumoRecursos.agregarConsumo(9.7);

        // Calcular estadísticas
        double media = consumoRecursos.calcularMedia();
        double minimo = consumoRecursos.calcularMinimo();
        double maximo = consumoRecursos.calcularMaximo();

        // Mostrar resultados
        System.out.println("Media de consumo: " + media);
        System.out.println("Mínimo de consumo: " + minimo);
        System.out.println("Máximo de consumo: " + maximo);
    }
}
