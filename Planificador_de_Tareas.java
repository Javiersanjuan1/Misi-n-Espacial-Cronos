import java.util.ArrayList;
import java.util.List;

// Clase para representar una tarea
class Tarea {
    private String nombre;

    public Tarea(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase para representar a un miembro de la tripulación
class MiembroTripulacion {
    private String nombre;
    private List<Tarea> tareas;

    public MiembroTripulacion(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void asignarTarea(Tarea tarea) {
        tareas.add(tarea);
    }
}

// Clase para organizar y distribuir tareas
class PlanificadorTareas {
    private List<MiembroTripulacion> tripulacion;

    public PlanificadorTareas() {
        tripulacion = new ArrayList<>();
    }

    public void agregarMiembro(MiembroTripulacion miembro) {
        tripulacion.add(miembro);
    }

    public void asignarTarea(MiembroTripulacion miembro, Tarea tarea) {
        miembro.asignarTarea(tarea);
    }

    public void visualizarTareas() {
        for (MiembroTripulacion miembro : tripulacion) {
            System.out.println("Tareas para " + miembro.getNombre() + ":");
            for (Tarea tarea : miembro.getTareas()) {
                System.out.println("- " + tarea.getNombre());
            }
            System.out.println();
        }
    }

    public int calcularCargaTrabajoOptima() {
        int cargaTotal = 0;
        for (MiembroTripulacion miembro : tripulacion) {
            cargaTotal += miembro.getTareas().size();
        }
        return cargaTotal;
    }
}

public class SistemaOrganizacionTareas {
    public static void main(String[] args) {
        NavegadorEstelar sistema = new NavegadorEstelar();

        // Crear miembros de la tripulación
        MiembroTripulacion tripulante1 = new MiembroTripulacion("Tripulante 1");
        MiembroTripulacion tripulante2 = new MiembroTripulacion("Tripulante 2");

        // Agregar miembros a la tripulación
        sistema.agregarMiembro(tripulante1);
        sistema.agregarMiembro(tripulante2);

        // Asignar tareas a los miembros
        sistema.asignarTarea(tripulante1, new Tarea("Limpiar cubierta"));
        sistema.asignarTarea(tripulante1, new Tarea("Revisar sistemas de navegación"));
        sistema.asignarTarea(tripulante2, new Tarea("Preparar comida"));
        sistema.asignarTarea(tripulante2, new Tarea("Reparar sistema de comunicación"));

        // Visualizar tareas asignadas
        sistema.visualizarTareas();

        // Calcular carga de trabajo óptima
        int cargaOptima = sistema.calcularCargaTrabajoOptima();
        System.out.println("Carga de trabajo óptima: " + cargaOptima);
    }
}