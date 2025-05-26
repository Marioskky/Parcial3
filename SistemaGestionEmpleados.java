/**
 * Clase principal de la aplicación de gestión de empleados.
 */
import java.util.Scanner;

public class SistemaGestionEmpleados {
    /**
     * Método principal que ejecuta la aplicación.
     * @param args Argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Empleados empleados = new Empleados();
        empleados.altaEmpleado(new Empleado("Juan", "Desarrollador", 50000));
        empleados.altaEmpleado(new Empleado("María", "Diseñadora", 45000));
        empleados.altaEmpleado(new Empleado("Pedro", "Gerente", 60000));

        Scanner scanner = new Scanner(System.in);
        System.out.print(Mensajes.INTRODUZCA_PORCENTAJE);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);
        empleados.mostrarEmpleados();
        scanner.close();
    }
}
