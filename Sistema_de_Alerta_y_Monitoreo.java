import java.util.ArrayList;
import java.util.List;

class FactorCritico {
    private String nombre;
    private double valor;

    public FactorCritico(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public double getValor() {
        return valor;
    }
}

class SistemaMonitoreo {
    private List<FactorCritico> factoresCriticos;
    private int[] primos;

    public SistemaMonitoreo() {
        factoresCriticos = new ArrayList<>();
        generarPrimos();
    }

    public void agregarFactorCritico(FactorCritico factorCritico) {
        factoresCriticos.add(factorCritico);
    }

    public void monitorear() {
        for (FactorCritico factorCritico : factoresCriticos) {
            if (esPrimo((int) factorCritico.getValor())) {
                System.out.println("Alerta: Valor primo detectado para " + factorCritico.getNombre() +
                        ": " + factorCritico.getValor());
            }
        }
    }

    public void generarPrimos() {
        int n = 1000; // Se puede ajustar según la cantidad necesaria de números pr
        primos = new int[n];
        primos[0] = 2;
        int count = 1;
        int num = 3;

        while (count < n) {
            boolean esPrimo = true;
            for (int i = 0; i < count; i++) {
                if (num % primos[i] == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                primos[count] = num;
                count++;
            }
            num += 2;
        }
    }

    public boolean esPrimo(int num) {
        for (int primo : primos) {
            if (primo == 0 || primo > num) {
                return false;
            }
            if (num == primo) {
                return true;
            }
        }
        return false;
    }
}

public class Sistema_de_Alerta_y_Monitoreo {
    public static void main(String[] args) {
        SistemaMonitoreo sistema = new SistemaMonitoreo();

        // Simulación: Agregar factores críticos
        sistema.agregarFactorCritico(new FactorCritico("Radiación", 17));
        sistema.agregarFactorCritico(new FactorCritico("Temperatura", 23));
        sistema.agregarFactorCritico(new FactorCritico("Presión", 13));

        // Monitorear y alertar
        sistema.monitorear();
    }
}
