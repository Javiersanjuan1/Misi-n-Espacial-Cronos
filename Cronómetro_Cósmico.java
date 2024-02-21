public class Cronómetro_Cósmico {
    // Constantes para conversiones de tiempo
    private static final double TIEMPO_PLANETA = 1.5; // Ejemplo: tiempo en otro planeta es el 1.5 del tiempo en la Tierra

    public static void main(String[] args) {
        long tiempoTierraSegundos = 1000000000; // Ejemplo: 1,000,000,000 segundos

        long minutosTierra = tiempoTierraSegundos / 60;
        long horasTierra = minutosTierra / 60;
        long diasTierra = horasTierra / 24;
        long añosTierra = diasTierra / 365;

        System.out.println("Tiempo en la Tierra:");
        System.out.println("Segundos: " + tiempoTierraSegundos);
        System.out.println("Minutos: " + minutosTierra);
        System.out.println("Horas: " + horasTierra);
        System.out.println("Días: " + diasTierra);
        System.out.println("Años: " + añosTierra);

        long tiempoPlanetaSegundos = (long) (tiempoTierraSegundos * TIEMPO_PLANETA);
        long minutosPlaneta = tiempoPlanetaSegundos / 60;
        long horasPlaneta = minutosPlaneta / 60;
        long diasPlaneta = horasPlaneta / 24;
        long añosPlaneta = diasPlaneta / 365;

        System.out.println("\nTiempo en el nuevo planeta:");
        System.out.println("Segundos: " + tiempoPlanetaSegundos);
        System.out.println("Minutos: " + minutosPlaneta);
        System.out.println("Horas: " + horasPlaneta);
        System.out.println("Días: " + diasPlaneta);
        System.out.println("Años: " + añosPlaneta);

        System.out.println("\nMayores valores representables en Java:");
        System.out.println("Byte: " + Byte.MAX_VALUE);
        System.out.println("Short: " + Short.MAX_VALUE);
        System.out.println("Integer: " + Integer.MAX_VALUE);
        System.out.println("Long: " + Long.MAX_VALUE);
        System.out.println("Float: " + Float.MAX_VALUE);
        System.out.println("Double: " + Double.MAX_VALUE);
    }
}
